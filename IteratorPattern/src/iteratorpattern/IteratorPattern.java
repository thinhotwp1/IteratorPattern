/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratorpattern;

import iteratorpattern.Menu.DinnerMenu;

/**
 *
 * @author Administrator
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(dinnerMenu);
        waitress.printMenu();
    }
    
}
