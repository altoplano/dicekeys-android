package org.dicekeys.api

//
//  DerivationRecipeTemplates.kt
//  DiceKeys
//
//  Auto-generated by recipe.ts in the DiceKeys specification TypeScript project.
//  Tue, 26 Jan 2021 10:27:10 GMT
//
import org.dicekeys.crypto.seeded.DerivationOptions

class DerivationRecipeTemplate(
        val type: DerivationOptions.Type,
        val name: String,
        val derivationOptionsJson: String
) {
    companion object {
        val defaults: Array<DerivationRecipeTemplate> = arrayOf(
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "1Password", """{"allow":[{"host":"*.1password.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Apple", """{"allow":[{"host":"*.apple.com"},{"host":"*.icloud.com"}],"lengthInChars":64}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Authy", """{"allow":[{"host":"*.authy.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Bitwarden", """{"allow":[{"host":"*.bitwarden.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Facebook", """{"allow":[{"host":"*.facebook.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Google", """{"allow":[{"host":"*.google.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Keeper", """{"allow":[{"host":"*.keepersecurity.com"},{"host":"*.keepersecurity.eu"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "LastPass", """{"allow":[{"host":"*.lastpass.com"}]}"""),
                DerivationRecipeTemplate(DerivationOptions.Type.Password, "Microsoft", """{"allow":[{"host":"*.microsoft.com"},{"host":"*.live.com"}]}""")
        )
    }
}
