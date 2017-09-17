package vnua.it.linhtran.test.securitydemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vnua.it.linhtran.test.securitydemo.domain.User;

/**
 * Created by linhtran on 17/09/17.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserName(String userName);

}
