package Composite.Ex2;

import java.util.ArrayList;

public class BFSSearch extends TraversalAlgoritm {

    @Override
    public ArrayList<Component> addSuccessors(ArrayList<Component> Q, ArrayList<Component> S) {
        ArrayList<Component>result=new ArrayList<Component>();
        result.addAll(Q);
        result.addAll(S);
        return result;
    }
}
