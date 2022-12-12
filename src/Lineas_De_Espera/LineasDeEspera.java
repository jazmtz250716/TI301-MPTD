package Lineas_De_Espera;

import java.util.*;

public class LineasDeEspera {

    ArrayList<String> nombre = new ArrayList<>();
    Queue<String> colaClientes = new LinkedList<>();

    public LineasDeEspera() {
        colaNombres();
    }

    public ArrayList<String> listaNombres() {
        nombre.add("Ignacio");
        nombre.add("Elena");
        nombre.add("Jimena");
        nombre.add("Lizet");
        nombre.add("Martin");
        nombre.add("Katia");
        nombre.add("Sergio");
        nombre.add("Santiago");
        nombre.add("Lupita");
        nombre.add("Alejandro");
        nombre.add("Julian");
        nombre.add("Perla");
        nombre.add("Isis");
        nombre.add("Gerardo");
        nombre.add("Victoria");
        nombre.add("Samanta");
        nombre.add("Ulises");
        nombre.add("Areli");
        nombre.add("Jorge");
        nombre.add("Diana");
        nombre.add("Teresa");
        nombre.add("Antonio");
        nombre.add("Rocio");
        nombre.add("Jose");
        nombre.add("Brenda");
        nombre.add("Erick");
        nombre.add("Angel");
        nombre.add("Fernando");
        nombre.add("Omar");
        nombre.add("Enrique");

        return nombre;
    }

    public int generaRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public void colaNombres() {
        listaNombres();
        int i = 0;
        while (i <= generaRandom(0, 29)) {
            colaClientes.add(nombre.get(generaRandom(0, 29)));
            i++;
        }
    }

    public String primerPosicion() {

        return colaClientes.peek();
    }

    public String ultimaPosicion() {
        Collections.reverse((List<?>) colaClientes);

        return colaClientes.peek();
    }

    @Override
    public String toString() {
        colaClientes.forEach(cola -> {
            System.out.println(cola);
        });

        System.out.println("");
        if (colaClientes.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println("Primer nombre de la cola :  " + primerPosicion());
        }

        if (colaClientes.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println("Ultimo nombre de la cola :  " + ultimaPosicion());
        }
        System.out.println("");

        return "";
    }
}
