package com.tiago.backend.app.dto;

public record DesafioResponse(
        Integer num1,
        String operation,
        Integer num2,
        Integer userAnswer,
        Integer correctAnswer,
        String result
) {
}
