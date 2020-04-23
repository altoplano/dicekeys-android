[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PrivateKey](./index.md)

# PrivateKey

`class PrivateKey`

A [PrivateKey](./index.md) is used to *unseal* messages sealed with its
corresponding [PublicKey](../-public-key/index.md).
The [PrivateKey](./index.md) and [PublicKey](../-public-key/index.md) are generated
from a seed and a set of key-derivation specified options in
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).

The [PrivateKey](./index.md) includes a copy of the public key in binary format, which can be
reconstituted as a [PublicKey](../-public-key/index.md) object via the [getPublicKey](get-public-key.md) method.

This class wraps the native c++ PrivateKey class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This constructor ensures copying does not copy the underlying pointer, which could lead to a use-after-free vulnerability or an exception on the second deletion.`PrivateKey(other: `[`PrivateKey`](./index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The options that guided the derivation of this key from the seed.`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [privateKeyBytes](private-key-bytes.md) | The internal binary representation of this private key.`val privateKeyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [publicKeyBytes](public-key-bytes.md) | The internal binary representation of this private key's corresponding public key.`val publicKeyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getPublicKey](get-public-key.md) | Get the corresponding [PublicKey](../-public-key/index.md) that can seal messages such that they can only be unsealed with the [PrivateKey](./index.md).`fun getPublicKey(): `[`PublicKey`](../-public-key/index.md) |
| [toJson](to-json.md) | `fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [unseal](unseal.md) | Unseal a ciphertext that was sealed by this key's corresponding [PublicKey](../-public-key/index.md).`fun unseal(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) that was sealed with the [PublicKey](../-public-key/index.md) corresponding to this [PrivateKey](./index.md).`fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [deriveFromSeed](derive-from-seed.md) | Derive a public/private key pair from a seed and a set of key-derivation options specified in JSON format.`fun deriveFromSeed(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`PrivateKey`](./index.md) |
| [fromJson](from-json.md) | Construct a [PrivateKey](./index.md) from a JSON format string, replicating the [PrivateKey](./index.md) on which [toJson](to-json.md) was called to generate [privateKeyAsJson](from-json.md#org.dicekeys.crypto.seeded.PrivateKey.Companion$fromJson(kotlin.String)/privateKeyAsJson)`fun fromJson(privateKeyAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`PrivateKey`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`PrivateKey`](./index.md) |
| [unseal](unseal.md) | Unseal a message by re-deriving the [PrivateKey](./index.md) from the secret [seedString](unseal.md#org.dicekeys.crypto.seeded.PrivateKey.Companion$unseal(kotlin.String, org.dicekeys.crypto.seeded.PackagedSealedMessage)/seedString) used to originally derive it.  The [PackagedSealedMessage.keyDerivationOptionsJson](../-packaged-sealed-message/key-derivation-options-json.md) needed to derive it is in the [packagedSealedMessage](unseal.md#org.dicekeys.crypto.seeded.PrivateKey.Companion$unseal(kotlin.String, org.dicekeys.crypto.seeded.PackagedSealedMessage)/packagedSealedMessage), as are the [PackagedSealedMessage.ciphertext](../-packaged-sealed-message/ciphertext.md) and [PackagedSealedMessage.postDecryptionInstructions](../-packaged-sealed-message/post-decryption-instructions.md).`fun unseal(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
