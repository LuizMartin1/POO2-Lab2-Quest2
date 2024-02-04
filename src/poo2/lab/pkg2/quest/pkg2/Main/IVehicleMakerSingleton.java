/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg2.Main;

/**
 *
 * @author Luiz Henrique
 */
public class IVehicleMakerSingleton {

    private static IVehicleMaker toyota;
    private static IVehicleMaker honda;

    public static IVehicleMaker getInstance(String tipo) {
        if (tipo.equals("toyota")) {
            if (toyota == null) {
                toyota = new Toyota();
            }
            return toyota;
        } else if (tipo.equals("honda")) {
            if (honda == null) {
                honda = new Honda();
            }
            return honda;
        }
        return null;
    }
    
}
