[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [Secret](./index.md)

# Secret

`class Secret`

This class represents secret , which is  derived from a seed
and set of key-derivation specified options in
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).

Because secret derivation uses a one-way function, this secret can be shared without
revealing the secret seed used to derive it.
It can then be used and, if lost, re-derived from the original seed and
[keyDerivationOptionsJson](key-derivation-options-json.md) that were first used to derive it.

This class wraps the native c++ Secret class from the
DiceKeys [Seeded Cryptography Library](https://dicekeys.github.io/seeded-crypto/).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A copy constructor to prevent copying of the native pointer, which would lead to a use-after-dereference pointer vulnerability`Secret(other: `[`Secret`](./index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [keyDerivationOptionsJson](key-derivation-options-json.md) | The options that guided the derivation of this key from the raw seed that was passed to [fromJson](from-json.md).`val keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [secretBytes](secret-bytes.md) | The secret as a byte array.`val secretBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Functions

| Name | Summary |
|---|---|
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [toJson](to-json.md) | Serialize the object to a JSON format that stores both the [secretBytes](secret-bytes.md) and the [keyDerivationOptionsJson](key-derivation-options-json.md) used to generate it. (The secret seed string used to generate it is not stored, as it is not kept after the object is constructed.)`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toSerializedBinaryForm](to-serialized-binary-form.md) | Convert this object to serialized binary form so that this object can be replicated/reconstituted via a call to [fromSerializedBinaryForm](from-serialized-binary-form.md)`fun toSerializedBinaryForm(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [deriveFromSeed](derive-from-seed.md) | Derive a new [Secret](./index.md) from a secret seed string and a set of key-derivation options specified in JSON format.`fun deriveFromSeed(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Secret`](./index.md) |
| [fromJson](from-json.md) | Construct a [Secret](./index.md) from a JSON format string, replicating the [Secret](./index.md) on which [toJson](to-json.md) was called to generate [seedAsJson](from-json.md#org.dicekeys.crypto.seeded.Secret.Companion$fromJson(kotlin.String)/seedAsJson)`fun fromJson(seedAsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Secret`](./index.md) |
| [fromSerializedBinaryForm](from-serialized-binary-form.md) | Reconstruct this object from serialized binary form using a ByteArray that was constructed via [toSerializedBinaryForm](to-serialized-binary-form.md).`fun fromSerializedBinaryForm(asSerializedBinaryForm: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Secret`](./index.md) |
