package com.example.homeworktwo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumbersController {
    private final NumbersService NumbersService;

    public NumbersController(NumbersService numbersService){
        this.NumbersService = numbersService;
    }
    @GetMapping("/numbers")
    public String oneToN(@RequestParam(required = true) int n, Model model){
        String res = PrintOneToNService.result(n);
        model.addAttribute("title", "The numbers between 1 and " + n + " are");
        model.addAttribute("n", n);
        model.addAttribute("res", res);
        return "result";
    }
    @GetMapping("sum-numbers")
    public String SumNumbers(@RequestParam(required = true) int n, Model model){
        String res = PrintSumOneToNService.result(n);
        model.addAttribute("title", "the sum on the numbers between 1 and " + n + " is");
        model.addAttribute("n", n);
        model.addAttribute("res", res);
        return "result";
    }
    @GetMapping("/words")
    public String printStringNTimes(@RequestParam(required = true) int n, @RequestParam(required = true) String word, Model model){
        String res = PrintStringNTimesService.result(n, word);
        model.addAttribute("title", "you requested the word " + word + " to be printed " + n + " times");
        model.addAttribute("n", n);
        model.addAttribute("word", word);
        model.addAttribute("res", res);
        return "result";
    }
}
