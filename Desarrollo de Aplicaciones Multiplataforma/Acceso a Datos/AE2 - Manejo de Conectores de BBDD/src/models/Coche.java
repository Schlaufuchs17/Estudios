package models;

public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private String color;

    public Coche() {}

    public Coche(int id, String marca, String modelo, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{id=" + id + ", marca='" + marca + "', modelo='" + modelo + "', color='" + color + "'}";
    }
}
