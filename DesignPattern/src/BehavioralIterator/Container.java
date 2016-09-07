package BehavioralIterator;

public class Container {
	public class Iterator {
		private int index;
		
		
		public void begin() {
			this.index = 0;
			return;
		}
		
		public boolean end() {
			if (index >= nameRespositoy.length) {
				return false;
			}
			return true;
		}
		
		public void next() {
			index++;
		}
		
		public String elem() {
			return nameRespositoy[index];
		}
	}
	
	String nameRespositoy[] = {"ram","sita", "david" };
	
	public Iterator getIterator() {
		return new Iterator();
	}
	
}	
