/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.*;
import dcc117.deliciasdaana.view.*;
import java.awt.event.*;


public class registrarProduto implements ActionListener
{
    private Tela tela;
    
    public registrarProduto(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tela.telaRegistraProduto();
    }
}
