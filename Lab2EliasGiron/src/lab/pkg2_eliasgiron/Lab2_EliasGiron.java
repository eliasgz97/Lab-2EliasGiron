package lab.pkg2_eliasgiron;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_EliasGiron {

    public static void main(String[] args) {
        ArrayList casas = new ArrayList();
        Scanner input = new Scanner(System.in);
        String usuario;
        int contrasena;
        System.out.println("Ingrese su usario: ");
        usuario = input.next();
        System.out.println("Ingrese su contraseña: ");
        contrasena = input.nextInt();
        while (!usuario.equals("leobanegas") || contrasena != 99) {
            System.out.println("El usuario o contraseña son incorrectos: ");
            System.out.println("Ingrese su usario: ");
            usuario = input.next();
            System.out.println("Ingrese su contraseña: ");
            contrasena = input.nextInt();
        }
        System.out.println("2. Registro de Casas");
        System.out.println("3. Manejo de estados");
        System.out.println("4. Salir");
        System.out.println("Ingrese opcion: ");
        int opcion = input.nextInt();
        switch (opcion) {

            case 1:
                System.out.println("1. Crear casas: ");
                System.out.println("2. Listar casas: ");
                System.out.println("3. Modificar casas: ");
                System.out.println("4. Borrar casas: ");
                System.out.println("5. Salida: ");
                System.out.println("Ingrese opcion: ");
                int registro = input.nextInt();
                if (registro == 1) {
                    String dueno;
                    System.out.println("Ingrese Numero de casa");
                    int casa = input.nextInt();
                    System.out.println("Ingrese Bloque de casa");
                    int bloque = input.nextInt();
                    System.out.println("Ingrese Color");
                    String color = input.next();
                    System.out.println("Ingrese Ancho");
                    int ancho = input.nextInt();
                    System.out.println("Ingrese Largo");
                    int largo = input.nextInt();
                    System.out.println("Ingrese si fue comprada[s/n]: ");
                    String comprada = input.next();
                    System.out.println("Ingrese numero de pisos");
                    int pisos = input.nextInt();
                    System.out.println("Ingrese numero de baños");
                    int banos = input.nextInt();
                    System.out.println("Ingrese numero de cuartos");
                    int cuartos = input.nextInt();
                    if (comprada.equals("S") || comprada.equals("s")) {
                        System.out.println("Ingrese nombre del dueño");
                        dueno = input.next();

                    } else {
                        dueno = "Ninguno";
                    }
                    System.out.println("Ingrese estado en este formato\n: "
                            + "1. LISTA\n"
                            + "2. CONSTRUCCION\n"
                            + "3. CONSTRUCCION EN ESPERA\n"
                            + "4. ESPERA DE DEMOLICION\n");
                    int estado = input.nextInt();
                    System.out.println("Ingrese nombre del ingeniero a cargo: ");
                    String ingeniero = input.next();
                    casas.add(new Casas(casa, bloque, color, ancho, largo, pisos, banos, cuartos, comprada, dueno, estado, ingeniero));

                } else if (registro == 2) {
                    String s = "";
                    for (Object t : casas) {
                        s += casas.indexOf(t) + "->" + t + " \n";

                    }
                    System.out.println(s);
                    System.out.println("");
                    System.out.println("1. Crear casas: ");
                    System.out.println("2. Listar casas: ");
                    System.out.println("3. Modificar casas: ");
                    System.out.println("4. Borrar casas: ");
                    System.out.println("5. Salida: ");
                    System.out.println("Ingrese opcion: ");
                    registro = input.nextInt();

                } else if (registro == 3) {
                    String impresion = "";
                    for (Object t : casas) {
                        impresion += casas.indexOf(t) + " \n";
                    }
                    System.out.println("");
                    System.out.println("Ingrese la casa que desea modificar: ");
                    int posicion = input.nextInt();
                    System.out.println("Escriba lo que desea modificar\n"
                            + "Numero de casa:\n "
                            + "Numero de bloque: \n"
                            + "Color: \n"
                            + " Ancho: \n"
                            + "Largo: \n"
                            + "Comprada[s/n]: \n"
                            + "Nombre del ingeniero: \n");
                    System.out.println("Ingrese la posicion: ");
                    int posicion2 = input.nextInt();
                    int modificar;
                    switch (posicion2) {
                        case 1:
                            System.out.println("Ingrese el numero de casa: ");
                            modificar = input.nextInt();
                            ((Casas) casas.get(posicion)).setCasa(modificar);
                            break;
                        case 2:
                            System.out.println("Ingrese el bloque de la casa: ");
                            modificar = input.nextInt();
                            ((Casas) casas.get(posicion)).setBloque(modificar);
                            break;
                        case 3:
                            System.out.println("Ingrese el color: ");
                            String color = input.next();
                            ((Casas) casas.get(posicion)).setColor(color);
                            break;
                        case 4:
                            System.out.println("Ingrese el ancho: ");
                            modificar = input.nextInt();
                            ((Casas) casas.get(posicion)).setAncho(modificar);
                            break;
                        case 5:
                            System.out.println("Ingrese el largo: ");
                            modificar = input.nextInt();
                            ((Casas) casas.get(posicion)).setLargo(modificar);
                            break;
                        case 6:
                            System.out.println("Ingrese si esta comprada");
                            String comprada = input.next();
                            ((Casas) casas.get(posicion)).setComprada(comprada);
                            break;
                        case 7:
                            System.out.println("Nombre del ingeniero: ");
                            String ingeniero = input.next();
                            ((Casas) casas.get(posicion)).setIngeniero(ingeniero);
                            break;

                    }
                } else if (registro == 4) {
                    System.out.println("Ingrese casa a eliminar: ");
                    int eliminar = input.nextInt();
                    casas.remove(eliminar);
                } else if (registro == 5) {
                    System.exit(0);

                }
            case 2:
                for (int i = 0; i < casas.size(); i++) {
                    System.out.println("->" + ((Casas) casas.get(i)).getCasa() + "\n"
                            + ((Casas) casas.get(i)).getEstado());

                }

                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
