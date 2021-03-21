package com.keyboardbuilder.dto;

public class KeyboardCase
{
    private String material;
    private int layout;

    public KeyboardCase()
    {
        this.material = "Test";
        this.layout = 1;
    }

    public KeyboardCase(String material, int layout)
    {
        this.material = material;
        this.layout = layout;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public int getLayout()
    {
        return layout;
    }

    public void setLayout(int layout)
    {
        this.layout = layout;
    }
}
