package BehavioralIterator;

public class DemoIterator {

	public static void main(String[] args) {
		Container con = new Container();
		
		Container.Iterator it = con.getIterator();
		
		for (it.begin(); it.end(); it.next()) {
			System.out.println(it.elem());
		}
		// TODO Auto-generated method stub

	}

}
