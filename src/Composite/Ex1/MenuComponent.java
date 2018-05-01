package Composite.Ex1;

import java.awt.*;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public void enterTheField(){
        throw new UnsupportedOperationException();
    }
    public void shoot(){
        throw new UnsupportedOperationException();
    }
    public void cry(){
        throw new UnsupportedOperationException();
    }
    public void simulateAnInjury(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
