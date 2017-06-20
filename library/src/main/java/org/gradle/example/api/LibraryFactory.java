package org.gradle.example.api;

import org.gradle.example.impl.LibraryImpl;

public class LibraryFactory {
    public static Library create() {
        return new LibraryImpl();
    }
}
