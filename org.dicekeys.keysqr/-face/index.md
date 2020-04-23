[DiceKeys](../../index.md) / [org.dicekeys.keysqr](../index.md) / [Face](./index.md)

# Face

`@JsonClass(true) open class Face`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Face(letter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, digit: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, orientationAsLowercaseLetterTRBL: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = '?')` |

### Properties

| Name | Summary |
|---|---|
| [clockwise90DegreeRotationsFromUpright](clockwise90-degree-rotations-from-upright.md) | `val clockwise90DegreeRotationsFromUpright: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`?` |
| [digit](digit.md) | `open val digit: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [letter](letter.md) | `open val letter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [orientationAsLowercaseLetterTRBL](orientation-as-lowercase-letter-t-r-b-l.md) | `open val orientationAsLowercaseLetterTRBL: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [overlineCode](overline-code.md) | `open val overlineCode: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`?` |
| [underlineCode](underline-code.md) | `open val underlineCode: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`?` |
| [undoverlineCodes](undoverline-codes.md) | `val undoverlineCodes: `[`FaceWithUnderlineAndOverlineCode`](../-face-with-underline-and-overline-code/index.md)`?` |

### Functions

| Name | Summary |
|---|---|
| [rotate](rotate.md) | `fun rotate(clockwise90DegreeRotations: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Face`](./index.md) |
| [toHumanReadableForm](to-human-readable-form.md) | `fun toHumanReadableForm(includeFaceOrientations: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [keySqrFromHumanReadableForm](key-sqr-from-human-readable-form.md) | `fun keySqrFromHumanReadableForm(hrf: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`KeySqr`](../-key-sqr/index.md)`<`[`Face`](./index.md)`>` |
| [majorityOfThree](majority-of-three.md) | `fun majorityOfThree(a: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, b: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, c: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [FaceRead](../-face-read/index.md) | `class FaceRead : `[`Face`](./index.md) |
