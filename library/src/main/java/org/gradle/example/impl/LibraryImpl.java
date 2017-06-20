package org.gradle.example.impl;

import org.gradle.example.api.Library;

public class LibraryImpl implements Library {
    @Override
    public boolean isTrue() {
        return true;
    }
}
