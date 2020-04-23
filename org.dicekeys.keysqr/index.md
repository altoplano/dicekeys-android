[DiceKeys](../index.md) / [org.dicekeys.keysqr](./index.md)

## Package org.dicekeys.keysqr

This *primarily internal* library is used by the DiceKeys app to represent DiceKeys as a square of
faces (or KeySqr), which can not only represent boxes of six-sided dice but also square of
two-sided chips.

### Types

| Name | Summary |
|---|---|
| [Face](-face/index.md) | `open class Face` |
| [FaceDimensionsFractional](-face-dimensions-fractional/index.md) | `object FaceDimensionsFractional` |
| [FaceRead](-face-read/index.md) | `class FaceRead : `[`Face`](-face/index.md) |
| [FaceWithUnderlineAndOverlineCode](-face-with-underline-and-overline-code/index.md) | `class FaceWithUnderlineAndOverlineCode` |
| [KeySqr](-key-sqr/index.md) | `class KeySqr<F : `[`Face`](-face/index.md)`>` |
| [Line](-line/index.md) | `class Line` |
| [Point](-point/index.md) | `class Point` |
| [Undoverline](-undoverline/index.md) | `class Undoverline` |

### Properties

| Name | Summary |
|---|---|
| [FaceDigits](-face-digits.md) | `val FaceDigits: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>` |
| [FaceLetters](-face-letters.md) | `val FaceLetters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>` |
| [FaceRotationLetters](-face-rotation-letters.md) | `val FaceRotationLetters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>` |
| [letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes](letter-index-times-six-plus-digit-index-face-with-undoverline-codes.md) | `val letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FaceWithUnderlineAndOverlineCode`](-face-with-underline-and-overline-code/index.md)`>` |
| [MinNumberOfBlackDotsInUndoverline](-min-number-of-black-dots-in-undoverline.md) | `const val MinNumberOfBlackDotsInUndoverline: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [MinNumberOfWhiteDotsInUndoverline](-min-number-of-white-dots-in-undoverline.md) | `const val MinNumberOfWhiteDotsInUndoverline: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [NullFaceWithUnderlineAndOverlineCode](-null-face-with-underline-and-overline-code.md) | `val NullFaceWithUnderlineAndOverlineCode: `[`FaceWithUnderlineAndOverlineCode`](-face-with-underline-and-overline-code/index.md) |
| [NumberOfDotsInUndoverline](-number-of-dots-in-undoverline.md) | `const val NumberOfDotsInUndoverline: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [overlineCodeToFaceWithUnderlineAndOverlineCode](overline-code-to-face-with-underline-and-overline-code.md) | `val overlineCodeToFaceWithUnderlineAndOverlineCode: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FaceWithUnderlineAndOverlineCode`](-face-with-underline-and-overline-code/index.md)`>` |
| [underlineCodeToFaceWithUnderlineAndOverlineCode](underline-code-to-face-with-underline-and-overline-code.md) | `val underlineCodeToFaceWithUnderlineAndOverlineCode: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FaceWithUnderlineAndOverlineCode`](-face-with-underline-and-overline-code/index.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [decodeUndoverlineByte](decode-undoverline-byte.md) | `fun decodeUndoverlineByte(isOverline: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, letterDigitEncodingByte: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`FaceWithUnderlineAndOverlineCode`](-face-with-underline-and-overline-code/index.md) |
