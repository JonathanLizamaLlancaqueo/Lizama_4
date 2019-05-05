package Archivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author JonathanLizama
 */
public final class GestorArchivos {

      public GestorArchivos() {
            

      }

      public String leerArchivoTexto(String ruta) {
            Path directorio = Paths.get(ruta);
            String texto = "";
            try {
                  texto = new String(Files.readAllBytes(directorio));
            } catch (IOException e) {
                  System.out.println(e);
                  System.out.println("El archivo no pudo ser leido | verifique la ruta introducida");

            }
            return texto;
      }

      public String agregarTextoArchivo(String ruta) {
            PrintWriter frase;
            try {
                  FileWriter arch = new FileWriter(ruta, true);
                  frase = new PrintWriter(arch);
                  frase.println("The first man who stepped on the moon." + "\t");
                  frase.close();
            } catch (IOException e) {
                  System.out.println(e);
                  System.out.println("Error al agregar texto al archivo");
            }
            return leerArchivoTexto(ruta);

      }

}
