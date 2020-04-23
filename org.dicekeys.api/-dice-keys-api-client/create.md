[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [create](./create.md)

# create

`@JvmStatic fun create(activity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`): `[`DiceKeysApiClient`](index.md)

Instantiate an API client for a use within a [Activity](https://developer.android.com/reference/android/app/Activity.html).

The [Activity](https://developer.android.com/reference/android/app/Activity.html) using the [DiceKeysApiClient](index.md) must pass a reference
to itself via the [activity](create.md#org.dicekeys.api.DiceKeysApiClient.Companion$create(android.app.Activity)/activity) parameter.

This client will send API requests to the DiceKeys app by creating intents and
calling [Activity.startActivityForResult](https://developer.android.com/reference/android/app/Activity.html#startActivityForResult(android.content.Intent, int)), but it needs your help
to relay the results. You must have your activity override
[Activity.onActivityResult](https://developer.android.com/reference/android/app/Activity.html#onActivityResult(int, int, android.content.Intent)) and pass the received intent to
your [DiceKeysApiClient](index.md)'s [handleOnActivityResult](handle-on-activity-result.md) method.

`@JvmStatic fun create(fragment: `[`Fragment`](https://developer.android.com/reference/androidx/androidx/fragment/app/Fragment.html)`): `[`DiceKeysApiClient`](index.md)

Instantiate an API client for a use within a [Fragment](https://developer.android.com/reference/androidx/androidx/fragment/app/Fragment.html).

The [Fragment](https://developer.android.com/reference/androidx/androidx/fragment/app/Fragment.html) using the [DiceKeysApiClient](index.md) must pass a reference
to itself via the [fragment](create.md#org.dicekeys.api.DiceKeysApiClient.Companion$create(androidx.fragment.app.Fragment)/fragment) parameter.

This client will send API requests to the DiceKeys app by creating intents and
calling [Fragment.startActivityForResult](https://developer.android.com/reference/androidx/androidx/fragment/app/Fragment.html#startActivityForResult(android.content.Intent, int)), but it needs your help
to relay the results. You must have your activity override
[Fragment.onActivityResult](https://developer.android.com/reference/androidx/androidx/fragment/app/Fragment.html#onActivityResult(int, int, android.content.Intent)) and pass the received intent to
your [DiceKeysApiClient](index.md)'s [handleOnActivityResult](handle-on-activity-result.md) method.

