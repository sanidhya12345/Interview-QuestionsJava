import java.util.Scanner;

//n=no of elements
//pass=n-1
public class SelectionSortExample {
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int [] ar=new int[5];

        //step 1 input
        System.out.println("Enter the elements in array");
        for (int i = 0; i < ar.length ; i++) {
            ar[i]= sc.nextInt();
        }

        //step 2 process
        for (int r = 0; r < ar.length-1; r++) {
            for (int c = r; c <= ar.length-1; c++) {
                if (ar[r]>ar[c])
                {
                    int temp=ar[r];
                    ar[r]=ar[c];
                    ar[c]=temp;
                }
            }
        }

        // step 3 output
        System.out.println("---------Sorted--------");
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        SelectionSortExample obj=new SelectionSortExample();
        obj.func();
    }
}
