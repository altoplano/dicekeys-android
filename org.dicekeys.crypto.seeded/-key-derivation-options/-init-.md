[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [KeyDerivationOptions](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`KeyDerivationOptions(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, requiredKeyType: KeyType? = null)`

A class to parse and construct key-derivation options in *keyDerivationOptionsJson* format.

```
val keyDerivationOptionsJson: String =
  KeyDerivationOptions.Symmetric().apply {
      // Ensure the JSON format has the "keyType" field specified
      keyType = requiredKeyType  // sets "keyType": "Symmetric" since this class type is Symmetric
      algorithm = defaultAlgorithm // sets "algorithm": "XSalsa20Poly1305"
      hashFunction = HashFunction.Argon2id // sets "hashFunction": "Argon2id"
      hashFunctionIterations = 4L // sets numeric (non-quoted) field "hashFunctionIterations": 4
  }.toJson() // converts KeyDerivationOptions to JSON string format
}
```

Note: This class inherits from org.json.JSONObject, the documentation of which discourages
classes from inheriting from it because overriding methods can lead to undocumented behaviors.
In our case, we do not override (change) any methods or functionality of the underlying
JSONObject.
Rather, we only *augment* this class, leaving the underlying functionality untouched.
We add only

1. Virtual fields, with getters/setters that write/read specified fields into the JSONObject
    with a consistent type, ensuring that these fields are not written using the wrong type
    (e.g. writing a numeric field as a string or using an invalid enum name in a string field).
2. Classes used by those getters and setters to expose JSON string fields as more-restricted
    (better typed) enums and JSON Objects as more-richly typed objects.

Those extending this class should follow the same convention in extending only by
adding virtual fields and the types used to support them.

