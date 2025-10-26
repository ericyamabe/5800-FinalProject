package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMeal {
    int mealId = 1;
    String name = "Test Meal";

    @Test
    public void nameTest() {
        Meal meal = new Meal();
        meal.setName(this.name);
        String testName = meal.getName();
        assertEquals(testName, this.name);
    }

    @Test
    public void createTest() {
        Meal meal = new Meal();
        meal.setName(this.name);
        boolean status = meal.createNew();
        assertEquals(status, true);
    }

    @Test
    public void selectTest() {
        Meal meal = new Meal();
        meal->select(this.mealId);
        assertEqual(meal.getName(), this.name);
    }
}
