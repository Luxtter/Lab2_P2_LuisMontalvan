/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_p2_luismontalvan;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class LoginOSignup {

    public String LOS;
    public int opc;
    public String user1;
    public String user2;
    public String contraseña1;
    public String contraseña2;
    public int contPos;
    public String nombre;
    public int edad;
    public String userReg;
    public String contReg;
    public boolean bandera;
    ArrayList users = new ArrayList();

    public LoginOSignup() {
        bandera= false;
    }

    public void LoOSi() {
        Scanner pochita = new Scanner(System.in);
        System.out.println("1)Log In\n2)Sign Up");
        opc = pochita.nextInt();
        switch (opc) {
            case 1:
                Usuarios usuario = new Usuarios();
                users.addAll(usuario.getUsers());
                System.out.println("Ingrese su usuario");
                user1 = pochita.next();
                for (int i = 0; i < users.size(); i++) {
                    user2 = (String)users.get(i);
                    if (user2.equals(user1)) {
                        bandera = true;
                        contPos= i;
                    }
                }
                if(bandera == true){
                  System.out.println("Ingrese su contraseña");
                  contraseña1 = pochita.next();
                  contraseña2 = (String)users.get(contPos+1);
                  if(contraseña1.equals(contraseña2)){
                    System.out.println("Acceso Concedido");
                  }
                }
                
                break;
            case 2:
                System.out.println("Ingrese su nombre");
                nombre = pochita.nextLine();
                System.out.println("Ingrese su edad");
                edad = pochita.nextInt();
                System.out.println("Ingrese su usuario");
                userReg = pochita.next();
                System.out.println("Ingrese su contraseña");
                user1 = pochita.next();
                break;
        }
    }
}
