package com.keyboardbuilder.enterprise;

import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeyboardBuilderController {

    /**
     * Handle the root (/) endpoint and return a start page
     * @return *
     */

    @RequestMapping("/")

    public String index() {
        KeyboardBuild build = new KeyboardBuild();
        build.setKeySwitches("Liner Cream");
        String keySwitches = build.getKeySwitches();
        return "start";
    }
}
