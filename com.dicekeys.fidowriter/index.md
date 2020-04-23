[DiceKeys](../index.md) / [com.dicekeys.fidowriter](./index.md)

## Package com.dicekeys.fidowriter

This *sample* application seeds FIDO security keys with cryptographic keys derived from the user's DiceKey.

### Types

| Name | Summary |
|---|---|
| [ConnectionToWritableUsbFidoKey](-connection-to-writable-usb-fido-key/index.md) | A USB connection to a FIDO security key over the CTAP HID protocol.`open class ConnectionToWritableUsbFidoKey` |
| [ListOfWritableUsbFidoKeys](-list-of-writable-usb-fido-keys/index.md) | An class that maintains a list of FIDO security keys that support the write operation and are available over the USB bus and to which the app has permission to write to.`class ListOfWritableUsbFidoKeys` |
| [MainActivity](-main-activity/index.md) | The main activity for an application that seeds FIDO security keys using seeds obtained from a DiceKey using a DiceKeys API.`class MainActivity : `[`AppCompatActivity`](https://developer.android.com/reference/androidx/androidx/appcompat/app/AppCompatActivity.html) |

### Exceptions

| Name | Summary |
|---|---|
| [LoadKeyNotAuthorizedByUserException](-load-key-not-authorized-by-user-exception/index.md) | `class LoadKeyNotAuthorizedByUserException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) |
