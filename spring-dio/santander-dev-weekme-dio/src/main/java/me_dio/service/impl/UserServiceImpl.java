package me_dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me_dio.model.User;
import me_dio.repository.UserRepository;
import me_dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Esse numero de conta ja existe");
        }
        return userRepository.save(userToCreate);
    }
    
}
