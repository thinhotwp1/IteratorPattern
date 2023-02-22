/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorpattern.Menu;

import iteratorpattern.iterator.MenuIterator;

/**
 *
 * @author Administrator
 */
public class DinnerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
    }
    

    public DinnerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
    
    public MenuIterator createIterator(){
        return new MenuIterator(menuItems);
    }

}
