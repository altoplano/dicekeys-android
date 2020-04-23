[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PrivateKey](index.md) / [unseal](./unseal.md)

# unseal

`fun unseal(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Unseal a ciphertext that was sealed by this key's corresponding [PublicKey](../-public-key/index.md).

If a [postDecryptionInstructions](unseal.md#org.dicekeys.crypto.seeded.PrivateKey$unseal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) was passed to the [PublicKey.seal](../-public-key/seal.md) operation,
the exact same string must also be passed as [postDecryptionInstructions](unseal.md#org.dicekeys.crypto.seeded.PrivateKey$unseal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) here.
This allows the sealer to specify a public-set of instructions that the party
unsealing must be aware of before the message can be unsealed.

`fun unseal(packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Unseal a [PackagedSealedMessage](../-packaged-sealed-message/index.md) that was sealed with the [PublicKey](../-public-key/index.md)
corresponding to this [PrivateKey](index.md).

`fun unseal(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, packagedSealedMessage: `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Unseal a message by re-deriving the [PrivateKey](index.md) from the secret [seedString](unseal.md#org.dicekeys.crypto.seeded.PrivateKey.Companion$unseal(kotlin.String, org.dicekeys.crypto.seeded.PackagedSealedMessage)/seedString)
used to originally derive it.  The [PackagedSealedMessage.keyDerivationOptionsJson](../-packaged-sealed-message/key-derivation-options-json.md)
needed to derive it is in the [packagedSealedMessage](unseal.md#org.dicekeys.crypto.seeded.PrivateKey.Companion$unseal(kotlin.String, org.dicekeys.crypto.seeded.PackagedSealedMessage)/packagedSealedMessage), as are the
[PackagedSealedMessage.ciphertext](../-packaged-sealed-message/ciphertext.md) and
[PackagedSealedMessage.postDecryptionInstructions](../-packaged-sealed-message/post-decryption-instructions.md).

