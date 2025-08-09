package me_dio.service;


import me_dio.model.User;


public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
