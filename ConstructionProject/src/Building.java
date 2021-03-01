
public class Building{


	 

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;


 

		public Building() {
 
			projectName = "";
			completeAddress = "";
			totalSquareFeet = 0.0;
			occupancyGroup = "";
			subgroup = "";

}

		public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {

			this.projectName = projectName;
			this.completeAddress = completeAddress;
			this.totalSquareFeet = totalSquareFeet;
			this.occupancyGroup = occupancyGroup;
			this.subgroup = subgroup;

}


 

	public void draw(){

		System.out.println("Drawing code for " + getClass() );

}



	public String displayData(){

		String s = "";
		s += "Project Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup;
		return s;

	}
}

	