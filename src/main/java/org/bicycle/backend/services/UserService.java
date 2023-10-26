package org.bicycle.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bicycle.backend.dao.jpa.UserRepository;
import org.bicycle.backend.models.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User user;

    public User save(User  userData){
        return userRepository.save(userData);
    }
    
}
