package com.citrix.playground.test.kosta;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VoidTest {
    
    @Test
    public void testVoidSimpleName()
    {
        assertEquals("Void", Void.class.getSimpleName());
    }
}
