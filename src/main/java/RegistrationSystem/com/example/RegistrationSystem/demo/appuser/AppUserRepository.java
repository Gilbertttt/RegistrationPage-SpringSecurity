// This repository hmmm......
//I'm not really sure it's the one connecting to our database

package RegistrationSystem.com.example.RegistrationSystem.demo.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {

    Optional<AppUser> findByEmail(String email);

}
