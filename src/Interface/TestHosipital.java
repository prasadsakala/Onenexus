package Interface;

public class TestHosipital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHosipital FH = new FortisHosipital();
		FH.CardioServices();
		FH.physioservices();
		FH.pathologyservices();
		FH.OptServices();
		FH.dentalservices();
		
		//cann't create object of interface
		
	//	USMedical USM = New USMedical();
		
		//top casting
		
		//child class object reffered by parent interface ref variable
		System.out.println("-------------------");
		USMedical USM =new FortisHosipital();
		USM.PediaServices();
		USM.physioservices();
		USM.OncologieServices();
		
		System.out.println("-------------------");

		UKMedical UKM=  new FortisHosipital();		
		UKM.dentalservices();
		UKM.CardioServices();
		UKM.physioservices();
		
		System.out.println("-------------------");
		
		IndicanMedical INDM=new FortisHosipital ();
		
		INDM.RadiologyServices();
		INDM.gynecservices();
		
		


	}

}
