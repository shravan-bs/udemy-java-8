public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate = 0.05;

	static void setTaxRate(double taxRateIn) {
		taxRate = taxRateIn;
	}

	static double computeTaxOn(double parm) {
		return parm * taxRate;
	}

	public double computeTax() {
		return orderAmount * taxRate;
	}

	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
