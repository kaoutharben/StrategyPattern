import java.util.ArrayList;

class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public String toString(ArrayList<Integer> liste ){
        String listeTrié ="[ ";
        for(int i=  0;i< (liste.size())-1;i++){
            listeTrié+=liste.get(i)+", ";

        }
        listeTrié+= liste.get(liste.size() - 1) +" ]";
        return listeTrié;
    }

    public void arrange(ArrayList<Integer> liste) {
        strategy.sort(liste);
    }
}

