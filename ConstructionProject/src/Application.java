public class Application {


 

 public static void main(String[] args) {

 System.out.println("---------------------------------------------");

 Building b = new Building("ganes house","123Main", 2500, "resi", "r1");

 b.draw();

 System.out.println(b.displayData());

 System.out.println("---------------------------------------------");

 Business bb = new Business();

 bb.draw();

 System.out.println(bb.toString());

 System.out.println("---------------------------------------------");

 Residential r = new Residential();

 r.draw();

 System.out.println(r.toString());

 System.out.println("---------------------------------------------");

Mall m = new Mall();

 m.draw();

 System.out.println(m.displayData());

 System.out.println("---------------------------------------------");

 Apartment a = new Apartment();

 a.draw();

 System.out.println(m.toString());

 System.out.println("---------------------------------------------");

 SingleFamilyHome s = new SingleFamilyHome();

 s.draw();

 System.out.println(s.displayData());

 System.out.println("---------------------------------------------");

}


 

}