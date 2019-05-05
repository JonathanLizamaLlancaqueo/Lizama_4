package Interacción;
import Archivo.GestorArchivos;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JonathanLizama
 */
public class Menu {

      GestorArchivos gestor = new GestorArchivos();

      public Menu() {
            boolean salir = false;
            while (!salir) {
                  System.out.println("------------------------------------------------------------------------");
                  System.out.println("Bienvenido al Gestor de Archivos");
                  System.out.println("------------------------------------------------------------------------");

                  System.out.println("[1].-|Mostrar Archivo de texto|");
                  System.out.println("[2].-|Añadir Texto Al Final|");
                  System.out.println("[3].-|SALIR| ");

                  System.out.println("Ingrese una opción porfavor");
                  int opcion = opcion();
                  switch (opcion) {
                        case 1: {
                              System.out.println("Archivo leido: ");
                              System.out.println(gestor.leerArchivoTexto("src\\texto.txt"));
                              break;
                        }
                        case 2: {
                              System.out.println(gestor.agregarTextoArchivo("src\\texto.txt"));
                              break;
                        }
                        case 3: {
                              System.out.println("Has salido del gestor Archivos!!!");
                              salir = true;
                              break;
                        }
                        default:
                              System.out.println("Ingrese una opción correcta...");
                              break;
                  }
            }
      }

      private int opcion() {

            Scanner leer = new Scanner(System.in);
            int num;
            try {
                  do {
                        System.out.println("");
                        num = leer.nextInt();
                  } while (num < 1);
                  return num;
            } catch (InputMismatchException e) {
                  System.out.println(e);
                  System.out.println("Ingrese un valor de acuerdo al tipo");
                  return -1;
            }
      }

}
