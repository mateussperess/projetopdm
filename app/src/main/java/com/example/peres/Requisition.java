package com.example.peres;

public class Requisition {
    private int code;
    private String message;
    private String type;
    private String action;

    public Requisition(int code, String message, String type, String action) {
        this.code = code;
        this.message = message;
        this.type = type;
        this.action = action;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action;
    }
}
