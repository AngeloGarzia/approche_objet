package entites;

public class AdressePostale {
        int numerorue;
        String libellerue;
        int codepostal;
        String  ville;


        // constructeur
        public AdressePostale(int numerorue, String libellerue, int codepostal, String ville) {
                this.numerorue = numerorue;
                this.libellerue = libellerue;
                this.codepostal = codepostal;
                this.ville = ville;
        }
        //presence d'une methode to string


        @Override
        public String toString() {
                return "AdressePostale{" +
                        "numerorue=" + numerorue +
                        ", libellerue='" + libellerue + '\'' +
                        ", codepostal=" + codepostal +
                        ", ville='" + ville + '\'' +
                        '}';
        }
}

