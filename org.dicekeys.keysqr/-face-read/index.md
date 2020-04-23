[DiceKeys](../../index.md) / [org.dicekeys.keysqr](../index.md) / [FaceRead](./index.md)

# FaceRead

`@JsonClass(true) class FaceRead : `[`Face`](../-face/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FaceRead(underline: `[`Undoverline`](../-undoverline/index.md)`?, overline: `[`Undoverline`](../-undoverline/index.md)`?, orientationAsLowercaseLetterTRBL: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, ocrLetterCharsFromMostToLeastLikely: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, ocrDigitCharsFromMostToLeastLikely: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, center: `[`Point`](../-point/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [center](center.md) | `val center: `[`Point`](../-point/index.md) |
| [ocrDigitCharsFromMostToLeastLikely](ocr-digit-chars-from-most-to-least-likely.md) | `val ocrDigitCharsFromMostToLeastLikely: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ocrLetterCharsFromMostToLeastLikely](ocr-letter-chars-from-most-to-least-likely.md) | `val ocrLetterCharsFromMostToLeastLikely: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [orientationAsLowercaseLetterTRBL](orientation-as-lowercase-letter-t-r-b-l.md) | `val orientationAsLowercaseLetterTRBL: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [overline](overline.md) | `val overline: `[`Undoverline`](../-undoverline/index.md)`?` |
| [overlineCode](overline-code.md) | `val overlineCode: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`?` |
| [overlineDigit](overline-digit.md) | `val overlineDigit: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [overlineLetter](overline-letter.md) | `val overlineLetter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [underline](underline.md) | `val underline: `[`Undoverline`](../-undoverline/index.md)`?` |
| [underlineCode](underline-code.md) | `val underlineCode: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`?` |
| [underlineDigit](underline-digit.md) | `val underlineDigit: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [underlineLetter](underline-letter.md) | `val underlineLetter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [faceReadJsonAdapter](face-read-json-adapter.md) | `val faceReadJsonAdapter: JsonAdapter<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FaceRead`](./index.md)`>>` |
| [moshi](moshi.md) | `val moshi: Moshi!` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [keySqrFromJsonFacesRead](key-sqr-from-json-faces-read.md) | `fun keySqrFromJsonFacesRead(json: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`KeySqr`](../-key-sqr/index.md)`<`[`FaceRead`](./index.md)`>?` |
| [keySqrFromListOfFacesRead](key-sqr-from-list-of-faces-read.md) | `fun keySqrFromListOfFacesRead(facesRead: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FaceRead`](./index.md)`>): `[`KeySqr`](../-key-sqr/index.md)`<`[`FaceRead`](./index.md)`>` |
| [majorityOfThree](majority-of-three.md) | `fun majorityOfThree(a: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, b: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, c: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
