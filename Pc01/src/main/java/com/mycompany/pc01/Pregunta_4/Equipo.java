/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc01.Pregunta_4;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase Equipo
class Equipo {
    private String codigo_equi;
    private String nombre_equi;
    private int anioFundacion_equi;

    public Equipo(String cod,/*Para probar*/ String nom_equi) {
        this.codigo_equi = cod;
        //para probar
        this.nombre_equi = nom_equi;
    }    

    public void gestionarIntegrante() {
        System.out.println("Gestionando integrante del equipo " + nombre_equi);
    }
}


