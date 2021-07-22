package com.example.home.model.mapper;

import com.example.home.entity.User;
import com.example.home.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user){
        UserDTO tmp = new UserDTO();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone(user.getPhone());
        return tmp;
    }
}
