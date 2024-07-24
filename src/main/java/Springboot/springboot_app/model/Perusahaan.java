package Springboot.springboot_app.model;

public class Perusahaan {
    private int id;
    private String namaperusahaan;
    private String alamat;
    private int jumlahpegawai;

    public Perusahaan(int id, String namaperusahaan, String alamat, int jumlahpegawai) {
        this.id = id;
        this.namaperusahaan = namaperusahaan;
        this.alamat = alamat;
        this.jumlahpegawai = jumlahpegawai;
    }


    public int getId() {

        return id;
    }

    public void setId() {

        this.id = id;
    }

    public String getNamaperusahaan() {

        return namaperusahaan;
    }

    public void setNamaperusahaan() {

        this.namaperusahaan = namaperusahaan;
    }

    public String getAlamat() {

        return alamat;
    }

    public void setAlamat() {

        this.alamat = alamat;
    }

    public int getJumlahpegawai() {

        return jumlahpegawai;
    }

    public void setJumlahpegawai() {

        this.jumlahpegawai = jumlahpegawai;
    }

}
