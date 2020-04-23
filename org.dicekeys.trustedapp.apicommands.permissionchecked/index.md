[DiceKeys](../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](./index.md)

## Package org.dicekeys.trustedapp.apicommands.permissionchecked

### Types

| Name | Summary |
|---|---|
| [ApiPermissionChecks](-api-permission-checks/index.md) | This class performs permission checks`open class ApiPermissionChecks` |
| [PermissionCheckedCommands](-permission-checked-commands/index.md) | Implements the server-side API calls and the necessary permission checks, using a structure that's locally testable (all intent marshalling and unmarshalling occurs outside this library.)`class PermissionCheckedCommands : `[`PermissionChecksAndHiddenSeeds`](-permission-checks-and-hidden-seeds/index.md) |
| [PermissionCheckedIntentCommands](-permission-checked-intent-commands/index.md) | Wrap the [PermissionCheckedCommands](-permission-checked-commands/index.md) to unmarshall parameters from the Android Intents (e.g. via `getStringExtra` or `getByteArrayExtra`) and then marshall the Api call's result into a result intent (e.g. via `putExtra`).`class PermissionCheckedIntentCommands` |
| [PermissionChecksAndHiddenSeeds](-permission-checks-and-hidden-seeds/index.md) | This class abstracts away all permissions checks AND all access to the keySqr seed, so that the only way the Api which inherits from it can get to the seed is by going through the permission checks.`open class PermissionChecksAndHiddenSeeds : `[`ApiPermissionChecks`](-api-permission-checks/index.md) |
