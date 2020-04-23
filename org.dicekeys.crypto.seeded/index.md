[DiceKeys](../index.md) / [org.dicekeys.crypto.seeded](./index.md)

## Package org.dicekeys.crypto.seeded

This wrapper for the DiceKeys
[Seeded Cryptography C++ Library](https://dicekeys.github.io/seeded-crypto/),
provides cryptographic keys seeded by DiceKeys (or other strings)
and cryptographic operations using those keys.

It includes support for
symmetric keys ([SymmetricKey](-symmetric-key/index.md));
assymetric key pairs for public-key encryption ([PublicKey](-public-key/index.md)) and decryption ([PrivateKey](-private-key/index.md));
assymetric key pairs for digital signatures ([SigningKey](-signing-key/index.md)) and their verification [SignatureVerificationKey](-signature-verification-key/index.md)),
as well as a general-purpose derived [Secret](-secret/index.md).
When messages are sealed with the *seal* operation of [SymmetricKey](-symmetric-key/index.md) or [PublicKey](-public-key/index.md), the ciphertext
is stored within a [PackagedSealedMessage](-packaged-sealed-message/index.md).

While we built this library and the underlying C++ library for DiceKeys,
we have made them general-purpose libraries for use with any type of seed string.
This library can be used to derive keys from (hopefully strong) passwords or other
secret seeds.

To this end, we have placed features specific to DiceKeys in the [org.dicekeys.api](../org.dicekeys.api/index.md) namespace.
That includes [ApiKeyDerivationOptions](../org.dicekeys.api/-api-key-derivation-options/index.md), which extends [KeyDerivationOptions](-key-derivation-options/index.md) in this package
with fields that would not apply to other seeded cryptography applications (e.g.,
ignoring the orientation of the faces of dice within a DiceKey).
It also includes the format for post-decryption instructions [PostDecryptionInstructions](../org.dicekeys.api/-post-decryption-instructions/index.md)
used by DiceKeys, allowing this library to remain format agnostic (as well as
agnostic to whether sealed messages should include post-decyrption instructions).

### Types

| Name | Summary |
|---|---|
| [KeyDerivationOptions](-key-derivation-options/index.md) | A class to parse and construct key-derivation options in *keyDerivationOptionsJson* format.`open class KeyDerivationOptions : `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html) |
| [PackagedSealedMessage](-packaged-sealed-message/index.md) | This class stores everything needed to unseal a message sealed with a [SymmetricKey](-symmetric-key/index.md) or [PublicKey](-public-key/index.md), so long as you have either the seed from which that key was derived from *or* the key itself:`class PackagedSealedMessage` |
| [PrivateKey](-private-key/index.md) | A [PrivateKey](-private-key/index.md) is used to *unseal* messages sealed with its corresponding [PublicKey](-public-key/index.md). The [PrivateKey](-private-key/index.md) and [PublicKey](-public-key/index.md) are generated from a seed and a set of key-derivation specified options in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).`class PrivateKey` |
| [PublicKey](-public-key/index.md) | A [PublicKey](-public-key/index.md) is used to *seal* messages, in combination with a [PrivateKey](-private-key/index.md) which can *unseal* them. The key pair of this [PublicKey](-public-key/index.md) and the matching [PrivateKey](-private-key/index.md) are generated from a seed and a set of key-derivation specified options in JSON format [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).`class PublicKey` |
| [Secret](-secret/index.md) | This class represents secret , which is  derived from a seed and set of key-derivation specified options in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).`class Secret` |
| [SignatureVerificationKey](-signature-verification-key/index.md) | A [SignatureVerificationKey](-signature-verification-key/index.md) is used to verify that messages were signed by its corresponding [SigningKey](-signing-key/index.md). [SigningKey](-signing-key/index.md)s generate *signatures*, and by verifying a message/signature pair the SignatureVerificationKey can confirm that the message was indeed signed using the [SigningKey](-signing-key/index.md). The key pair of the [SigningKey](-signing-key/index.md) and SignatureVerificationKey is generated from a seed and a set of key-derivation specified options in`class SignatureVerificationKey` |
| [SigningKey](-signing-key/index.md) | [SigningKey](-signing-key/index.md)s generate *signatures* of messages which can then be used by the corresponding [SignatureVerificationKey](-signature-verification-key/index.md) to verify that a message was signed by  can confirm that the message was indeed signed by the SigningKey and has not since been tampered with.`class SigningKey` |
| [SymmetricKey](-symmetric-key/index.md) | A SymmetricKey can be used to seal and unseal messages. This SymmetricKey class can be (re) derived from a seed using set of key-derivation options specified in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html). So, you can use this symmetric-key to seal a message, throw the key away, and re-generate the key when you need to unseal the message so long as you still have the original seed and keyDerivationOptionsJson.`class SymmetricKey` |

### Exceptions

| Name | Summary |
|---|---|
| [ClientNotAuthorizedException](-client-not-authorized-exception/index.md) | `class ClientNotAuthorizedException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [CryptographicVerificationFailureException](-cryptographic-verification-failure-exception/index.md) | Thrown when a cryptographic operation fails.`class CryptographicVerificationFailureException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [InvalidArgumentException](-invalid-argument-exception/index.md) | A generic exception for invalid arguments.`class InvalidArgumentException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [InvalidKeyDerivationOptionsJsonException](-invalid-key-derivation-options-json-exception/index.md) | Thrown when a keyDerivationOptionsJson parameter contains a string that is neither empty nor in valid JSON format.`class InvalidKeyDerivationOptionsJsonException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [InvalidKeyDerivationOptionValueException](-invalid-key-derivation-option-value-exception/index.md) | Thrown when a keyDerivationOptionsJson parameter contains a field that has an invalid or forbidden value.`class InvalidKeyDerivationOptionValueException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [JsonParsingException](-json-parsing-exception/index.md) | Thrown when JSON parsing fails, such as when trying to re-constitute an object in JSON format that was corrupted.`class JsonParsingException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [KeyLengthException](-key-length-exception/index.md) | Thrown when keyDerivationOptionsJson parameter contains an invalid keyLengthInBytes field.`class KeyLengthException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [UnknownException](-unknown-exception/index.md) | `class UnknownException : `[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
