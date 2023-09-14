package com.andresmontoya.aplicacion;

import com.andresmontoya.dominio.Competencia;
import com.andresmontoya.dominio.Equipos;
import com.andresmontoya.dominio.Etapas;
import com.andresmontoya.dominio.Jugadores;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Jugadores> primeraLista = new ArrayList<>();
        Jugadores tandaUno = new Jugadores(primeraLista);
        tandaUno.agregarJugador("Andres", primeraLista);
        tandaUno.agregarJugador("Alejo", primeraLista);
        tandaUno.agregarJugador("Ana", primeraLista);
        tandaUno.agregarJugador("Daza", primeraLista);

        ArrayList<Jugadores> segundaLista = new ArrayList<>();
        Jugadores tandaDos = new Jugadores(segundaLista);
        tandaDos.agregarJugador("Juliana", segundaLista);
        tandaDos.agregarJugador("Sebastian", segundaLista);

        ArrayList<Jugadores> terceraLista = new ArrayList<>();
        Jugadores tandaTres = new Jugadores(terceraLista);
        tandaTres.agregarJugador("Juanjo", terceraLista);
        tandaTres.agregarJugador("Cristian", terceraLista);
        tandaTres.agregarJugador("Ricardo", terceraLista);

        ArrayList<Jugadores> cuartaLista = new ArrayList<>();
        Jugadores tandaCuatro = new Jugadores(cuartaLista);
        tandaCuatro.agregarJugador("Evelin", cuartaLista);
        tandaCuatro.agregarJugador("Jhonki", cuartaLista);
        tandaCuatro.agregarJugador("Karen", cuartaLista);
        tandaCuatro.agregarJugador("Mateo", cuartaLista);
        tandaCuatro.agregarJugador("Mariana", cuartaLista);

        ArrayList<Jugadores> quintaLista = new ArrayList<>();
        Jugadores tandaQuinta = new Jugadores(quintaLista);
        tandaQuinta.agregarJugador("Daniel", quintaLista);

        ArrayList<Equipos> ListaEquipos = new ArrayList<>();
        Equipos Equipos = new Equipos(ListaEquipos);
        Equipos.agregarEquipo("Santa Fe");
        Equipos.agregarJugadores(primeraLista);
        Equipos.agregarEquipo("Medellin");
        Equipos.agregarJugadores(segundaLista);
        Equipos.agregarEquipo("Nacional");
        Equipos.agregarJugadores(terceraLista);
        Equipos.agregarEquipo("Millonarios");
        Equipos.agregarJugadores(cuartaLista);
        Equipos.agregarEquipo("Junior");
        Equipos.agregarJugadores(quintaLista);

        Competencia Competencia = new Competencia(ListaEquipos);

        Etapas Etapas = new Etapas(Equipos.getJugadores());
        Etapas.generarEtapas();

        int opcion;
        System.out.println("\n\t*******************************");
        System.out.println("\t* BIENVENIDO A LA COMPETENCIA *");
        System.out.println("\t*******************************");
        do {
            System.out.println("1. Equipos");
            System.out.println("2. Todos los participantes");
            System.out.println("3. Resultados de las etapas");
            System.out.println("4. Corredores de un equipo determinado");
            System.out.println("5. Top 10 de la competencia");
            System.out.println("0. Salir");
            System.out.print("Ingrese lo que desea consultar: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("*******************************");
                    Equipos.mostrarEquipos();
                    System.out.println("*******************************");
                    break;
                case 2:
                    System.out.println("*******************************");
                    Equipos.mostrarTodos();
                    System.out.println("*******************************");
                    break;
                case 3:
                    System.out.print("*******************************");
                    Etapas.resultadosEtapas(ListaEquipos.size());
                    System.out.println("\n*******************************");
                    break;
                case 4:
                    System.out.println("*******************************");
                    Equipos.mostrarEquipos();
                    System.out.print("Ingrese el numeral del equipo: ");
                    int team = Integer.parseInt(sc.nextLine());
                    System.out.println("*******************************");
                    Equipos.mostrarPorEquipo(team);
                    System.out.println("*******************************");
                    break;
                case 5:
                    System.out.println("*******************************");
                    Competencia.topDiez(Equipos.getJugadores());
                    System.out.println("*******************************");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("*******************************");
                    System.out.println("Opcion no valida.");
                    System.out.println("*******************************");
                    break;
            }
        } while (opcion != 0);

    }
}
