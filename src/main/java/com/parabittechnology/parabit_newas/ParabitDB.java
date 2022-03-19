/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parabittechnology.parabit_newas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
/**
 *
 * @author india
 */
public class ParabitDB 
{
 Connection con;
 Statement stm;
 ResultSet rs;
 public ParabitDB()
 {
 try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ENV_Parabit", "root", "");
            stm=con.createStatement();
           // stm.executeUpdate("Insert into climate values(6,'hello')");
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String arg[])
            {
                ParabitDB ob = new ParabitDB();
            }
     
     
 }