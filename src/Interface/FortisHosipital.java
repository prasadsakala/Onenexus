package Interface;

public class FortisHosipital implements USMedical, UKMedical, IndicanMedical{

	@Override
	public void physioservices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----physioservices");
	}

	@Override
	public void OncologieServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----OncologieServices");

	}

	@Override
	public void PediaServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----PediaServices");

	}

	@Override
	public void CardioServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----CardioServices");
	}

	@Override
	public void dentalservices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----dentalservices");

	}
	
	@Override
	public void gynecservices() {
		System.out.println("FortisHosipital----gynecservices");
		
	}

	@Override
	public void RadiologyServices() {
		// TODO Auto-generated method stub
		System.out.println("FortisHosipital----RadiologyServices");

	}


	//FH Individual
	public void OptServices() {
		System.out.println("FortisHosipital----OPTServices");

		}
	
	public void pathologyservices() {
		
	}
}
