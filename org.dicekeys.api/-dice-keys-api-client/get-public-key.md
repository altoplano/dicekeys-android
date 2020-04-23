[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getPublicKey](./get-public-key.md)

# getPublicKey

`fun getPublicKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`PublicKey`](../../org.dicekeys.crypto.seeded/-public-key/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Get a [PublicKey](../../org.dicekeys.crypto.seeded/-public-key/index.md) derived from the user's DiceKey and the [ApiKeyDerivationOptions](../-api-key-derivation-options/index.md) specified
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html)
as [keyDerivationOptionsJson](get-public-key.md#org.dicekeys.api.DiceKeysApiClient$getPublicKey(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.PublicKey)))/keyDerivationOptionsJson).

`suspend fun getPublicKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`PublicKey`](../../org.dicekeys.crypto.seeded/-public-key/index.md)

getPublicKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

