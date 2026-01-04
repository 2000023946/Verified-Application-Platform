package domain.auth.proof;

public sealed interface AuthProof permits PasswordProof, OAuthProof, MultiFactorProof {
}
