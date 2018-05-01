package Composite.Ex1;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent>menuComponents = new ArrayList<MenuComponent>();
    String name;

    public Menu(String name){
        this.name=name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for(int i=0; i<menuComponents.size(); i++){
            menuComponents.get(i).print();
        }
    }
}
