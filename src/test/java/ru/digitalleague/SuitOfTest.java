package ru.digitalleague;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

 @RunWith(Suite.class)
 @RunWith()
 @Suite.SuiteClasses({
        AddNewObject.class,
        AddObject.class,
        AddToExistObject.class,
        CheckFreePlaces.class,
        IsInStock.class,
        RemoveObject.class
})
public class SuitOfTest {
}
