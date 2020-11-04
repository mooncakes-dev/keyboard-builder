package com.keyboardbuilder.enterprise.dto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardCaseTest
{

    private KeyboardCase testKeyboardCase;

    @AfterAll
    public void tearDown() throws Exception
    {
        testKeyboardCase = null;
    }

    @Test
    public void ConstructorTest()
    {
        givenEmptyConstructor();
        whenMaterialIsSetTo("Wood");
        whenLayoutIsSetTo(1);
        thenFieldsEqual("Wood", 1);
    }

    private void givenEmptyConstructor()
    {
        testKeyboardCase = new KeyboardCase();
    }

    private void whenLayoutIsSetTo(int layout)
    {
        testKeyboardCase.setLayout(layout);
    }

    private void whenMaterialIsSetTo(String material)
    {
        testKeyboardCase.setMaterial(material);
    }

    private void thenFieldsEqual(String material, int layout)
    {
        assertEquals(testKeyboardCase.getMaterial(), material);
        assertEquals(testKeyboardCase.getLayout(), layout);
    }
}