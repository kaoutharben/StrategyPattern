import java.util.ArrayList;

class BubbleSort implements Strategy {
    public void sort(ArrayList<Integer> liste) {
        int n = liste.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (liste.get(j) > liste.get(j + 1))
                {

                    int temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
        System.out.println(liste);
    }
}
