package org.dicekeys.trustedapp.apicommands.permissionchecked

import org.dicekeys.crypto.seeded.*
import org.dicekeys.api.*
import org.dicekeys.keysqr.Face
import org.dicekeys.keysqr.KeySqr

/**
 * Implements the server-side API calls and the necessary permission checks,
 * using a structure that's locally testable
 * (all intent marshalling and unmarshalling occurs outside this library.)
 *
 * Internally, this class does not have access to the keySqr.
 * The only way it can get seeds is by calling the [PermissionChecksAndHiddenSeeds]
 * to get the seeds through the reference monitor.
 *
 * Internally, all API calls only use seeds to create key or [Secret] objects,
 * and keys are generated by one of the following two functions which centralize
 * security checks:
 * [getSeedOrThrowIfClientNotAuthorized], which throws an exception if the client
 * application is not authorized to use the key or [Secret] being derived, and
 * for calls to [getPrivateKey], [getSigningKey], and [getSymmetricKey] the
 * [getSeedOrThrowIfClientsMayNotRetrieveKeysOrThisClientNotAuthorized]
 * method checks that the `clientMayRetrieveKey` key-derivation option is set to true.
 *
 * The caller is responsible for catching exceptions
 */
class PermissionCheckedCommands(
  keySqr: KeySqr<Face>,
  clientsApplicationId: String,
  askUserForApprovalOrReturnResultIfReady: (message: String) -> Boolean?
) : PermissionChecksAndHiddenSeeds(
  keySqr,
  clientsApplicationId,
  askUserForApprovalOrReturnResultIfReady
) {

  /**
   * Implement [DiceKeysApiClient.getSecret] with the necessary permissions checks
   */
  fun getSecret(keyDerivationOptionsJson: String): Secret =
    Secret.deriveFromSeed(
      getSeedOrThrowIfClientNotAuthorized(
        keyDerivationOptionsJson,
        KeyDerivationOptions.KeyType.Secret
      ),
      keyDerivationOptionsJson
    )

  /**
   * Implement [DiceKeysApiClient.sealWithSymmetricKey] with the necessary permissions checks
   */
  fun sealWithSymmetricKey(
    keyDerivationOptionsJson: String,
    plaintext: ByteArray,
    postDecryptionInstructions: String?
  ): PackagedSealedMessage =
    SymmetricKey.deriveFromSeed(
      getSeedOrThrowIfClientNotAuthorized(
        keyDerivationOptionsJson,
        KeyDerivationOptions.KeyType.Symmetric
      ),
      keyDerivationOptionsJson
    ).seal(plaintext, postDecryptionInstructions ?: "")

  /**
   * Implement [DiceKeysApiClient.unsealWithSymmetricKey] with the necessary permissions checks
   */
  fun unsealWithSymmetricKey(
    packagedSealedMessage: PackagedSealedMessage
  ) : ByteArray? =
    if (isUnsealingAllowedByPostDecryptionInstructions(packagedSealedMessage) == true)
      SymmetricKey.unseal(
        packagedSealedMessage,
        getSeedOrThrowIfClientNotAuthorized(
          packagedSealedMessage.keyDerivationOptionsJson,
          KeyDerivationOptions.KeyType.Symmetric
        )
      )
    else null

  /**
   * Implement [DiceKeysApiClient.getPublicKey] with the necessary permissions checks
   */
  fun getPublicKey(
    keyDerivationOptionsJson: String
  ) : PublicKey =
    PrivateKey.deriveFromSeed(
      getSeedOrThrowIfClientNotAuthorized(
        keyDerivationOptionsJson,
        KeyDerivationOptions.KeyType.Public
      ),
      keyDerivationOptionsJson
    ).getPublicKey()

  /**
   * Implement [DiceKeysApiClient.getPrivateKey] with the necessary permissions checks
   */
  fun getPrivateKey(
    keyDerivationOptionsJson: String
  ) : PrivateKey = PrivateKey.deriveFromSeed(
    getSeedOrThrowIfClientsMayNotRetrieveKeysOrThisClientNotAuthorized(
      keyDerivationOptionsJson,
      KeyDerivationOptions.KeyType.Public
    ),
    keyDerivationOptionsJson
  )

  /**
   * Implement [DiceKeysApiClient.getSigningKey] with the necessary permissions checks
   */
  fun getSigningKey(
    keyDerivationOptionsJson: String
  ) : SigningKey = SigningKey.deriveFromSeed(
    getSeedOrThrowIfClientsMayNotRetrieveKeysOrThisClientNotAuthorized(
      keyDerivationOptionsJson,
      KeyDerivationOptions.KeyType.Signing
    ),
    keyDerivationOptionsJson
  )

  /**
   * Implement [DiceKeysApiClient.getSymmetricKey] with the necessary permissions checks
   */
  fun getSymmetricKey(
    keyDerivationOptionsJson: String
  ) : SymmetricKey = SymmetricKey.deriveFromSeed(
    getSeedOrThrowIfClientsMayNotRetrieveKeysOrThisClientNotAuthorized(
      keyDerivationOptionsJson,
      KeyDerivationOptions.KeyType.Symmetric
    ),
    keyDerivationOptionsJson
  )

  /**
   * Implement [DiceKeysApiClient.getSignatureVerificationKey] with the necessary permissions checks
   */
  fun getSignatureVerificationKey(
    keyDerivationOptionsJson: String
  ) : SignatureVerificationKey =
    SigningKey.deriveFromSeed(
      getSeedOrThrowIfClientNotAuthorized(
        keyDerivationOptionsJson,
        KeyDerivationOptions.KeyType.Signing
      ),
      keyDerivationOptionsJson
    ).getSignatureVerificationKey()

  /**
   * Implement [DiceKeysApiClient.unsealWithPrivateKey] with the necessary permissions checks
   */
  fun unsealWithPrivateKey(
    packagedSealedMessage: PackagedSealedMessage
  ) : ByteArray? =
    if (isUnsealingAllowedByPostDecryptionInstructions(packagedSealedMessage) == true)
      PrivateKey.deriveFromSeed(
        getSeedOrThrowIfClientNotAuthorized(
          packagedSealedMessage.keyDerivationOptionsJson,
          KeyDerivationOptions.KeyType.Public
        ),
        packagedSealedMessage.keyDerivationOptionsJson
      ).unseal(packagedSealedMessage)
    else null

  /**
   * Implement [DiceKeysApiClient.generateSignature] with the necessary permissions checks
   */
  fun generateSignature(
    keyDerivationOptionsJson: String,
    message: ByteArray
  ): Pair<ByteArray, SignatureVerificationKey> = SigningKey.deriveFromSeed(
      getSeedOrThrowIfClientNotAuthorized(
        keyDerivationOptionsJson,
        KeyDerivationOptions.KeyType.Signing
      ),
      keyDerivationOptionsJson
    ).let{ signingKey ->
      Pair(signingKey.generateSignature(message), signingKey.getSignatureVerificationKey())
    }

}