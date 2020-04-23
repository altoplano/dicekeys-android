[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [Secret](index.md) / [secretBytes](./secret-bytes.md)

# secretBytes

`val secretBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

The secret as a byte array.

Unlike the raw byte arrays generated for keys (e.g. [PrivateKey](../-private-key/index.md)s and [SigningKey](../-signing-key/index.md)s),
which perform operations on internal binary keys and discourage callers from accessing
them directly,
the purpose of the [Secret](index.md) class is to expose this array of [secretBytes](./secret-bytes.md) to the
creator of this object.

