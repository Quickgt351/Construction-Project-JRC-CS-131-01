
public class SingleFamilyHome extends Residential {

 private boolean garage;

 

 public SingleFamilyHome() {

 super();

 garage = false;

}

 

 public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {

 super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,laundryRoom);

 this.garage = garage;

}

 

 public String displayData() {

 String s = "";

     s += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");

     return s;

}

 

 public boolean getGarage() {

 return garage;

}


 

 public void isGarage(boolean garage) {

 this.garage = garage;

}


 

}