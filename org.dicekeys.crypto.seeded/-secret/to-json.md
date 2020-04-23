[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [Secret](index.md) / [toJson](./to-json.md)

# toJson

`fun toJson(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Serialize the object to a JSON format that stores both the [secretBytes](secret-bytes.md)
and the [keyDerivationOptionsJson](key-derivation-options-json.md) used to generate it.
(The secret seed string used to generate it is not stored, as it is
not kept after the object is constructed.)

