package com.test.sts;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/loginform.it", method = RequestMethod.GET)
	public String home(Model model) {

		// ���� ��ū���� ����� ���� ���ڿ� ����
		String state = generateState();
		// ���� �Ǵ� ������ ���� ������ ���� ��ū�� ����
		model.addAttribute("state", state);

		return "APIExamNaverLogin";
	}

	public String generateState() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
}
