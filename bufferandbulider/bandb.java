package bufferandbulider;

public class bandb {
	

	public static void main(String[] args) {
		long Startime= System.currentTimeMillis();
		StringBuilder bb = new StringBuilder();
		for(int j=0;j<=100000000;j++) {

			bb.append('d');
//			bb.indexOf("d");
//			bb.append(1000);
			
		}
		System.out.println("StringBuilder time "+(System.currentTimeMillis()-Startime)+" ms");
	
		
	Startime = System.currentTimeMillis();
		
		StringBuffer bf =new StringBuffer();
		for(int i = 0 ;i <=100000000;i++) {
			bf.append('d');
			bf.indexOf("d");
		}
		System.out.println("StringBuffer time "+(System.currentTimeMillis()-Startime)+" ms");
		
		
}
		

}
