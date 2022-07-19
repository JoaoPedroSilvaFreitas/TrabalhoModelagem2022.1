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
public class Doce extends Produto
{
    private String sabor;
    private float valor;
    private List<Ingrediente> ingredientes;
    
    Doce(String sabor)
    {
        this.sabor = sabor;
        this.valor = 0;
    }
    
    public float calculaValor()
    {   
        for (Ingrediente ingrediente : ingredientes)
        {
            valor += ingrediente.getValor();
        }
        return valor;
    }

    public void setSabor(String sabor)
    {
        this.sabor = sabor;
    }

    public String getSabor()
    {
        return this.sabor;
    }
    
    public void setIngredientes(List<Ingrediente> ingredientes) 
    {
        this.ingredientes = ingredientes;
    }
    
    public List<Ingrediente> getIngredientes() 
    {
        return ingredientes;
    }
    
}
