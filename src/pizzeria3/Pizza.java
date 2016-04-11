/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Surfer69 contribution;
 */
package pizzeria3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class Pizza {

    String masa;
    String tipo;
    String tamaño;
    List<String> listaIngredientes=new ArrayList();

    private Double precioMasa = 0.0;
    private Double precioTipo = 0.0;
    private Double precioTamaño = 0.0;
    private Double precioIngredientes = 0.0;
    private Double precioTotal = 0.0;

    private final double MASANORMAL = 9.0;
    private final double MASAINTEGRAL = 9.5;
    private final double TBASICA = 3.0;
    private final double TCUATRO = 5.0;
    private final double TBBQ = 7.0;
    private final double TMEX = 8.5;
    private final double IJAMON = 0.50;
    private final double IQUESO = 0.75;
    private final double ITOMATE = 1.5;
    private final double ICEBOLLA = 2.50;
    private final double IOLIVAS = 1;
    private final double PMEDIANA=1.15;
    private final double PGRANDE=1.3;

    public Pizza(String masa, String tipo, String tamaño, List<String> ingredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        listaIngredientes = ingredientes;

    }

    public Pizza() {
        
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public double calcularPrecio() {
        //tipo masa
        if (masa.equalsIgnoreCase("Normal")) {
            precioMasa = MASANORMAL;
        }
        if (masa.equalsIgnoreCase("Inregral")) {
            precioMasa = MASAINTEGRAL;
        }
        //tipo pizza
        if (tipo.equalsIgnoreCase("Basica")) {
            precioTipo = TBASICA;

        }
        if (tipo.equalsIgnoreCase("Cuatro Quesos")) {
            precioTipo = TCUATRO;

        }
        if (tipo.equalsIgnoreCase("Mexicana")) {
            precioTipo = TMEX;

        }
        if (tipo.equalsIgnoreCase("Barbacoa")) {
            precioTipo = TBBQ;

        }
        //tipos ingredientes

        precioIngredientes = 0.0;
        for (String ing : listaIngredientes) {
            if (ing.equalsIgnoreCase("Jamon")) {
                precioIngredientes += IJAMON;
            }
            if (ing.equalsIgnoreCase("Olivas")) {
                precioIngredientes += IOLIVAS;
            }
            if (ing.equalsIgnoreCase("Cebolla")) {
                precioIngredientes += ICEBOLLA;
            }
            if (ing.equalsIgnoreCase("Tomate")) {
                precioIngredientes += ITOMATE;
            }
            if (ing.equalsIgnoreCase("Queso")) {
                precioIngredientes += IQUESO;
            }

        }
              
        precioTotal = precioMasa + precioIngredientes + precioTipo;
         //tamaño
         if (tamaño.equalsIgnoreCase("Mediana")) {
            precioTotal = precioTotal * PMEDIANA;
        }
        if (tamaño.equalsIgnoreCase("Grande")) {
            precioTotal = precioTotal *PGRANDE ;
        }
        return precioTotal;

    }

    @Override
    public String toString() {
       return "Pizza:|Tipo de masa: " + masa+"/Precio: "+ precioMasa.toString()+"|" + "\n"+"|Tipo de pizaa: " + tipo +"/Precio: "+ precioTipo.toString()+"|"+ "\n" +"|Ingredientes :"+ listaIngredientes.toString()+"/Precio"+ precioIngredientes.toString()  +"/Precio: "+ "|Tamaño:" + tamaño +"/Precio"+precioTamaño.toString()+"|PRECIO TOTAL= "+precioTotal; 
             //   
    }
    
}
