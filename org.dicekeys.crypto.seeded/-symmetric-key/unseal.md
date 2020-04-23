[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SymmetricKey](index.md) / [unseal](./unseal.md)

# unseal

`fun unseal(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Decrypt and authenticate a message which had been sealed by [sealToCiphertextOnly](seal-to-ciphertext-only.md).

If a [postDecryptionInstructions](unseal.md#org.dicekeys.crypto.seeded.SymmetricKey$unseal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) was passed to the [PublicKey.seal](../-public-key/seal.md) operation,
the exact same string must also be passed as [postDecryptionInstructions](unseal.md#org.dicekeys.crypto.seeded.SymmetricKey$unseal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) here.
This allows the sealer to specify a public-set of instructions that the party
unsealing must be aware of before the message can be unsealed.

`fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) that was sealed with this [SymmetricKey](index.md).

`@JvmStatic fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`, seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) by first re-deriving the [SymmetricKey](index.md)
from a [seedString](unseal.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$unseal(org.dicekeys.crypto.seeded.PackagedSealedMessage, kotlin.String)/seedString).

