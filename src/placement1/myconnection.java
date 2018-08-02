/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anchit Chawla
 */
public class myconnection {
    Connection db;
    public myconnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/placement", "root","");
        }
        catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
}
