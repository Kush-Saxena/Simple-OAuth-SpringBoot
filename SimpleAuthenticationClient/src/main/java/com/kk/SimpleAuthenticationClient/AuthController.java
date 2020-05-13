package com.kk.SimpleAuthenticationClient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	@RequestMapping("/")
	public String login() {

		return "welcomePage.jsp";
	}

}
