package Personne;

import java.util.ArrayList;

public class PrenomSort implements Comparable {
    @Override
    public void compare(ArrayList<Personne> liste) {
        quickSort(liste,0,liste.size()-1);
        System.out.println(liste);


    }

    private void quickSort(ArrayList<Personne> array, int debut, int fin) {
        if (debut <fin) {
            int pi = partition(array,debut, fin);
            quickSort(array,debut, pi - 1);
            quickSort(array, pi + 1, fin);
        }
    }

    int partition(ArrayList<Personne> array, int debut, int fin) {


       String pivot = array.get(fin).prenom;
        int i = (debut - 1);

        for (int j = debut; j < fin; j++) {
            if (array.get(j).prenom.compareTo(pivot) <=0 ) {
                i++;
                Personne temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }
        Personne temp = array.get(i + 1);
        array.set(i + 1, array.get(fin));
        array.set(fin, temp);
        return (i + 1);
    }
}
