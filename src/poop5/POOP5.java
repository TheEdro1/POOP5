/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

import Circulo.javapackage.Circulo;
import Fecha.javapackage.Fecha;
import Persona.javapackage.Persona;

/**
 *
 * @author Ethan
 */
public class POOP5 {

    public static void main(String[] args) {
           
           Circulo circulo = new Circulo();
           circulo.getRadio();
           System.out.println(circulo.getRadio());
           circulo.setRadio(7.77f);
           circulo.calcularArea();
           circulo.calcularPerimetro();
           System.out.println("Creando persona....");
           
           Fecha fechaDeNacimiento = new Fecha();
           fechaDeNacimiento.imprimirFecha();
           
           Persona Pablo = new Persona();
           Pablo.setEdad(19);
           Pablo.setAltura(1.75f);
           Pablo.setNombre("Pablo Jimenez");
           Pablo.setOcupacion("Bombero");
           Pablo.setfechaDeNacimiento(fechaDeNacimiento);
           
           System.out.println(Pablo);
           
           
       }
}