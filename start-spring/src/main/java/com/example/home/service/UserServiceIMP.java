package com.example.home.service;

import com.example.home.entity.User;
import com.example.home.model.dto.UserDTO;
import com.example.home.model.mapper.UserMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class UserServiceIMP implements UserService{

    private static ArrayList<User> users = new ArrayList<User>();

    static{
        users.add(new User(1, "dinh cong dinh 1", "zedpro2k1@gmail.com", "012321321", "test11111"));
        users.add(new User(2, "dinh cong dinh 2", "zedpro2k2@gmail.com", "012321322", "test11112"));
        users.add(new User(3, "dinh cong dinh 3", "zedpro2k3@gmail.com", "012321323", "test11113"));
        users.add(new User(4, "dinh cong dinh 4", "zedpro2k4@gmail.com", "012321324", "test11114"));
        users.add(new User(5, "dinh cong dinh 5", "zedpro2k5@gmail.com", "012321325", "test11115"));
        users.add(new User(6, "dinh cong dinh 6", "zedpro2k6@gmail.com", "012321326", "test11116"));
    }

    @Override
    public List<UserDTO> getListUser() {
        List<UserDTO> result = new ArrayList<UserDTO>();
        for(User user: users){
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public UserDTO getUserById(int id) {
        for(User user: users){
            if(user.getId() == id){
                return UserMapper.toUserDTO(user);
            }
        }
        return null;
    }

    @Override
    public List<UserDTO> searchUser(String keyword) {
        List<UserDTO> result = new ArrayList<UserDTO>();
        for(User user:users){
            if(user.getName().contains(keyword)){
                result.add(UserMapper.toUserDTO(user));
            }
        }
        return result;
    }
}
