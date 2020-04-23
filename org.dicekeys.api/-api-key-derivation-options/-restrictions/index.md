[DiceKeys](../../../index.md) / [org.dicekeys.api](../../index.md) / [ApiKeyDerivationOptions](../index.md) / [Restrictions](./index.md)

# Restrictions

`class Restrictions`

This subclass is used to determine which clients/sites are permitted to use keys
derived from a keyDerivationOptionsJson string.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | This subclass is used to determine which clients/sites are permitted to use keys derived from a keyDerivationOptionsJson string.`Restrictions(jsonObj: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)` = JSONObject())` |

### Properties

| Name | Summary |
|---|---|
| [androidPackagePrefixesAllowed](android-package-prefixes-allowed.md) | In Android, client applications are identified by their package name, which must be cryptographically signed before an application can enter the Google play store.`var androidPackagePrefixesAllowed: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [jsonObj](json-obj.md) | `var jsonObj: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html) |
| [urlPrefixesAllowed](url-prefixes-allowed.md) | On Apple platforms, applications are specified by a URL containing a domain name from the Internet's Domain Name System (DNS).`var urlPrefixesAllowed: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
