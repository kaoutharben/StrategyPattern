package Personne;

public class Personne {
    String nom ;
    String prenom;
    int age;
    Personne( String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public String toString( ){
        String perso ="{ " +this.nom+" , "+ this.prenom+" , "+this.age +" }";
        return perso;
    }

}
