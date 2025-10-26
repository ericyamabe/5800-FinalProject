package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFood   {
    int foodId = 1;
    String name = "Test Food";

    @Test
    public void nameTest() {
        Food food = new Food();
        meal.setName(this.name);
        String testName = food.getName();
        assertEquals(testName, this.name);
    }

    @Test
    public void badNameTest() {
        Food food = new Food();
        assertThrows(food.setName("Bad Nam3"), {
            throw new Exception("Invalid name");
        });
    }

    @Test
    public void createTest() {
        Food food = new Food();
        food.setName(this.name);
        boolean status = food.createNew();
        assertEquals(status, true);
    }

    @Test
    public void selectTest() {
        Food food = new Food();
        food->select(this.foodId);
        assertEqual(food.getName(), this.name);
    }
}
