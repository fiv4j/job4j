package ru.job4j.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionsCountingTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionsCounting function = new FunctionsCounting();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionsCounting function = new FunctionsCounting();
        List<Double> result = function.diapason(0, 5, x -> Math.pow(x, 2) + 3 * x);
        List<Double> expected = Arrays.asList(0D, 4D, 10D, 18D, 28D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        FunctionsCounting function = new FunctionsCounting();
        List<Double> result = function.diapason(10, 15, Math::log10);
        List<Double> expected = Arrays.asList(1.0, 1.0413926851582251, 1.0791812460476249,
                1.1139433523068367, 1.146128035678238);
        assertThat(result, is(expected));
    }
}
