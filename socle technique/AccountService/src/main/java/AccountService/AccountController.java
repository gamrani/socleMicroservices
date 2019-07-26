package AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/home")
@Api(value="account endpoints")
public class AccountController {

	@Autowired
    Environment environment;
	
	@GetMapping("/")
	public String health() {
		return "okey";
	}
	
	@PostMapping("/get/{account}")
    public String account(@PathVariable("account") String account) {
        return "Squad team of "+account+" are : "+"Taoufik + Youssef + Zakaria";
    }
}
