/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo.javapackage;

/**
 *
 * @author Ethan
 */
public class Circulo {
    final float PI = 3.14f;
        private float radio ;

        public Circulo (){
           
        }
       
        public Circulo (float radio){
            this.radio= radio;
        }
       
        public float getRadio() {
            return radio;
        }
       
        public void setRadio(float radio) {
            this.radio = radio;
        }
        public void calcularPerimetro(){
            System.out.println("Perimetro: "+2 * PI * radio);
        }
        public void calcularArea(){
            System.out.println("Area "+ PI * radio * radio);
           
        }
    }
    