[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [generateSignature](./generate-signature.md)

# generateSignature

`fun generateSignature(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, callback: Callback<GenerateSignatureResult>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Sign a [message](generate-signature.md#org.dicekeys.api.DiceKeysApiClient$generateSignature(kotlin.String, kotlin.ByteArray, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.api.DiceKeysApiClient.GenerateSignatureResult)))/message) using a public/private signing key pair derived
from the user's DiceKey and the [ApiKeyDerivationOptions](../-api-key-derivation-options/index.md) specified in JSON format via
[keyDerivationOptionsJson](generate-signature.md#org.dicekeys.api.DiceKeysApiClient$generateSignature(kotlin.String, kotlin.ByteArray, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.api.DiceKeysApiClient.GenerateSignatureResult)))/keyDerivationOptionsJson).

`suspend fun generateSignature(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): GenerateSignatureResult`

generateSignature (same as above) implemented as a Kotlin suspend function
in place of callbacks.

