package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testDogConstructor() {

        String name = "Fido";
        Date birthDate = new Date(2/2019);
        Integer givenID = 0;

        Dog dog = new Dog(name, birthDate, 0);

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCatConstructor() {

        String name = "Whiskers";
        Date birthDate = new Date(2/2019);
        Integer givenID = 0;

        Cat cat = new Cat(name, birthDate, 0);

    }
}
