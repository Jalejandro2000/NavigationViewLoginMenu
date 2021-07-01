package com.example.navigationviewloginmenu.model;

public class user {


        public int Id;
        public String Password;
        public String Username;
        public String Name;
        public String Gender;
        public String Birthdaydate;
        public String Rol;
        public String Createat;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthdaydate() {
        return Birthdaydate;
    }

    public void setBirthdaydate(String birthdaydate) {
        Birthdaydate = birthdaydate;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getCreateat() {
        return Createat;
    }

    public void setCreateat(String createat) {
        Createat = createat;
    }

    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", Password='" + Password + '\'' +
                ", Username='" + Username + '\'' +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthdaydate='" + Birthdaydate + '\'' +
                ", Rol='" + Rol + '\'' +
                ", Createat='" + Createat + '\'' +
                '}';
    }
}
