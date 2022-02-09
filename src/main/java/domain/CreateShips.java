package domain;

import javax.swing.*;

public class CreateShips {
    static Spaceships space1;

    public static void ShipOption(int option) {
        switch (option) {
            case 1 -> {
                space1 = new UnmannedShips("", "", 0, 0, 0, "");

            }
            case 2 -> {
                space1 = new MannedShips("", "", 0, 0, 0, "");

            }
            case 3 ->{
                space1 = new ShuttleVehicles("", "", 0, 0, 0, "");

            }
            case 4 -> {
                space1 = new Apolo("", "", 0, 0, 0, "");

            }
            default ->
                    System.out.println("Que tengas un Excelente Viaje");
        }

        space1.name = JOptionPane.showInputDialog("Por favor ingrese el nombre de la nave");
        space1.type = JOptionPane.showInputDialog("Por favor ingrese el tipo de la nave");
        space1.speed = Long.parseLong(JOptionPane.showInputDialog("Por favor ingrese la velocidad"));
        space1.height = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese la altura de la nave"));
        space1.weight = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese el peso de la nave"));
        space1.typeFuel = JOptionPane.showInputDialog("Por favor ingrese el tipo de combustible que usa la nave");

        space1.speedSpaceship();
        space1.weightSpaceship();
        System.out.println("""
                            La nave fue creada con exito
                            """ + space1.toString());
    }
}

