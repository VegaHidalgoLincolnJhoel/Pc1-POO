/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pc01.Pregunta_4;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("E001", "Boca");
        Jugador jugador1 = new Jugador("J001", "teves");
        DirectorTecnico dt1 = new DirectorTecnico("Gareca");
        Torneo torneo1 = new Torneo("T001");

        // Prueba de métodos
        equipo1.gestionarIntegrante();
        jugador1.jugar();
        dt1.comandarEquipo();
        dt1.dirigirJugador();
    }
}
