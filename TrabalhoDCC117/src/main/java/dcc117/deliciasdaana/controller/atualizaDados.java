/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller;

/**
 *
 * @author joaop
 */

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import dcc117.deliciasdaana.controller.util.*;
import dcc117.deliciasdaana.view.*;
import dcc117.deliciasdaana.model.*;



public class atualizaDados implements WindowListener
{
    private static final String CAMINHOclientes = "dadosClientes.json";
    //private static final String CAMINHOingredientes = "dadosIngredientes.json";
    private static final String CAMINHOprodutos = "dadosProdutos.json";
    private static final String CAMINHOencomendas = "dadosEncomendas.json";
    private Tela tela;

    public atualizaDados(Tela tela)
    {
        this.tela = tela;
    }
    
    @Override
    public void windowOpened(WindowEvent e) 
    {

        try 
        {
            String clientes = Arquivo.lerArquivo(CAMINHOclientes);
            List<Cliente> Clientes = JSON.toClientes(clientes);
            
            //String produtos = Arquivo.lerArquivo(CAMINHOprodutos);
            //List<Produto> Produtos = JSON.toProdutos(produtos);
            
            String encomendas = Arquivo.lerArquivo(CAMINHOencomendas);
            List<Encomenda> Encomendas = JSON.toEncomendas(encomendas);
            
            for (Cliente cliente : Clientes) 
            {
                tela.getUsuario().addCliente(cliente);
            }
            
            /*
            for (Produto produto : Produtos) 
            {
                tela.getUsuario().addProduto(produto);
            }
            */
            
            for (Encomenda encomenda : Encomendas) 
            {
                tela.getUsuario().addEncomenda(encomenda);
            }
            
            tela.repaint();
            
        }catch (FileNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO: Não foi possível carregar os dados");
            }
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        try 
        {
            /*
            ListModel<Cliente> modelCliente = tela.getClientes().getModel();
            List<Cliente> clientes = new ArrayList<>();
            
            ListModel<Ingrediente> modelIngrediente = tela.getIngredientes().getModel();
            List<Ingrediente> ingredientes = new ArrayList<>();
            
            ListModel<Encomenda> modelEncomenda = tela.getEncomendas().getModel();
            List<Encomenda> encomendas = new ArrayList<>();

            for (int i = 0; i < modelCliente.getSize(); i++) 
            {
                clientes.add(modelCliente.getElementAt(i));
            }
            
            for (int i = 0; i < modelIngrediente.getSize(); i++) 
            {
                ingredientes.add(modelIngrediente.getElementAt(i));
            }
            
            for (int i = 0; i < modelEncomenda.getSize(); i++) 
            {
                encomendas.add(modelEncomenda.getElementAt(i));
            }
            */
            
            /*
            List<Cliente> clientes = tela.getUsuario().getClientes();
            List<Encomenda> encomendas = tela.getUsuario().getEncomendas();
            
            for (int i = 0; i < clientes.size(); i++) 
            {
                clientes.add(clientes.get(i));
            }
            
            for (int i = 0; i < encomendas.size(); i++) 
            {
                encomendas.add(encomendas.get(i));
            }
            */
            
            String ClientesToJSON = JSON.clientesToJSON(tela.getUsuario().getClientes());
            //String ProdutosToJSON = JSON.produtosToJSON(tela.getUsuario().getProdutos());
            String EncomendasToJSON = JSON.encomendasToJSON(tela.getUsuario().getEncomendas());
            
            Arquivo.escreverArquivo(CAMINHOclientes, ClientesToJSON);
            //Arquivo.escreverArquivo(CAMINHOprodutos, ProdutosToJSON);
            Arquivo.escreverArquivo(CAMINHOencomendas, EncomendasToJSON);
            
        }catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(tela, "ERRO: Não foi possivel salvar os dados");
            }
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        
    }

    @Override
    public void windowIconified(WindowEvent e) 
    {

    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {
        
    }

    @Override
    public void windowActivated(WindowEvent e) 
    {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {
        
    }
    
}