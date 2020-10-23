package com.example.mongoapp.exception;

public class TokenInvalidException extends MAppException{

    private String token;
    private String status;

    public TokenInvalidException(String message) {
        super(message);
    }

    public TokenInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenInvalidException addToken(String token) {
        this.token=token;
        return this;
    }

    public TokenInvalidException addStatus(String status) {
        this.status=status;
        return this;
    }
    public TokenInvalidException build(){
        return this;
    }

    public String getToken() {
        return token;
    }

    public String getStatus() {
        return status;
    }
}
