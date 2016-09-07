package NullObject;

public class NoTenant extends AbstractTenant{
		
		public boolean isNill() {
			return name.isEmpty();
		}
		
		public String getName(){
			return "Tenant is not available in the database";
		}
		
}
