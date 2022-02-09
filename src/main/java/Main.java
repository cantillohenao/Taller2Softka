import javax.swing.*;

import static domain.CreateShips.ShipOption;

/**
 * Principal Class
 * @author Juan Camilo Cantillo
 */
public class Main {
    public static void main(String[] args) {
        int option = 0;

        while (option < 5) {

            String ship = JOptionPane.showInputDialog("""
                                                      Crear una nave: 
                                                       1- Nave no tripulada 
                                                       2- Nave tripulada
                                                       3- Nave lanzadora
                                                       4- Modulo lunar
                                                       5- Salir""");
            option = Integer.parseInt(ship);

            if (option < 5) {
                ShipOption(option);
            }

        }

    }

}
