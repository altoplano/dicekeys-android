[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SignatureVerificationKey](index.md) / [verifySignature](./verify-signature.md)

# verifySignature

`fun verifySignature(message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, signature: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`fun verifySignature(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, signature: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Verify that [message](verify-signature.md#org.dicekeys.crypto.seeded.SignatureVerificationKey$verifySignature(kotlin.ByteArray, kotlin.ByteArray)/message) was signed by this key's corresponding [SigningKey](../-signing-key/index.md) to generate
[signature](verify-signature.md#org.dicekeys.crypto.seeded.SignatureVerificationKey$verifySignature(kotlin.ByteArray, kotlin.ByteArray)/signature).

