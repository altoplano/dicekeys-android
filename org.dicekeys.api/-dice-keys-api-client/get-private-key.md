[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getPrivateKey](./get-private-key.md)

# getPrivateKey

`fun getPrivateKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`PrivateKey`](../../org.dicekeys.crypto.seeded/-private-key/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Get a [PrivateKey](../../org.dicekeys.crypto.seeded/-private-key/index.md) derived from the user's DiceKey (the seed) and the key-derivation options
specified via [keyDerivationOptionsJson](get-private-key.md#org.dicekeys.api.DiceKeysApiClient$getPrivateKey(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.PrivateKey)))/keyDerivationOptionsJson),
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
which must specify
`"clientMayRetrieveKey": true`.

`suspend fun getPrivateKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`PrivateKey`](../../org.dicekeys.crypto.seeded/-private-key/index.md)

getPrivateKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

