[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [getSignatureVerificationKey](./get-signature-verification-key.md)

# getSignatureVerificationKey

`fun getSignatureVerificationKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback<`[`SignatureVerificationKey`](../../org.dicekeys.crypto.seeded/-signature-verification-key/index.md)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Get a public [SignatureVerificationKey](../../org.dicekeys.crypto.seeded/-signature-verification-key/index.md) derived from the user's DiceKey and the
[ApiKeyDerivationOptions](../-api-key-derivation-options/index.md) specified in JSON format via [keyDerivationOptionsJson](get-signature-verification-key.md#org.dicekeys.api.DiceKeysApiClient$getSignatureVerificationKey(kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.SignatureVerificationKey)))/keyDerivationOptionsJson)

`suspend fun getSignatureVerificationKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SignatureVerificationKey`](../../org.dicekeys.crypto.seeded/-signature-verification-key/index.md)

getSignatureVerificationKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

