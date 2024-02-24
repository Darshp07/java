package construct;



public class Array04 {
	
   public  static int Array (int x,int y,int z) {
	int sum = x+y+z;
	double p=(sum/300.0)*100;
	System.out.println(sum);
	System.out.println(p);
	return sum;	
	
	
	}
   
   public  static int sub(int a,int b) {
	   int sub = a-b;
	   System.out.println(sub);
	   return sub;
   }
public static void main(String[] args) {
	
 Array04 std1 = new Array04();
 std1.Array(43, 87, 90);
 Array04 std2 = new Array04();
 
 std2.Array(6786, 66, 454);
 Array(89,87,78);
 
 sub(67,8);
}

}
