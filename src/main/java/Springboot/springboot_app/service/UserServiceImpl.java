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
        User user1 = new User(1, "Aigi", 23, "wahyuaigi2@gmail.com");
        User user2 = new User(2, "Wahyu", 23, "wahyuaigi1@gmail.com");
        User user3 = new User(3, "Way", 23, "wahyuaigi3@gmail.com");
        User user4 = new User(4, "Ai", 23, "wahyuaigi4@gmail.com");
        User user5 = new User(5, "Muhammad", 23, "wahyuaigi5@gmail.com");
        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));

        // Initialize Perusahaan list
        Perusahaan perusahaan1 = new Perusahaan(1, "ruangguru", "jakbar", 500);
        Perusahaan perusahaan2 = new Perusahaan(2, "zenius", "jakpus", 100);
        Perusahaan perusahaan3 = new Perusahaan(3, "skolla", "jaksel", 50);
        Perusahaan perusahaan4 = new Perusahaan(4, "nf", "depok", 300);
        perusahaanList.addAll(Arrays.asList(perusahaan1, perusahaan2, perusahaan3, perusahaan4));

        DaftarTamu daftarTamu1 = new DaftarTamu(1, "bumn", "bpk tohir");
        DaftarTamu daftarTamu2 = new DaftarTamu(2, "pertamina", "bpk doyo");
        DaftarTamu daftarTamu3 = new DaftarTamu(3, "tambang", "bpk aksen");
        DaftarTamu daftarTamu4 = new DaftarTamu(4, "bimbel", "bpk kianu");
        DaftarTamu daftarTamu5 = new DaftarTamu(5, "mobil", "bpk dion");
        daftarTamuList.addAll(Arrays.asList(daftarTamu1, daftarTamu2, daftarTamu3, daftarTamu4, daftarTamu5));
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
