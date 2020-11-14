/*
 GONZALEZ VALADEZ JOSE LEONARDO
  3S11
 */
package colaa;
import java.util.Scanner;
/* @author Angel*/
public class Colaa {
    public static void main(String[] args) {
        //Se selecciona un metodo para llamar al scanner para igresar datos 
        Scanner sc = new Scanner(System.in);
        //Se declaran algunas variables y arreglos para las colas
        int lim = 0, guard = 0, edge = 0, inicio = 0, chose, pokeball, palu;
        char roster[] = new char[26];
        int a[] = new int[9999999];
        int b[] = new int[9999999];
        int c[] = new int[9999999];
        //Se inicia la condicional do para el menu pricipal de seleccion switch
        do {
            //Sintaxis del menu
            System.out.println("***---BIENVENIDO A LA COLA 1.1---***");
            System.out.println("1-Cola simple");
            System.out.println("2-Cola Abecedario");
            System.out.println("3-Cola Abecedario Aleatorio");
            System.out.println("4-Cola A y Cola B");
            System.out.println("5-Cola Abecedario Aleatorio s/Repetir");
            System.out.println("///////Elige un programa que desees ejecutar/////////");
            //Se inicia el menu switch con cada uno de sus casos
            switch (chose = sc.nextInt()) {
                //Se inicia el programa de la opcion 1.
                case 1:
                    //Se pide el tamaño de la cola
                    System.out.println("La Cola tendra un limite de datos de...");
                    char roste[] = new char[palu = sc.nextInt()];
                    //Se inicia la condicional do para el menu pricipal de seleccion switch
                    do {
                        //Sintaxis de menu
                        System.out.println("------------Cola simple------------");
                        System.out.println("1...Agregar un dato a la colaa\n"
                                + "2...Mostrar datos de la cola\n"
                                + "3...Eliminar dato de la cola\n"
                                + "4...Salir y terminar la ejecucion\n"
                                + "\n***Seleccione el numero de la accion que desee realizar***\n");
                        //Se inicia el submenu switch con cada uno de sus casos
                        switch (chose = sc.nextInt()) {
                            case 1:
                                //Para Ingresar un valor a la cola
                                if (edge < palu) {
                                    System.out.println("Ingresa un nuevo dato a la cola");
                                    //ingresa el valor en la cola
                                    roste[edge] = sc.next().charAt(0);
                                    //el tope aumenta una posicion
                                    edge++;
                                } else {
                                    System.out.println("LO SIENTO LA COLA ESTA LLENA");
                                }
                                break;
                            case 2:
                                //Para mostrar la cola
                                if (edge > 0) {
                                    System.out.println("---La Cola tiene los siguientes datos--- \n");
                                    //reocorre el arreglo y lo va mostrando
                                    for (int i = inicio; i < palu; i++) {
                                        System.out.print(" " + roste[i]);
                                    }
                                } else {
                                    System.out.println("LA COLA NO TIENE DATOS PARA MOSTRAR");
                                }
                                System.out.println("\n¿Deseas realizar alguna otra accion?");
                                break;
                            case 3:
                                //Para eliminar un elemento de la cola
                                if (edge > 0) {
                                    System.out.println("---El primer dato ha sido eliminado de la Cola---\n");
                                    //da la vuelta a los valores y elimina tope que esta vez sera el inicio
                                    for (int i = inicio; i < palu - 1; i++) {
                                        //Da la vuelta a la cola
                                        roste[i] = roste[i + 1];
                                    }
                                    //elimina tope
                                    edge--;
                                } else {
                                    System.out.println("-LO SIENTO LA COLA NO CONTIENE NINGUN ELEMENTO-");
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                        }
                    } while (chose != 4);
                    break;
                case 2:
                    do {
                        System.out.println("------------Cola Abecedario------------");
                        System.out.println("1...Llenar abecedario ordenado\n"
                                + "2...Mostrar datos de la cola\n"
                                + "3...Eliminar dato de la cola\n"
                                + "4...Agregar un dato a la cola\n"
                                + "5...Salir y terminar la ejecucion\n"
                                + "\n***Seleccione el numero de la accion que desee realizar***\n");
                        switch (chose = sc.nextInt()) {
                            case 1:
                                if (edge <= 26) {
                                    System.out.println("---Se han rellenado los espacios vacios---\n");
                                    for (int i = inicio; edge < 26; i++) {
                                        roster[edge] = (char) ('a' + i);
                                        edge++;
                                    }
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 2:
                                if (edge > 0) {
                                    System.out.println("---La Cola tiene los siguientes datos--- \n");
                                    for (int i = inicio; i < edge; i++) {
                                        System.out.print(" " + roster[i]);
                                    }
                                } else {
                                    System.out.println("LA COLA NO TIENE DATOS PARA MOSTRAR");
                                }
                                System.out.println("\n¿Deseas realizar alguna otra accion?");
                                break;
                            case 3:
                                if (edge > 0) {
                                    System.out.println("---El primer dato ha sido eliminado de la cola---\n");
                                    for (int i = inicio; i < edge - 1; i++) {
                                        roster[i] = roster[i + 1];
                                    }
                                    edge--;
                                } else {
                                    System.out.println("-LO SIENTO LA COLA NO CONTIENE NINGUN ELEMENTO-");
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 4:
                                if (edge < 26) {
                                    System.out.println("Ingresa un nuevo dato a la cola");
                                    roster[edge] = sc.next().charAt(0);
                                    edge++;
                                } else {
                                    System.out.println("LO SIENTO LA COLA ESTA LLENA");
                                }

                                break;
                        }
                    } while (chose != 5);
                    break;
                    //Submenu para llenar la cola con el abecedario aleatorio 
                case 3:
                    System.out.println("----------Cola Abecedario Aleatorio---------");
                    do {
                        System.out.println("1...Llenar abecedario\n"
                                + "2...Mostrar datos de la cola\n"
                                + "3...Eliminar dato de la cola\n"
                                + "4...Agregar un dato a la cola\n"
                                + "5...Ordenar elementos de la cola alfabeticamente\n"
                                + "6...Salir y terminar la ejecucion\n"
                                + "\n***Seleccione el numero de la accion que desee realizar***\n");
                        switch (chose = sc.nextInt()) {
                            case 1:
                                if (edge <= 26) {
                                    System.out.println("---Se han rellenado los espacios vacios---\n");//a(inicio),b,c,d(tope)
                                    for (int i = inicio; edge < 26; i++) {
                                        roster[edge] = (char) ('a' + Math.random() * 26);
                                        edge++;
                                    }
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 2:
                                if (edge > 0) {
                                    System.out.println("---La Cola tiene los siguientes datos--- \n");
                                    for (int i = inicio; i < edge; i++) {
                                        System.out.print(" " + roster[i]);
                                    }
                                } else {
                                    System.out.println("LA COLA NO TIENE DATOS PARA MOSTRAR");
                                }
                                System.out.println("\n¿Deseas realizar alguna otra accion?");
                                break;
                            case 3:
                                if (edge > 0) {
                                    System.out.println("---El primer dato ha sido eliminado de la Cola---\n");
                                    for (int i = inicio; i < edge - 1; i++) {//original a(inicio),b,c,d,e(tope)
                                        roster[i] = roster[i + 1];            //a,b,c,d,  ,a,b,c,d           c,b,a
                                    }
                                    edge--;
                                } else {
                                    System.out.println("-LO SIENTO LA COLA NO CONTIENE NINGUN ELEMENTO-");
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 4:
                                if (edge < 26) {
                                    System.out.println("Ingresa un nuevo dato a la cola");
                                    roster[edge] = sc.next().charAt(0);
                                    edge++;
                                } else {
                                    System.out.println("LO SIENTO LA COLA ESTA LLENA");
                                }

                                break;
                            case 5:
                                System.out.println("---Los elementos de la Cola se han ordenado---");
                                for (int i = 0; i < 26; i++) {
                                    for (int j = 0; j < i; j++) {
                                        if (roster[i] < roster[j]) {
                                            pokeball = roster[i];
                                            roster[i] = roster[j];
                                            roster[j] = (char) pokeball;
                                        }
                                    }
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");

                                break;
                        }
                    } while (chose != 6);
                    break;
                    //Sebmenu´para llenar colas a y b, despues sumarlas entre si
                case 4:
                    System.out.println("¿Que tamaño tendran sus colas?");
                    palu = sc.nextInt();
                    do {
                        System.out.println("------------Cola A (1-100) Y Cola B (100-200)------------");

                        System.out.println("1...Llenar Cola A y B\n"
                                + "2...Unir Colas A y B\n"
                                + "3...Mostrar Colas A y B\n"
                                + "4...Vaciar colas\n"
                                + "5...Mostrar Cola C\n"
                                + "6...Salir y terminar la ejecucion\n"
                                + "\n***Seleccione el numero de la accion que desee realizar***\n");
                        switch (chose = sc.nextInt()) {
                            case 1:
                                if ((edge & lim) < palu) {

                                    System.out.println("---Se han rellenado los espacios vacios de las colas---\n");
                                    for (int i = inicio; edge < palu; i++) {
                                        a[edge] = (int) (Math.random() * 100);
                                        edge++;
                                    }
                                    for (int i = inicio; lim < palu; i++) {
                                        b[lim] = (int) (100 + Math.random() * 100);
                                        lim++;
                                    }
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 2:
                                if ((edge & lim) > 0) {
                                    System.out.println("Se han unido las Colas");
                                    for (int i = 0; guard < palu; i++) {
                                        c[i] = (a[i] + b[i]);
                                        guard++;
                                    }
                                } else {
                                    System.out.println("No hay Colas para unir");
                                }
                                break;
                            case 3:
                                if ((edge & lim) > 0) {
                                    System.out.println("---La Cola A tiene los siguientes datos--- \n");
                                    for (int i = inicio; i < edge; i++) {
                                        System.out.print(" " + a[i]);
                                    }
                                    System.out.println("\n---La Cola A tiene los siguientes datos--- \n");
                                    for (int i = inicio; i < lim; i++) {
                                        System.out.print(" " + b[i]);
                                    }
                                } else {
                                    System.out.println("LAS COLAS NO TIENE DATOS PARA MOSTRAR");
                                }
                                System.out.println("\n¿Deseas realizar alguna otra accion?");
                                break;
                            case 4:
                                System.out.println("Se han vaciado las colas");
                                edge = 0;
                                lim = 0;
                                guard = 0;
                                break;
                            case 5:
                                if (guard > 0) {
                                    System.out.print("Los datos de la Cola C quedan de esta manera\n");
                                    for (int i = inicio; i < guard; i++) {
                                        System.out.print(" " + c[i]);
                                    }
                                    System.out.print("\n");
                                } else {
                                    System.out.println("No hay Cola C que mostrar");
                                }
                                System.out.print("***¿DESEAS REALIZAR ALGUNA OTRA ACCION?***\n");

                                break;
                        }
                    } while (chose != 6);
                    break;
                    //Programa para llenar con el abecedario aleatorio sin repetir
                case 5:
                    do {
                        System.out.println("------------Cola Abecedario Aleatorio s/Repetir------------");
                        System.out.println("1...Llenar abecedario aleatorio s/repetir\n"
                                + "2...Mostrar datos de la cola\n"
                                + "3...Eliminar dato de la cola\n"
                                + "4...Agregar un dato a la cola\n"
                                + "5...Ordenar elementos de la cola alfabeticamente\n"
                                + "6...Salir y terminar la ejecucion\n"
                                + "\n***Seleccione el numero de la accion que desee realizar***\n");
                        switch (chose = sc.nextInt()) {
                            case 1:
                                if (edge < 26) {
                                    System.out.println("La Cola se llenado de forma exitosa");
                                    roster[edge] = (char) (Math.random() * 26 + 'a');
                                    for (edge = 0; edge < 26; edge++) {//a
                                        roster[edge] = (char) (Math.random() * 26 + 'a');
                                        for (int j = inicio; j < edge; j++) {
                                            if (roster[edge] == roster[j]) {
                                                edge--;        //a
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("La Cola esta llena");
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 2:
                                if (edge > 0) {
                                    System.out.println("---La Cola tiene los siguientes datos--- \n");
                                    for (int i = inicio; i < edge; i++) {
                                        System.out.print(" " + roster[i]);
                                    }
                                } else {
                                    System.out.println("LA COLA NO TIENE DATOS PARA MOSTRAR");
                                }
                                System.out.println("\n¿Deseas realizar alguna otra accion?");
                                break;
                            case 3:
                                if (edge > 0) {
                                    System.out.println("---El primer dato ha sido eliminado de la Cola---\n");
                                    for (int i = inicio; i < edge - 1; i++) {
                                        roster[i] = roster[i + 1];
                                    }
                                    edge--;
                                } else {
                                    System.out.println("-LO SIENTO LA COLA NO CONTIENE NINGUN ELEMENTO-");
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                            case 4:
                                if (edge < 26) {
                                    System.out.println("Ingresa un nuevo dato a la cola");
                                    roster[edge] = sc.next().charAt(0);
                                    edge++;
                                } else {
                                    System.out.println("LO SIENTO LA COLA ESTA LLENA");
                                }
                                break;
                            case 5:
                                System.out.println("---Los elementos de la Cola se han ordenado---");
                                for (int i = inicio; i < edge; i++) {
                                    for (int j = inicio; j < i; j++) {
                                        if (roster[i] < roster[j]) {
                                            pokeball = roster[i];
                                            roster[i] = roster[j];
                                            roster[j] = (char) pokeball;
                                        }
                                    }
                                }
                                System.out.println("¿Deseas realizar alguna otra accion?");
                                break;
                        }
                    } while (chose != 6);
                    break;
            }
        } while (chose != 6);
     
    }

}