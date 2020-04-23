[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PublicKey](index.md) / [seal](./seal.md)

# seal

`fun seal(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`fun seal(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)

Seal a plaintext message to create a ciphertext which can only be unsealed
using the corresponding [PrivateKey](../-private-key/index.md). The [message](seal.md#org.dicekeys.crypto.seeded.PublicKey$seal(kotlin.String, kotlin.String)/message) string will be converted
to UTF8 binary format before it is sealed.

If a [postDecryptionInstructions](seal.md#org.dicekeys.crypto.seeded.PublicKey$seal(kotlin.String, kotlin.String)/postDecryptionInstructions) string is passed,
the exact same string must also be passed as [postDecryptionInstructions](seal.md#org.dicekeys.crypto.seeded.PublicKey$seal(kotlin.String, kotlin.String)/postDecryptionInstructions)
to [PrivateKey.unseal](../-private-key/unseal.md) the message with the corresponding [PrivateKey](../-private-key/index.md).
This allows the sealer to specify a public-set of instructions that the party
unsealing must be aware of before the message can be unsealed.

