package com.andresmontoya.dominio;

import java.util.ArrayList;
import java.util.List;

public class Etapas {

    private List<ArrayList<Jugadores>> ListaJugadores = new ArrayList<>();

    public Etapas(List<ArrayList<Jugadores>> ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    public void generarEtapas() {
        int Cont = 0;
        while (Cont < 10) {
            for (ArrayList<Jugadores> Lista : ListaJugadores) {
                for (Jugadores Jugador : Lista) {
                    Jugador.setTiempo((int) (Math.random() * 15) + 5);
                }
            }
            Cont++;
        }
        for (ArrayList<Jugadores> Lista : ListaJugadores) {
            for (Jugadores Jugador : Lista) {
                Jugador.calcularPromedio();
            }
        }
    }

    public void resultadosEtapas(int CantidadEquipos) {
        if (CantidadEquipos <= 5) {
            for (ArrayList<Jugadores> Lista : ListaJugadores) {
                for (Jugadores Jugador : Lista) {
                    System.out.print("\n" + Jugador.getNombre() + ":");
                    for (int Tiempo : Jugador.getTiempo()) {
                        System.out.print(" [" + Tiempo + "]");
                    }
                }
            }
        } else {
            System.out.print("\nNo pueden haber mas de 5 equipos en la competencia.");
        }
    }
}
