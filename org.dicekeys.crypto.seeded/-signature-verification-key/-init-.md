[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SignatureVerificationKey](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SignatureVerificationKey(other: `[`PublicKey`](../-public-key/index.md)`)`

This constructor ensures copying does not copy the underlying pointer, which could
lead to a use-after-free vulnerability or an exception on the second deletion.

`SignatureVerificationKey(keyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")`

Construct by passing the classes' members

