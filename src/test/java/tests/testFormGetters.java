package tests;

import org.example.Form;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class testFormGetters {
    public void testFormGetters() {
        // Create a Form object with sample data
        Form form = new Form("John Doe", 25, "john@example.com");

        // Use the getters to retrieve the data
        int age = form.getAge();
        String email = form.getEmail();

        // Assert that the retrieved values match the expected values
        String name = form.getName();
        assertEquals("John Doe", name);
        assertEquals(25, age);
        assertEquals("john@example.com", email);
    }
}