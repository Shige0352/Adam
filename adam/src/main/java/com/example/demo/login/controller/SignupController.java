package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.controller.domain.model.SignupForm;


@Controller
public class SignupController {

	private Map<String, String> radioMarriage;
	private Map<String, String> initRadioMarrige() {

		Map<String, String> radio = new LinkedHashMap<>();

		radio.put("既婚", "true");
		radio.put("未婚", "false");
		return radio;
	}

	@GetMapping("/signup")
	public String getSignUp(@ModelAttribute SignupForm form, Model model) {
		radioMarriage = initRadioMarrige();
		model.addAttribute("radioMarriage", radioMarriage);
		return "login/signup";


			}


	@PostMapping("/signup")
	public String postSignUp(@ModelAttribute SignupForm form, BindingResult bindingResult, Model model) {

		//登録に引っかかった場合、ユーザー登録画面に戻す
		if(bindingResult.hasErrors()) {
			System.out.println("bbbbb");

			return getSignUp(form, model);



		}
		//formの結果をコンフォームに出力
		System.out.println(form);

		//ログイン画面へリダイレクト
		return "redirect:/login";
	}
}