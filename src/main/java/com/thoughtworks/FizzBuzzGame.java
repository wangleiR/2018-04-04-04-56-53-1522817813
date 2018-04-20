package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();  

    
   // private Integer[] targets = new Integer[]{3,5,7};
    private List<Integer> targets = Arrays.asList(3,5,7);
    //private String[] marks = new String[]{"Fizz", "Buzz", "Whizz"};
    private List<String> marks = Arrays.asList("Fizz", "Buzz", "Whizz");

    public void start(int count) {
        results.addAll(IntStream.rangeClosed(1, count).boxed().map(this::total).collect(Collectors.toList()));
    }

    public List<String> getResults() {
        return results;
    }

    public String dealWithFirstRule(int number){
        for (int i = 0; i <targets.size() ; i++) {
            return number%targets.get(i) == 0 ? marks.get(i): null;
        }
        return null;
    }
    public String dealWithSecondRule(int number){
        String res = "";
        for (int i = 0; i <targets.size() ; i++) {
            if (number%targets.get(i) == 0)
                res += marks.get(i);
        }
        return res;
    }
    public String dealWithThirdRule(int number){
        return String.valueOf(number).indexOf('3') == -1 ? null:"Fizz";
    }

    public String total(int number){
        String first  = dealWithFirstRule(number);
        String second  = dealWithSecondRule(number);
        String third  = dealWithThirdRule(number);
        if (third != null)
            return third;
        else if (second.length() > 0)
            return second;
        else if (first != null)
            return first;
        return String.valueOf(number);

    }
}


