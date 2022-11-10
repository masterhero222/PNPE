
public class Main {

	public static void main(String[] args) {
		
		
		TV tv1 = new TV(2500.99, 9921, "Samsung", 10, "Brabus");
		Books book1 = new Books(999.99, 1, "Boiko Borisov", "Kak da kradesh s dvata djoba");
		
		double tvOffPrice = tv1.getPrice() - tv1.getPrice() % 9;
		double booksOffPrice = book1.getPrice() - book1.getPrice() %20;
		
		System.out.println(tvOffPrice);
		System.out.println(booksOffPrice);
		
		tv1.getMessage(tv1.getPower());

	}

}
