import java.util.ArrayList;

class InsertionSort implements Strategy {

    public void sort(ArrayList<Integer> liste ) {
        int n = liste.size();
        for (int i = 1; i < n; ++i) {
            int index = liste.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && liste.get(j) > index) {
                liste.set(j + 1, liste.get(j));
                j = j - 1;
            }
            liste.set(j + 1, index);
        }
        System.out.println(liste);
    }

}
