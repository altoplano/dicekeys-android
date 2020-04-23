[DiceKeys](../../index.md) / [org.dicekeys.crypto.seeded](../index.md) / [SignatureVerificationKey](index.md) / [getJsonQrCode](./get-json-qr-code.md)

# getJsonQrCode

`fun getJsonQrCode(maxEdgeLengthInDevicePixels: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = qrCodeNativeSizeInQrCodeSquarePixels * 2): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)
`fun getJsonQrCode(maxWidth: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, maxHeight: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)

Get a QR code that encodes this signature-verification key in JSON format.

