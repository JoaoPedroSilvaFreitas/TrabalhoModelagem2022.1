/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc117.deliciasdaana.controller.util;

/**
 *
 * @author joaop
 */

import dcc117.deliciasdaana.model.*;
import com.google.gson.Gson;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSON 
{
    //Objetos
    public static String clienteToJSON(Cliente cliente)
    {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        return json;
    }
    
    public static Cliente JSONtoCliente(String json)
    {
        Gson gson = new Gson();
        Cliente aluno = gson.fromJson(json, Cliente.class);
        return aluno;
    }

    public static String ingredienteToJSON(Ingrediente ingrediente)
    {
        Gson gson = new Gson();
        String json = gson.toJson(ingrediente);
        return json;
    }
    
    public static Ingrediente JSONtoIngrediente(String json)
    {
        Gson gson = new Gson();
        Ingrediente ingrediente = gson.fromJson(json, Ingrediente.class);
        return ingrediente;
    }
    
    public static String encomendaToJSON(Encomenda encomenda)
    {
        Gson gson = new Gson();
        String json = gson.toJson(encomenda);
        return json;
    }
    
    public static Encomenda JSONtoEncomenda(String json)
    {
        Gson gson = new Gson();
        Encomenda encomenda = gson.fromJson(json, Encomenda.class);
        return encomenda;
    }
    
    //Listas
    public static String clientesToJSON(List<Cliente> clientes)
    {
        Gson gson = new Gson();
        String json = gson.toJson(clientes);
        return json;
    }
    
    public static String ingredientesToJSON(List<Ingrediente> ingredientes)
    {
        Gson gson = new Gson();
        String json = gson.toJson(ingredientes);
        return json;
    }
    
    public static String encomendasToJSON(List<Encomenda> encomendas)
    {
        Gson gson = new Gson();
        String json = gson.toJson(encomendas);
        return json;
    }

    public static List<Cliente> toClientes(String json)
    {
        Gson gson = new Gson();
        Type clientesTipo = new TypeToken<ArrayList<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(json, clientesTipo);
        return clientes;
    }
    
    public static List<Ingrediente> toIngredientes(String json)
    {
        Gson gson = new Gson();
        Type ingredientesTipo = new TypeToken<ArrayList<Ingrediente>>(){}.getType();
        List<Ingrediente> ingredientes = gson.fromJson(json, ingredientesTipo);
        return ingredientes;
    }
    
    public static List<Encomenda> toEncomendas(String json)
    {
        Gson gson = new Gson();
        Type encomendasTipo = new TypeToken<ArrayList<Encomenda>>(){}.getType();
        List<Encomenda> encomendas = gson.fromJson(json, encomendasTipo);
        return encomendas;
    }
}