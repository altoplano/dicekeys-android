[DiceKeys](../../../index.md) / [org.dicekeys.api](../../index.md) / [ApiKeyDerivationOptions](../index.md) / [Restrictions](index.md) / [urlPrefixesAllowed](./url-prefixes-allowed.md)

# urlPrefixesAllowed

`var urlPrefixesAllowed: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?`

On Apple platforms, applications are specified by a URL containing a domain name
from the Internet's Domain Name System (DNS).

If this value is specified, applications must come from clients that have a URL prefix
starting with one of the items on this list if they are to use a derived key.

Since some platforms, including iOS, do not allow the DiceKeys app to authenticate
the sender of an API request, the app may perform a cryptographic operation
only if it has been instructed to send the result to a URL that starts with
one of the permitted prefixes.

