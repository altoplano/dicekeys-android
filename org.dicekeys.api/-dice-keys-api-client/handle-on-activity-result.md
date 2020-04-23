[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [handleOnActivityResult](./handle-on-activity-result.md)

# handleOnActivityResult

`fun handleOnActivityResult(resultIntent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Activities and Fragments that use this API should implement onActivityResult and
and call handleOnActivityResult with the data/intent (third parameter) received.
Doing so allows this class to process results returned to the activity/fragment
and then call the appropriate callback functions when an API call has either
succeeded or failed.

