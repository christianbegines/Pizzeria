/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Surfer69 contribution;
 */
package pizzeria5;

import pizzeria4.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import pizzeria3.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class Pizza {

    DecimalFormat d = new DecimalFormat("##.##");
    private String masa;
    private String tipo;
    private String tamaño;
    int contadorTicket = 1;
    private List<String> listaIngredientes = new ArrayList();

    private Double precioMasa = 0.0;
    private Double precioTipo = 0.0;
    private Double precioTamaño = 0.0;
    private Double precioIngredientes = 0.0;
    private Double precioTotal = 0.0;

    private double MASANORMAL;
    private double MASAINTEGRAL;
    private double TBASICA;
    private double TCUATRO;
    private double TBBQ;
    private double TMEX;
    private double IJAMON;
    private double IQUESO;
    private double ITOMATE;
    private double ICEBOLLA;
    private double IOLIVAS;
    private double PMEDIANA;
    private double PGRANDE;

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
        if (masa.equalsIgnoreCase("Integral")) {
            precioMasa = MASAINTEGRAL;

        }
        //tipo pizza
        if (tipo.equalsIgnoreCase("Basica")) {
            precioTipo = TBASICA;
            this.setTipo("Basica");

        }
        if (tipo.equalsIgnoreCase("Cuatro Quesos")) {
            precioTipo = TCUATRO;
            this.setTipo("Cuatro Quesos");

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
            precioTotal = (precioTotal * PMEDIANA) + precioTotal;
            precioTamaño = precioTotal * PMEDIANA;
        }
        if (tamaño.equalsIgnoreCase("Familiar")) {
            precioTotal = precioTotal * PGRANDE + precioTotal;
            precioTamaño = precioTotal * PGRANDE;
        }

        return precioTotal;

    }

    public String pedido() {
        double precio = this.calcularPrecio();
        return "Pizza:|Tipo de masa: " + masa
                + "/Precio masa : " + precioMasa + "|"
                + "\r\n" + "|Tipo de pizaa: " + tipo + "/Precio tipo: " + precioTipo
                + "\r\n" + "|Ingredientes :" + listaIngredientes.toString() + "\r\n"
                + "/Precio ing :" + precioIngredientes.toString() + "\r\n"
                + "|Tamaño: " + tamaño + "/Precio  " + d.format(precioTamaño) + "\r\n"
                + "|PRECIO TOTAL= " + precio;
        //   
    }

    public boolean generarTicket() {
        boolean res = true;

        LocalDateTime hoy = LocalDateTime.now();

        try (FileWriter t = new FileWriter("Factura" + Integer.toString(contadorTicket) + ".txt");
                BufferedWriter factura = new BufferedWriter(t)) {

            factura.write(hoy.toString());
            factura.newLine();
            factura.write(this.pedido());
            contadorTicket++;

        } catch (FileNotFoundException ex) {
            res = false;
        } catch (IOException ex) {
            res = false;
        }

        return res;
    }

    public boolean cargarPrecios(File fichero) {
        String nombre, linea;
        String precio;
        boolean res = true;
        try (FileReader r = new FileReader(fichero);
                BufferedReader br = new BufferedReader(r);) {
            while ((linea = br.readLine()) != null) {
                String[] dato = linea.split(":");
                nombre = dato[0];
                switch (nombre) {
                    case "Normal":
                        this.MASANORMAL = Double.parseDouble(dato[1]);
                        break;
                    case "Integral":
                        this.MASAINTEGRAL = Double.parseDouble(dato[1]);
                        break;
                    case "Basica":
                        this.TBASICA = Double.parseDouble(dato[1]);
                        break;
                    case "CuatroQuesos":
                        this.TCUATRO = Double.parseDouble(dato[1]);
                        break;
                    case "Barbacoa":
                        this.TBBQ = Double.parseDouble(dato[1]);
                        break;
                    case "Mexicana":
                        this.TMEX = Double.parseDouble(dato[1]);
                        break;
                    case "Ijamon":
                        this.IJAMON = Double.parseDouble(dato[1]);
                        break;
                    case "Icebolla":
                        this.ICEBOLLA = Double.parseDouble(dato[1]);
                        break;
                    case "Iolivas":
                        this.IOLIVAS = Double.parseDouble(dato[1]);
                        break;
                    case "Itomate":
                        this.ITOMATE = Double.parseDouble(dato[1]);
                        break;
                    case "Iqueso":
                        this.IQUESO = Double.parseDouble(dato[1]);
                        break;
                    case "Pmediana":
                        this.PMEDIANA = Double.parseDouble(dato[1]);
                        break;
                    case "Pgrande":
                        this.PGRANDE = Double.parseDouble(dato[1]);
                }
            }
        } catch (FileNotFoundException ex) {
            res = false;
        } catch (IOException ex) {
            res = false;
        }
        return res;
    }

}
