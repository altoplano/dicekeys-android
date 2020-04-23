[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [DiceKeysApiClient](index.md) / [unsealWithPrivateKey](./unseal-with-private-key.md)

# unsealWithPrivateKey

`fun unsealWithPrivateKey(packagedSealedMessage: `[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)`, callback: Callback<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>? = null): `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)

Unseal (decrypt &amp; authenticate) a message that was previously sealed with a
[PublicKey](../../org.dicekeys.crypto.seeded/-public-key/index.md) to construct a [PackagedSealedMessage](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md).
The public/private key pair will be re-derived from the user's seed (DiceKey) and the
key-derivation options packaged with the message.  It will also ensure that the
post-decryption instructions have not changed since the message was packaged.

`suspend fun unsealWithPrivateKey(packagedSealedMessage: `[`PackagedSealedMessage`](../../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

unsealWithPrivateKey (same as above) implemented as a Kotlin suspend function
in place of callbacks.

