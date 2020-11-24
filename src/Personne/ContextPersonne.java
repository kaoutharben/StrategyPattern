package Personne;

import java.util.ArrayList;

public class ContextPersonne {
    Comparable comparable;
    ContextPersonne(Comparable comparable){
        this.comparable=comparable;
    }
    public String toString(ArrayList<Personne>  liste ){
        String listeTrié ="[ ";
        for(int i=  0;i< (liste.size())-1;i++){
            listeTrié+=liste.get(i).toString() + " , ";
        }
        listeTrié+= liste.get(liste.size()-1).toString()+"  ]";
        return listeTrié;
    }


    public void comparePerso(ArrayList<Personne> liste) {
        comparable.compare(liste);
    }


}
