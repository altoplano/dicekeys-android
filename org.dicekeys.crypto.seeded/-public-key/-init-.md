[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PublicKey](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`PublicKey(other: `[`PublicKey`](index.md)`)`

This constructor ensures copying does not copy the underlying pointer, which could
lead to a use-after-free vulnerability or an exception on the second deletion.

