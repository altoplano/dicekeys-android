[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SigningKey](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SigningKey(other: `[`SigningKey`](index.md)`)`

This constructor ensures copying does not copy the underlying pointer, which could
lead to a use-after-free vulnerability or an exception on the second deletion.

