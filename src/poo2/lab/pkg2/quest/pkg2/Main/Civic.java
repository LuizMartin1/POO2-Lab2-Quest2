/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg2.quest.pkg2.Main;

/**
 *
 * @author Luiz Henrique
 */
public class Civic implements IVehicle {
    
    @Override
    public void start() {
        System.out.println("Ligando o Civic..."); 
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Civic...");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Civic...");
    }
}
