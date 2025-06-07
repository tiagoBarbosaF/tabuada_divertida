package com.tiago.backend.app.enums;

public enum OperationEnum {
    SUM("+", "sum"),
    SUBTRACTION("-", "subtraction"),
    MULTIPLICATION("*", "multiplication"),
    DIVIDE("/", "divide");

    private final String operation;
    private final String description;

    OperationEnum(String operation, String description) {
        this.operation = operation;
        this.description = description;
    }

    public String getOperation() {
        return operation;
    }

    public String getDescription() {
        return description;
    }
}
