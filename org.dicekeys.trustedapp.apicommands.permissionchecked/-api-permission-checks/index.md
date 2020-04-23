[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](../index.md) / [ApiPermissionChecks](./index.md)

# ApiPermissionChecks

`open class ApiPermissionChecks`

This class performs permission checks

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This class performs permission checks`ApiPermissionChecks(clientsApplicationId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, askUserForApprovalOrReturnResultIfReady: (message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?)` |

### Inheritors

| Name | Summary |
|---|---|
| [PermissionChecksAndHiddenSeeds](../-permission-checks-and-hidden-seeds/index.md) | This class abstracts away all permissions checks AND all access to the keySqr seed, so that the only way the Api which inherits from it can get to the seed is by going through the permission checks.`open class PermissionChecksAndHiddenSeeds : `[`ApiPermissionChecks`](./index.md) |
