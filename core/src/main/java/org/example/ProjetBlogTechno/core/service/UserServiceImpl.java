package org.example.ProjetBlogTechno.core.service;

import org.example.ProjetBlogTechno.core.dto.CommentDTO;
import org.example.ProjetBlogTechno.core.dto.UserDTO;

import java.util.*;


public interface UserServiceImpl {

        public UserDTO saveUser(UserDTO userDTO);

        public boolean deleteUser(Long id);
        public boolean deleteAllUser();

        public boolean addCommentToUser(Long id, CommentDTO commentDTO);

        public List<UserDTO> listUser();

        public UserDTO getUserById(Long id);
    }

