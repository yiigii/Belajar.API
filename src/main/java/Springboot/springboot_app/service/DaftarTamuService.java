package Springboot.springboot_app.service;

import Springboot.springboot_app.model.DaftarTamu;
import Springboot.springboot_app.model.User;
import java.util.Optional;

public interface DaftarTamuService {
    Optional<User> getUser(Integer id);
    Optional<Springboot.springboot_app.model.Perusahaan> getPerusahaan(Integer id);
    Optional<Springboot.springboot_app.model.DaftarTamu> getDaftarTamu(Integer id);

    void setDaftarTamu(DaftarTamu daftarTamu);
}
