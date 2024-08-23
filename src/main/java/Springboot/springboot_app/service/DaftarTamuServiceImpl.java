package Springboot.springboot_app.service;

import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.Perusahaan;
import Springboot.springboot_app.model.User;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DaftarTamuServiceImpl implements DaftarTamuService {

    private List<User> userList;
    private List<Perusahaan> perusahaanList;
    private List<DaftarTamu> daftarTamuList;

    public DaftarTamuServiceImpl() throws JsonProcessingException {
        userList = new ArrayList<>();
        perusahaanList = new ArrayList<>();
        daftarTamuList = new ArrayList<>();

        User user1 = new User(1, "Aigi");
        User user2 = new User(2, "Wahyu");
        User user3 = new User(3, "Way");
        User user4 = new User(4, "Muhammad");

        Perusahaan perusahaan1 = new Perusahaan(1, "Skolla");
        Perusahaan perusahaan2 = new Perusahaan(2, "Ruang Guru");

        DaftarTamu daftarTamu1 = new DaftarTamu(1, perusahaan1, user1);
        DaftarTamu daftarTamu2 = new DaftarTamu(2, perusahaan1, user2);
        DaftarTamu daftarTamu3 = new DaftarTamu(3, perusahaan2, user3);
        DaftarTamu daftarTamu4 = new DaftarTamu(4, perusahaan2, user4);

        daftarTamuList.add(daftarTamu1);
        daftarTamuList.add(daftarTamu2);
        daftarTamuList.add(daftarTamu3);
        daftarTamuList.add(daftarTamu4);

        ObjectMapper objectMapper = new ObjectMapper();

        String listJson = objectMapper.writeValueAsString(daftarTamuList);
        System.out.println(listJson);
            try {
                String json = objectMapper.writeValueAsString(daftarTamuList);
                System.out.println(json);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
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

    }
}
