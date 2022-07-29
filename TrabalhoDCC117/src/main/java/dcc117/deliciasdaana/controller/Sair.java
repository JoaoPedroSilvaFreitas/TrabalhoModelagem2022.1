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

public class Sair implements ActionListener
{
    private Tela tela;
    private int TelaId;
    
    public Sair(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            tela.visibilidadeTelaUsuario();
            tela.telaPrincipal();
        }else
            {
                if(TelaId == 2)
                {
                   tela.visibilidadeTelaRegistraCliente();
                   tela.telaUsuario(tela.getUsuario());
                }else
                    {
                        if(TelaId == 3)
                        {
                           tela.visibilidadeTelaRegistraEncomenda();
                           tela.telaUsuario(tela.getUsuario());
                        }else
                            {
                                if(TelaId == 4)
                                {
                                    //tela.visibilidadeTelaRegistraIngrediente();
                                    tela.visibilidadeTelaRegistraProduto();
                                    tela.telaUsuario(tela.getUsuario());
                                }else
                                    {
                                        if(TelaId == 5)
                                        {
                                            tela.visibilidadeTelaConsultaGastoLucro();
                                            tela.telaUsuario(tela.getUsuario());
                                        }else
                                            {
                                                if(TelaId == 6)
                                                {
                                                    tela.visibilidadeTelaRelatorio();
                                                    tela.telaUsuario(tela.getUsuario());
                                                }else
                                                    {
                                                        if(TelaId == 7)
                                                        {
                                                            tela.visibilidadeTelaCalendario();
                                                            tela.telaUsuario(tela.getUsuario());
                                                        }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        
    }
}
