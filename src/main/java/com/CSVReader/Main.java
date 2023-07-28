package com.CSVReader;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Injector injector = Guice.createInjector(new BindingConfig());
    }
}
