package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static junit.framework.Assert.assertEquals;

public class CheckFreePlaces {
    @Before

    public void setObject() {
        Storage.addObject("pear", 1);
        Storage.addObject("peach", 1);
    }

    @Test
    public void checkFreePlaces() {
        Storage.checkFreePlaces();
        assertEquals(1, 1);
    }

    @Test
    public void checkFreePlaces1() {
        Storage.addObject("grape", 1);
        Storage.checkFreePlaces();
        assertEquals(1, 1);
    }
}
