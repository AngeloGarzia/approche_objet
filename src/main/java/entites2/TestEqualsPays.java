package entites2;

public class TestEqualsPays {
    public static void main(String[] args) {


        Pays p1 = new Pays("FRance", 67000000);
        Pays p2 = new Pays("FRance", 67000000);

        if (p1.equals(p2)) {
            System.out.println("p1 est egale a p2");;
                            }
        else           {
            System.out.println("p1 n'est pas egale a p2");;
                          }
//   ******************************methode ==**************************************************************************
        if (p1==p2) {
            System.out.println("p1 est egale a p2");;
        }
        else                {
            System.out.println("p1 n'est pas egale a p2");;
        }







    }
}