package fichier;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String nomDeLaVille;
    private String codeDepartement;
    private String nomDeLaRegion;
    private int pouplationTotale;

//Constructeur
        public Ville(String nomDeLaVille, String codeDepartement, String nomDeLaRegion, int pouplationTotale) {
        this.nomDeLaVille = nomDeLaVille;
        this.codeDepartement = codeDepartement;
        this.nomDeLaRegion = nomDeLaRegion;
        this.pouplationTotale = pouplationTotale;
    }
//  to Sting
    @Override
    public String toString() {
        return "Ville{" +
                "nomDeLaVille='" + nomDeLaVille + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", nomDeLaRegion='" + nomDeLaRegion + '\'' +
                ", pouplationTotale=" + pouplationTotale +
                '}';
    }
//  implementation
   // @Override
    //public int compareTo(Ville o) {
      //  return this.nomDeLaVille.compareToIgnoreCase((o.nomDeLaVille));
    //}
    @Override
    public int compareTo(Ville o) {
        return Integer.compare(o.getPouplationTotale(),this.pouplationTotale);
    }

    //  guetter et setter


    public String getNomDeLaVille() {
        return nomDeLaVille;
    }

    public void setNomDeLaVille(String nomDeLaVille) {
        this.nomDeLaVille = nomDeLaVille;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public int getPouplationTotale() {
        return pouplationTotale;
    }

    public void setPouplationTotale(int pouplationTotale) {
        this.pouplationTotale = pouplationTotale;
    }
//      equals et hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville ville)) return false;
        return codeDepartement == ville.codeDepartement && pouplationTotale == ville.pouplationTotale
                && Objects.equals(nomDeLaVille, ville.nomDeLaVille) && Objects.equals(nomDeLaRegion,
                ville.nomDeLaRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomDeLaVille, codeDepartement, nomDeLaRegion, pouplationTotale);
    }
}// class
