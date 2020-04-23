[DiceKeys](../../index.md) / [org.dicekeys.keysqr](../index.md) / [KeySqr](./index.md)

# KeySqr

`class KeySqr<F : `[`Face`](../-face/index.md)`>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KeySqr(faces: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<F>)` |

### Properties

| Name | Summary |
|---|---|
| [allDigitsAreDefined](all-digits-are-defined.md) | `val allDigitsAreDefined: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allLettersAndDigitsAreDefined](all-letters-and-digits-are-defined.md) | `val allLettersAndDigitsAreDefined: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allLettersAreDefined](all-letters-are-defined.md) | `val allLettersAreDefined: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allLettersDigitsAndOrientationsAreDefined](all-letters-digits-and-orientations-are-defined.md) | `val allLettersDigitsAndOrientationsAreDefined: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [allOrientationsAreDefined](all-orientations-are-defined.md) | `val allOrientationsAreDefined: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [faces](faces.md) | `val faces: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<F>` |

### Functions

| Name | Summary |
|---|---|
| [removeOrientations](remove-orientations.md) | `fun removeOrientations(): `[`KeySqr`](./index.md)`<`[`Face`](../-face/index.md)`>` |
| [rotate](rotate.md) | `fun rotate(clockwise90DegreeRotations: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`KeySqr`](./index.md)`<`[`Face`](../-face/index.md)`>` |
| [toCanonicalRotation](to-canonical-rotation.md) | `fun toCanonicalRotation(): `[`KeySqr`](./index.md)`<`[`Face`](../-face/index.md)`>` |
| [toHumanReadableForm](to-human-readable-form.md) | `fun toHumanReadableForm(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toKeySeed](to-key-seed.md) | `fun toKeySeed(excludeOrientationOfFaces: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [NumberOfFacesInKey](-number-of-faces-in-key.md) | `const val NumberOfFacesInKey: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [rotationIndexes](rotation-indexes.md) | `val rotationIndexes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>>` |
