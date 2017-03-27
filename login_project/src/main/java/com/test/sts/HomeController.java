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

		// 상태 토큰으로 사용할 랜덤 문자열 생성
		String state = generateState();
		// 세션 또는 별도의 저장 공간에 상태 토큰을 저장
		model.addAttribute("state", state);

		return "APIExamNaverLogin";
	}

	public String generateState() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
}
