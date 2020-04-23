[DiceKeys](../../../index.md) / [com.dicekeys.fidowriter](../../index.md) / [ConnectionToWritableUsbFidoKey](../index.md) / [HidResponseInitializationPacket](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`HidResponseInitializationPacket(hidResponsePacketBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, cmdToValidate: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`? = null, dataLengthToValidate: `[`UShort`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html)`? = null)`

A class for parsing a byte array representing an
HID Response Initialization Packet into an
[channel](channel.md), [cmd](cmd.md), [dataLength](data-length.md), and [data](data.md) array.

Throw an [InvalidCommandException](-invalid-command-exception/index.md) if [cmdToValidate](#) is set and
[cmd](cmd.md) is not [cmdToValidate](#).

Throw an [InvalidLengthException](-invalid-length-exception/index.md) if [dataLengthToValidate](#) is set and
the message [dataLength](data-length.md) is not [lengthToValidate](#).

