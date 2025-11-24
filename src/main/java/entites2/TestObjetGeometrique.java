package entites2;

public class TestObjetGeometrique {
    public static void main(String[] args) {
       ObjetGeometrique[] arrayObjetGeo= new ObjetGeometrique [2];

        arrayObjetGeo[0]=new Cercle(10);
        arrayObjetGeo[1]=new Rectangle(10,20);
        int i=0;
        for  (i=0 ; i<arrayObjetGeo.length;i++) {

            System.out.println("Périmètre : " + (arrayObjetGeo[i].perimetre() ));
            System.out.println("Surface : " + (arrayObjetGeo[i].surface() ));

        }


    }
}
