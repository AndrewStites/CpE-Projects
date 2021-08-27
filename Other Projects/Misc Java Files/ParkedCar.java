import java.io.*;
import java.util.Scanner;
/* ParkedCar class */
class ParkedCar
{
/* variable declarations */
     private String carMake;
    private String carModel;
    private String carColor;
    private String carLicenseNo;
    private int minsParked;
     /* Constructor */
    public ParkedCar(String cmak, String cmod, String ccol, String cLno,
     int mins)
     {
          this.carMake = cmak;
        this.carModel = cmod;
this.carColor = ccol;
        this.carLicenseNo = cLno;
          this.minsParked = mins;
    }
     /* Constructor */
    public ParkedCar(ParkedCar car1)
     {
          this.carMake = car1.carMake;
        this.carModel = car1.carModel;
        this.carColor = car1.carColor;
        this.carLicenseNo = car1.carLicenseNo;
        this.minsParked = car1.minsParked;
    }
     /* set method for Make */
    public void setCarMake(String m)
     {
          this.carMake = m;
    }
     /* set method for Model */
    public void setCarModel(String m)
     {
          this.carModel = m;
    }
     /* set method for Color */
    public void setCarColor(String c)
     {
          this.carColor = c;
    }
     /* set method for LicenseNo */
    public void setCarLicenseNo(String cLno)
     {
          this.carLicenseNo = cLno;
    }
     /* set method for MinutesParked */
    public void setMinsParked(int m)
     {
          this.minsParked = m;
    }
     /* get method for Make */
    public String getCarMake()
     {
          return carMake;
    }
     /* get method for Model */
    public String getCarModel()
     {
          return carModel;
    }
     /* get method for Color */
    public String getCarColor()
     {
          return carColor;
    }
     /* get method for LicenseNo */
    public String getCarLicenseNo()
     {
          return carLicenseNo;
    }
     /* get method for MinutesParked */
    public int getMinsParked()
     {
          return minsParked;
    }
     /* method to print details */
    public String toString()
     {
String newString = "CarMake: " + carMake + "\nCarModel: " + carModel + "\nCarColor: " + carColor + "\nLicenseNo: " + carLicenseNo + "\nMinutesParked: " + minsParked;
        return newString;
    }
}
/* ParkingMeter Class */
class ParkingMeter
{
/* variable declarations */
     int minsForParking;
     /* get method for minutes for parking */
    public int getMinsForParking()
     {
          return minsForParking;
    }
     /* set method for minutes for parking */
    public void setMinsForParking(int minsForParking)
     {
          this.minsForParking = minsForParking;
    }
}
/* ParkingTicket Class */
class ParkingTicket
{
/* variable declarations */
     int fineAmount;
    int illegalParkedHour;
    /* get method for FineAmount */
     public int getFineAmount()
     {
          return fineAmount;
    }
     /* set method for FineAmount */
    public void setFineAmount(int fineAmount)
     {
          this.fineAmount = fineAmount;
    }
     /* method for generating report */
void reportIllegalParkedCar(ParkedCar myPC, ParkingMeter myPM, PoliceOfficer myPO)
     {
          System.out.println("Illegally parked car details :");
        System.out.println("carMake :" + myPC.getCarMake());
        System.out.println("carModel :" + myPC.getCarModel());
        System.out.println("carColor :" + myPC.getCarColor());
          System.out.println("carLicenceNo :" + myPC.getCarLicenseNo());
        illegalParkedHour =
((myPC.getMinsParked() - myPM.getMinsForParking()) / 60) + 1;
        if (illegalParkedHour <= 1)
              setFineAmount(25);
        else
              setFineAmount(25 + ((illegalParkedHour - 1) * 10));
        System.out.println("FineAmount : $" + getFineAmount());
        System.out.println("Name of Police officier :"
+ myPO.getPoliceName());
        System.out.println("BadgeNumber :" + myPO.getBadgeNo());
    }
}
/* PoliceOfficer class */
public class PoliceOfficer
{
/* variable declarations */
     String policeName;
    int badgeNo;
     /* get method for PoliceName */
    public String getPoliceName()
     {
          return policeName;
   }
     /* set method for PoliceName */
    public void setPoliceName(String policeName)
     {
          this.policeName = policeName;
    }
     /* get method for BadgeNo */
    public int getBadgeNo()
     {
          return badgeNo;
    }
     /* set method for BadgeNo */
    public void setBadgeNo(int badgeNo)
     {
          this.badgeNo = badgeNo;
    }
     /* method to check time */
    boolean expired(int timePurchace, int timeParked)
     {
          if (timeParked - timePurchace > 0)
              return true;
        else
              return false;
    }
     /* object creation for ParkedCar class */
    ParkedCar myPC = new ParkedCar(null, null, null, null, 0);
    /* object creation for ParkingMeter class */
     ParkingMeter myPM = new ParkingMeter();
     /* main method */
    public static void main(String[] args)
     {
          /* boolean declaration */
          boolean state;
          /* object creation for PoliceOfficer class */
        PoliceOfficer myPO = new PoliceOfficer();
        System.out.println("Enter police officer name :");
          Scanner newSc = new Scanner(System.in);
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
        state = myPO.expired(myPO.myPM.getMinsForParking(),
myPO.myPC.getMinsParked());
        if (state == true)
          {
               /* object creation for ParkingTicket class */
              ParkingTicket pt = new ParkingTicket();
            pt.reportIllegalParkedCar(myPO.myPC, myPO.myPM, myPO);
        }
          else
              System.out.println("Car is parked Legally!");
    }
}