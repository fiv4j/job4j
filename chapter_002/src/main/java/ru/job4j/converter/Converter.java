package ru.job4j.converter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static List<Integer> convertMatrixToList(Integer[][] matrix) {
        return matrix != null ? Arrays.stream(matrix)
                                    .flatMap(Arrays::stream)
                                    .collect(Collectors.toList())
                               : null;
    }
}
