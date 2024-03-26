public class LibraryFine{
  public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine=0;
        if(d1>d2 && m1==m2 && y1==y2){
             fine=15*(d1-d2);
        }
        if(m1>m2 && y1==y2){
            fine=500*(m1-m2);
        }
        if(y1>y2){
            fine=10000;
        }
        return fine;
    }
}
