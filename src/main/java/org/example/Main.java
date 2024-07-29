package org.example;

import org.example.filter.Filter;
import org.example.filter.FilterUtil;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Object[] array = {1, 2, 3, 4, 5};
        Filter doubleFilter = o -> (int) o * 2;

        Object[] result = FilterUtil.filter(array, doubleFilter);

        System.out.println(Arrays.toString(result));
    }
}
