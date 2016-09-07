package NullObject;

public class TenantFactory {
	public static String[] availableTenant = {"Rob","Naresh","Ramesh","Sita"};
	
	public static AbstractTenant getTanant(String tname) {
		for (int i = 0; i < availableTenant.length ; i++ ) {
			if (availableTenant[i].compareToIgnoreCase(tname) == 0) {
				return new RealTanent(availableTenant[i]);
			}
		}
		return new NoTenant();
	}

}
