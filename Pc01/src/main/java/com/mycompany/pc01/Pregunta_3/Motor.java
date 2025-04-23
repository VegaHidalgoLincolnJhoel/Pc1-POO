/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc01.Pregunta_3;

/**
 *
 * @author Lincoln Vega Hidalgo
 */
public class Motor {
    private String marca;
    private String cilindrada;
    private float capacidad;

    // Constructor por defecto
    public Motor() {
        this.marca = "";
        this.cilindrada = "";
        this.capacidad = 0.0f;
    }

    // Constructor sobrecargado
    public Motor(String marca, String cilindrada, float capacidad) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.capacidad = capacidad;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public float getCapacidad() {
        return capacidad;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    // Procedimiento (void)
    public void encenderMotor() {
        System.out.println("El motor está encendido.");
    }

    // Función (retorna algo)
    public String mostrarDetalles() {
        return "Marca: " + marca + ", Cilindrada: " + cilindrada + ", Capacidad: " + capacidad + "L";
    }

    // Sobrecarga del método mostrarDetalles
    public String mostrarDetalles(boolean incluirCapacidad) {
        if (incluirCapacidad) {
            return mostrarDetalles();
        } else {
            return "Marca: " + marca + ", Cilindrada: " + cilindrada;
        }
    }
}

