/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc01.Pregunta_4;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase Jugador
class Jugador {
    private String codigo_jug;
    private String nombre_jug;
    private int numeroCamiseta_jug;

    public Jugador(String cod, /*para probar*/String nom) {
        this.codigo_jug = cod;
          //para probar
        this.nombre_jug = nom;
    }

    public void jugar() {
        System.out.println("Jugador " + nombre_jug + " esta jugando");
    }
}