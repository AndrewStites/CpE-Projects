import java.io.*;
import java.util.Scanner;

class ParkedCar {
    private String carMake;
    private String carModel;
    private String carColor;
    private String carLicenseNo;
    private int minsParked;


    public ParkedCar(String cmak, String cmod, String ccol, String cLno, int mins) {

        this.carMake = cmak;
        this.carModel = cmod;
		this.carColor = ccol;
        this.carLicenseNo = cLno;
        this.minsParked = mins;
    }

    public ParkedCar(ParkedCar car1) {

        this.carMake = car1.carMake;
        this.carModel = car1.carModel;
        this.carColor = car1.carColor;
        this.carLicenseNo = car1.carLicenseNo;
        this.minsParked = car1.minsParked;
    }

    public void setCarMake(String m) {
        this.carMake = m;
    }

    public void setCarModel(String m) {
         this.carModel = m;
    }

    public void setCarColor(String c) {
         this.carColor = c;
    }

    public void setCarLicenseNo(String cLno) {
         this.carLicenseNo = cLno;
    }

    public void setMinsParked(int m) {
         this.minsParked = m;
    }

    public String getCarMake() {
          return carMake;
    }

    public String getCarModel() {
          return carModel;
    }

    public String getCarColor() {
          return carColor;
    }

    public String getCarLicenseNo() {
          return carLicenseNo;
    }

    public int getMinsParked() {
          return minsParked;
    }

    public String toString() {
		String newString = "CarMake: " + carMake + "\nCarModel: " + carModel + "\nCarColor: " + carColor + "\nLicenseNo: " + carLicenseNo + "\nMinutesParked: " + minsParked;
        return newString;
    }
}

class ParkingMeter {

    int minsForParking;

    public int getMinsForParking() {
          return minsForParking;
    }

    public void setMinsForParking(int minsForParking) {
          this.minsForParking = minsForParking;
    }
}

class ParkingTicket {

    int fineAmount;
    int illegalParkedHour;

    public int getFineAmount() {
          return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
          this.fineAmount = fineAmount;
    }

void reportIllegalParkedCar(ParkedCar myPC, ParkingMeter myPM, PoliceOfficer myPO) {

        System.out.println("Illegally parked car details :");
        System.out.println("carMake :" + myPC.getCarMake());
        System.out.println("carModel :" + myPC.getCarModel());
        System.out.println("carColor :" + myPC.getCarColor());
        System.out.println("carLicenceNo :" + myPC.getCarLicenseNo());

        illegalParkedHour = ((myPC.getMinsParked() - myPM.getMinsForParking()) / 60) + 1;

        if (illegalParkedHour <= 1) {
              setFineAmount(25);
        }else{
              setFineAmount(25 + ((illegalParkedHour - 1) * 10));
        System.out.println("FineAmount : $" + getFineAmount());
        System.out.println("Name of Police officier :" + myPO.getPoliceName());
        System.out.println("BadgeNumber :" + myPO.getBadgeNo());

	  }
    }
}

public class PoliceOfficer {

    String policeName;
    int badgeNo;

    public String getPoliceName() {
          return policeName;
   }

    public void setPoliceName(String policeName) {
          this.policeName = policeName;
    }

    public int getBadgeNo() {
          return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
          this.badgeNo = badgeNo;
    }

    boolean expired(int timePurchace, int timeParked) {

        if (timeParked - timePurchace > 0) {
              return true;
        }else{
              return false;
   		}
    }

    ParkedCar myPC = new ParkedCar(null, null, null, null, 0);

    ParkingMeter myPM = new ParkingMeter();

    public static void main(String[] args) {

        boolean state;
        Scanner newSc = new Scanner(System.in);

        PoliceOfficer myPO = new PoliceOfficer();

        System.out.println("Enter police officer name :");
        	myPO.setPoliceName(newSc.nextLine());

        System.out.println("Enter police badge number :");
        	myPO.setBadgeNo(newSc.nextInt());

        System.out.println("Enter carMake:");
        	myPO.myPC.setCarMake(newSc.next());

        System.out.println("Enter carModel:");
        	myPO.myPC.setCarModel(newSc.next());

        System.out.println("Enter carColor:");
        	myPO.myPC.setCarColor(newSc.next());

        System.out.println("Enter carLicenceNo:");
        	myPO.myPC.setCarLicenseNo(newSc.next());

        System.out.println("Enter minutes car parked:");
        	myPO.myPC.setMinsParked(newSc.nextInt());

        System.out.println("Enter minutes purchased for parking:");
        	myPO.myPM.setMinsForParking(newSc.nextInt());

        state = myPO.expired(myPO.myPM.getMinsForParking(), myPO.myPC.getMinsParked());

        if (state == true) {

            ParkingTicket pt = new ParkingTicket();
            pt.reportIllegalParkedCar(myPO.myPC, myPO.myPM, myPO);

        }else{

            System.out.println("Car is parked Legally!");
	 }
    }
}