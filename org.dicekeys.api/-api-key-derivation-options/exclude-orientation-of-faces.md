[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [ApiKeyDerivationOptions](index.md) / [excludeOrientationOfFaces](./exclude-orientation-of-faces.md)

# excludeOrientationOfFaces

`var excludeOrientationOfFaces: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

When using a DiceKey as a seed, setting this value to true will exclude the orientation
of each face from the key, so that the seed is unchanged even if orientations are misread.
This reduces the lieklihood that, if a user copies their DiceKey manually and does not verify
it, an error in copying orientation would prevent them from re-generating their key.
It also reduces the security of the key.

For a key of 25 dice, it reduces the entropy by 50 (2x25) bits, from ~196 bits to ~146 bits.

