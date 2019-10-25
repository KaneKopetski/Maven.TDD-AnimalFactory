package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        Cat cat = new Cat(null, null, null);

        cat.setName("Perot");

        String actualName = cat.getName();
        String expectedName = "Perot";

        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void testSetBirthDate(){
        Date newBirthDate = new Date(6/12/1989);

        Cat cat = new Cat(null, null, null);
        cat.setBirthDate(newBirthDate);

        Date actualBirthDate = cat.getBirthDate();
        Date expectedBirthDate = new Date(6/12/1989);

        Assert.assertEquals(actualBirthDate, expectedBirthDate);
    }

    @Test
    public void testSpeak(){
        Cat cat = new Cat(null, null, null);

        String actualSpoken = cat.speak();
        String expectedSpoken = "meow!";

        Assert.assertEquals(actualSpoken, expectedSpoken);
    }

    @Test
    public void testEat(){
        Cat cat = new Cat(null, null, null);

        Integer expectedNumberOfMeals = 1;

        cat.eat(null);

        Integer actualNumberOfMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expectedNumberOfMeals, actualNumberOfMeals);
    }

    @Test
    public void testGetID() {
        Cat cat = new Cat(null, null, null);

        Integer actualId = cat.getId();
        Integer expectedId = null;

        Assert.assertEquals(actualId, expectedId);
    }

    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);


    }

}
