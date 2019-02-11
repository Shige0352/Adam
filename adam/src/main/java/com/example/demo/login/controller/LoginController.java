package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin(Model model) {
		// login. html に 画面 遷移
		return "login/login";
	}
	// ログイン 画面 の POST 用 コントローラー
	@PostMapping("/login")
	public String postLogin(Model model) {
		// login. html に 画面 遷移
		return "login/login";
	}

}



