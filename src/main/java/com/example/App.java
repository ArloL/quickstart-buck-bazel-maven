package com.example;

import static com.google.common.base.Preconditions.checkNotNull;

class App {

    public static void main(String... args) {
        checkNotNull(args);
        System.out.println("Hello World");
    }

}
