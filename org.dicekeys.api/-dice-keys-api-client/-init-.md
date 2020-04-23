[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`DiceKeysApiClient(callingContext: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`)`

The API client used to ask the DiceKeys app to generate cryptographic keys seeded by a user's
DiceKey and to perform operations on the application's behalf.

**IMPORTANT**

**To use this API, you must:**

1. Call [create](create.md) to instantiate an API for your activity or fragment, which you can use
to make API calls/
2. Implement *onActivityResult* for your activity or fragment, and pass the
intent you receive to your API object's [handleOnActivityResult](handle-on-activity-result.md) function. This allows the
API to receive responses to API requests, process them, and return them to you.

If you forget the second step, your API calls will never return—a class of bug first
documented in ([Steiner and Hawes, 1949](https://en.wikipedia.org/wiki/M.T.A._(song))).

