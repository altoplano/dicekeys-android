[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SigningKey](index.md) / [toJson](./to-json.md)

# toJson

`fun toJson(minimizeSizeByRemovingTheSignatureVerificationKeyBytesWhichCanBeRegeneratedLater: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Serialize this object to a JSON-formatted string

It can be reconstituted by calling the constructor with this string.

The JSON-encoding will always include the binary signing key bytes (in hex format)
and the keyDerviationOptionsJson used to derive the key, but the
signature-verification key bytes will not be included unless you set
the first parameter,
[minimizeSizeByRemovingTheSignatureVerificationKeyBytesWhichCanBeRegeneratedLater](to-json.md#org.dicekeys.crypto.seeded.SigningKey$toJson(kotlin.Boolean)/minimizeSizeByRemovingTheSignatureVerificationKeyBytesWhichCanBeRegeneratedLater),
to false (it defaults to true). As the excessively-long name implies,
when the signature-generation key is not included in the JSON format,
if can reconstituted from the signing-key shoudld it be needed again.
So, the default saves space at the cost of the computation to recalculate
the signature-verification key if it is needed later.

