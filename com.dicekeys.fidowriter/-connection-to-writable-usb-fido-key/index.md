[DiceKeys](../../index.md) / [com.dicekeys.fidowriter](../index.md) / [ConnectionToWritableUsbFidoKey](./index.md)

# ConnectionToWritableUsbFidoKey

`@ExperimentalUnsignedTypes open class ConnectionToWritableUsbFidoKey`

A USB connection to a FIDO security key over the CTAP HID protocol.

Wow, that's an excessive list of acronyms.  Let's go through them.

* USB: Universal Serial Bus
* CTAP: Client to Authenticator Protocol of the FIDO protocol.
    (Wait, we're supposed to be reducing the list of acronyms to learn, not increasing it!)
* FIDO: the Fast IDentity Online alliance, whose member companies are acronymophiles
* HID: Human Interface Device portion of the CTAP protocol (the one for USB devices), as
    [documented](https://fidoalliance.org/specs/fido-v2.0-id-20180227/fido-client-to-authenticator-protocol-v2.0-id-20180227.html#usb))
    by the FIDO alliance.

### Types

| Name | Summary |
|---|---|
| [Commands](-commands/index.md) | Hardcoded command identifiers specified for the CTAP protocol`object Commands` |
| [CtapHidInitResponseFields](-ctap-hid-init-response-fields/index.md) | A data class for accessing the fields of a CTAP HID Init Response packet`data class CtapHidInitResponseFields` |
| [Defaults](-defaults/index.md) | Internal default values for timeouts and reties`object Defaults` |
| [Endpoints](-endpoints/index.md) | `object Endpoints` |
| [Errors](-errors/index.md) | The error code returned when an operation is denied (e.g. if the user did not press the key three times to authorize a write.)`object Errors` |
| [HidResponseInitializationPacket](-hid-response-initialization-packet/index.md) | A class for parsing a byte array representing an HID Response Initialization Packet into an [channel](-hid-response-initialization-packet/channel.md), [cmd](-hid-response-initialization-packet/cmd.md), [dataLength](-hid-response-initialization-packet/data-length.md), and [data](-hid-response-initialization-packet/data.md) array.`open class HidResponseInitializationPacket` |
| [Interface](-interface/index.md) | `object Interface` |

### Functions

| Name | Summary |
|---|---|
| [finalize](finalize.md) | `fun finalize(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [loadKeySeed](load-key-seed.md) | Issue the command to re-seed the security key with [keySeedAs96Bytes](load-key-seed.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$loadKeySeed(kotlin.ByteArray, kotlin.UInt, kotlin.UInt)/keySeedAs96Bytes).`fun loadKeySeed(keySeedAs96Bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, fidoCounter: `[`UInt`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)` = ( (
                    System.currentTimeMillis() -
                            GregorianCalendar(2020, 0, 0, 0, 0, 0).timeInMillis
                    ) / 10).toUInt(), commandVersion: `[`UInt`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)` = 0u): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [sendCommand](send-command.md) | Send a [command](send-command.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$sendCommand(kotlin.Byte, kotlin.ByteArray, kotlin.Int, kotlin.Int, kotlin.Int)/command) and [data](send-command.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$sendCommand(kotlin.Byte, kotlin.ByteArray, kotlin.Int, kotlin.Int, kotlin.Int)/data), then await and return the response. While awaiting the response, timeout after [timeout](#) ms and then retry up to [retries](#) time with [retryTimeout](#) ms for each of the retries (attempts after the first attempt).`fun sendCommand(command: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`, data: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, responseTimeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Defaults.TIMEOUT_MS, responseRetries: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1 + Defaults.RETRIES, responseRetryTimeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Defaults.RETRY_TIMEOUT_MS): HidResponseInitializationPacket` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [connect](connect.md) | Construct a [ConnectionToWritableUsbFidoKey](./index.md) class for a given [device](connect.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey.Companion$connect(android.hardware.usb.UsbManager, android.hardware.usb.UsbDevice)/device) which can be will be opened via the provided [usbManager](connect.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey.Companion$connect(android.hardware.usb.UsbManager, android.hardware.usb.UsbDevice)/usbManager).`fun connect(usbManager: `[`UsbManager`](https://developer.android.com/reference/android/hardware/usb/UsbManager.html)`, device: `[`UsbDevice`](https://developer.android.com/reference/android/hardware/usb/UsbDevice.html)`): `[`ConnectionToWritableUsbFidoKey`](./index.md) |
