package org.example.filter;


@FunctionalInterface
public interface Filter {
    Object apply(Object o);
}
