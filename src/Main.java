import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	for(int i=1; i<11;i++){
	    if (i==7) {
            continue;
         }
        System.out.println(i);

      int[] a={1,2,3,4,5};
      System.out.println(a[2]);
    }
	int[]c={1,2,3,4,5,6};
	try{

        System.out.println(c[7]);
	}
	catch (Exception e){
        System.out.println("Outside of the bound message");
    }
}
}
