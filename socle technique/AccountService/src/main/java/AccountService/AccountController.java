package AccountService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/account")
@Api(value="account endpoints")
public class AccountController {

	@GetMapping("/get")
	public String get() {
		return "Account Controller Starter";
	}
}
