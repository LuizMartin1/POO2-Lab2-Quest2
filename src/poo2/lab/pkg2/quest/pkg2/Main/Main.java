/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg2.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Optei pelo Singleton para os fabricantes pelo fato de preciar instancia-los apenas 1 vez
        //SINGLETON PARA CRIAÇÃO DOS FABRICANTES
        IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota");
        IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda");
        
        //Optei pelo factory para os carros por organização de codigo, facil manutenção e extensibilidade 
        //FACTORY PARA CRIAÇÃO DOS CARROS
        IVehicle corolla = toyota.makeVehicle("corolla");
        IVehicle hilux = toyota.makeVehicle("hilux");
        IVehicle etios = toyota.makeVehicle("etios");
        
        IVehicle city = honda.makeVehicle("city");
        IVehicle civic = honda.makeVehicle("civic");
        IVehicle fit = honda.makeVehicle("fit");
        
        //FUNCIONAMENTO 
        corolla.start();
        corolla.drive();
        corolla.stop();
        System.out.println("\n");
        
        hilux.start();
        hilux.drive();
        hilux.stop();
        System.out.println("\n");
        
        etios.start();
        etios.drive();
        etios.stop();
        System.out.println("\n");
        
        city.start();
        city.drive();
        city.stop();
        System.out.println("\n");
        
        civic.start();
        civic.drive();
        civic.stop();
        System.out.println("\n");
        
        fit.start();
        fit.drive();
        fit.stop();
        System.out.println("\n");
        
    }
    
}
