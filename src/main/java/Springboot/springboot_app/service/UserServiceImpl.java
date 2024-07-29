package Springboot.springboot_app.service;

import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.Perusahaan;
import Springboot.springboot_app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList;
    private List<Perusahaan> perusahaanList;
    private List<DaftarTamu> daftarTamuList;

    public UserServiceImpl() {
        userList = new ArrayList<>();
        perusahaanList = new ArrayList<>();
        daftarTamuList = new ArrayList<>();

        // Initialize User list
        User user1 = new User(1, "Aigi");
        User user2 = new User(2, "Wahyu");
        User user3 = new User(3, "Way");
        User user4 = new User(4, "Ai");
        User user5 = new User(5, "Muhammad");
        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));

        // Initialize Perusahaan list
        Perusahaan perusahaan1 = new Perusahaan(1, "ruangguru");
        Perusahaan perusahaan2 = new Perusahaan(2, "zenius");
        Perusahaan perusahaan3 = new Perusahaan(3, "skolla");
        Perusahaan perusahaan4 = new Perusahaan(4, "nf");
        perusahaanList.addAll(Arrays.asList(perusahaan1, perusahaan2, perusahaan3, perusahaan4));

    }

    @Override
    public Optional<User> getUser(Integer id) {
        for (User user : userList) {
            if (id.equals(user.getId())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Perusahaan> getPerusahaan(Integer id) {
        for (Perusahaan perusahaan : perusahaanList) {
            if (id.equals(perusahaan.getId())) {
                return Optional.of(perusahaan);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<DaftarTamu> getDaftarTamu(Integer id) {
        for (DaftarTamu daftarTamu : daftarTamuList) {
            if (id.equals(daftarTamu.getId())) {
                return Optional.of(daftarTamu);
            }
        }
        return Optional.empty();
    }
}
