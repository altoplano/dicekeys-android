[DiceKeys](../../index.md) / [org.dicekeys.read](../index.md) / [KeySqrAnalyzer](./index.md)

# KeySqrAnalyzer

`class KeySqrAnalyzer : `[`Analyzer`](https://developer.android.com/reference/androidx/androidx/camera/core/ImageAnalysis/Analyzer.html)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KeySqrAnalyzer(activity: `[`ReadKeySqrActivity`](../-read-key-sqr-activity/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [activity](activity.md) | `val activity: `[`ReadKeySqrActivity`](../-read-key-sqr-activity/index.md) |
| [done](done.md) | `var done: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onActionDone](on-action-done.md) | `var onActionDone: (`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onActionOverlay](on-action-overlay.md) | `var onActionOverlay: (`[`Bitmap`](https://developer.android.com/reference/android/graphics/Bitmap.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Functions

| Name | Summary |
|---|---|
| [analyze](analyze.md) | `fun analyze(image: `[`ImageProxy`](https://developer.android.com/reference/androidx/androidx/camera/core/ImageProxy.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
