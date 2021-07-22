package com.example.home.service;
import java.util.List;

import com.example.home.model.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public List<UserDTO> getListUser();
    public UserDTO getUserById(int id);
    public List<UserDTO> searchUser(String keyword);
}
