public class Mall extends Business {

 

 private int numRentedUnits;

 private double medianUnitSize;

 private int numParkingSpaces;

 

 public Mall() {

 super();

 numRentedUnits = 0;

 medianUnitSize = 0.0;

 numParkingSpaces = 0;

}

 

 public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {

 super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentedUnits);

 this.medianUnitSize = medianUnitSize;

 this.numParkingSpaces = numParkingSpaces;

}

 

 public String displayData() {

 String s = "";

     s += super.toString() + "\nMedian Unit Size: " + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;

     return s;

}

 

 public int getNumRentedUnits() {

 return numRentedUnits;

}


 

 public void setNumRentedUnits(int numRentedUnits) {

 this.numRentedUnits = numRentedUnits;

}


 

 public double getMedianUnitSize() {

 return medianUnitSize;

}


 

 public void setMedianUnitSize(double medianUnitSize) {

 this.medianUnitSize = medianUnitSize;

}


 

 public int getNumParkingSpaces() {

 return numParkingSpaces;

}


 

 public void setNumParkingSpaces(int numParkingSpaces) {

 this.numParkingSpaces = numParkingSpaces;

}

 


 

}