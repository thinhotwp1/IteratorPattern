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
    MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public DinnerMenu() {
    }

    public DinnerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuIterator createIterator() {
        menuItems[0] = new MenuItem("Banh chung chay", "banh chung nhan dau", true, 10000);
        menuItems[1] = new MenuItem("Banh chung thit", "banh chung nhan thit", false, 20000);
        return new MenuIterator(menuItems);
    }

}
