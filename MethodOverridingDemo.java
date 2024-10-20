class Doctor {
	public void treatPatient() {
		System.out.println("treat patient");
	}
}

class Ortho extends Doctor {
	public void treatPatient() {
		System.out.println("refer to xray unit");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Doctor d = new Ortho();
		d.treatPatient();
		

	}

}
