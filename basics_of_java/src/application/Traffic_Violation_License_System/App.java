package application.Traffic_Violation_License_System;

//---------------- ENUMS ----------------

enum ViolationType {
	SPEEDING, SIGNAL_JUMP, DRUNK_DRIVE
}

enum LicenseType {
	VALID, EXPIRED
}

//---------------- EXCEPTIONS ----------------

//Checked Exception
class InvalidLicenseException extends Exception {
	public InvalidLicenseException(String msg) {
		super(msg);
	}
}

class ViolationProcessingException extends RuntimeException {
	public ViolationProcessingException(String msg) {
		super(msg);
	}
}

//---------------- ABSTRACTION ----------------

interface ViolationService {
	double calculateFine() throws InvalidLicenseException;
}

//---------------- ABSTRACT MODEL ----------------

abstract class ViolationModel implements ViolationService {
	private int violationId;
	private String name;
	private ViolationType violationType;
	private LicenseType licenseType;
	private double fineAmount;

	public ViolationModel(int violationId, String name, ViolationType violationType, LicenseType licenseType) {
		this.violationId = violationId;
		this.name = name;
		this.violationType = violationType;
		this.licenseType = licenseType;
	}

	// Getter
	protected LicenseType getLicenseType() {
		return licenseType;
	}

	// Each subclass defines its base fine
	protected abstract double baseFare();

	@Override
	public double calculateFine() throws InvalidLicenseException {
		if (licenseType == null) {
			throw new InvalidLicenseException("License Information Missing.");
		}

		fineAmount = baseFare();

		if (licenseType == LicenseType.EXPIRED) {
			fineAmount += 2000;
		}

		return fineAmount;
	}

	@Override
	public String toString() {
		return "[ ViolationId : " + violationId + ", Driver Name : " + name + ", ViolationType: " + violationType
				+ ", LicenseType : " + licenseType + ", Fine: ₹" + fineAmount + " ]";
	}
}

//---------------- CONCRETE CLASSES ----------------

class Speeding extends ViolationModel {

	public Speeding(int violationId, String name, LicenseType licenseType) {
		super(violationId, name, ViolationType.SPEEDING, licenseType);
	}

	@Override
	protected double baseFare() {
		return 1000;
	}

}

class SignalJump extends ViolationModel {

	public SignalJump(int violationId, String name, LicenseType licenseType) {
		super(violationId, name, ViolationType.SIGNAL_JUMP, licenseType);
	}

	@Override
	protected double baseFare() {
		return 1500;
	}
}

class DrunkDrive extends ViolationModel {

	public DrunkDrive(int violationId, String name, LicenseType licenseType) {
		super(violationId, name, ViolationType.DRUNK_DRIVE, licenseType);
	}

	@Override
	protected double baseFare() {
		return 5000;
	}
}

//---------------- MAIN APPLICATION ----------------

public class App {
	public static void main(String[] args) {
		try {
			ViolationModel v1 = new DrunkDrive(1, "Anoushka", LicenseType.VALID);
			ViolationModel v2 = new Speeding(2, "Anishka", LicenseType.EXPIRED);

			double fineV1 = v1.calculateFine();
			System.out.println(v1);
			System.out.println("Fine: ₹" + fineV1);

			double fineV2 = v2.calculateFine();
			System.out.println(v1);
			System.out.println("Fine: ₹" + fineV2);
		} catch (InvalidLicenseException e) {
			System.out.println("License Error: " + e.getMessage());
		} catch (Exception e) {
			throw new ViolationProcessingException("Unexpected processing error");
		}
	}
}
