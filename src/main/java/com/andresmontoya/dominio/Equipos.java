package com.andresmontoya.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipos {

    private List<Equipos> Nombres = new ArrayList<>();
    private List<ArrayList<Jugadores>> ListaJugadores = new ArrayList<>();
    private String Nombre;

    public Equipos(List<Equipos> Nombres) {
        this.Nombres = Nombres;
    }

    public void agregarEquipo(String Nombre) {
        Equipos Equipo = new Equipos(this.Nombres);
        Equipo.Nombre = Nombre;
        this.Nombres.add(Equipo);
    }

    public List<ArrayList<Jugadores>> getJugadores() {
        return ListaJugadores;
    }

    public void agregarJugadores(List<Jugadores> Jugadores) {
        if (Jugadores.size() > 5) {
            System.out.print("\nNo pueden tener mas de 5 participantes en el equipo.\n");
        } else {
            this.ListaJugadores.add((ArrayList<Jugadores>) Jugadores);
        }
    }

    public void mostrarPorEquipo(int Equipo) {
        if (Equipo < 0 || Equipo > this.ListaJugadores.size() - 1) {
            System.out.print("El equipo indicado no tiene corredores.\n");
        } else {
            System.out.println("Equipo: " + Nombres.get(Equipo).Nombre);
            System.out.println("Jugadores del equipo:");
            for (Jugadores Jugador : ListaJugadores.get(Equipo)) {
                System.out.println("* " + Jugador.getNombre());
            }
        }
    }

    public void mostrarTodos() {
        for (ArrayList<Jugadores> Lista : ListaJugadores) {
            for (Jugadores Jugador : Lista) {
                System.out.println("* " + Jugador.getNombre());
            }
        }
    }

    public void mostrarEquipos() {
        int Cont = 0;
        for (Equipos Equipo : Nombres) {
            System.out.println(Cont + " || " + Equipo.Nombre);
            Cont++;
        }
    }
}
