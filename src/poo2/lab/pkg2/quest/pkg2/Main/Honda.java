/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg2.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Honda implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
       if(modelo.equals("city")){
           return new City();
       }
       else if(modelo.equals("civic")){
           return new Civic();
       }
       else if(modelo.equals("fit")){
           return new Fit();
       }
       return null;
    }
    
}
