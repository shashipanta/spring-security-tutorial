package com.example.apitutorial.init;

import com.example.apitutorial.domain.Role;
import com.example.apitutorial.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationStartRunner implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role roleUser = new Role(1l, "123", "ROLE_USER");
        Role roleAdmin = new Role(2l, "456", "ROLE_ADMIN");
        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);
        System.out.println("inside command line runner");
    }
}
