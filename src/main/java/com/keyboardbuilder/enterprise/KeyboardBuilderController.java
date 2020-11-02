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

    /**
     * Handle guides (/guides) endpoint and return a guides page
     * @return *
     */

    @RequestMapping("/guides")

    public String guides() {
        return "guides";
    }

    /**
     * Handle guides (/add-new-build) endpoint and return a guides page
     * @return *
     */

    @RequestMapping("/add-new-build")

    public String addNewBuild() {
        return "add-new-build";
    }

    /**
     * Handle a group buy page for keycaps (/keycaps-group-buy) endpoint and returns appropriate group buys
     * @return *
     */

    @RequestMapping("/keycaps-group-buy")

    public String keycapsGroupBuy() {
        return "keycaps-group-buy";
    }

    /**
     * Handle a group buy page for key switches (/switches-group-buy) endpoint and returns appropriate group buys
     * @return *
     */

    @RequestMapping("/switches-group-buy")

    public String switchesGroupBuy() {
        return "switches-group-buy";
    }

    /**
     * Handle a group buy page for keyboard cases (/cases-group-buy) endpoint and returns appropriate group buys
     * @return *
     */

    @RequestMapping("/cases-group-buy")

    public String casesGroupBuy() {
        return "cases-group-buy";
    }

    /**
     * Handle a group buy page for pre-build keyboards (/keyboards-group-buy) endpoint and returns appropriate group buys
     * @return *
     */

    @RequestMapping("/keyboards-group-buy")

    public String keyboardsGroupBuy() {
        return "keyboards-group-buy";
    }
}
