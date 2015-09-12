package com.example;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.InputStream;
import java.util.Properties;

class App {

    public static void main(String... args) throws Exception {
        try(InputStream inputStream = App.class.getClassLoader().getResourceAsStream("app.properties")) {
            checkNotNull(inputStream, "Properties not found");
            Properties prop = new Properties();
            prop.load(inputStream);
            String user = prop.getProperty("user");
            System.out.println("Hello " + user);
        }
    }

}
