package com.baddles.demo.javajunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MyTestCase {

    @Test
    @DisplayName("ID Example test")
    void IDTest() {
        MyId id = new MyId();
        Assertions.assertEquals(id.getId(), "1859046");
    }
}
