package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addDogTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null, null,4);

        dogHouse.add(dog);

        Dog expected = dog;
        Dog actual = dogHouse.getDogById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogByIdTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null, null,4);

        dogHouse.add(dog);
        dogHouse.remove(4);

        Dog expected = null;
        Dog actual = dogHouse.getDogById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null, null,4);

        dogHouse.add(dog);

        Dog expected = dog;
        Dog actual = dogHouse.getDogById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog(null, null,11);

        dogHouse.add(dog);
        dogHouse.remove(dog);

        Dog expected = null;
        Dog actual = dogHouse.getDogById(11);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog(null, null,11);

        dogHouse.add(dog1);

        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }



}
