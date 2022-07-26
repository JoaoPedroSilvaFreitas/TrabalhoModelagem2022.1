/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

/**
 *
 * @author joaop
 */

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import dcc117.deliciasdaana.view.*;
import javax.swing.*;


public class relatorioInfo implements ListSelectionListener
{
    private Tela tela;

    public relatorioInfo(Tela tela) 
    {
        this.tela = tela;
    }
    
    public void valueChanged(ListSelectionEvent e) 
    {
    
        int id = tela.getEncomendas().getSelectedIndex();
        
        if(id != -1)
        {
            tela.getNomeCliente().setText(tela.getEncomendas().getModel().getElementAt(id).getCliente().getNome());
            
            tela.getTelefoneCliente().setText(tela.getEncomendas().getModel().getElementAt(id).getCliente().getTelefone());
            
            tela.getEnderecoCliente().setText(tela.getEncomendas().getModel().getElementAt(id).getCliente().getEndereco());
            
            tela.getDataDiaEntrega().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDeEntrega().getDia()));
            tela.getDataMesEntrega().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDeEntrega().getMes()));
            tela.getDataAnoEntrega().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDeEntrega().getAno()));
            
            tela.getDataDiaPedido().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDoPedido().getDia()));
            tela.getDataMesPedido().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDoPedido().getMes()));
            tela.getDataAnoPedido().setText(Integer.toString(tela.getEncomendas().getModel().getElementAt(id).getDataDoPedido().getAno()));
            
            tela.getEncomendaInfo().setText(tela.getEncomendas().getModel().getElementAt(id).getInfo());
            
            tela.getEncomendaValor().setText(Double.toString(tela.getEncomendas().getModel().getElementAt(id).getValorTotal()));
            
            tela.getEncomendaGasto().setText(Double.toString(tela.getEncomendas().getModel().getElementAt(id).getGastoTotal()));
        }
    }
}
