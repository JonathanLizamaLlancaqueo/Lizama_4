/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremias
 */
public class Poleras_Test {
       LecturaDatos lectura;

      public Poleras_Test() {
      }

      @Before
      public void setUp() {

             lectura= new LecturaDatos();
      }

      @After
      public void tearDown() {
      }

      
      
      /**
       * Test que lee el contenido de un archivo en una ruta que no existe
       *
       *
       */
      @Test
      public void testLectura(){
            ArrayList<Polera>resultado = lectura.lectura("C:\\Users\\Jeremias\\Desktop\\listadoassas.csv");
            ArrayList<Polera> esperado = new ArrayList<>();
            assertEquals(esperado, resultado);
      }
      
      
}
