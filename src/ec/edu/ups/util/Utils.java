/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author braya
 */
public class Utils {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto_Interciclo_2PU");
    
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
}
