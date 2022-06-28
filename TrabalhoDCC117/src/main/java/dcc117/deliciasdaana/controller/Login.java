/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

/**
 *
 * @author joaop
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import dcc117.deliciasdaana.view.*;
import dcc117.deliciasdaana.obj.*;


public class Login implements ActionListener
{
    private Tela tela;
    
    public Login(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        boolean login = false;
        
        if(tela.getSenha().getText().equals("Admin"))
        {
            Usuario usuario = new Usuario();
            tela.telaUsuario(usuario);
            login = true;
        }

        if(login == false)
        {
            JOptionPane.showMessageDialog(tela, "Senha inválida");
        }
    }
}
