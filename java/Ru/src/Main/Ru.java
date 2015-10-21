package Main;


import Interface.*;
import BandodeDados.*;
import ru.*;

/**
 *
 * @author Tomás Abril
 */

public class Ru {

    /**
     * @param args the command line arguments
     */
   static Controle controle; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        controle = new Controle(); 

    }

    // Método público estático de acesso único ao objeto
    public static Controle getInstance(){

            return controle;
            // Retorna o a instância do objeto
    }
    
}
