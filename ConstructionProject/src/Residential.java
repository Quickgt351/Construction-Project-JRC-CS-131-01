public class Residential extends Building {

 

 protected int numBedrooms;

 protected int numBathrooms;

 protected boolean laundryRoom;

 

 public Residential() {

 super();

 numBedrooms = 0;

 numBathrooms = 0;

 laundryRoom = false;

}

 

 public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {

 super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);

 this.numBedrooms = numBedrooms;

 this.numBathrooms = numBathrooms;

 this.laundryRoom = laundryRoom;

}

 

 public String toString() {

 return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms + "\nLaundry Room: " + ((laundryRoom == true)? "Y" : "N");

}

 


 

 public int getNumBedrooms() {

 return numBedrooms;

}

 

 public void setNumBedrooms(int numBedrooms) {

       this.numBedrooms = numBedrooms;

}

 

 public int getNumBathrooms() {

       return numBathrooms;

}


 

   public void setNumBathrooms(int numBathrooms) {

       this.numBathrooms = numBathrooms;

}


 

   public boolean isLaundryRoom() {

       return laundryRoom;

}


 

   public void setLaundryRoom(boolean laundryRoom) {

       this.laundryRoom = laundryRoom;

}   

   

}