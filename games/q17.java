package games;

public class q17 {
	public static void main(String[] args) {
		
		int line=9;
		int start=1;
		int sp = line -1;
		
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
		}
			for(int k=1;k<=start;k++) {
				System.out.print("* ");
			}
			System.out.println("");
			start++;
			sp--;
		}
//		System.out.println("&");
		for(int d=1;d<=5;d++) {
			for(int t=1;t<=9;t++) {
				if(t==1 || t == 9|| t==7 || t==3) {
				System.out.print("* ");
			
			}else
			{
				System.out.print("  ");
			}
			}
			System.out.println("");
		}
	}

}
