package oops_abstraction;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {

	
	//US Medical
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");	
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");
		
	}
	


	//UK Medical
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
		
	}

	//India Medical
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}

	@Override
	public void gynoServices() {
		System.out.println("FH -- gynoServices");
		
	}
	
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
		
	}
	
	//FH - individual method
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}
	

}
