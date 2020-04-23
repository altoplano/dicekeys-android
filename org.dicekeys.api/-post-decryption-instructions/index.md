[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [PostDecryptionInstructions](./index.md)

# PostDecryptionInstructions

`open class PostDecryptionInstructions : `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)

Parse or construct
[post-decryption instructions JSON format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html)
strings. If constructing from a JSON string, the class will be populated with the fields
specified by that JSON object.  Or, pass an empty string to the constructor, set the
fields using `apply`, and then generate a postDecryptionInstructions string.

For example:

``` kotlin
val postDecryptionInstructions = PostDecryptionInstructions().apply{
  userMustAcknowledgeThisMessage = "Only allow this message to be unsealed if you want to spoilers for season 6."
}.toJson()

val message = PostDecryptionInstructions(postDecryptionInstructions).userMustAcknowledgeThisMessage
```

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Parse or construct [post-decryption instructions JSON format](https://dicekeys.github.io/seeded-crypto/post_decryption_instructions_format.html) strings. If constructing from a JSON string, the class will be populated with the fields specified by that JSON object.  Or, pass an empty string to the constructor, set the fields using `apply`, and then generate a postDecryptionInstructions string.`PostDecryptionInstructions(postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [restrictions](restrictions.md) | `var restrictions: Restrictions?` |
| [userMustAcknowledgeThisMessage](user-must-acknowledge-this-message.md) | `var userMustAcknowledgeThisMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [toJson](to-json.md) | `fun toJson(indent: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
