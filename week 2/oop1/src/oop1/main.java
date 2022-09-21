package oop1;

public class main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Delonghi Kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		Product product3 = new Product();
		product3.setName("Delonghi Kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");


		
		Product[] products = {product1, product2, product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0555555");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("Burak");
		individualCustomer.setLastName("Bulama");
		
		CorperateCustomer corperateCustomer = new CorperateCustomer();
		corperateCustomer.setId(2);
		corperateCustomer.setCompanyName("Kodlama.io");
		corperateCustomer.setPhone("0533333");
		corperateCustomer.setTaxNumber("11111111");
		corperateCustomer.setCustomerNumber("54786777");
		
		Customer[] customers = {individualCustomer, corperateCustomer};
		
		
	}

}
