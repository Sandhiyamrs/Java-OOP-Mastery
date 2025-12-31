package com.example.oop.encapsulation;

public final class ImmutableUser {
    private final String username;

    public ImmutableUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
