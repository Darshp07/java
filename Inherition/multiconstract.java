package Inherition;

class Product{
	String product_id;
	Product(String productid){
		this.product_id=productid;
	}
	
}
class Type extends Product{
	String name;
	
	Type(String productid,String name){
		super(productid);
		this.name=name;
	}
}
class Electornic extends Type {
	double price;
	
	Electornic(String productid,String name,double price){
		
		super(productid,name);
		this.price=price;
	}
	void show() {
		System.out.println("id:"+product_id+"\n"+"name:"+name+"\n"+"price:"+price);
	}
	
}
public class multiconstract {

	public static void main(String[] args) {
		Electornic E = new Electornic("D07D","laptop",45000.506);
		E.show();
	}

}
