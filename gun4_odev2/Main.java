
import gun4_odev2.BaseCustomerManager;
import gun4_odev2.Customer;
import gun4_odev2.NeroCustomerManager;
import gun4_odev2.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniseServiceAdapters());
		customerManager.Save(new Customer(1, "Ýbrahim", "Müezzinoðlu", "1996", "12345687910"));

	}

}
