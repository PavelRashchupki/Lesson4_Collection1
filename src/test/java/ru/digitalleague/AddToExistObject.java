package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddToExistObject {

    @Before
    public void setUp1() {
        Storage.addObject("apple", 3);
        Storage.addObject("pear", 2);
        Storage.addObject("peach", 7);
    }

    @Test
    public void testAddToExistObject() {
        System.out.println(Storage.storage.keySet());
        System.out.println(Storage.storage.values());
        assertFalse(Storage.addToExistObject("apple", 8));
    }

    @Test
    public void testAddToExistObject1() {
        System.out.println(Storage.storage.keySet());
        System.out.println(Storage.storage.values());
        assertTrue(Storage.addToExistObject("pear", 4));
    }
}
