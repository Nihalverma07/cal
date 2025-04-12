package com.calculator.service;
import org.springframework.stereotype.Service;



@Service
public class CalculatorService {

    public Long add (Long operand1,Long operand2){
        return operand1+operand2;

    }

    public Long sub(Long operand1,Long operand2){
        return  operand1 - operand2;

    }

    public Long mul(Long operand1,Long operand2){
        return operand1 * operand2;

    }

    public Long div (Long operand1,Long operand2){
        return operand1 / operand2;
    }
}
