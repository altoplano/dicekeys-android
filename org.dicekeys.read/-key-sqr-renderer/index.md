[DiceKeys](../../index.md) / [org.dicekeys.read](../index.md) / [KeySqrRenderer](./index.md)

# KeySqrRenderer

`class KeySqrRenderer`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KeySqrRenderer(typeface: `[`Typeface`](https://developer.android.com/reference/android/graphics/Typeface.html)`?)` |

### Functions

| Name | Summary |
|---|---|
| [renderFace](render-face.md) | `fun renderFace(face: `[`Face`](../../org.dicekeys.keysqr/-face/index.md)`, canvas: `[`Canvas`](https://developer.android.com/reference/android/graphics/Canvas.html)`, faceSize: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = minOf(canvas.width, canvas.height).toFloat(), textPaint: `[`Paint`](https://developer.android.com/reference/android/graphics/Paint.html)` = textPaintForFaceSize(faceSize), x: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0f, y: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 0f): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [renderKeySqr](render-key-sqr.md) | `fun renderKeySqr(keySqr: `[`KeySqr`](../../org.dicekeys.keysqr/-key-sqr/index.md)`<`[`Face`](../../org.dicekeys.keysqr/-face/index.md)`>, canvas: `[`Canvas`](https://developer.android.com/reference/android/graphics/Canvas.html)`, size: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = minOf(canvas.width, canvas.height).toFloat(), x: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = (canvas.width - size) / 2, y: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = (canvas.height - size) / 2): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
