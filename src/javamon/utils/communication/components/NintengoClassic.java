/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.communication.components;

/**
 *
 * @author Mario
 */
public class NintengoClassic {
    public void sendJavamon(String pJavamonXmlString){
        System.out.println("Opening connection...");
        System.out.println(pJavamonXmlString);
        System.out.println("Javamon received...");
        System.out.println("Connection closed.");
    }
}
