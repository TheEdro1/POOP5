/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona.javapackage;

import Fecha.javapackage.Fecha;

/**
 *
 * @author Ethan
 */
public class Persona {
    private int edad;
    private float altura;
    private String nombre;
    private String ocupacion;
    private Fecha fechaDeNacimiento;
    //
    public Persona(){
       
    }
   
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento){
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.ocupacion = ocupacion;
    }
   
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
   
    public float getAltura(){
            return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public Fecha getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public void setfechaDeNacimiento(Fecha fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
   
    public String getOcupacion(){
        return ocupacion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
   
   
    public boolean comer(){
        return true;
    }
    public boolean jugar(){
        return true;
    }
    public int correr(){
        System.out.println("500m");
        return 0;
    }
    public void saludar(){
        System.out.println("holi");
    }
    public void estudiar(){
        System.out.println("estoy estudiando");
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", ocupacion=" + ocupacion + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
   
}
