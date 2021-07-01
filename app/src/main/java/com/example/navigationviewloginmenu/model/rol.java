package com.example.navigationviewloginmenu.model;

public class rol {

    public int Id;
    public String Cargo;
    public String Namemenu;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getNamemenu() {
        return Namemenu;
    }

    public void setNamemenu(String namemenu) {
        Namemenu = namemenu;
    }

    @Override
    public String toString() {
        return "rol{" +
                "Id=" + Id +
                ", Cargo='" + Cargo + '\'' +
                ", Namemenu='" + Namemenu + '\'' +
                '}';
    }
}
