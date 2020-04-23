[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PackagedSealedMessage](index.md) / [postDecryptionInstructions](./post-decryption-instructions.md)

# postDecryptionInstructions

`val postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

An optional string that provides instructions the party unsealing the message should
be aware of (or is asked to follow).  If this is changed between when the message
is sealed and when it is unsealed the unseal operation will fail.

