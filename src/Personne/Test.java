package Personne;

import java.util.ArrayList;

public class Test {

    public static void main(String args[]) throws InterruptedException {

        ArrayList<Personne> array = new ArrayList<>(5);
        array.add(new Personne("sam","bean",22));
        array.add(new Personne("ana","dan",12));
        array.add(new Personne("liam","hure",88));
        array.add(new Personne("yu","chean",33));
        array.add(new Personne("gi","xu",62));

        ContextPersonne ctx = new ContextPersonne(new PrenomSort());
        ContextPersonne ctx1 = new ContextPersonne(new NameSort());
        ContextPersonne ctx2 = new ContextPersonne(new AgeSort());

        ctx.comparePerso(array);
        ctx1.comparePerso(array);
        ctx2.comparePerso(array);
    }
}