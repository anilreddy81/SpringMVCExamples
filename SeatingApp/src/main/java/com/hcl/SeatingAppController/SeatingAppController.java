package com.hcl.SeatingAppController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SeatingAppController {
	@RequestMapping("/greeting")
    public String greeting() {
        return "greeting";
    }

}
