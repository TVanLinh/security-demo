package vnua.it.linhtran.test.securitydemo.sercurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vnua.it.linhtran.test.securitydemo.domain.User;
import vnua.it.linhtran.test.securitydemo.repository.UserRepository;

/**
 * Created by linhtran on 17/09/17.
 */
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username + " not exist");
        }
        return new CustomUserDetail(user);
    }
}
