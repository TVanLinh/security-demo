package vnua.it.linhtran.test.securitydemo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vnua.it.linhtran.test.securitydemo.domain.User;

import java.security.Principal;

/**
 * Created by linhtran on 17/09/17.
 */

@RestController
public class UserController {

    @GetMapping(value = "user")
    public ResponseEntity<User> user(Principal principal) {
        User user = new User();
        user.setUserName(principal.getName());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
