package ru.digitalleague;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddNewObject {
    @Test
    public void addNewObject1() {
        assertTrue(Storage.addNewObject("orange", 5));
    }

    @Test
    public void addNewObject2() {
        assertFalse(Storage.addNewObject("orange", 11));
    }

    @Before

    public void setObject() {
        Storage.addObject("pear", 1);
        Storage.addObject("peach", 1);
    }

    @Test
    public void addNewObject3() {
        Storage.addNewObject("orange", 1);
        assertFalse(Storage.addNewObject("grape", 1));

    }

    @AfterClass
    public static void clearData() {
        Storage.storage.clear();
    }

}
