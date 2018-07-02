/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javamon.controllers.JavamonOSController;

/**
 *
 * @author Mario
 */
public class JavamonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("JavamonOS 0.1");
        JavamonOSController mainController = new JavamonOSController();
        int option = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (option !=3){
            System.out.println("Select action:");
            System.out.println("1. Create Javamon");
            System.out.println("2. Send it to a NintengoClassic");
            System.out.print("Enter String");
            option = Integer.parseInt(br.readLine());
            if (option == 1){
                System.out.print("Escriba el nombre del Javamon (y presione ENTER)? ");
                mainController.CreateJavamon(br.readLine());
                System.out.println("Javamon Creado. Tiene " + mainController.getJavamons().size() + " Javamones" );
            }
            if (option == 2){
                System.out.print("Enviando el primer javamon de la lista ");
                mainController.sendJavamonToNintengoClassic(mainController.getJavamons().get(0));
                System.out.println("Javamon enviado," );
            }
        }

    }
    
}
