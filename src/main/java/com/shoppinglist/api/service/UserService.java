package com.shoppinglist.api.service;

import com.shoppinglist.api.entity.User;
import com.shoppinglist.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// The UserService class will handle the creation, search, and other operations related to users. The service layer will be the "bridge" between the business logic and the repository.
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Método para salvar um novo usuário
    public User save(User user) {
        return userRepository.save(user);
    }

    // Método para encontrar todos os usuários
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Método para encontrar um usuário por ID
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    // Método para encontrar um usuário por email
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    //Método para deletar um usuário por ID
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
