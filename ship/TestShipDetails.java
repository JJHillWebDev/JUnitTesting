// Source:  http://www.tutorialspoint.com/junit/index.htm
import org.junit.Test;
import static org.junit.Assert.*;

public class TestShipDetails 
{
   	@Test
   	public void testShipInfo() 
   	{
   	  	//create new ship
      	String shipName = "Lolipop";
      	String year = "1960";
      	Ship ship = new Ship(shipName, year);

      	//bad values for testing 
      	String shipNameBad = "Not Lolipop";
      	String yearBad = "1690";

      	//test getName()
      	String testName = ship.getName();
      	assertEquals(testName, shipName);
      	assertNotSame(testName, shipNameBad);
      	assertNotNull(testName);
      
      	//test getYearBuilt()
      	String testYear = ship.getYearBuilt();
      	assertEquals(testYear, year);
      	assertNotSame(testYear, yearBad);
      	assertNotNull(testYear);

      	//test toString()
      	String testString = ship.toString();
    	assertNotNull(testString);
   	}


	@Test
	public void testCargoShipInfo() 
	{
		//create CargoShip
		String shipName = "Black Pearl";
		String year = "1800";
		int tonnage = 50000;
		CargoShip cargoShip = new CargoShip(shipName, year, tonnage);

		//bad values for testing
      	String shipNameBad = "Not Black Pearl";
      	String yearBad = "1989";
      	int tonnageBad = 4200;
      
      	//test getName()
      	String testName = cargoShip.getName();
      	assertEquals(testName, shipName);
      	assertNotSame(testName, shipNameBad);
      	assertNotNull(testName);

      	//test getYearBuilt()
      	String testYear = cargoShip.getYearBuilt();
      	assertEquals(testYear, year);
      	assertNotSame(testYear, yearBad);
      	assertNotNull(testYear);
      
      	//test getTonnage()
      	int testTonnage = cargoShip.getTonnage();
      	assertEquals(testTonnage, tonnage);
      	assertNotSame(testTonnage, tonnageBad);
     	assertNotNull(testTonnage);

     	//test toString()
      	String testString = cargoShip.toString();
      	assertNotNull(testString);
	}


	@Test
   	public void testCruiseShipInfo() 
   	{
   		//create CruiseShip
   	  	String shipName = "Disney Magic";
      	String year = "1998";
      	int passengers = 2400;
      	CruiseShip cruiseShip = new CruiseShip(shipName, year, passengers);

      	//bad values for testing
      	String shipNameBad = "Not Disney Magic";
      	String yearBad = "1008";
      	int passengersBad = 50;
      
      	//test getName()
      	String testName = cruiseShip.getName();
      	assertEquals(testName, shipName);
      	assertNotSame(testName, shipNameBad);
      	assertNotNull(testName);

      	//test getYearBuilt()
      	String testYear = cruiseShip.getYearBuilt();
      	assertEquals(testYear, year);
      	assertNotSame(testYear, yearBad);
      	assertNotNull(testYear);

      	//test getPassenegers()
      	int testPassengers = cruiseShip.getPassengers();
      	assertEquals(testPassengers, passengers);
      	assertNotSame(testPassengers, passengersBad);
      	assertNotNull(testPassengers);

      	//test toString()
      	String testString = cruiseShip.toString();
      	assertNotNull(testString);
   	}
}