package com.baddles.demo.javajunit;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MyTestCase {
    MyId id;
    
    @Before
    public void initialize() {
        id = new MyId();
    }

    @Test
    @DisplayName("ID Example test")
    public void IDTest() {
        Assertions.assertEquals(id.getId(), "1859046");
    }
}
