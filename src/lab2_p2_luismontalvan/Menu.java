/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_p2_luismontalvan;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class Menu {
    public int opc;
    public Menu() {
    }

    public void inicioMenu() {
        Scanner pochita = new Scanner(System.in);
        System.out.println("1)Registro de Inmbueble/Solares\n2)Manejo de Estados\n3)Log In/Sign Up\n4)Salir\n");
        opc = pochita.nextInt();
        switch(opc){
            case 1:
                System.out.println("si");
                break;
            case 2:
                System.out.println("si");
                break;
            case 3:
                LoginOSignup LOS= new LoginOSignup();
                LOS.LoOSi();
                break;
            case 4:
                System.out.println("si");
                break;
            
                    
        } 
    }
}
