package org.example;

public class User {
    private Form form;
    private Profile profile;

    public User(Form form, Profile profile) {
        this.form = form;
        this.profile = profile;
    }

    public Form getForm() {
        return form;
    }

    public Profile getProfile() {
        return profile;
    }
}

