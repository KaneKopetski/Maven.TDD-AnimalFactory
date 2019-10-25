package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(null, null,4);

        catHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIdTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(null, null,4);

        catHouse.add(cat);
        catHouse.remove(4);

        Cat expected = null;
        Cat actual = catHouse.getCatById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(null, null,4);

        catHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(null, null,11);

        catHouse.add(cat);
        catHouse.remove(cat);

        Cat expected = null;
        Cat actual = catHouse.getCatById(11);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat1 = new Cat(null, null,11);
        Cat cat2 = new Cat(null, null,1);
        Cat cat3 = new Cat(null, null,5);


        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);


        Integer expected = 3;
        Integer actual = catHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }



}
