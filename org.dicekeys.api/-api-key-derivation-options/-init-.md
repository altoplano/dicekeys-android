[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [ApiKeyDerivationOptions](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ApiKeyDerivationOptions(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, requiredKeyType: KeyType? = null)`

Used to construct and parse the strings in
[key-derivation options JSON format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
which specify how to derive cryptographic keys from seed string.
These JSON strings appear throughout the API (and in the [DiceKeysApiClient](../-dice-keys-api-client/index.md)) as a
parameter named *keyDerivationOptionsJson*.

This implementation extends of the more general [KeyDerivationOptions](../../org.dicekeys.crypto.seeded/-key-derivation-options/index.md) class, which
abstracts all the general-purpose key-derivation options that aren't specific
to DiceKeys or the DiceKeys App/API.

This extension adds the [restrictions](restrictions.md) field, and the [Restrictions](-restrictions/index.md) class, so that the
options string can specify which client apps and URLs are allowed to use the API to
perform cryptographic operations (e.g. sealing or signed  data) with the derived key.

This extension adds the [clientMayRetrieveKey](client-may-retrieve-key.md) option to indicate that clients may
use the API to return derived keys back to the client, so that the clients can
perform cryptographic operations even when the DiceKeys app or seed string are unavailable.

This extension adds support for the [excludeOrientationOfFaces](exclude-orientation-of-faces.md) option, which can create
seeds that remain the same even if the orientation of a die within a DiceKey changes.

``` kotlin
val keyDerivationOptionsJson: String =
        ApiKeyDerivationOptions.Symmetric().apply {
            // Ensure the JSON format has the "keyType" field specified
            keyType = requiredKeyType  // sets "keyType": "Symmetric" since this class type is Symmetric
            algorithm = defaultAlgorithm // sets "algorithm": "XSalsa20Poly1305"
            // Set other fields in the spec in a Kotlin/Java friendly way
            clientMayRetrieveKey = true // sets "clientMayRetrieveKey": true
            // The restrictions subclass can be constructed
            restrictions = ApiKeyDerivationOptions.Restrictions().apply {
                androidPackagePrefixesAllowed = listOf("com.example.app")
                urlPrefixesAllowed = listOf("https://example.com/app/")
            }
            // The restrictions subclass can also be modified in place
            restrictions?.apply { urlPrefixesAllowed = listOf("https://example.com/app/", "https://example.com/anotherapp") }
            // You may set JSON fields outside the spec using methods this class inherits from
            // JSONObject, since the spec allows arbitrary fields to support use cases outside
            // its original purpose
            put("salt", "S0d1um Chl0r1d3")
        }.toJson()
// Use this class to parse a JSON string specifying the derivation of a public/private key
if (ApiKeyDerivationOptions.Public(keyDerivationOptionsJson).clientMayRetrieveKey) {
    // The keyDerivationOptionsJson allows clients not just to use the derived key,
    // but also to retrieve a copy of it (conditional on evaluation of 'requirements')
} // Converts KeyDerivationOptions to JSON string format
```

