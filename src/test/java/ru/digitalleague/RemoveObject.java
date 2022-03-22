package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class RemoveObject {
    public Storage varTest = new Storage();


    @Before
    public void setUp() {
        varTest.addObject("apple", 3);
        varTest.addObject("pear", 7);
    }

    @Test
    public void removeExistingObjectTest() {
        Storage.removeObject("pear");
        assertFalse(Storage.isInStock("pear"));
    }


    @Test
    public void removeNonexistingObjectTest() {
        Storage.removeObject("pear");
        assertFalse(Storage.removeObject("pear"));
    }


}


