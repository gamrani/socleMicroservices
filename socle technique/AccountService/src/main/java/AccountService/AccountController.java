package AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/account")
@Api(value="account endpoints")
public class AccountController {

	@Autowired
    Environment environment;
	
	@GetMapping("/")
	public String health() {
		return "i'm okey";
	}
	
	@GetMapping("/get")
    public String account() {
        return "hi from accountConotroller";
    }
}
