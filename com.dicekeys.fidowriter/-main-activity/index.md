[DiceKeys](../../index.md) / [com.dicekeys.fidowriter](../index.md) / [MainActivity](./index.md)

# MainActivity

`class MainActivity : `[`AppCompatActivity`](https://developer.android.com/reference/androidx/androidx/appcompat/app/AppCompatActivity.html)

The main activity for an application that seeds FIDO security keys using
seeds obtained from a DiceKey using a DiceKeys API.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The main activity for an application that seeds FIDO security keys using seeds obtained from a DiceKey using a DiceKeys API.`MainActivity()` |

### Functions

| Name | Summary |
|---|---|
| [deviceReadyToWrite](device-ready-to-write.md) | `fun deviceReadyToWrite(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getSeed](get-seed.md) | `fun getSeed(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?` |
| [isSeedValid](is-seed-valid.md) | `fun isSeedValid(s: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`? = getSeed()): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onActivityResult](on-activity-result.md) | `fun onActivityResult(requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, resultCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, data: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onCreate](on-create.md) | `fun onCreate(savedInstanceState: `[`Bundle`](https://developer.android.com/reference/android/os/Bundle.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResume](on-resume.md) | `fun onResume(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [writeToCurrentFidoToken](write-to-current-fido-token.md) | `fun writeToCurrentFidoToken(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
