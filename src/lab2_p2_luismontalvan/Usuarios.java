/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_p2_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Usuarios {
    private String user;
    private String contraseña;
    ArrayList users = new ArrayList();
    private String datos;
    
    public Usuarios() {
        this.user= "admin";
        this.contraseña = "admin1234";
        datos = this.user;
        users.add(datos);
        datos = this.contraseña;
        users.add(datos);
    }

    public Usuarios(String user, String contraseña) {
        this.user = user;
        this.contraseña = contraseña;
        datos = this.user;
        users.add(datos);
        datos = this.contraseña;
        users.add(datos);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList getUsers() {
        return users;
    }

    public void setUsers(ArrayList users) {
        this.users = users;
    }
    
    
            
}
