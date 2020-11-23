package com.example.FileOperation.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FileOperation.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
