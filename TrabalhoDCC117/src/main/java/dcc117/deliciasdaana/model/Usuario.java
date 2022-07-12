/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.model;

import java.util.*;

/**
 *
 * @author joaop
 */
public class Usuario 
{
    private String senha;
    private List<Encomenda> encomendas = new ArrayList<Encomenda>();
    private List<Cliente> clientes= new ArrayList<Cliente>();
    private List<Ingrediente> ingredientes= new ArrayList<Ingrediente>();

    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }
    
    public void addEncomenda(Encomenda encomenda)
    {
        encomendas.add(encomenda);
    }
    
    public void addIngrediente(Ingrediente ingrediente)
    {
        ingredientes.add(ingrediente);
    }
    
    //get
    public String getSenha()
    {
        return this.senha;
    }
    
    public List<Encomenda> getEncomendas() 
    {
        return encomendas;
    }

    public List<Cliente> getClientes() 
    {
        return clientes;
    }

    public List<Ingrediente> getIngredientes() 
    {
        return ingredientes;
    }
    
    //set
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    public void setEncomendas(List<Encomenda> encomendas) 
    {
        this.encomendas = encomendas;
    }
    
    public void setClientes(List<Cliente> clientes) 
    {
        this.clientes = clientes;
    }
    
    public void setIngredientes(List<Ingrediente> ingredientes) 
    {
        this.ingredientes = ingredientes;
    }
    
}
