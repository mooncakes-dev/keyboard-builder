package com.keyboardbuilder.enterprise.dto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeySwitchesTest
{
    private KeySwitches testKeySwitches;

    @AfterAll
    private void tearDown() throws Exception
    {
        testKeySwitches = null
    }

    @Test
    public void ConstructorTest()
    {
        givenEmptyConstructor();
        whenLayoutIsSetTo("TypeA");
        whenWeightIsSetTo(1);
        whenBrandIsSetTo("TypeB");
        thenFieldsEqual("Wood", 1);
    }

    private void givenEmptyConstructor()
    {
        testKeySwitches = new KeyboardCase();
    }

    private void whenLayoutIsSetTo(String type)
    {
        testKeySwitches.setType(type);
    }

    private void whenWeightIsSetTo(int weight)
    {
        testKeySwitches.setWeight(weight);
    }

    private void whenBrandIsSetTo(String brand)
    {
        testKeySwitches.setBrand(brand);
    }

    private void thenFieldsEqual(String type, int weight, String brand)
    {
        assertEquals(testKeySwitches.getType(), type);
        assertEquals(testKeySwitches.getWeight(), weight);
        assertEquals(testKeySwitches.getBrand(), brand);
    }

}