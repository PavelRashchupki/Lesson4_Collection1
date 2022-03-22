package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class IsInStock {
    @Before
    public void setObject() {
        Storage.addObject("pear", 1);
    }

    @Test
    public void IsInStock1() {
        assertTrue(Storage.isInStock("pear"));
    }

    @Test
    public void IsInStock2() {
        assertFalse(Storage.isInStock("orange"));
    }
}