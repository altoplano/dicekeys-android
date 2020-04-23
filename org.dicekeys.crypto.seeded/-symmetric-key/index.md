[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SymmetricKey](./index.md)

# SymmetricKey

`class SymmetricKey`

A SymmetricKey can be used to seal and unseal messages.
This SymmetricKey class can be (re) derived from a seed using
set of key-derivation options specified in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).
So, you can use this symmetric-key to seal a message, throw the
key away, and re-generate the key when you need to unseal the
message so long as you still have the original seed and
keyDerivationOptionsJson.

Sealing a message (*plaintext*) creates a _ciphertext which contains
the message but from which observers who do not have the PrivateKey
cannot discern the contents of the message.
Sealing also provides integrity-protection, which will preven the
message from being unsealed if it is modified.
We use the verbs seal and unseal, rather than encrypt and decrypt,
because the encrypting alone does not confer that the message includes
an integrity (message authentication) check.

Supports authenticated encryption and decryption via the [seal](seal.md) and [unseal](unseal.md) methods.

Can be serialized into JSON format via the [toJson](to-json.md) method and restored from JSON
by calling the constructor with a JSON string.

This class wraps the native c++ SymmetricKey class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Properties

| Name | Summary |
|---|---|
| [keyBytes](key-bytes.md) | The binary representation of the symmetric key.`val keyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The options that guided the derivation of this key from the seed.`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [seal](seal.md) | Use authenticated encryption to seal a [plaintext](seal.md#org.dicekeys.crypto.seeded.SymmetricKey$seal(kotlin.ByteArray, kotlin.String)/plaintext) message for secure storage or transmission, so that it can later be decrypted and authenticated by calling [unseal](unseal.md) with the same [SymmetricKey](./index.md) (or a copy of the key).`fun seal(plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)<br>Seals a string message by first converting it to UTF8 format.`fun seal(plaintext: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md) |
| [sealToCiphertextOnly](seal-to-ciphertext-only.md) | Use authenticated encryption to seal a [plaintext](seal-to-ciphertext-only.md#org.dicekeys.crypto.seeded.SymmetricKey$sealToCiphertextOnly(kotlin.ByteArray, kotlin.String)/plaintext) message for secure storage or transmission, so that it can later be decrypted and authenticated by calling [unseal](unseal.md) with the same [SymmetricKey](./index.md) (or a copy of the key).`fun sealToCiphertextOnly(plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Seals a string message by first converting it to UTF8 format.`fun sealToCiphertextOnly(plaintext: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [toJson](to-json.md) | Convert this symmetric key to JSON-format string so that it can be later reconstituted by passing the string to [fromJson](from-json.md).`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [unseal](unseal.md) | Decrypt and authenticate a message which had been sealed by [sealToCiphertextOnly](seal-to-ciphertext-only.md).`fun unseal(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) that was sealed with this [SymmetricKey](./index.md).`fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [deriveFromSeed](derive-from-seed.md) | Construct a symmetric key from a secret [seedString](derive-from-seed.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$deriveFromSeed(kotlin.String, kotlin.String)/seedString), which should have enough entropy to make it hard to guess (e.g. 128+ bits) and a set of public (non-secret) key-derivation options ([keyDerivationOptionsJson](derive-from-seed.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$deriveFromSeed(kotlin.String, kotlin.String)/keyDerivationOptionsJson)).`fun deriveFromSeed(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SymmetricKey`](./index.md) |
| [fromJson](from-json.md) | Construct a [SymmetricKey](./index.md) from a JSON format string, replicating the [SymmetricKey](./index.md) on which [toJson](to-json.md) was called to generate [symmetricKeyAsJson](from-json.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$fromJson(kotlin.String)/symmetricKeyAsJson)`fun fromJson(symmetricKeyAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SymmetricKey`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`SymmetricKey`](./index.md) |
| [unseal](unseal.md) | Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) by first re-deriving the [SymmetricKey](./index.md) from a [seedString](unseal.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$unseal(org.dicekeys.crypto.seeded.PackagedSealedMessage, kotlin.String)/seedString).`fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`, seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
