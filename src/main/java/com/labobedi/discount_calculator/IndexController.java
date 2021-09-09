package com.labobedi.discount_calculator;
/*Author K Labobedi
 * 09 SEP 2021 10:32
 *kgethegolabobedi@gmail.com
 *(+267)77 599 020
 * */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//Controller class gives the ability get and post mapping of html pages.
@Controller
public class IndexController {

	//Controlling the Store html template
	@GetMapping("/Store")
	public String index(Model model) {
		model.addAttribute("groceryBean",new ShoppingBasketBean());
		return "Store";
	}

	//Forwading by PostMapping to the result html template after processing.
	@PostMapping("/result")
	public String processForm (@ModelAttribute ShoppingBasketBean groceryBean, BindingResult result, Model model) {
		model.addAttribute("groceryBean",groceryBean);
		return "result";
	}
}
