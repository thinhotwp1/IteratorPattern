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
        return !(i >= items.length || items[i] == null);
    }

    @Override
    public Object next() {
        MenuItem item = items[i];
        i = i + 1;
        System.out.println(i);
        return item;
    }

}
