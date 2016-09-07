package NullObject;

public class RealTanent extends AbstractTenant {
	public RealTanent(String Name) {
		this.name = Name;
	}
	
	public boolean isNill() {
		return name.isEmpty();
	}
	
	public String getName(){
		return this.name;
	}
	
}
