package ru.job4j.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionsCounting {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int arg = start; arg < end; arg++) {
            result.add(func.apply((double) arg));
        }
        return result;
    }
}
