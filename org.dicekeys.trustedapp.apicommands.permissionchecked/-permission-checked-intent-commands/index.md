[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](../index.md) / [PermissionCheckedIntentCommands](./index.md)

# PermissionCheckedIntentCommands

`class PermissionCheckedIntentCommands`

Wrap the [PermissionCheckedCommands](../-permission-checked-commands/index.md) to unmarshall parameters from the
Android Intents (e.g. via `getStringExtra` or `getByteArrayExtra`) and then
marshall the Api call's result into a result intent (e.g. via `putExtra`).

The caller is responsible for catching exceptions and marshalling them

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Wrap the [PermissionCheckedCommands](../-permission-checked-commands/index.md) to unmarshall parameters from the Android Intents (e.g. via `getStringExtra` or `getByteArrayExtra`) and then marshall the Api call's result into a result intent (e.g. via `putExtra`).`PermissionCheckedIntentCommands(api: `[`PermissionCheckedCommands`](../-permission-checked-commands/index.md)`, intent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`, returnIntent: (fn: (intent: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`) -> `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Functions

| Name | Summary |
|---|---|
| [generateSignature](generate-signature.md) | `fun generateSignature(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getPrivate](get-private.md) | `fun getPrivate(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getPublicKey](get-public-key.md) | `fun getPublicKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getSecret](get-secret.md) | `fun getSecret(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getSignatureVerificationKey](get-signature-verification-key.md) | `fun getSignatureVerificationKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getSigningKey](get-signing-key.md) | `fun getSigningKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getSymmetricKey](get-symmetric-key.md) | `fun getSymmetricKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [sealWithSymmetricKey](seal-with-symmetric-key.md) | `fun sealWithSymmetricKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [unsealWithPrivateKey](unseal-with-private-key.md) | `fun unsealWithPrivateKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?` |
| [unsealWithSymmetricKey](unseal-with-symmetric-key.md) | `fun unsealWithSymmetricKey(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`?` |
