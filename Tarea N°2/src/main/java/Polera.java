
/**
 *
 * @author JonathanLizama
 */
public class Polera {

      // Atributos de la clase polera
      final private String material;
      final private String talla;
      final private String estampado;

      //Constructor con parametros de entrada
      public Polera(String material, String talla, String estampado) {
            this.talla = talla;
            this.estampado = estampado;
            this.material = material;
      }

      public String getMaterial() {
            return material;
      }

      public String getTalla() {
            return talla;
      }

      public String getEstampado() {
            return estampado;
      }

}
