[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SigningKey](./index.md)

# SigningKey

`class SigningKey`

[SigningKey](./index.md)s generate *signatures* of messages which can then be
used by the corresponding [SignatureVerificationKey](../-signature-verification-key/index.md) to verify that a message
was signed by  can confirm that the message was indeed signed by the
SigningKey and has not since been tampered with.

The corresponding SignatureVerificationKey can be obtained by calling
[getSignatureVerificationKey](get-signature-verification-key.md).

The key pair of the [SigningKey](./index.md) and [SignatureVerificationKey](../-signature-verification-key/index.md) is generated
from a seed and a set of key-derivation specified options in [keyDerivationOptionsJson](key-derivation-options-json.md)

This class wraps the native c++ SigningKey class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This constructor ensures copying does not copy the underlying pointer, which could lead to a use-after-free vulnerability or an exception on the second deletion.`SigningKey(other: `[`SigningKey`](./index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [keyDerivationOptionsJson](key-derivation-options-json.md) | Get the key-derivation options used to generate this [SigningKey](./index.md)`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [signatureVerificationKeyBytes](signature-verification-key-bytes.md) | The binary representation of the signature-verification key.`val signatureVerificationKeyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [signingKeyBytes](signing-key-bytes.md) | The binary representation of the signing-key.`val signingKeyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [generateSignature](generate-signature.md) | `fun generateSignature(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Generate a signature for a message, which can be used by the corresponding public SignatureVerificationKey to verify that this message was, in fact, signed by this key.`fun generateSignature(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [getSignatureVerificationKey](get-signature-verification-key.md) | Return the corresponding public signature-verification key that others can use to verify messages signed with this key.`fun getSignatureVerificationKey(): `[`SignatureVerificationKey`](../-signature-verification-key/index.md) |
| [toJson](to-json.md) | Serialize this object to a JSON-formatted string`fun toJson(minimizeSizeByRemovingTheSignatureVerificationKeyBytesWhichCanBeRegeneratedLater: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [deriveFromSeed](derive-from-seed.md) | Derive a signing/signature-verification key pair from a seed and a set of key-derivation options specified in JSON format.`fun deriveFromSeed(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SigningKey`](./index.md) |
| [fromJson](from-json.md) | Construct a [SigningKey](./index.md) from a JSON format string, replicating the [SigningKey](./index.md) on which [toJson](to-json.md) was called to generate [signingKeyAsJson](from-json.md#org.dicekeys.crypto.seeded.SigningKey.Companion$fromJson(kotlin.String)/signingKeyAsJson)`fun fromJson(signingKeyAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SigningKey`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`SigningKey`](./index.md) |
