/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg2.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Toyota implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("corolla")){
            return new Corolla();
        }
        else if(modelo.equals("hilux")){
            return new Hilux();
        }
        else if(modelo.equals("etios")){
            return new Etios();
        }
        return null;
    }
    
   
}
