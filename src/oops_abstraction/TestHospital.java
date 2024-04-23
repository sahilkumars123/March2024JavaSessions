package oops_abstraction;

public class TestHospital {

	public static void main(String[] args) {

		//USMedical us = new USMedical(); - it is not allowed to have a object of interface
		
		FortisHospital fh = new FortisHospital();
		
		fh.physioServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.ENTServices();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.test();
		fh.test(10);
		fh.covidVaccination();
		fh.trainMedicalStudents();
		fh.billing();
		
		
		//topcasting-- YES
		
		
		WHO ws = new FortisHospital();
		
		ws.covidVaccination();
		
		USMedical us = new FortisHospital();
		
		us.cardioServices();
		us.ENTServices();
		us.emergencyServices();
		us.physioServices();
		us.test();
		us.test(10);
		us.covidVaccination();
		us.billing();
		
		UKMedical uk = new FortisHospital();
		
		uk.emergencyServices();
		uk.neuroServices();

		//downcasting is not allowed at the compile time incase of interfaces
		//FortisHospital fh = (FortisHospital) new UKMedical();
			
		
		
		
	}

}
