package RegistrationSystem.com.example.RegistrationSystem.demo.registration;

// Registration

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    public String register (@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
