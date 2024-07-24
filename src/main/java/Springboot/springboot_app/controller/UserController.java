package Springboot.springboot_app.controller;

import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.Perusahaan;
import Springboot.springboot_app.model.User;
import Springboot.springboot_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Springboot.springboot_app.controller.UserController;

import java.util.Optional;

@RestController
    public class UserController{

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional user = userService.getUser(id);
        if (user.isPresent()){
            return (User) user.get();
        }
        return null;
    }


    @GetMapping("/perusahaan")
    public Perusahaan getPerusahaanById(@RequestParam Integer id){
        Optional perusahaan = userService.getPerusahaan(id);
        if (perusahaan.isPresent()){
            return (Perusahaan) perusahaan.get();
        }
        return null;
    }

    @GetMapping("/daftartamu")
    public DaftarTamu getDaftarTamuById(@RequestParam Integer id){
        Optional daftartamu = userService.getDaftarTamu(id);
        if (daftartamu.isPresent()){
            return (DaftarTamu) daftartamu.get();
        }
        return null;
    }


}

