/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

import dcc117.deliciasdaana.model.*;
import dcc117.deliciasdaana.view.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class addProduto implements ActionListener
{
    private Tela tela;
    private int TelaId;
    
    public addProduto(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            Doce doce = new Doce(tela.getCadastrarDoceSabor().getText(), tela.getCadastrarDoceInfo().getText(), Double.parseDouble(tela.getCadastrarDoceValor().getText()));
            tela.getUsuario().addProduto(doce);
            JOptionPane.showMessageDialog(tela,"Doce adicionado");
            tela.repaint();
            
            
        }else
            {
                if(TelaId == 2)
                {
                    Bolo bolo = new Bolo(tela.getCadastrarBoloSaborMassa().getText(),tela.getCadastrarBoloSaborRecheio().getText(),tela.getCadastrarBoloTamanho().getText(), tela.getCadastrarBoloInfo().getText(), Double.parseDouble(tela.getCadastrarBoloValor().getText()));
                    tela.getUsuario().addProduto(bolo);
                    JOptionPane.showMessageDialog(tela,"Bolo adicionado");
                    tela.repaint();
                }
            }
    }
}