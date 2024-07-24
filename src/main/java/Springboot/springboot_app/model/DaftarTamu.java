package Springboot.springboot_app.model;

public class DaftarTamu {

    private int id;
    private String perusahaan;
    private String userr;

    public DaftarTamu(int id, String perusahaan, String userr) {
        this.id = id;
        this.perusahaan = perusahaan;
        this.userr = userr;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPerusahaan() {
        return perusahaan = perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getUserr(){
        return userr = userr;
    }

    public void setUserr(String userr) {
        this.userr = userr;
    }
}
