/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

import java.awt.event.ActionEvent;
import dcc117.deliciasdaana.view.*;
import java.awt.event.ActionListener;
import dcc117.deliciasdaana.model.*;

/**
 *
 * @author joaop
 */
public class consultarGastoLucro implements ActionListener
{
    private Tela tela;
    private int telaId;
    
    public consultarGastoLucro(Tela tela, int telaId)
    {
        this.tela = tela;
        this.telaId = telaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(telaId == 0)
        {
            tela.telaConsultaGastoLucro();
        }else
            if(telaId == 1)
            {
                double lucro = 0;
                double gasto = 0;
                for(Encomenda encomenda : tela.getUsuario().getEncomendas())
                {
                    if(encomenda.getDataDeEntrega().verificaData(Integer.parseInt(tela.getCadastrarDataPedidoDia().getText()), Integer.parseInt(tela.getCadastrarDataPedidoMes().getText()), Integer.parseInt(tela.getCadastrarDataPedidoAno().getText()), Integer.parseInt(tela.getCadastrarDataEntregaDia().getText()), Integer.parseInt(tela.getCadastrarDataEntregaMes().getText()), Integer.parseInt(tela.getCadastrarDataEntregaAno().getText())))
                    {
                        lucro += encomenda.getValorTotal();
                        gasto += encomenda.getGastoTotal();
                    }
                }
                lucro = lucro - gasto;
                tela.getConsultaValor().setText(Double.toString(lucro));
                tela.getConsultaGasto().setText(Double.toString(gasto));
            }
    }
}
