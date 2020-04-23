[DiceKeys](../../index.md) / [org.dicekeys.api](../index.md) / [PostDecryptionInstructions](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`PostDecryptionInstructions(postDecryptionInstructions: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

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

