package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasib
 */
public abstract class iletisimdbcon {
    private Connection iletisimcon;
    
    public Connection connect(){
        
        try {
            this.iletisimcon=DriverManager.getConnection("jdbc:derby://localhost:1527/CodeCasters", "CODECASTERS", "123");
        } catch (SQLException ex) {
            Logger.getLogger(iletisimdbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this.iletisimcon;
    }
    
}
