package org.example.filter;

import java.util.Arrays;

public class FilterUtil {

    public static Object[] filter(Object[] array, Filter filter) {
        return Arrays.stream(array).map(filter::apply)
                                   .toArray();
    }
}
