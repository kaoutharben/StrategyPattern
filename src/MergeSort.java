import java.util.ArrayList;

class MergeSort implements Strategy {

    @Override
    public void sort(ArrayList<Integer> liste ) {
        mergeSort(0, liste.size() - 1, liste, new ArrayList<Integer>(liste));
        System.out.println(liste);
    }
    private void mergeSort(int debut, int fin, ArrayList<Integer> valeur, ArrayList<Integer>  aux) {

        if(debut < fin){
            int mid = debut + (fin - debut) / 2;
            mergeSort(debut, mid, valeur, aux);
            mergeSort(mid+1, fin, valeur, aux);
            merge(debut, mid, fin, valeur, aux);
        }
    }

    private void merge(int debut, int mid, int fin,ArrayList<Integer> valeur, ArrayList<Integer>  aux) {

        int left = debut;
        int right = mid + 1;

        for(int i = debut ;i <= fin; i++){
            aux.set(i, valeur.get(i));
        }

        while(left <= mid && right <= fin){
            valeur.set(debut++, aux.get(left).compareTo(aux.get(right)) < 0 ? aux.get(left++) : aux.get(right++));
        }

        while(left <= mid){
            valeur.set(debut++, aux.get(left++));
        }
    }
}
