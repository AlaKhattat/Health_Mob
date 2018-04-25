/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthadvisor.service;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.healthadvisor.entities.Medecin;
import com.healthadvisor.entities.Patient;
import com.healthadvisor.entities.Utilisateur;

/**
 *
 * @author khattout
 */
public class ServiceUser {
    
    public void ajouterUtilisateur(Utilisateur user){
           ConnectionRequest con = new ConnectionRequest();
        String Url = "http://localhost/Healthintege/web/app_dev.php/api/ajouterUser/" + user;
        con.setUrl(Url);

        System.out.println("tt");

        con.addResponseListener(e -> {
            String str = new String(con.getResponseData());       
            System.out.println(str);         
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        
    }
    
     public void ajouterPatient(Patient patient){
           ConnectionRequest con = new ConnectionRequest();
        String Url = "http://localhost/Healthintege/web/app_dev.php/api/ajouterPatient/" + patient;
        con.setUrl(Url);

        System.out.println("tt");

        con.addResponseListener(e -> {
            String str = new String(con.getResponseData());       
            System.out.println(str);         
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        
    }
    
    public void ajouterMedecin(Medecin medecin){
           ConnectionRequest con = new ConnectionRequest();
        String Url = "http://localhost/Healthintege/web/app_dev.php/api/ajouterMedecin/" + medecin;
        con.setUrl(Url);

        System.out.println("tt");

        con.addResponseListener(e -> {
            String str = new String(con.getResponseData());       
            System.out.println(str);         
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        
    }
    
}
