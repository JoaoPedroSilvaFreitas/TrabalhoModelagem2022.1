/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

import java.awt.event.ActionEvent;
import dcc117.deliciasdaana.view.*;
import java.awt.event.ActionListener;

/**
 *
 * @author joaop
 */
public class calendario implements ActionListener
{
    private Tela tela;
    
    public calendario(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tela.telaCalendario();
    }
}