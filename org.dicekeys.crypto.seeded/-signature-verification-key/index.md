[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SignatureVerificationKey](./index.md)

# SignatureVerificationKey

`class SignatureVerificationKey`

A [SignatureVerificationKey](./index.md) is used to verify that messages were
signed by its corresponding [SigningKey](../-signing-key/index.md).
[SigningKey](../-signing-key/index.md)s generate *signatures*, and by verifying a message/signature
pair the SignatureVerificationKey can confirm that the message was
indeed signed using the [SigningKey](../-signing-key/index.md).
The key pair of the [SigningKey](../-signing-key/index.md) and SignatureVerificationKey is generated
from a seed and a set of key-derivation specified options in

To derive a [SignatureVerificationKey](./index.md) from a seed, first derive the
corresponding SigningKey and then call [SigningKey.getSignatureVerificationKey](../-signing-key/get-signature-verification-key.md).

This class wraps the native c++ SignatureVerificationKey class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This constructor ensures copying does not copy the underlying pointer, which could lead to a use-after-free vulnerability or an exception on the second deletion.`SignatureVerificationKey(other: `[`PublicKey`](../-public-key/index.md)`)`<br>Construct by passing the classes' members`SignatureVerificationKey(keyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")` |

### Properties

| Name | Summary |
|---|---|
| [keyBytes](key-bytes.md) | The binary representation of the signature-verification key.`val keyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The key-derivation options used to derive this [SigningKey](../-signing-key/index.md) and its corresponding [SignatureVerificationKey](./index.md)`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getJsonQrCode](get-json-qr-code.md) | Get a QR code that encodes this signature-verification key in JSON format.`fun getJsonQrCode(maxEdgeLengthInDevicePixels: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = qrCodeNativeSizeInQrCodeSquarePixels * 2): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)<br>`fun getJsonQrCode(maxWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, maxHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html) |
| [toJson](to-json.md) | Serialize the object to JSON format so that it can later be reconstituted via a call to [fromJson](from-json.md),`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [verifySignature](verify-signature.md) | Verify that [message](verify-signature.md#org.dicekeys.crypto.seeded.SignatureVerificationKey$verifySignature(kotlin.ByteArray, kotlin.ByteArray)/message) was signed by this key's corresponding [SigningKey](../-signing-key/index.md) to generate [signature](verify-signature.md#org.dicekeys.crypto.seeded.SignatureVerificationKey$verifySignature(kotlin.ByteArray, kotlin.ByteArray)/signature).`fun verifySignature(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, signature: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`fun verifySignature(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, signature: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromJson](from-json.md) | Construct a [SignatureVerificationKey](./index.md) from a JSON format string, replicating the [SignatureVerificationKey](./index.md) on which [toJson](to-json.md) was called to generate [signatureVerificationKeyAsJson](from-json.md#org.dicekeys.crypto.seeded.SignatureVerificationKey.Companion$fromJson(kotlin.String)/signatureVerificationKeyAsJson)`fun fromJson(signatureVerificationKeyAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SignatureVerificationKey`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`SignatureVerificationKey`](./index.md) |
