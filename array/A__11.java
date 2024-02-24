package array;

public class A__11 {

	public static void main(String[] args) {
		
		
	    
	        int arr[]={23,45,12,43,25,3,5,13,64};
	        
	                for(int i=0;i<arr.length;i++){
	                    int index = i;
	                    for(int j=i+1;j<arr.length;j++){
	                        if(arr[j]<arr[index]){
	                            index = j;
	                        }
	                    }
	                    int temp = arr[i];
	                    arr[i] = arr[index];
	                    arr[index]=temp;
	                    System.out.print(" "+arr[i]);
	                    
	                }
	    
	       
	    }
	}

