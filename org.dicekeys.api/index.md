[DiceKeys](../index.md) / [org.dicekeys.api](./index.md)

## Package org.dicekeys.api

Your can use the [DiceKeysApiClient](-dice-keys-api-client/index.md) in this package to ask the DiceKeys app
to derive keys from the user's DiceKey, and to perform cryptographic operations
on your application's behalf.
This package uses and returns keys from the [org.dicekeys.crypto.seeded](../org.dicekeys.crypto.seeded/index.md) package.

You specify how keys are derived, and place restrictions on thier use, via the
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html/),
which you can construct and parse using [ApiKeyDerivationOptions](-api-key-derivation-options/index.md).

If you are sealing messages with a [SymmetricKey](../org.dicekeys.crypto.seeded/-symmetric-key/index.md) or [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md), you can
instruct the DiceKeys to enforce additional restrictions before unsealing a
message with a derived key. You can create these
[post-decryption instructions](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html) by using the
[PostDecryptionInstructions](-post-decryption-instructions/index.md) class.
These instructions are not sealed, but are stored in plaintext within a
[PackagedSealedMessage](../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md), along with the ciphertext and the key-derivation
options needed to re-derive the unsealing key from the user's DiceKey.

### Types

| Name | Summary |
|---|---|
| [ApiKeyDerivationOptions](-api-key-derivation-options/index.md) | Used to construct and parse the strings in [key-derivation options JSON format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html), which specify how to derive cryptographic keys from seed string. These JSON strings appear throughout the API (and in the [DiceKeysApiClient](-dice-keys-api-client/index.md)) as a parameter named *keyDerivationOptionsJson*.`open class ApiKeyDerivationOptions : `[`KeyDerivationOptions`](../org.dicekeys.crypto.seeded/-key-derivation-options/index.md) |
| [DiceKeysApiClient](-dice-keys-api-client/index.md) | The API client used to ask the DiceKeys app to generate cryptographic keys seeded by a user's DiceKey and to perform operations on the application's behalf.`abstract class DiceKeysApiClient` |
| [PostDecryptionInstructions](-post-decryption-instructions/index.md) | Parse or construct [post-decryption instructions JSON format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html) strings. If constructing from a JSON string, the class will be populated with the fields specified by that JSON object.  Or, pass an empty string to the constructor, set the fields using `apply`, and then generate a postDecryptionInstructions string.`open class PostDecryptionInstructions : `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html) |

### Exceptions

| Name | Summary |
|---|---|
| [ClientMayNotRetrieveKeyException](-client-may-not-retrieve-key-exception/index.md) | `class ClientMayNotRetrieveKeyException : `[`IllegalArgumentException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html) |
| [ClientPackageNotAuthorizedException](-client-package-not-authorized-exception/index.md) | Thrown when a key to be derived has requirements in keyDerivationOptionsJson that disallow the calling client application from accessing or using the key.`class ClientPackageNotAuthorizedException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [DiceKeysAppNotPresentException](-dice-keys-app-not-present-exception/index.md) | `class DiceKeysAppNotPresentException : `[`IllegalArgumentException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html) |
