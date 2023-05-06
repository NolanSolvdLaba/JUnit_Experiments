package tests;

import org.example.Profile;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest {
    @Test
    public void testSearchSurveyData() {
        //populating survey data
        Map<String, String> johnnySurvey = new HashMap<>();
        johnnySurvey.put("name", "Johnny Survey");
        johnnySurvey.put("occupation", "Fireman");
        johnnySurvey.put("location", "Brooklyn");

        //instantiating profile
        Profile johnnyAnswers = new Profile(johnnySurvey);

        //running the name search
        Boolean nameExists = johnnyAnswers.searchSurveyData("occupation", "Doctor");
        assertEquals(false, nameExists);

        Boolean nameExists2 = johnnyAnswers.searchSurveyData("occupation", "Fireman");
        assertEquals(true, nameExists2);
    }
}
