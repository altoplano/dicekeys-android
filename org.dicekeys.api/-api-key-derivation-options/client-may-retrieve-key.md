[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [ApiKeyDerivationOptions](index.md) / [clientMayRetrieveKey](./client-may-retrieve-key.md)

# clientMayRetrieveKey

`var clientMayRetrieveKey: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Unless this value is explicitly set to *true*, the DiceKeys may prevent
to obtain a raw derived [SymmetricKey](../../org.dicekeys.crypto.seeded/-symmetric-key/index.md),
[PrivateKey](../../org.dicekeys.crypto.seeded/-private-key/index.md), or
[SigningKey](../../org.dicekeys.crypto.seeded/-signing-key/index.md).
Clients may retrieve a derived [PublicKey](../../org.dicekeys.crypto.seeded/-public-key/index.md),
or [SignatureVerificationKey](../../org.dicekeys.crypto.seeded/-signature-verification-key/index.md) even if this value
is not set or set to false.

Even if this value is set to true, requests for keys are not permitted unless
the client would be authorized to perform cryptographic operations on those keys.
In other words, access is forbidden if the [restrictions](restrictions.md) field is set and the
specified [Restrictions](-restrictions/index.md) are not met.

