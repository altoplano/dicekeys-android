[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getSecret](./get-secret.md)

# getSecret

`fun getSecret(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`Secret`](../../org.dicekeys.crypto.seeded/-secret/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Derive a pseudo-random cryptographic [Secret](../../org.dicekeys.crypto.seeded/-secret/index.md) from the user's DiceKey and
the key-derivation options passed as [keyDerivationOptionsJson](get-secret.md#org.dicekeys.api.DiceKeysApiClient$getSecret(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.Secret)))/keyDerivationOptionsJson)
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).

`suspend fun getSecret(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Secret`](../../org.dicekeys.crypto.seeded/-secret/index.md)

getSeed (same as above) implemented as a Kotlin suspend function
in place of callbacks.

