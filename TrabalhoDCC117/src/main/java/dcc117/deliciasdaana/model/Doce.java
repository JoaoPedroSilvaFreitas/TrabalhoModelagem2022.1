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
    
    public Doce(String sabor, String info, double valor, double custo)
    {
        this.sabor = sabor;
        this.info = info;
        this.valor = valor;
        this.custo = custo;
    }

    public void setSabor(String sabor)
    {
        this.sabor = sabor;
    }

    public String getSabor()
    {
        return this.sabor;
    }
    
    //toString
    @Override
    public String toString()
    {
        return "Doce:   " + this.sabor + "  " + "   " + this.valor + "   R$" + this.info;
    }
    
}
