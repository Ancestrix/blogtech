package org.example.ProjetBlogTechno.core.service;

import org.example.ProjetBlogTechno.core.dto.UserDTO;
import org.springframework.stereotype.*;


import java.util.*;

@Service
public interface UserServiceImpl {
        public UserDTO saveUser(UserDTO userDTO);

        public boolean deleteUser(Long id);
        public boolean deleteAllUser();


        public List<UserDTO> listUser();

        public UserDTO getUserById(Long id);
    }

