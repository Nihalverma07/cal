package com.calculator.entity;

import java.time.LocalDateTime;


public class Calculation {

    private Long id;

    private Long operand1;
    private Long operand2;
    private String Operator;
    private Long result;
    private LocalDateTime timeStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOperand1() {
        return operand1;
    }

    public void setOperand1(Long operand1) {
        this.operand1 = operand1;
    }

    public Long getOperand2() {
        return operand2;
    }

    public void setOperand2(Long operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
