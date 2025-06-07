package com.tiago.backend.app.dto;

import com.tiago.backend.app.enums.OperationEnum;

public record DesafioRequest(Integer num1, OperationEnum operation, Integer num2, Integer userAnswer) {
}
