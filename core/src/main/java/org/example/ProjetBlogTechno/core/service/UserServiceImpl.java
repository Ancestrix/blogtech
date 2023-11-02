package org.example.ProjetBlogTechno.core.service;

import org.example.ProjetBlogTechno.core.dto.UserDTO;
import org.springframework.stereotype.*;


import java.util.*;

@Service
public interface UserServiceImpl {
        UserDTO saveUser(UserDTO userDTO);

        boolean deleteUser(Long id);
        boolean deleteAllUser();


        List<UserDTO> listUser();

        UserDTO getUserById(Long id);
    }

