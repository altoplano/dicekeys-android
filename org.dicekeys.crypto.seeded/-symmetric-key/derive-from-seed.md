[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SymmetricKey](index.md) / [deriveFromSeed](./derive-from-seed.md)

# deriveFromSeed

`@JvmStatic fun deriveFromSeed(seedString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SymmetricKey`](index.md)

Construct a symmetric key from a secret [seedString](derive-from-seed.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$deriveFromSeed(kotlin.String, kotlin.String)/seedString), which should have enough
entropy to make it hard to guess (e.g. 128+ bits) and a set of public (non-secret)
key-derivation options ([keyDerivationOptionsJson](derive-from-seed.md#org.dicekeys.crypto.seeded.SymmetricKey.Companion$deriveFromSeed(kotlin.String, kotlin.String)/keyDerivationOptionsJson)).

