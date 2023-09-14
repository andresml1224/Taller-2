package com.andresmontoya.dominio;

import java.util.ArrayList;
import java.util.List;

public class Jugadores {

    private String nombre;
    private List<Integer> tiempo = new ArrayList<>();
    private List<Jugadores> nombres = new ArrayList<>();
    private double promedio = 0;

    public Jugadores(List<Jugadores> nombres) {
        this.nombres = nombres;
    }

    public void agregarJugador(String Nombre, List<Jugadores> Nombres) {
        Jugadores Jugador = new Jugadores(this.nombres);
        Jugador.nombre = Nombre;
        Nombres.add(Jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setTiempo(int Time) {
        tiempo.add(Time);
    }

    public List<Integer> getTiempo() {
        return tiempo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double Promedio) {
        this.promedio = Promedio;
    }

    public void calcularPromedio() {
        for (int Time : tiempo) {
            promedio = promedio + Time;
        }
        promedio = promedio / 10;
    }
}
