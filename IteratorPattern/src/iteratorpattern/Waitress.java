/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorpattern;

import iteratorpattern.Menu.DinnerMenu;
import iteratorpattern.Menu.MenuItem;
import iteratorpattern.iterator.Iterator;

/**
 *
 * @author Administrator
 */
public class Waitress {
    DinnerMenu dinnerMenu;

    public Waitress(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }
    public void printMenu(){
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("===== MENU =====");
        printMenu(dinnerIterator);
    }
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getTenMon()+", ");
            System.out.print(menuItem.getMoTa()+", ");
            System.out.println(menuItem.getGia());
        }
    }
        
}
