/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc01.Pregunta_4;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase DirectorTecnico
class DirectorTecnico {
    private String codigo_dt;
    private String nombre_dt;
    private double sueldo_dt;

    public DirectorTecnico(/*paraprobar*/String nom) {
    this.nombre_dt = nom;
    }

    public void comandarEquipo() {
        System.out.println("El DT " + nombre_dt + " esta comandando el equipo");
    }

    public void dirigirJugador() {
        System.out.println("El DT " + nombre_dt + " esta dirigiendo al jugador");
    }
}