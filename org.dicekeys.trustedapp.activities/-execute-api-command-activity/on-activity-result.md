[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.activities](../index.md) / [ExecuteApiCommandActivity](index.md) / [onActivityResult](./on-activity-result.md)

# onActivityResult

`protected fun onActivityResult(requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, resultCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, data: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Handle results of activities to

* Load a DiceKey into memory if it isn't there when the command is executed
* Ask the user to respond to a warning
