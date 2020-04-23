[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [unsealWithSymmetricKey](./unseal-with-symmetric-key.md)

# unsealWithSymmetricKey

`fun unsealWithSymmetricKey(packagedSealedMessage: `[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)`, callback: Callback<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Unseal (decrypt &amp; authenticate) a [packagedSealedMessage](unseal-with-symmetric-key.md#org.dicekeys.api.DiceKeysApiClient$unsealWithSymmetricKey(org.dicekeys.crypto.seeded.PackagedSealedMessage, org.dicekeys.api.DiceKeysApiClient.Callback((kotlin.ByteArray)))/packagedSealedMessage) that was previously sealed with a
symmetric key derived from the user's DiceKey, the
[ApiKeyDerivationOptions](../-api-key-derivation-options/index.md) specified in JSON format via [PackagedSealedMessage.keyDerivationOptionsJson](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/key-derivation-options-json.md),
and any [PostDecryptionInstructions](../-post-decryption-instructions/index.md) optionally specified by [PackagedSealedMessage.postDecryptionInstructions](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/post-decryption-instructions.md)
in [Post-Decryption Instructions JSON Format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html).

If any of those strings change, the wrong key will be derive and the message will
not be successfully unsealed, yielding a [org.dicekeys.crypto.seeded.CryptographicVerificationFailureException](../../org.dicekeys.crypto.seeded/-cryptographic-verification-failure-exception/index.md) exception.

`suspend fun unsealWithSymmetricKey(packagedSealedMessage: `[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

unsealWithSymmetricKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

