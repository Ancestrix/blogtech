package org.example.ProjetBlogTechno.core.service.impl;

import org.example.ProjetBlogTechno.core.dto.UserDTO;
import org.example.ProjetBlogTechno.core.dto.CommentDTO;
import org.example.ProjetBlogTechno.core.repository.UserImpl;
import org.example.ProjetBlogTechno.core.repository.entity.User;

import org.example.ProjetBlogTechno.core.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;


@Service
public class UserService implements UserServiceImpl  {
    private final UserImpl userImpl;
    @Autowired
    public UserService( UserImpl userImpl) {
        this.userImpl = userImpl;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        final User savedUser = userImpl.save(toEntity(userDTO));
        return toDTO(savedUser);
    }

    @Override
    public boolean deleteUser(Long id) {
        User existing= userImpl.findById(id).orElse(null);
        if(null==existing){
            return false;
        }
        userImpl.delete(existing);
        return true;
    }

    @Override
    public boolean deleteAllUser() {
        userImpl.deleteAll();
        return true;
    }

    @Override
    public boolean addCommentToUser(Long id, CommentDTO commentDTO) {
        return false;
    }

    @Override
    public List<UserDTO> listUser() {
        final Stream<User> userStream= userImpl.findAll().stream();
        return userStream.map(this::toDTO).toList();
    }
    public UserDTO getUserById(Long id) {
        final User user= userImpl.findById(id).orElse(null);
        return toDTO(user);
    }

    private UserDTO toDTO(User entity){
        if(null==entity){
            return null;
        }
        UserDTO dto = new UserDTO();
        dto.setUsername(entity.getUsername());
        dto.setMail(entity.getMail());
        dto.setId(entity.getId());
        return dto;
    }

    private User toEntity(UserDTO dto){
        if(null==dto){
            return null;
        }
        User entity = new User();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setMail(dto.getMail());
        return entity;
    }
}
