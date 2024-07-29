package Springboot.springboot_app.model;

public class Perusahaan {
    private int id;
    private String name;

    public Perusahaan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
