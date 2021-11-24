package gun4_odev2;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager( ICustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}	
		else {
			System.out.println("Not a valid person");
		}

	}

}
