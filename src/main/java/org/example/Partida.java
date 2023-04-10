package org.example;
import java.util.Random;
import java.util.Scanner;
public class Partida {

    public Partida() {

    }
    public void enfrentarJugador(){


    }

    public void EnfrentarMountros() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int opcion = rand.nextInt(3) + 1;
        int opcion1;
        Jugador jugador = new Jugador(120,"0");
        Vampiro enemigo1 = new Vampiro(120,120,2);
        Zombie zombie = new Zombie(120,40,"saltador");
        Zombie zombie2 = new Zombie(120,40,"saltador");
        Vampiro enemigo2 = new Vampiro(120,240,2);
        JefeFinal jefeFinal = new JefeFinal(120,240);

        switch (opcion) {
            case 1:
                Jugador jugador = new Jugador(120,"100");
                enemigo1 = new Vampiro(120,120,2);
                zombie = new Zombie(120,40,"saltador");
                jefeFinal = new JefeFinal(120,40);
                System.out.println("Te enfrentaras a  un vampiro, un zombie y un jefe Final");
                System.out.println("Selecciona tu arma O ataque:");
                System.out.println("1. Espada de Hielo");
                System.out.println("2. Espada de Fuego");
                System.out.println("3.Ataque de luz");
                System.out.println("3.Espada de Acero");
                 opcion1 = scanner.nextInt();

                // Usar una estructura switch para seleccionar la opción correspondiente
                switch (opcion1) {
                    case 1:
                        System.out.println("Has seleccionado una Espada de Hielo");
                        System.out.println("tienes una vida de:"+jugador.getVida());
                        
                        System.out.println("el vampiro te quito:"+jugador.getVida());
                        break;
                    case 2:
                        System.out.println("Has seleccionado Espada de Fuego ");

                        break;
                    case 3:
                        System.out.println("Has seleccionado ataque de Luz");

                        break;

                    case 4:
                        System.out.println("Has seleccionado Espada De Hielo");

                        break;

                    default:
                        System.out.println("has seleccionado Espada de Acero");
                        break;
                }
                break;
            case 2:
                enemigo1 = new Vampiro(120,240,2);
                enemigo2 = new Vampiro(120,240,2);
                jefeFinal = new JefeFinal(120,240);
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                zombie2 = new Zombie(120,40,"saltador");
                zombie = new Zombie(120,40,"saltador");
                jefeFinal = new JefeFinal(120,40);
                System.out.println("Opción 3 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}


