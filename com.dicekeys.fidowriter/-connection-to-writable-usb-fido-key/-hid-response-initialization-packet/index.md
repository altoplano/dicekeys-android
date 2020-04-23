[DiceKeys](../../../index.md) / [com.dicekeys.fidowriter](../../index.md) / [ConnectionToWritableUsbFidoKey](../index.md) / [HidResponseInitializationPacket](./index.md)

# HidResponseInitializationPacket

`@ExperimentalUnsignedTypes open class HidResponseInitializationPacket`

A class for parsing a byte array representing an
HID Response Initialization Packet into an
[channel](channel.md), [cmd](cmd.md), [dataLength](data-length.md), and [data](data.md) array.

Throw an [InvalidCommandException](-invalid-command-exception/index.md) if [cmdToValidate](#) is set and
[cmd](cmd.md) is not [cmdToValidate](#).

Throw an [InvalidLengthException](-invalid-length-exception/index.md) if [dataLengthToValidate](#) is set and
the message [dataLength](data-length.md) is not [lengthToValidate](#).

### Exceptions

| Name | Summary |
|---|---|
| [InvalidCommandException](-invalid-command-exception/index.md) | `class InvalidCommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) |
| [InvalidLengthException](-invalid-length-exception/index.md) | `class InvalidLengthException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | A class for parsing a byte array representing an HID Response Initialization Packet into an [channel](channel.md), [cmd](cmd.md), [dataLength](data-length.md), and [data](data.md) array.`HidResponseInitializationPacket(hidResponsePacketBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, cmdToValidate: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`? = null, dataLengthToValidate: `[`UShort`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [channel](channel.md) | The channel the packet was received on. (The first four bytes of the packet)`val channel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [cmd](cmd.md) | The command is the lower 7 bits of the 5th byte in the packet (index 4, after the 4-byte channel)`val cmd: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [data](data.md) | The data bytes are the bytes starting with the 8th byte (the byte at index 7)`val data: `[`ByteBuffer`](https://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html) |
| [dataLength](data-length.md) | The message's data length is the unsigned two-byte big-endian value starting at the sixth byte (index 5). It may exceed the length of the data in this single packet.`val dataLength: `[`UShort`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-short/index.html) |
| [hidResponsePacketBytes](hid-response-packet-bytes.md) | `val hidResponsePacketBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) |
| [morePacketsRequired](more-packets-required.md) | More packets are required if the total bytes in the message is greater than the number of bytes in this packet.`val morePacketsRequired: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
