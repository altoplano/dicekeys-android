[DiceKeys](../../index.md) / [org.dicekeys.trustedapp.apicommands.permissionchecked](../index.md) / [PermissionChecksAndHiddenSeeds](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`PermissionChecksAndHiddenSeeds(keySqr: `[`KeySqr`](../../org.dicekeys.keysqr/-key-sqr/index.md)`<`[`Face`](../../org.dicekeys.keysqr/-face/index.md)`>, clientsApplicationId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, askUserForApprovalOrReturnResultIfReady: (message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?)`

This class abstracts away all permissions checks AND all access to the keySqr seed,
so that the only way the Api which inherits from it can get to the seed is by
going through the permission checks.

