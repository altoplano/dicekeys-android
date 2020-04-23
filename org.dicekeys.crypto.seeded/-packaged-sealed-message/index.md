[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PackagedSealedMessage](./index.md)

# PackagedSealedMessage

`class PackagedSealedMessage`

This class stores everything needed to unseal a message
sealed with a [SymmetricKey](../-symmetric-key/index.md) or [PublicKey](../-public-key/index.md), so long as you have either the seed from which
that key was derived from *or* the key itself:

This class wraps the native c++ PackagedSealedMessage class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A copy constructor to prevent copying of the native pointer, which would lead to a use-after-dereference pointer vulnerability`PackagedSealedMessage(other: `[`PackagedSealedMessage`](./index.md)`)`<br>Construct this object from its member values`PackagedSealedMessage(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [ciphertext](ciphertext.md) | The encrypted message in binary format`val ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The options that guided the derivation of the key used to seal/unseal the message.`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [postDecryptionInstructions](post-decryption-instructions.md) | An optional string that provides instructions the party unsealing the message should be aware of (or is asked to follow).  If this is changed between when the message is sealed and when it is unsealed the unseal operation will fail.`val postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toJson](to-json.md) | Serialize the object to a JSON format that stores the [ciphertext](ciphertext.md), [keyDerivationOptionsJson](key-derivation-options-json.md), and [postDecryptionInstructions](post-decryption-instructions.md). It can then be reconstructed via a call to [fromJson](from-json.md).`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromJson](from-json.md) | Construct a [PackagedSealedMessage](./index.md) from a JSON format string, replicating the [PackagedSealedMessage](./index.md) on which [toJson](to-json.md) was called to generate [packagedSealedMessageAsJson](from-json.md#org.dicekeys.crypto.seeded.PackagedSealedMessage.Companion$fromJson(kotlin.ByteArray)/packagedSealedMessageAsJson)`fun fromJson(packagedSealedMessageAsJson: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`PackagedSealedMessage`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`PackagedSealedMessage`](./index.md) |
