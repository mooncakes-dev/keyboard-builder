package com.keyboardbuilder.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardCaseTest {

    private KeyboardCase case1 = null;

    @Test
    void EmptyConstructorNotNull()
    {
        givenEmptyCaseConstruct();
        thenCaseNotNull();
    }

    @Test
    void FullConstructor()
    {
        givenMaterialAndLayout("Wood", 3);
        thenMaterialEquals("Wood");
        thenLayoutEquals(3);
    }

    @Test
    void GetterSetterTest()
    {
        givenEmptyCaseConstruct();
        whenMaterialSet("Plastic");
        whenLayoutSet(2);
        thenMaterialEquals("Plastic");
        thenLayoutEquals(2);
    }

    private void givenEmptyCaseConstruct()
    {
        case1 = new KeyboardCase();
    }

    private void givenMaterialAndLayout(String material, int layout)
    {
        case1 = new KeyboardCase(material, layout);
    }

    private void whenMaterialSet(String material)
    {
        case1.setMaterial(material);
    }

    private void whenLayoutSet(int layout)
    {
        case1.setLayout(layout);
    }

    private void thenCaseNotNull()
    {
        assertNotNull(case1);
    }

    private void thenMaterialEquals(String material)
    {
        assertEquals(case1.getMaterial(), material);
    }

    private void thenLayoutEquals(int layout)
    {
        assertEquals(case1.getLayout(), layout);
    }

}