package persholas.shameena.exceptiondemo;

public class ProductInfo {
	public void productCheck(double weight) throws InvalidProductException{
	       if(weight<100){
	           throw new InvalidProductException("Product weight is too low");
	       }
	   }
}
