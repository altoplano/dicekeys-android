[DiceKeys](./index.md)

## DiceKeys for Android

### Overview

The DiceKeys app enables mutually-distrusting applications to derive keys and
other secrets from the user's DiceKey without actually seeing the DiceKey.

Your applications can communicate with the DiceKeys app via the [DiceKeysApiClient](org.dicekeys.api/-dice-keys-api-client/index.md).
You can ask the DiceKeys app to derive cryptographic keys seeded by the user's DiceKey,
to perform cryptographic operations using the derived keys,
and to give those keys to your application if it is authorized to receive them.
You specify how keys are derived and who can access them via the
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html/),
which you can construct and parse using the [ApiKeyDerivationOptions](org.dicekeys.api/-api-key-derivation-options/index.md) class.

The API builds on the the cross-platform
[Seeded Cryptography C++ Library](https://dicekeys.github.io/seeded-crypto/).
That library implements seeded
symmetric keys ([SymmetricKey](org.dicekeys.crypto.seeded/-symmetric-key/index.md));
assymetric key pairs for public-key encryption ([PublicKey](org.dicekeys.crypto.seeded/-public-key/index.md)) and decryption ([PrivateKey](org.dicekeys.crypto.seeded/-private-key/index.md));
assymetric key pairs for digital signatures ([SigningKey](org.dicekeys.crypto.seeded/-signing-key/index.md)) and their verification [SignatureVerificationKey](org.dicekeys.crypto.seeded/-signature-verification-key/index.md)),
as well as a general-purpose derived [Secret](org.dicekeys.crypto.seeded/-secret/index.md).
When messages are sealed with the *seal* operation of [SymmetricKey](org.dicekeys.crypto.seeded/-symmetric-key/index.md) or [PublicKey](org.dicekeys.crypto.seeded/-public-key/index.md),
the ciphertext is stored within a [PackagedSealedMessage](org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md).

The FIDO writer application, [com.dicekeys.fidowriter](com.dicekeys.fidowriter/index.md), is a real-world
use case which is also small enough to be a good sample application.
It seeds FIDO security keys with a secret it has the DiceKeys app derive
from the user's DiceKey.
If the FIDO security key is lost, the user can use this app to re-derive the
secret from their DiceKey, and turn a replacement key into a perfect replica
of the security key they lost.
(Only a limited set of FIDO security keys support this write operation.)

### Packages

| Name | Summary |
|---|---|
| [com.dicekeys.fidowriter](com.dicekeys.fidowriter/index.md) | This *sample* application seeds FIDO security keys with cryptographic keys derived from the user's DiceKey. |
| [org.dicekeys.api](org.dicekeys.api/index.md) | Your can use the [DiceKeysApiClient](org.dicekeys.api/-dice-keys-api-client/index.md) in this package to ask the DiceKeys app to derive keys from the user's DiceKey, and to perform cryptographic operations on your application's behalf. This package uses and returns keys from the [org.dicekeys.crypto.seeded](org.dicekeys.crypto.seeded/index.md) package. |
| [org.dicekeys.crypto.seeded](org.dicekeys.crypto.seeded/index.md) | This wrapper for the DiceKeys [Seeded Cryptography C++ Library](https://dicekeys.github.io/seeded-crypto/), provides cryptographic keys seeded by DiceKeys (or other strings) and cryptographic operations using those keys. |

### Index

[All Types](alltypes/index.md)