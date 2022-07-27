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
import javax.swing.JOptionPane;

public class alterarMes implements ActionListener
{
    private Tela tela;
    private int telaId;
    
    public alterarMes(Tela tela, int telaId)
    {
        this.tela = tela;
        this.telaId = telaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(telaId == 0)
        {
            int mes;
            mes = Integer.parseInt(tela.getCalendarioMes().getText()) - 1;
            if(mes < 1)
            {
                mes = 12;
                int ano;
                ano = Integer.parseInt(tela.getCalendarioAno().getText()) - 1;
                tela.getCalendarioAno().setText(Integer.toString(ano));
            }
            tela.getCalendarioMes().setText(Integer.toString(mes));
            
            
        }else
            {
                if(telaId == 1)
                {
                    int mes;
                    mes = Integer.parseInt(tela.getCalendarioMes().getText()) + 1;
                    if(mes > 12)
                    {
                        mes = 1;
                        int ano;
                        ano = Integer.parseInt(tela.getCalendarioAno().getText()) + 1;
                        tela.getCalendarioAno().setText(Integer.toString(ano));
                    }
                    tela.getCalendarioMes().setText(Integer.toString(mes));
                }
            }
        
        int mes = Integer.parseInt(tela.getCalendarioMes().getText());
        
        tela.getDia29().setText("29");
        tela.getDia30().setText("30");
        tela.getDia31().setText("31");
        
        if(mes == 2 || mes == 4 || mes == 6 || mes == 9|| mes == 11)
        {
            if(mes == 2)
            {
                tela.getDia30().setText("");
                tela.getDia29().setText("");
                if(Integer.parseInt(tela.getCalendarioAno().getText()) % 4 == 0)
                {
                    tela.getDia29().setText("29");
                }
            }else
                {
                    tela.getDia30().setText("30");
                    tela.getDia29().setText("29");
                }
            tela.getDia31().setText("");
        }
        
        
    }
} 
    