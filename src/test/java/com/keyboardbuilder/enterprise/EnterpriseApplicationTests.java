package com.keyboardbuilder.enterprise;

import com.keyboardbuilder.enterprise.dto.KeySwitches;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnterpriseApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    void verifyKeySwitchesProperties()  {
        String type = "Write the type";
        int weight = 22;
        String brand ="Write the brand name";

        KeySwitches keySwitches = new KeySwitches();
        keySwitches.setType(type);
        assertEquals(type, keySwitches.getType());

        keySwitches.setWeight(weight);
        assertEquals(weight, keySwitches.getWeight());

        keySwitches.setBrand(brand);
        assertEquals(brand, keySwitches.getBrand());
    }

}
