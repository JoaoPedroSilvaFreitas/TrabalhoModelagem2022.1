/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dcc117.deliciasdaana.view.*;
import dcc117.deliciasdaana.model.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class cadastrar implements ActionListener
{
    private Tela tela;
    private int TelaId;
    
    public cadastrar(Tela tela, int TelaId)
    {
        this.tela = tela;
        this.TelaId = TelaId;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(TelaId == 1)
        {
            Cliente cliente = new Cliente(tela.getCadastrarNomeCliente().getText(), tela.getCadastrarTelefoneCliente().getText(), tela.getCadastrarEnderecoCliente().getText());
            tela.getUsuario().addCliente(cliente);
            JOptionPane.showMessageDialog(tela, "Cliente " + tela.getUsuario().getClientes().get(tela.getUsuario().getClientes().size()-1).getNome() + " cadastrado(a) com sucesso!");
            tela.repaint();
            
        }else
            {
                if(TelaId == 2)
                {
                    int idCliente = tela.getClientes().getSelectedIndex();
                    
                    if(idCliente == -1) 
                    {
                        JOptionPane.showMessageDialog(tela, "ERRO:Selecione um cliente");
                    }else
                        {
                            //DefaultListModel<Cliente> modelClientes = (DefaultListModel<Cliente>) tela.getClientes().getModel();
                            Cliente cliente = tela.getUsuario().getClientes().get(idCliente);//modelClientes.getElementAt(idCliente);
                            
                            
                            Data dataPedido = new Data(Integer.parseInt(tela.getCadastrarDataPedidoDia().getText()), Integer.parseInt(tela.getCadastrarDataPedidoMes().getText()), Integer.parseInt(tela.getCadastrarDataPedidoAno().getText()));
                            Data dataEntrega = new Data(Integer.parseInt(tela.getCadastrarDataEntregaDia().getText()), Integer.parseInt(tela.getCadastrarDataEntregaMes().getText()), Integer.parseInt(tela.getCadastrarDataEntregaAno().getText()));
                            Encomenda encomenda = new Encomenda(cliente/*modelClientes.getElementAt(idCliente)*/, dataPedido, dataEntrega, tela.getCadastrarEncomendaInfo().getText());
                            
                            
                            tela.getUsuario().addEncomenda(encomenda);
                            JOptionPane.showMessageDialog(tela,"Encomenda registrada");
                            tela.repaint();
                        }
                }else
                    {
                        if(TelaId == 3)
                        {
                            double valor = Double.parseDouble(tela.getCadastrarValorIngrediente().getText());
                            int quantidade = Integer.parseInt(tela.getCadastrarQuantidadeIngrediente().getText());
                            Ingrediente ingrediente = new Ingrediente(tela.getCadastrarNomeIngrediente().getText(),valor , quantidade);
                            tela.getUsuario().addIngrediente(ingrediente);
                            JOptionPane.showMessageDialog(tela, "Ingrediente " + tela.getUsuario().getIngredientes().get(tela.getUsuario().getIngredientes().size()-1).getNome() + " adicionado com sucesso!");
                            tela.repaint();
                        }
                    }
            }
    }
}
