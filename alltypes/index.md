

## DiceKeys for Android

### All Types

| Name | Summary |
|---|---|
|

##### [org.dicekeys.api.ApiKeyDerivationOptions](../org.dicekeys.api/-api-key-derivation-options/index.md)

Used to construct and parse the strings in
[key-derivation options JSON format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html),
which specify how to derive cryptographic keys from seed string.
These JSON strings appear throughout the API (and in the [DiceKeysApiClient](../org.dicekeys.api/-dice-keys-api-client/index.md)) as a
parameter named *keyDerivationOptionsJson*.


|

##### [org.dicekeys.trustedapp.apicommands.permissionchecked.ApiPermissionChecks](../org.dicekeys.trustedapp.apicommands.permissionchecked/-api-permission-checks/index.md)

This class performs permission checks


|

##### [org.dicekeys.api.ClientMayNotRetrieveKeyException](../org.dicekeys.api/-client-may-not-retrieve-key-exception/index.md)


|

##### [org.dicekeys.crypto.seeded.ClientNotAuthorizedException](../org.dicekeys.crypto.seeded/-client-not-authorized-exception/index.md)


|

##### [org.dicekeys.api.ClientPackageNotAuthorizedException](../org.dicekeys.api/-client-package-not-authorized-exception/index.md)

Thrown when a key to be derived has requirements in keyDerivationOptionsJson that disallow
the calling client application from accessing or using the key.


|

##### [com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey](../com.dicekeys.fidowriter/-connection-to-writable-usb-fido-key/index.md)

A USB connection to a FIDO security key over the CTAP HID protocol.


|

##### [org.dicekeys.crypto.seeded.CryptographicVerificationFailureException](../org.dicekeys.crypto.seeded/-cryptographic-verification-failure-exception/index.md)

Thrown when a cryptographic operation fails.


|

##### [org.dicekeys.api.DiceKeysApiClient](../org.dicekeys.api/-dice-keys-api-client/index.md)

The API client used to ask the DiceKeys app to generate cryptographic keys seeded by a user's
DiceKey and to perform operations on the application's behalf.


|

##### [org.dicekeys.api.DiceKeysAppNotPresentException](../org.dicekeys.api/-dice-keys-app-not-present-exception/index.md)


|

##### [org.dicekeys.trustedapp.activities.DisplayPublicKeyActivity](../org.dicekeys.trustedapp.activities/-display-public-key-activity/index.md)


|

##### [org.dicekeys.trustedapp.activities.ExecuteApiCommandActivity](../org.dicekeys.trustedapp.activities/-execute-api-command-activity/index.md)


|

##### [org.dicekeys.keysqr.Face](../org.dicekeys.keysqr/-face/index.md)


|

##### [org.dicekeys.keysqr.FaceDimensionsFractional](../org.dicekeys.keysqr/-face-dimensions-fractional/index.md)


|

##### [org.dicekeys.keysqr.FaceRead](../org.dicekeys.keysqr/-face-read/index.md)


|

##### [org.dicekeys.keysqr.FaceWithUnderlineAndOverlineCode](../org.dicekeys.keysqr/-face-with-underline-and-overline-code/index.md)


|

##### [org.dicekeys.crypto.seeded.InvalidArgumentException](../org.dicekeys.crypto.seeded/-invalid-argument-exception/index.md)

A generic exception for invalid arguments.


|

##### [org.dicekeys.crypto.seeded.InvalidKeyDerivationOptionsJsonException](../org.dicekeys.crypto.seeded/-invalid-key-derivation-options-json-exception/index.md)

Thrown when a keyDerivationOptionsJson parameter contains a string that is neither
empty nor in valid JSON format.


|

##### [org.dicekeys.crypto.seeded.InvalidKeyDerivationOptionValueException](../org.dicekeys.crypto.seeded/-invalid-key-derivation-option-value-exception/index.md)

Thrown when a keyDerivationOptionsJson parameter contains a field that has an invalid
or forbidden value.


|

##### [org.dicekeys.crypto.seeded.JsonParsingException](../org.dicekeys.crypto.seeded/-json-parsing-exception/index.md)

Thrown when JSON parsing fails, such as when trying to re-constitute an object
in JSON format that was corrupted.


|

##### [org.dicekeys.crypto.seeded.KeyDerivationOptions](../org.dicekeys.crypto.seeded/-key-derivation-options/index.md)

A class to parse and construct key-derivation options in *keyDerivationOptionsJson* format.


|

##### [org.dicekeys.crypto.seeded.KeyLengthException](../org.dicekeys.crypto.seeded/-key-length-exception/index.md)

Thrown when keyDerivationOptionsJson parameter contains an invalid keyLengthInBytes field.


|

##### [org.dicekeys.keysqr.KeySqr](../org.dicekeys.keysqr/-key-sqr/index.md)


|

##### [org.dicekeys.read.KeySqrAnalyzer](../org.dicekeys.read/-key-sqr-analyzer/index.md)


|

##### [org.dicekeys.read.KeySqrDrawable](../org.dicekeys.read/-key-sqr-drawable/index.md)


|

##### [org.dicekeys.read.KeySqrRenderer](../org.dicekeys.read/-key-sqr-renderer/index.md)


|

##### [org.dicekeys.trustedapp.state.KeySqrState](../org.dicekeys.trustedapp.state/-key-sqr-state/index.md)


|

##### [org.dicekeys.keysqr.Line](../org.dicekeys.keysqr/-line/index.md)


|

##### [com.dicekeys.fidowriter.ListOfWritableUsbFidoKeys](../com.dicekeys.fidowriter/-list-of-writable-usb-fido-keys/index.md)

An class that maintains a list of FIDO security keys
that support the write operation and are available
over the USB bus and to which the app has permission to
write to.


|

##### [com.dicekeys.fidowriter.LoadKeyNotAuthorizedByUserException](../com.dicekeys.fidowriter/-load-key-not-authorized-by-user-exception/index.md)


|

##### [com.dicekeys.fidowriter.MainActivity](../com.dicekeys.fidowriter/-main-activity/index.md)

The main activity for an application that seeds FIDO security keys using
seeds obtained from a DiceKey using a DiceKeys API.


|

##### [org.dicekeys.trustedapp.activities.MainActivity](../org.dicekeys.trustedapp.activities/-main-activity/index.md)


|

##### [org.dicekeys.crypto.seeded.PackagedSealedMessage](../org.dicekeys.crypto.seeded/-packaged-sealed-message/index.md)

This class stores everything needed to unseal a message
sealed with a [SymmetricKey](../org.dicekeys.crypto.seeded/-symmetric-key/index.md) or [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md), so long as you have either the seed from which
that key was derived from *or* the key itself:


|

##### [org.dicekeys.trustedapp.apicommands.permissionchecked.PermissionCheckedCommands](../org.dicekeys.trustedapp.apicommands.permissionchecked/-permission-checked-commands/index.md)

Implements the server-side API calls and the necessary permission checks,
using a structure that's locally testable
(all intent marshalling and unmarshalling occurs outside this library.)


|

##### [org.dicekeys.trustedapp.apicommands.permissionchecked.PermissionCheckedIntentCommands](../org.dicekeys.trustedapp.apicommands.permissionchecked/-permission-checked-intent-commands/index.md)

Wrap the [PermissionCheckedCommands](../org.dicekeys.trustedapp.apicommands.permissionchecked/-permission-checked-commands/index.md) to unmarshall parameters from the
Android Intents (e.g. via `getStringExtra` or `getByteArrayExtra`) and then
marshall the Api call's result into a result intent (e.g. via `putExtra`).


|

##### [org.dicekeys.trustedapp.apicommands.permissionchecked.PermissionChecksAndHiddenSeeds](../org.dicekeys.trustedapp.apicommands.permissionchecked/-permission-checks-and-hidden-seeds/index.md)

This class abstracts away all permissions checks AND all access to the keySqr seed,
so that the only way the Api which inherits from it can get to the seed is by
going through the permission checks.


|

##### [org.dicekeys.keysqr.Point](../org.dicekeys.keysqr/-point/index.md)


|

##### [org.dicekeys.api.PostDecryptionInstructions](../org.dicekeys.api/-post-decryption-instructions/index.md)

Parse or construct
[post-decryption instructions JSON format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html)
strings. If constructing from a JSON string, the class will be populated with the fields
specified by that JSON object.  Or, pass an empty string to the constructor, set the
fields using `apply`, and then generate a postDecryptionInstructions string.


|

##### [org.dicekeys.crypto.seeded.PrivateKey](../org.dicekeys.crypto.seeded/-private-key/index.md)

A [PrivateKey](../org.dicekeys.crypto.seeded/-private-key/index.md) is used to *unseal* messages sealed with its
corresponding [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md).
The [PrivateKey](../org.dicekeys.crypto.seeded/-private-key/index.md) and [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md) are generated
from a seed and a set of key-derivation specified options in
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).


|

##### [org.dicekeys.crypto.seeded.PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md)

A [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md) is used to *seal* messages, in combination with a
[PrivateKey](../org.dicekeys.crypto.seeded/-private-key/index.md) which can *unseal* them.
The key pair of this [PublicKey](../org.dicekeys.crypto.seeded/-public-key/index.md) and the matching [PrivateKey](../org.dicekeys.crypto.seeded/-private-key/index.md) are generated
from a seed and a set of key-derivation specified options in JSON format
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).


|

##### [org.dicekeys.read.ReadKeySqr](../org.dicekeys.read/-read-key-sqr/index.md)


|

##### [org.dicekeys.read.ReadKeySqrActivity](../org.dicekeys.read/-read-key-sqr-activity/index.md)


|

##### [org.dicekeys.crypto.seeded.Secret](../org.dicekeys.crypto.seeded/-secret/index.md)

This class represents secret , which is  derived from a seed
and set of key-derivation specified options in
[Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).


|

##### [org.dicekeys.crypto.seeded.SignatureVerificationKey](../org.dicekeys.crypto.seeded/-signature-verification-key/index.md)

A [SignatureVerificationKey](../org.dicekeys.crypto.seeded/-signature-verification-key/index.md) is used to verify that messages were
signed by its corresponding [SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md).
[SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md)s generate *signatures*, and by verifying a message/signature
pair the SignatureVerificationKey can confirm that the message was
indeed signed using the [SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md).
The key pair of the [SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md) and SignatureVerificationKey is generated
from a seed and a set of key-derivation specified options in


|

##### [org.dicekeys.crypto.seeded.SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md)

[SigningKey](../org.dicekeys.crypto.seeded/-signing-key/index.md)s generate *signatures* of messages which can then be
used by the corresponding [SignatureVerificationKey](../org.dicekeys.crypto.seeded/-signature-verification-key/index.md) to verify that a message
was signed by  can confirm that the message was indeed signed by the
SigningKey and has not since been tampered with.


|

##### [org.dicekeys.crypto.seeded.SymmetricKey](../org.dicekeys.crypto.seeded/-symmetric-key/index.md)

A SymmetricKey can be used to seal and unseal messages.
This SymmetricKey class can be (re) derived from a seed using
set of key-derivation options specified in [Key-Derivation Options JSON Format](https://dicekeys.github.io/seeded-crypto/key_derivation_options_format.html).
So, you can use this symmetric-key to seal a message, throw the
key away, and re-generate the key when you need to unseal the
message so long as you still have the original seed and
keyDerivationOptionsJson.


|

##### [org.dicekeys.keysqr.Undoverline](../org.dicekeys.keysqr/-undoverline/index.md)


|

##### [org.dicekeys.crypto.seeded.UnknownException](../org.dicekeys.crypto.seeded/-unknown-exception/index.md)


