/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.obj;

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
    
    public void setSabor(String sabor)
    {
        this.sabor = sabor;
    }

    public String getSabor()
    {
        return this.sabor;
    }
    
}
