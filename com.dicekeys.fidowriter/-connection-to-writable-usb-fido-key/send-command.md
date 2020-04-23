[DiceKeys](../../index.md) / [com.dicekeys.fidowriter](../index.md) / [ConnectionToWritableUsbFidoKey](index.md) / [sendCommand](./send-command.md)

# sendCommand

`fun sendCommand(command: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`, data: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, responseTimeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Defaults.TIMEOUT_MS, responseRetries: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1 + Defaults.RETRIES, responseRetryTimeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Defaults.RETRY_TIMEOUT_MS): HidResponseInitializationPacket`

Send a [command](send-command.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$sendCommand(kotlin.Byte, kotlin.ByteArray, kotlin.Int, kotlin.Int, kotlin.Int)/command) and [data](send-command.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$sendCommand(kotlin.Byte, kotlin.ByteArray, kotlin.Int, kotlin.Int, kotlin.Int)/data), then await and return the response.
While awaiting the response, timeout after [timeout](#) ms
and then retry up to [retries](#) time with [retryTimeout](#) ms
for each of the retries (attempts after the first attempt).

