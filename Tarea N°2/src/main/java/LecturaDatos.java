
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JonathanLizama
 */
public class LecturaDatos {
       ArrayList<Polera> poleras = new ArrayList<>();

      /**
       * Función que Imprime los objetos contenidos en el arrayList.
       *
       */
      public void imprimir() {
            for (int i = 0; i < poleras.size(); i++) {
                  System.out.println("Material: " + this.poleras.get(i).getMaterial());
                  System.out.println("Talla: " + this.poleras.get(i).getTalla());
                  System.out.println("Estampado: " + this.poleras.get(i).getEstampado());
                  System.out.println("");

            }
      }

      /**
       * Función que lee el contenido de un archivo.csv.
       *
       * @param ruta ruta donde esta ubicado el archivo.
       * @return poleras los 5 objetos iniciales.
       *
       */
      public ArrayList<Polera> lectura(String ruta) {
            int lineas = 0;
            BufferedReader br = null;
            String[] datos;
            String texto;
            String separador = ",";
            try {
                  br = new BufferedReader(new FileReader(ruta));
                  while ((texto = br.readLine()) != null) {
                        lineas++;
                        if (lineas > 1) {
                              datos = texto.split(separador);

                              poleras.add(new Polera(datos[0], datos[1], datos[2]));
                        }
                  }
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            } finally {
                  if (br != null) {
                        try {
                              br.close();
                        } catch (IOException e) {
                              e.printStackTrace();
                        }
                  }
            }
            return poleras;
      }

      /**
       * Función que agrega un objetoNuevo al arrayList y lo escribe en el archivo.csv.
       *
       * @return poleras  con el nuevo objeto añadido.
       *
       */
      public ArrayList<Polera> agregarTexto() {
            FileWriter ruta;
            BufferedWriter br;
            try {
                  ruta = new FileWriter("C:\\Users\\Jeremias\\Desktop\\listado.csv", true);
                  br = new BufferedWriter(ruta);
                  Polera poleraNueva = new Polera("algodon", "XL", "false");
                  poleras.add(poleraNueva);
                  br.write(poleraNueva.toString());
                  br.close();
                  ruta.close();
            } catch (IOException e) {
                  System.out.println(e);
                  System.out.println("Archivo no encontrado.");
            }
            return poleras;
      }

      
}
