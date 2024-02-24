package array;

public class A__07 {
    public static void main(String[] args) {

        int a[] = {32, 23,1, 62, 53, 13,111, 35, 57,17, 86, 35, 80};

        int small = a[0];
        int secsmall = a[1];
        
        for (int i = 0; i < a.length; i++) {
        	int num = a[i];
            if (num < small ) {            	
            	secsmall = small;      
                small=num  ;
               
                 System.out.println(secsmall);
                  System.out.println(small);
            } 
            else if ( num < secsmall && num != small) {
                secsmall= num;
                System.out.println(secsmall);
                System.out.println(small);
            }
        }

    
    System.out.println("this is smallest :" + small);
    System.out.println("Second smallest: " + secsmall);
}
}
