package ru.digitalleague;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertTrue;


public class AddObject {
    @Before
    public void setUp() {
        Storage.addObject("apple", 3);
        Storage.addObject("pear", 7);
        Storage.addObject("peach", 7);
    }

    @Test
    public void addObject0() {
        Storage.addObject("apple", 1);
        assertTrue(Storage.storage.get("apple") == 4);

    }

    @Test
    public void addObject1() {
        Storage.addObject("pear", 11);
        assertTrue(Storage.storage.get("pear") == 7);
    }

    @Test
    public void addObject2() {
        Storage.addObject("berry", 2);
        assertTrue(Storage.storage.get("berry") == null);
    }

    @AfterClass
    public static void clearData() {
        Storage.storage.clear();
    }


}
