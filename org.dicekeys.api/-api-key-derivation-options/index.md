[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [ApiKeyDerivationOptions](./index.md)

# ApiKeyDerivationOptions

`open class ApiKeyDerivationOptions : `[`KeyDerivationOptions`](../../org.dicekeys.crypto.seeded/-key-derivation-options/index.md)

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

### Types

| Name | Summary |
|---|---|
| [Public](-public/index.md) | An extension class that must represent a specification for a public/private key pair`class Public : `[`ApiKeyDerivationOptions`](./index.md) |
| [Restrictions](-restrictions/index.md) | This subclass is used to determine which clients/sites are permitted to use keys derived from a keyDerivationOptionsJson string.`class Restrictions` |
| [Seed](-seed/index.md) | An extension class that must represent a specification for a derived seed`class Seed : `[`ApiKeyDerivationOptions`](./index.md) |
| [Signing](-signing/index.md) | An extension class that must represent a specification for a signing/verification key pair`class Signing : `[`ApiKeyDerivationOptions`](./index.md) |
| [Symmetric](-symmetric/index.md) | An extension class that must represent a specification for a symmetric key`class Symmetric : `[`ApiKeyDerivationOptions`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Used to construct and parse the strings in [key-derivation options JSON format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html), which specify how to derive cryptographic keys from seed string. These JSON strings appear throughout the API (and in the [DiceKeysApiClient](../-dice-keys-api-client/index.md)) as a parameter named *keyDerivationOptionsJson*.`ApiKeyDerivationOptions(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, requiredKeyType: KeyType? = null)` |

### Properties

| Name | Summary |
|---|---|
| [clientMayRetrieveKey](client-may-retrieve-key.md) | Unless this value is explicitly set to *true*, the DiceKeys may prevent to obtain a raw derived [SymmetricKey](../../org.dicekeys.crypto.seeded/-symmetric-key/index.md), [PrivateKey](../../org.dicekeys.crypto.seeded/-private-key/index.md), or [SigningKey](../../org.dicekeys.crypto.seeded/-signing-key/index.md). Clients may retrieve a derived [PublicKey](../../org.dicekeys.crypto.seeded/-public-key/index.md), or [SignatureVerificationKey](../../org.dicekeys.crypto.seeded/-signature-verification-key/index.md) even if this value is not set or set to false.`var clientMayRetrieveKey: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [excludeOrientationOfFaces](exclude-orientation-of-faces.md) | When using a DiceKey as a seed, setting this value to true will exclude the orientation of each face from the key, so that the seed is unchanged even if orientations are misread. This reduces the lieklihood that, if a user copies their DiceKey manually and does not verify it, an error in copying orientation would prevent them from re-generating their key. It also reduces the security of the key.`var excludeOrientationOfFaces: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [restrictions](restrictions.md) | Restrict which clients are permitted to use the API to work with the derived key. See the documentation for [Restrictions](-restrictions/index.md).`var restrictions: Restrictions?` |
