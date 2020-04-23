[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [KeyDerivationOptions](index.md) / [toJson](./to-json.md)

# toJson

`fun toJson(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Generate JSON for these key-derivation options.

*DO NOT* assume this will always generate the same JSON string, as the JSON
spec allows fields to be placed in different orders.
Any change will yield a different key.
Rather, the original JSON string should be preserved.
This library is designed to preserve the keyDerivationOptionsJson string for you.
All derived keys, including the public [PublicKey](../-public-key/index.md) and [SignatureVerificationKey](../-signature-verification-key/index.md), contain
the keyDerivationOptionsJson used to derive them so that the corresponding
[PrivateKey](../-private-key/index.md) and [SigningKey](../-signing-key/index.md) can be re-derived if needed.
All values sealed by a [SymmetricKey](../-symmetric-key/index.md) or [PublicKe](#) are returned in a
[PackagedSealedMessage](../-packaged-sealed-message/index.md) class which contains the keyDerivationOptionsJson needed
to re-derive the keys to unseal the message (but not the seed, as that would
allow anyone who intercepts the message to re-derive the key.)

