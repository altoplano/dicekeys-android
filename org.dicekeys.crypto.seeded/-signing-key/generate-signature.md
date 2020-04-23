[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SigningKey](index.md) / [generateSignature](./generate-signature.md)

# generateSignature

`fun generateSignature(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`fun generateSignature(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

Generate a signature for a message, which can be used
by the corresponding public SignatureVerificationKey to verify that
this message was, in fact, signed by this key.

