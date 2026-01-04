package domain.session.proof;

public sealed interface SessionProof
        permits AuthenticatedSessionProof, ExpiredSessionProof, TerminatedSessionProof {
}
