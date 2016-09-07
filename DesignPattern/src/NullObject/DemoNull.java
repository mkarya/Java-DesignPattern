package NullObject;

public class DemoNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTenant t1 = TenantFactory.getTanant("Rob");
		System.out.println(t1.getName());
		AbstractTenant t2 = TenantFactory.getTanant("Kamala");
		System.out.println(t2.getName());
		AbstractTenant t3 = TenantFactory.getTanant("sita");
		System.out.println(t3.getName());
	}

}
