package wooteco.security.core;

public class Authentication {
    private Object principal;

    public Authentication() {
    }

    public Authentication(Object principal) {
        this.principal = principal;
    }

    public Object getPrincipal() {
        return principal;
    }
}
