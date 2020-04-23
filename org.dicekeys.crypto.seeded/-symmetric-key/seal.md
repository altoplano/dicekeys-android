[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SymmetricKey](index.md) / [seal](./seal.md)

# seal

`fun seal(plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)

Use authenticated encryption to seal a [plaintext](seal.md#org.dicekeys.crypto.seeded.SymmetricKey$seal(kotlin.ByteArray, kotlin.String)/plaintext) message for secure storage or
transmission, so that it can later be decrypted and authenticated by calling
[unseal](unseal.md) with the same [SymmetricKey](index.md) (or a copy of the key).

If a [postDecryptionInstructions](seal.md#org.dicekeys.crypto.seeded.SymmetricKey$seal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) string is passed,
the exact same string must also be passed as [postDecryptionInstructions](seal.md#org.dicekeys.crypto.seeded.SymmetricKey$seal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions)
to [PrivateKey.unseal](../-private-key/unseal.md) the message with the corresponding [PrivateKey](../-private-key/index.md).
This allows the sealer to specify a public-set of instructions that the the party
unsealing must be aware of before the message can be unsealed.

Returns a [PackagedSealedMessage](../-packaged-sealed-message/index.md) containing not only the ciphertext, but the
plaintext [postDecryptionInstructions](seal.md#org.dicekeys.crypto.seeded.SymmetricKey$seal(kotlin.ByteArray, kotlin.String)/postDecryptionInstructions) the message was sealed with, which
are required for unsealing, as well as the [keyDerivationOptionsJson](key-derivation-options-json.md) used to
construct this [SymmetricKey](index.md) in case it needs to be re-derived from the
original secret seed.

`fun seal(plaintext: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../-packaged-sealed-message/index.md)

Seals a string message by first converting it to UTF8 format.

