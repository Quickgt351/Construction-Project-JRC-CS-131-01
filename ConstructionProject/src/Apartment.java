public class Apartment extends Residential{

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvaliable;

 

	public Apartment() {

		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvaliable = false;

}

 

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvaliable) {

		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvaliable = parkingAvaliable;

}

 

	public String displayData() {
      String s = "";
      s += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: " + avgUnitSize + "\nParking Available: " + ((parkingAvaliable == true) ? "Y" : "N");
      return s;

}

 

 	public int getNumRentableUnits() {
 		return numRentableUnits;

}

 	public void setNumRentableUnits(int numRentableUnits) {
 		this.numRentableUnits = numRentableUnits;

}

 	public double getAvgUnitSize() {
 		return avgUnitSize;

}

 	public void setAvgUnitSize(double avgUnitSize) {
 		this.avgUnitSize = avgUnitSize;

}
 	public boolean isParkingAvaliable() {
 		return parkingAvaliable;

}

 	public void setParkingAvaliable(boolean parkingAvaliable) {
 		this.parkingAvaliable = parkingAvaliable;

}

 

}