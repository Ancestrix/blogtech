package org.example.ProjetBlogTechno.api.controller;

import org.example.ProjetBlogTechno.core.dto.UserDTO;
import org.example.ProjetBlogTechno.core.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController()
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(@Autowired UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserDTO> getArticleDTOList(ModelMap model){
        model.addAttribute("user", userService.listUser());
        return userService.listUser();
    }
    @GetMapping("/{id}")
    public UserDTO getUserDTOById(@PathVariable Long id, ModelMap model){
        model.addAttribute("userById", userService.listUser());
        return userService.getUserById(id);
    }

    @PostMapping()
    public UserDTO saveUserDTO(@RequestBody final UserDTO userDTO){
        return userService.saveUser(userDTO);
    }


    @DeleteMapping("/{id}")
    public boolean deleteUserDTO(@RequestParam final Long id){
        return userService.deleteUser(id);
    }
    @DeleteMapping()
    public boolean deleteAllUserDTO(){
        return userService.deleteAllUser();
    }
}

