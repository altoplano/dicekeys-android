[DiceKeys](../../../index.md) / [org.dicekeys.api](../../index.md) / [ApiKeyDerivationOptions](../index.md) / [Restrictions](index.md) / [androidPackagePrefixesAllowed](./android-package-prefixes-allowed.md)

# androidPackagePrefixesAllowed

`var androidPackagePrefixesAllowed: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?`

In Android, client applications are identified by their package name,
which must be cryptographically signed before an application can enter the
Google play store.

If this value is specified, Android apps must have a package name that begins
with one of the provided prefixes if they are to use a derived key.

Note that all prefixes, and the client package names they are compared to,
have an implicit '.' appended to to prevent attackers from registering the
suffix of a package name.  Hence the package name "com.example.app" is treated
as "com.example.app." and the prefix "com.example" is treated as
"com.example." so that an attacker cannot generate a key by registering
"com.examplesignedbyattacker".

