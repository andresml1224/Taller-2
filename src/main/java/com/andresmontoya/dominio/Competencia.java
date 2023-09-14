package com.andresmontoya.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Competencia {

    private List<Equipos> equipos = new ArrayList<>();

    public Competencia(List<Equipos> Equipos) {
        this.equipos = Equipos;
    }

    private boolean enTop(List<Jugadores> jugador, String nombre) {
        boolean value = false;
        for (Jugadores Competidor : jugador) {
            if (Competidor.getNombre().equals(nombre)) {
                value = true;
                break;
            }
        }
        return value;
    }

    public void topDiez(List<ArrayList<Jugadores>> listaJugadores) {
        if (equipos.size() <= 5) {
            List<Double> promedios = new ArrayList<>();
            for (ArrayList<Jugadores> lista : listaJugadores) {
                for (Jugadores jugador : lista) {
                    promedios.add(jugador.getPromedio());
                }
            }

            Collections.sort(promedios);

            List<Jugadores> top = new ArrayList<>();
            for (Double promedio : promedios) {
                for (ArrayList<Jugadores> lista : listaJugadores) {
                    for (Jugadores jugador : lista) {
                        if (jugador.getPromedio() == (promedio)) {
                            if (!enTop(top, jugador.getNombre())) {
                                top.add(jugador);
                            }
                        }
                    }
                }
            }
            List<Jugadores> top10 = top.subList(0, 10);
            int cont = 1;
            for (Jugadores jugador : top10) {
                System.out.println(cont + ". " + jugador.getNombre() + " || Promedio: [" + jugador.getPromedio() + "]");
                cont++;
            }
        } else {
            System.out.print("No pueden haber mas de 5 equipos en la competencia.\n");
        }
    }
}
