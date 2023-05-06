package org.example;

import java.util.Map;

public class Profile {
    private Map<String, String> surveyData;

    public Profile(Map<String, String> surveyData) {
        this.surveyData = surveyData;
    }

    public boolean searchSurveyData(String key, String value) {
        for (Map.Entry<String, String> entry : surveyData.entrySet()) {
            if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
