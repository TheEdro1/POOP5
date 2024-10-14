/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fecha.javapackage;

/**
 *
 * @author Ethan
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }
    public String imprimirFecha(){
        System.out.println(dia+"/"+mes+"/"+anho);
        return (dia+"/"+mes+"/"+anho);
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anho=" + anho + '}';
    }
   
}