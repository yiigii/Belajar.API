package Springboot.springboot_app.model;

public class DaftarTamu {
    private int id;
    private Perusahaan perusahaan;
    private User user;

    public DaftarTamu(int id, Perusahaan perusahaan, User user) {
        this.id = id;
        this.perusahaan = perusahaan;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan){
        this.perusahaan = perusahaan;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DaftarTamu{" +
                "id=" + id +
                ", perusahaan='" + perusahaan.getName() +
                ", user=" + user.getName() +
                '}';
    }
}

