/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorpattern.iterator;

import iteratorpattern.Menu.MenuItem;

/**
 *
 * @author Administrator
 */
public class MenuIterator implements Iterator {

    MenuItem[] items;
    int i = 0;

    public MenuIterator(MenuItem[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if (i >= items.length || items[i] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[i];
        i = i++;
        return item;
    }

}
