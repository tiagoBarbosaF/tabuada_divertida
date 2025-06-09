package com.tiago.backend.core;

import com.tiago.backend.app.dto.DesafioRequest;
import com.tiago.backend.app.dto.DesafioResponse;
import com.tiago.backend.app.enums.OperationEnum;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class DesafioService {

    public DesafioResponse getDesafio() {
        Integer randomNum1 = randomNumber();
        Integer randomNum2 = randomNumber();
        String randomOperation = randomOperation();

        if (randomOperation.equals(OperationEnum.DIVIDE.getOperation()) && randomNum2.equals(0))
            randomNum2 = randomNumber();

        return new DesafioResponse(randomNum1, randomOperation, randomNum2,
                null, null, null);
    }

    public DesafioResponse postDesafio(DesafioRequest request) {
        Integer result = calculate(request.num1(), request.operation(), request.num2());
        boolean checkAnswer = (int) request.userAnswer() == result;

        if (checkAnswer) return new DesafioResponse(request.num1(), request.operation().name(),
                request.num2(), request.userAnswer(), result, "Resposta correta 😉👍");

        return new DesafioResponse(request.num1(), request.operation().name(),
                request.num2(), request.userAnswer(), result, "Resposta incorreta tente novamente!");
    }

    private Integer calculate(Integer num1, OperationEnum operation, Integer num2) {
        return switch (OperationEnum.valueOf(operation.name())) {
            case SUM -> num1 + num2;
            case SUBTRACTION -> num1 - num2;
            case MULTIPLICATION -> num1 * num2;
            case DIVIDE -> num2 != 0 ? num1 / num2 : 0;
        };
    }

    private Integer randomNumber() {
        return ThreadLocalRandom.current().nextInt(0, 11);
    }

    private String randomOperation() {
        OperationEnum[] values = OperationEnum.values();
        return values[(int) (Math.random() * values.length)].getOperation();
    }
}
