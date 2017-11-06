/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author KOL-FACULTY01
 */
public class LoginForm 
{
    JFrame loginform;
    JLabel uName, uPass;
    JTextField tuName, tuPass;
    JButton login, cancel;
    
    public LoginForm()
    {
        loginform = new JFrame("Login Form");
        loginform.setLayout(null);
        loginform.setSize(300,170);
        loginform.setVisible(true);
        
        uName = new JLabel("Enter User Name:");
        uName.setBounds(10,20,100,20);
        
        uPass = new JLabel("Enter Password:");
        uPass.setBounds(10,60,100,20);
        
        tuName = new JTextField();
        tuName.setBounds(120,20,150,20);
        
        tuPass = new JTextField();
        tuPass.setBounds(120,60,150,20);
        
        login = new JButton("Login");
        login.setBounds(50,100,100,25);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(170,100,100,25);
        
        loginform.add(uName);
        loginform.add(uPass);
        loginform.add(tuName);
        loginform.add(tuPass);
        loginform.add(login);
        loginform.add(cancel);
        
        loginform.setResizable(false);
    }
    public static void main(String[] args)
    {
        LoginForm lf = new LoginForm();
        
             
    }
    
}
