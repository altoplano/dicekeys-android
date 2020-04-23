[DiceKeys](../../../index.md) / [com.dicekeys.fidowriter](../../index.md) / [ConnectionToWritableUsbFidoKey](../index.md) / [HidResponseInitializationPacket](index.md) / [dataLength](./data-length.md)

# dataLength

`val dataLength: `[`UShort`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html)

The message's data length is the unsigned two-byte big-endian value starting at the
sixth byte (index 5). It may exceed the length of the data in this single packet.

