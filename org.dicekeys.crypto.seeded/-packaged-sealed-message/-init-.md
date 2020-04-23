[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [PackagedSealedMessage](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`PackagedSealedMessage(other: `[`PackagedSealedMessage`](index.md)`)`

A copy constructor to prevent copying of the native pointer, which would lead
to a use-after-dereference pointer vulnerability

`PackagedSealedMessage(ciphertext: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, keyDerivationOptionsJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Construct this object from its member values

