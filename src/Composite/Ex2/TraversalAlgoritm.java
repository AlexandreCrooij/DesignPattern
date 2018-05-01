package Composite.Ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class TraversalAlgoritm {
    public final Component search(Component treeRoot, String s){
        ArrayList<Component>Q=new ArrayList<Component>();
        ArrayList<Component>S=new ArrayList<Component>();
        Component N=null;
        Q.add(treeRoot);

        while (true) {
            if(Q.size()==0){
                return null;
            }
            else{
                N=Q.get(0);
                Q.remove(0);
                if(N.getName().contains(s)){
                    return N;
                }
                else{
                    S=N.getChildren();
                    Q = addSuccessors(Q,S);
                }
            }
        }
    }
    public abstract ArrayList<Component> addSuccessors(ArrayList<Component>arrayList1, ArrayList<Component>arrayList2);
}
