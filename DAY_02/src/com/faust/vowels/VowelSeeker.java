package com.faust.vowels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VowelSeeker {
    private int frequency;
    private String string_to_analyze;
    private String resulting_string;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getString_to_analyze() {
        return string_to_analyze;
    }

    public void setString_to_analyze(String string_to_analyze) {
        this.string_to_analyze = string_to_analyze;
    }

    public String getResulting_string() {
        resulting_string = "";
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < string_to_analyze.length(); i++) {
                if (i % frequency == 0 && vowels.contains(string_to_analyze.toCharArray()[i])) {
                    resulting_string += string_to_analyze.toCharArray()[i];
                }
        }
        return resulting_string;
    }

    public void setResulting_string(String resulting_string) {
        this.resulting_string = resulting_string;
    }

    public VowelSeeker(int frequency, String string_to_analyze) {
        this.frequency = frequency;
        this.string_to_analyze = string_to_analyze;
    }




}
