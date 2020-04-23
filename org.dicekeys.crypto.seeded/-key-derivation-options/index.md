[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [KeyDerivationOptions](./index.md)

# KeyDerivationOptions

`open class KeyDerivationOptions : `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)

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

### Types

| Name | Summary |
|---|---|
| [Algorithm](-algorithm/index.md) | Specify the specific algorithm to use for the supported cryptographic operation(s). Do not set if `"keyType": "Secret"`.`enum class Algorithm` |
| [HashFunction](-hash-function/index.md) | The key-derivation hash functions currently supported by this library, with names matching the string values in the JSON format.`enum class HashFunction` |
| [KeyType](-key-type/index.md) | The keyType values currently supported by this library as an enum, with names matching the string values in the JSON format.`enum class KeyType` |
| [Public](-public/index.md) | `class Public : `[`KeyDerivationOptions`](./index.md) |
| [Seed](-seed/index.md) | `class Seed : `[`KeyDerivationOptions`](./index.md) |
| [Signing](-signing/index.md) | `class Signing : `[`KeyDerivationOptions`](./index.md) |
| [Symmetric](-symmetric/index.md) | `class Symmetric : `[`KeyDerivationOptions`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A class to parse and construct key-derivation options in *keyDerivationOptionsJson* format.`KeyDerivationOptions(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, requiredKeyType: KeyType? = null)` |

### Properties

| Name | Summary |
|---|---|
| [algorithm](algorithm.md) | Specifies the hash function used to derive the key.`var algorithm: Algorithm?` |
| [defaultAlgorithm](default-algorithm.md) | A read-only field that yields the default algorithm to use for the keyType that has been ste for this object.  If keyType isn't set, or is set to a value with no algorithm (Secret), then the value is null.`val defaultAlgorithm: Algorithm?` |
| [defaultHashFunction](default-hash-function.md) | The default hash function is SHA256`val defaultHashFunction: HashFunction` |
| [hashFunction](hash-function.md) | The hash function the use to derive the secret or the key seed.`var hashFunction: HashFunction` |
| [hashFunctionIterations](hash-function-iterations.md) | If using the memory-intensive `Argon2id` or `Scrypt` hash functions, you can set the number of iterative cycles (which those algorithms call opsLimit) via this field.`var hashFunctionIterations: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [hashFunctionMemoryLimit](hash-function-memory-limit.md) | If using the memory-intensive `Argon2id` or `Scrypt` hash functions, you can set the memory required for the hash function via this value.  The default is 67108864.`var hashFunctionMemoryLimit: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [keyLengthInBytes](key-length-in-bytes.md) | Specifies the key-length in bytes if using a cryptographic operation for which multiple key lengths are supported, or the length of the secret to be derived if `"keyType": "Secret"`.`var keyLengthInBytes: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [keyType](key-type.md) | Specify whether this JSON object should be used to construct a [Secret](../-secret/index.md), [SymmetricKey](../-symmetric-key/index.md), [PrivateKey](../-private-key/index.md), or [SigningKey](../-signing-key/index.md).`var keyType: KeyType?` |
| [requiredKeyType](required-key-type.md) | `val requiredKeyType: KeyType?` |

### Functions

| Name | Summary |
|---|---|
| [toJson](to-json.md) | Generate JSON for these key-derivation options.`fun toJson(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [ApiKeyDerivationOptions](../../org.dicekeys.api/-api-key-derivation-options/index.md) | Used to construct and parse the strings in [key-derivation options JSON format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html), which specify how to derive cryptographic keys from seed string. These JSON strings appear throughout the API (and in the [DiceKeysApiClient](../../org.dicekeys.api/-dice-keys-api-client/index.md)) as a parameter named *keyDerivationOptionsJson*.`open class ApiKeyDerivationOptions : `[`KeyDerivationOptions`](./index.md) |
