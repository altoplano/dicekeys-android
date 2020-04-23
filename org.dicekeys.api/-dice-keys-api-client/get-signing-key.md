[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getSigningKey](./get-signing-key.md)

# getSigningKey

`fun getSigningKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`SigningKey`](../../org.dicekeys.crypto.seeded/-signing-key/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Get a [SigningKey](../../org.dicekeys.crypto.seeded/-signing-key/index.md) derived from the user's DiceKey (the seed) and the key-derivation options
specified via [keyDerivationOptionsJson](get-signing-key.md#org.dicekeys.api.DiceKeysApiClient$getSigningKey(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.SigningKey)))/keyDerivationOptionsJson),
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
which must specify
`"clientMayRetrieveKey": true`.

`suspend fun getSigningKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SigningKey`](../../org.dicekeys.crypto.seeded/-signing-key/index.md)

getSigningKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

