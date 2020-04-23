[DiceKeys](../../../index.md) / [org.dicekeys.api](../../index.md) / [DiceKeysApiClient](../index.md) / [Callback](./index.md)

# Callback

`interface Callback<T>`

The generic wrapper for all callback classes used to get asynchronous
responses. (Kotlin users can avoid using callbacks by using the suspendable
APi calls.)

### Functions

| Name | Summary |
|---|---|
| [onComplete](on-complete.md) | `abstract fun onComplete(result: T): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onException](on-exception.md) | `abstract fun onException(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
