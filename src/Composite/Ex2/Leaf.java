package Composite.Ex2;

import java.util.ArrayList;

/**
 * Lab 10
 * @author egs
 */
public class Leaf extends Component {
    //Attributes

    /**
     * @uml.property  name="name"
     */
    private String name;

    //Constructor
    public Leaf(String n) {
        name = n;
    }

    /**
     * @return
     * @uml.property  name="name"
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf " + name;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }
}
