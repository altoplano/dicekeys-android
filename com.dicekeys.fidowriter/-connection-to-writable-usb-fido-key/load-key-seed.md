[DiceKeys](../../index.md) / [com.dicekeys.fidowriter](../index.md) / [ConnectionToWritableUsbFidoKey](index.md) / [loadKeySeed](./load-key-seed.md)

# loadKeySeed

`fun loadKeySeed(keySeedAs96Bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, fidoCounter: `[`UInt`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)` = ( (
                    System.currentTimeMillis() -
                            GregorianCalendar(2020, 0, 0, 0, 0, 0).timeInMillis
                    ) / 10).toUInt(), commandVersion: `[`UInt`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-int/index.html)` = 0u): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Issue the command to re-seed the security key with [keySeedAs96Bytes](load-key-seed.md#com.dicekeys.fidowriter.ConnectionToWritableUsbFidoKey$loadKeySeed(kotlin.ByteArray, kotlin.UInt, kotlin.UInt)/keySeedAs96Bytes).

