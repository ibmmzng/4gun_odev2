package gun4_odev2;

public class MerniseServiceAdapters implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		public boolean result;
		public boolean checkIfRealPerson(Customer customer) {
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			try {
				return result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
			} catch (NumberFormatException | RemoteException e) {
				e.printStackTrace();
			}
		return result;
	}

}
