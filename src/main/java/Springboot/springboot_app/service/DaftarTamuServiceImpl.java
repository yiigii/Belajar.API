package Springboot.springboot_app.service;
import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.Perusahaan;
import Springboot.springboot_app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DaftarTamuServiceImpl implements DaftarTamuService {

        private List<User> userList;
        private List<Perusahaan> perusahaanList;
        private List<DaftarTamu> daftarTamuList;

        public DaftarTamuServiceImpl() {
            userList = new ArrayList<>();
            perusahaanList = new ArrayList<>();
            daftarTamuList = new ArrayList<>();

            User user1 = new User(1, "Aigi");
            User user2 = new User(2, "Wahyu");
            User user3 = new User(3, "Way");
            User user4 = new User(4, "Muhammad");

            Perusahaan perusahaan1 = new Perusahaan(1, "Skolla");
            Perusahaan perusahaan2 = new Perusahaan(2, "Ruang Guru");

            Springboot.springboot_app.model.DaftarTamu daftarTamu1 = new Springboot.springboot_app.model.DaftarTamu(1, perusahaan1, user1);
            Springboot.springboot_app.model.DaftarTamu daftarTamu2 = new Springboot.springboot_app.model.DaftarTamu(2, perusahaan1, user2);
            Springboot.springboot_app.model.DaftarTamu daftarTamu3 = new Springboot.springboot_app.model.DaftarTamu(3, perusahaan2, user3);
            Springboot.springboot_app.model.DaftarTamu daftarTamu4 = new Springboot.springboot_app.model.DaftarTamu(4, perusahaan2, user4);

            System.out.println(daftarTamu1);
            System.out.println(daftarTamu2);
            System.out.println(daftarTamu3);
            System.out.println(daftarTamu4);

        }

    @Override
    public Optional<User> getUser(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Perusahaan> getPerusahaan(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<DaftarTamu> getDaftarTamu(Integer id) {
        return Optional.empty();
    }

    @Override
    public void setDaftarTamu(DaftarTamu daftarTamu) {
        daftarTamuList.add(daftarTamu);
    }

}
