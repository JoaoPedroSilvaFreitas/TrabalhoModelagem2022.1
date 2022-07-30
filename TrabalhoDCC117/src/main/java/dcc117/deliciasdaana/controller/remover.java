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
import dcc117.deliciasdaana.view.*;
import dcc117.deliciasdaana.model.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class remover implements ActionListener
{
    private Tela tela;
    private int TelaId;
    
    public remover(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            int idCliente = tela.getClientes().getSelectedIndex();
            
            if(idCliente == -1) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO:Selecione um cliente");
            }else
                {
                    tela.getUsuario().getClientes().remove(idCliente);
                    tela.visibilidadeTelaRegistraEncomenda();
                    tela.telaRegistraEncomenda();
                    JOptionPane.showMessageDialog(tela, "Cliente removido");
                    tela.repaint();
                } 

        }
        
        if(TelaId == 2)
        {
            int idEncomenda = tela.getEncomendas().getSelectedIndex();
            
            if(idEncomenda == -1) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO:Selecione uma Encomenda");
            }else
                {
                    tela.getUsuario().getEncomendas().remove(idEncomenda);
                    tela.visibilidadeTelaRelatorio();
                    tela.telaRelatorio();
                    JOptionPane.showMessageDialog(tela, "Encomenda removida");
                    tela.repaint();
                }
        }
        
    }
}
    