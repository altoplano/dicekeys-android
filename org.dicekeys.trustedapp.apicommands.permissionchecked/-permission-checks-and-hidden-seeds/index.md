[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](../index.md) / [PermissionChecksAndHiddenSeeds](./index.md)

# PermissionChecksAndHiddenSeeds

`open class PermissionChecksAndHiddenSeeds : `[`ApiPermissionChecks`](../-api-permission-checks/index.md)

This class abstracts away all permissions checks AND all access to the keySqr seed,
so that the only way the Api which inherits from it can get to the seed is by
going through the permission checks.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This class abstracts away all permissions checks AND all access to the keySqr seed, so that the only way the Api which inherits from it can get to the seed is by going through the permission checks.`PermissionChecksAndHiddenSeeds(keySqr: `[`KeySqr`](../../org.dicekeys.keysqr/-key-sqr/index.md)`<`[`Face`](../../org.dicekeys.keysqr/-face/index.md)`>, clientsApplicationId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, askUserForApprovalOrReturnResultIfReady: (message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?)` |

### Inheritors

| Name | Summary |
|---|---|
| [PermissionCheckedCommands](../-permission-checked-commands/index.md) | Implements the server-side API calls and the necessary permission checks, using a structure that's locally testable (all intent marshalling and unmarshalling occurs outside this library.)`class PermissionCheckedCommands : `[`PermissionChecksAndHiddenSeeds`](./index.md) |
