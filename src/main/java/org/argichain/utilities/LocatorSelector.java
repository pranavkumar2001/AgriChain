package org.argichain.utilities;

import org.argichain.locatorInterface.SubstringTestInterface;
import org.openqa.selenium.By;

import java.lang.reflect.Field;

public class LocatorSelector implements SubstringTestInterface {

    private static Object LocatorSelector;

    // Method to dynamically return a By locator from the LocatorSelector class using reflection based on the given field name
    public static By select(String value) {
        Field field;
        try {
            field = LocatorSelector.class.getField(value); // Get the field with the given name from LocatorSelector
            return (By) field.get(LocatorSelector); // Return the field's value as a By locator
        } catch (Exception e) {
            return null;
        }
    }

}
