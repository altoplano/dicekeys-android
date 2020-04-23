[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](../index.md) / [PermissionCheckedIntentCommands](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`PermissionCheckedIntentCommands(api: `[`PermissionCheckedCommands`](../-permission-checked-commands/index.md)`, intent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`, returnIntent: (fn: (intent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`) -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

Wrap the [PermissionCheckedCommands](../-permission-checked-commands/index.md) to unmarshall parameters from the
Android Intents (e.g. via `getStringExtra` or `getByteArrayExtra`) and then
marshall the Api call's result into a result intent (e.g. via `putExtra`).

The caller is responsible for catching exceptions and marshalling them

