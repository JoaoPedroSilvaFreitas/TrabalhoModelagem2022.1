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
    private static final String CAMINHOingredientes = "dadosIngredientes.json";
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
            
            String ingredientes = Arquivo.lerArquivo(CAMINHOingredientes);
            List<Ingrediente> Ingredientes = JSON.toIngredientes(ingredientes);
            
            String encomendas = Arquivo.lerArquivo(CAMINHOencomendas);
            List<Encomenda> Encomendas = JSON.toEncomendas(encomendas);

            DefaultListModel<Cliente> modelClientes = new DefaultListModel<>();
            DefaultListModel<Ingrediente> modelIngredientes = new DefaultListModel<>();
            DefaultListModel<Encomenda> modelEncomendas = new DefaultListModel<>();

            for (Cliente cliente : Clientes) 
            {
                modelClientes.addElement(cliente);
            }
            
            for (Ingrediente ingrediente : Ingredientes) 
            {
                modelIngredientes.addElement(ingrediente);
            }
            
            for (Encomenda encomenda : Encomendas) 
            {
                modelEncomendas.addElement(encomenda);
            }
            
            tela.getClientes().setModel(modelClientes);
            tela.getIngredientes().setModel(modelIngredientes);
            tela.getEncomendas().setModel(modelEncomendas);
            
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
            
            String ClientesToJSON = JSON.clientesToJSON(clientes);
            String IngredientesToJSON = JSON.ingredientesToJSON(ingredientes);
            String EncomendasToJSON = JSON.encomendasToJSON(encomendas);
            
            Arquivo.escreverArquivo(CAMINHOclientes, ClientesToJSON);
            Arquivo.escreverArquivo(CAMINHOingredientes, IngredientesToJSON);
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