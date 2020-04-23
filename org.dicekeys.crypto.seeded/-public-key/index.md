[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PublicKey](./index.md)

# PublicKey

`class PublicKey`

A [PublicKey](./index.md) is used to *seal* messages, in combination with a
[PrivateKey](../-private-key/index.md) which can *unseal* them.
The key pair of this [PublicKey](./index.md) and the matching [PrivateKey](../-private-key/index.md) are generated
from a seed and a set of key-derivation specified options in JSON format
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).

To derive a public key from a seed, first derive the corresponding
[PrivateKey](../-private-key/index.md) and then call [PrivateKey.getPublicKey](../-private-key/get-public-key.md).

Sealing a message (*plaintext*) creates a _ciphertext which contains
the message but from which observers who do not have the PrivateKey
cannot discern the contents of the message.
Sealing also provides integrity-protection, which will prevent the
message from being unsealed if it is modified.
We use the verbs seal and unseal, rather than encrypt and decrypt,
because the encrypting alone does not confer that the message includes
an integrity (message authentication) code to prove that the ciphertext
has not been tampered with.

Note that sealing data does not prevent attackers who capture a sealed message
(ciphertext) in transit with another validly-sealed message. A SigningKey
can be used to sign messages that another party can verify that the
message has not been forged or modified since the signer approved it.

This class wraps the native c++ PublicKey class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This constructor ensures copying does not copy the underlying pointer, which could lead to a use-after-free vulnerability or an exception on the second deletion.`PublicKey(other: `[`PublicKey`](./index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [keyBytes](key-bytes.md) | The binary representation of the public key.`val keyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The key-derivation options used to derive the [PublicKey](./index.md) and its corresponding [PrivateKey](../-private-key/index.md)`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getJsonQrCode](get-json-qr-code.md) | Get a QR code that encodes this public key in JSON format.`fun getJsonQrCode(maxEdgeLengthInDevicePixels: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = qrCodeNativeSizeInQrCodeSquarePixels * 2): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)<br>`fun getJsonQrCode(maxWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, maxHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html) |
| [seal](seal.md) | `fun seal(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)<br>Seal a plaintext message to create a ciphertext which can only be unsealed using the corresponding [PrivateKey](../-private-key/index.md). The [message](seal.md#org.dicekeys.crypto.seeded.PublicKey$seal(kotlin.String, kotlin.String)/message) string will be converted to UTF8 binary format before it is sealed.`fun seal(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md) |
| [sealJNI](seal-j-n-i.md) | Seal a plaintext message to create a ciphertext which can only be unsealed using the corresponding [PrivateKey](../-private-key/index.md). The [message](seal-j-n-i.md#org.dicekeys.crypto.seeded.PublicKey$sealJNI(kotlin.ByteArray, kotlin.String)/message) string will be converted to UTF8 binary format before it is sealed.`fun sealJNI(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toJson](to-json.md) | Serialize the object to JSON format so that it can later be reconstituted via a call to [fromJson](from-json.md).`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromJson](from-json.md) | Construct a [PublicKey](./index.md) from a JSON format string, replicating the [PublicKey](./index.md) on which [toJson](to-json.md) was called to generate [publicKeyAsJson](from-json.md#org.dicekeys.crypto.seeded.PublicKey.Companion$fromJson(kotlin.String)/publicKeyAsJson)`fun fromJson(publicKeyAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`PublicKey`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`PublicKey`](./index.md) |
