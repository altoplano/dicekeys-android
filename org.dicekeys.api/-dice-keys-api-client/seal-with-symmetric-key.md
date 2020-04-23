[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [sealWithSymmetricKey](./seal-with-symmetric-key.md)

# sealWithSymmetricKey

`fun sealWithSymmetricKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", callback: Callback<`[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)`>): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Seal (encrypt with a message-authentication code) a message ([plaintext](seal-with-symmetric-key.md#org.dicekeys.api.DiceKeysApiClient$sealWithSymmetricKey(kotlin.String, kotlin.ByteArray, kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.PackagedSealedMessage)))/plaintext)) with a
symmetric key derived from the user's DiceKey, the
[keyDerivationOptionsJson](seal-with-symmetric-key.md#org.dicekeys.api.DiceKeysApiClient$sealWithSymmetricKey(kotlin.String, kotlin.ByteArray, kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.PackagedSealedMessage)))/keyDerivationOptionsJson)
in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
and [PostDecryptionInstructions](../-post-decryption-instructions/index.md) specified via a JSON string as
[postDecryptionInstructions](seal-with-symmetric-key.md#org.dicekeys.api.DiceKeysApiClient$sealWithSymmetricKey(kotlin.String, kotlin.ByteArray, kotlin.String, org.dicekeys.api.DiceKeysApiClient.Callback((org.dicekeys.crypto.seeded.PackagedSealedMessage)))/postDecryptionInstructions) in the
in [Post-Decryption Instructions JSON Format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html).

`suspend fun sealWithSymmetricKey(keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, plaintext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)

Seal (same as above) implemented as a Kotlin suspend function in place of callbacks.

