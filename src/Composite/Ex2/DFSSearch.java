package Composite.Ex2;

import java.util.ArrayList;

public class DFSSearch extends TraversalAlgoritm {

    @Override
    public ArrayList<Component> addSuccessors(ArrayList<Component> Q, ArrayList<Component> S) {
        ArrayList<Component>result=new ArrayList<Component>();
        result.addAll(S);
        result.addAll(Q);
        return result;
    }
}
