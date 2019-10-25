package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetBirthDate(){
        Date newBirthDate = new Date(6/12/1989);

        Dog dog = new Dog(null, null, null);
        dog.setBirthDate(newBirthDate);

        Date actualBirthDate = dog.getBirthDate();
        Date expectedBirthDate = new Date(6/12/1989);

        Assert.assertEquals(actualBirthDate, expectedBirthDate);
    }

    @Test
    public void testSpeak(){
        Dog dog = new Dog(null, null, null);

        String actualSpoken = dog.speak();
        String expectedSpoken = "bark!";

        Assert.assertEquals(actualSpoken, expectedSpoken);
    }

    @Test
    public void testEat(){
        Dog dog = new Dog(null, null, null);

        Integer expectedNumberOfMeals = 1;

        dog.eat(null);

        Integer actualNumberOfMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expectedNumberOfMeals, actualNumberOfMeals);
    }

    @Test
    public void testGetID() {
        Dog dog = new Dog(null, null, null);

        Integer actualId = dog.getId();
        Integer expectedId = null;

        Assert.assertEquals(actualId, expectedId);
    }

    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog(null, null, null);

        Boolean expected = true;

        Boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog(null, null, null);

        Boolean expected = true;

        Boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
}
