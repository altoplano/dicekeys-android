[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PackagedSealedMessage](index.md) / [toJson](./to-json.md)

# toJson

`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Serialize the object to a JSON format that stores the [ciphertext](ciphertext.md),
[keyDerivationOptionsJson](key-derivation-options-json.md), and [postDecryptionInstructions](post-decryption-instructions.md).
It can then be reconstructed via a call to [fromJson](from-json.md).

