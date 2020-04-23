[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SigningKey](index.md) / [signatureVerificationKeyBytes](./signature-verification-key-bytes.md)

# signatureVerificationKeyBytes

`val signatureVerificationKeyBytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)

The binary representation of the signature-verification key.

If this key was reconstituted from a JSON format where the signature-verification key bytes
were not stored, accessing this getter will cause them to be regenerated.

(You should not need to access this directly unless you are
need to extend the functionality of this library by operating
on keys directly.)

