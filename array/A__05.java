package array;

import java.util.Arrays;
import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;

public class A__05 {
    public static void main(String[] args) {

        int a[] = {32, 23, 62, 53, 13,111, 35, 57, 86, 35, 80};
        
        
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("max is"+max);
        

        int last = a[1];
        int seclast = a[0];
        for (int i = 0; i < a.length; i++) {
        	int num = a[i];
            if (num > last) {            	
                seclast = last;     
                   last = num;
//                     System.out.println(seclast);
//                     System.out.println(last);
            } 
            else if (num > seclast && num != last) {
                seclast = num;
                System.out.println(seclast);
                System.out.println(last);
            }
        }

    
    System.out.println("this is last large :" + last);
    System.out.println("Second largest number: " + seclast);
}
}
