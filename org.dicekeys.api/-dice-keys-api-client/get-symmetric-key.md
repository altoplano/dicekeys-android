[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getSymmetricKey](./get-symmetric-key.md)

# getSymmetricKey

`fun getSymmetricKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`SymmetricKey`](../../org.dicekeys.crypto.seeded/-symmetric-key/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Get a [SymmetricKey](../../org.dicekeys.crypto.seeded/-symmetric-key/index.md) derived from the user's DiceKey (the seed) and the key-derivation options
specified via [keyDerivationOptionsJson](get-symmetric-key.md#org.dicekeys.api.DiceKeysApiClient$getSymmetricKey(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.SymmetricKey)))/keyDerivationOptionsJson),
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
which must specify
`"clientMayRetrieveKey": true`.

`suspend fun getSymmetricKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SymmetricKey`](../../org.dicekeys.crypto.seeded/-symmetric-key/index.md)

getSymmetricKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

