[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [KeyDerivationOptions](index.md) / [defaultAlgorithm](./default-algorithm.md)

# defaultAlgorithm

`val defaultAlgorithm: Algorithm?`

A read-only field that yields the default algorithm to use for the keyType
that has been ste for this object.  If keyType isn't set, or is set to
a value with no algorithm (Secret), then the value is null.

