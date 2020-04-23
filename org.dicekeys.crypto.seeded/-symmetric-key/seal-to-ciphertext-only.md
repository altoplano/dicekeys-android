[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SymmetricKey](index.md) / [sealToCiphertextOnly](./seal-to-ciphertext-only.md)

# sealToCiphertextOnly

`fun sealToCiphertextOnly(plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Use authenticated encryption to seal a [plaintext](seal-to-ciphertext-only.md#org.dicekeys.crypto.seeded.SymmetricKey$sealToCiphertextOnly(kotlin.ByteArray, kotlin.String)/plaintext) message for secure storage or
transmission, so that it can later be decrypted and authenticated by calling
[unseal](unseal.md) with the same [SymmetricKey](index.md) (or a copy of the key).

If a [postDecryptionInstructions](seal-to-ciphertext-only.md#org.dicekeys.crypto.seeded.SymmetricKey$sealToCiphertextOnly(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) string is passed,
the exact same string must also be passed as [postDecryptionInstructions](seal-to-ciphertext-only.md#org.dicekeys.crypto.seeded.SymmetricKey$sealToCiphertextOnly(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions)
to [PrivateKey.unseal](../-private-key/unseal.md) the message with the corresponding [PrivateKey](../-private-key/index.md).
This allows the sealer to specify a public-set of instructions that the the party
unsealing must be aware of before the message can be unsealed.

`fun sealToCiphertextOnly(plaintext: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Seals a string message by first converting it to UTF8 format.

