package domain.auth.proof;

public final class MultiFactorProof implements AuthProof {
    private final String code;

    public MultiFactorProof(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
