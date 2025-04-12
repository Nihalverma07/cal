package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping("/add")
    public Long addition(@RequestParam Long operand1, @RequestParam Long operand2){
        return calculatorService.add(operand1, operand2);
    }

    @GetMapping("/sub")
    public Long substraction(@RequestParam Long operand1, @RequestParam Long operand2){
        return calculatorService.sub(operand1, operand2);
    }

    @GetMapping("/mul")
    public Long Multiplication(@RequestParam Long operand1, @RequestParam Long operand2){
        return calculatorService.mul(operand1, operand2);
    }

    @GetMapping("/div")
    public Long division(@RequestParam Long operand1, @RequestParam Long operand2){
        return calculatorService.div(operand1, operand2);
    }
}
