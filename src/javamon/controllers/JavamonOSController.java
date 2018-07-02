/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javamon.entities.Javamon;
import javamon.utils.communication.CommunicationManager;
import javamon.utils.enums.Element;
import javamon.utils.enums.Experience;

/**
 *
 * @author Mario
 */
public class JavamonOSController {
    private ArrayList <Javamon> javamons;

    public JavamonOSController(){
        this.javamons = new ArrayList<Javamon>();
    }
    
    public List<Javamon> getJavamons(){
        return this.javamons;
    }
    
    public void CreateJavamon(String pName){
        Javamon newJavamon = new Javamon();
        newJavamon.setName(pName);
        newJavamon.setHighAttack(10);
        newJavamon.setMiddleAttack(10);
        newJavamon.setLowAttack(10);
        newJavamon.setHighDefense(10);
        newJavamon.setMiddleDefense(10);
        newJavamon.setLowDefense(10);
        newJavamon.setExperienceLevel(Experience.NEW);
        Random randomGenerator = new Random();
        newJavamon.setElement(Element.valueOf(randomGenerator.nextInt(4-0+1)+0 ));
        javamons.add(newJavamon);
    }
    
    public void sendJavamonToNintengoClassic(Javamon pJavamon){
        CommunicationManager comManager = new CommunicationManager();
        comManager.SendJavamon(pJavamon);
    }

    public void executeOption(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
