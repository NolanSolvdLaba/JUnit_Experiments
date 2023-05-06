package org.example;

import org.example.Form;
import org.example.Profile;
import org.example.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Form object
        Form form = new Form("John Doe", 30, "johndoe@example.com");

        // Create a Profile object
        Map<String, String> surveyData = new HashMap<>();
        surveyData.put("name", "John Doe");
        surveyData.put("occupation", "Software Engineer");
        surveyData.put("location", "San Francisco");
        Profile profile = new Profile(surveyData);

        // Create a User object with the Form and Profile
        User user = new User(form, profile);

        // Access the Form and Profile of the User
        Form userForm = user.getForm();
        Profile userProfile = user.getProfile();

        // Get information from the Form
        String name = userForm.getName();
        int age = userForm.getAge();
        String email = userForm.getEmail();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

        // Search for specific information within the Profile
        boolean foundOccupation = userProfile.searchSurveyData("occupation", "Software Engineer");
        System.out.println("Occupation found: " + foundOccupation);
    }
}
