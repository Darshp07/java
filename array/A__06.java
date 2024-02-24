package array;

public class A__06 {
    public static void main(String[] args) {

        int a[] = {1,123,32, 23, 62, 53,2, 15,35, 57,13,3, 86, 35, 80};

        int secsmall = a[1];
        int small = a[0];
        
        for (int i = 0; i < a.length; i++) {
        	int num = a[i];
            if (num < small) {            	 
                 secsmall= small;
                 small = num;
                             System.out.println(small);
                             System.out.println(secsmall);

            }     
            else if (num < secsmall && num != small ) {
                small = num;
//                System.out.println(seclast);
//                System.out.println(last);
            }
        }

    
    System.out.println("second smallest number :" + secsmall);
    System.out.println("Smallest number: " + small);
}
}
