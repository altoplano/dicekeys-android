[DiceKeys](../../index.md) / [com.dicekeys.fidowriter](../index.md) / [ListOfWritableUsbFidoKeys](./index.md)

# ListOfWritableUsbFidoKeys

`class ListOfWritableUsbFidoKeys`

An class that maintains a list of FIDO security keys
that support the write operation and are available
over the USB bus and to which the app has permission to
write to.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | An class that maintains a list of FIDO security keys that support the write operation and are available over the USB bus and to which the app has permission to write to.`ListOfWritableUsbFidoKeys(usbManager: `[`UsbManager`](https://developer.android.com/reference/android/hardware/usb/UsbManager.html)`, permissionIntent: `[`PendingIntent`](https://developer.android.com/reference/android/app/PendingIntent.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [devices](devices.md) | `val devices: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`UsbDevice`](https://developer.android.com/reference/android/hardware/usb/UsbDevice.html)`>` |

### Functions

| Name | Summary |
|---|---|
| [connect](connect.md) | Establish a connection to a device by name`fun connect(deviceName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ConnectionToWritableUsbFidoKey`](../-connection-to-writable-usb-fido-key/index.md)<br>Establish a connection to a USB device that supports FIDO writing`fun connect(device: `[`UsbDevice`](https://developer.android.com/reference/android/hardware/usb/UsbDevice.html)`): `[`ConnectionToWritableUsbFidoKey`](../-connection-to-writable-usb-fido-key/index.md) |
| [hasPermission](has-permission.md) | Check if a device is one the app has the user's permission to connect to.`fun hasPermission(device: `[`UsbDevice`](https://developer.android.com/reference/android/hardware/usb/UsbDevice.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [requestPermission](request-permission.md) | Request permission to connect to a device`fun requestPermission(device: `[`UsbDevice`](https://developer.android.com/reference/android/hardware/usb/UsbDevice.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
