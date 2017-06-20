package org.gradle.example;

import org.gradle.example.api.Library;
import org.gradle.example.api.LibraryFactory;

public class Main {
    public static void main(String... args) {
        Library library = LibraryFactory.create();
        if(library.isTrue()) {
            System.out.println("Application success!");
            System.exit(0);

        } else {
            System.out.println("Application failed!");
            System.exit(1);
        }

    }
}
