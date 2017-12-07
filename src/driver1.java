public class driver1 {
    public static void main(String [] args) {

        cardriver1 myCar = new cardriver1 ();
        cardriver1 hisCar = new cardriver1("black", "honda", 400,3.5);
        cardriver1 herCar = new cardriver1("Pink", "Volks", 300, 2.5);

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        	myCar.setColor("blue");
        	hisCar.setColor("blue");
        	herCar.setColor("blue");

        myCar.setMake("Ferrari");
        hisCar.setMake("Ferrari");
        herCar.setMake("Ferrari");

        myCar.setHorsepower(650);
        hisCar.setHorsepower(650);
        herCar.setHorsepower(650);

        myCar.setEngineSize(6.5);
        hisCar.setEngineSize(6.5);
        herCar.setEngineSize(6.5);

        System.out.println("\n(All cars have been changed to blue Ferrari's with 650HP and 6.5 Engine Size)");
        System.out.println("MyCar: " +  myCar.getColor() + " " + myCar.getHorsepower() + " " + myCar.getEngineSize() + " " + myCar.getMake());
        System.out.println("hisCar: " + hisCar.getColor() + " " + hisCar.getHorsepower() + " " + hisCar.getEngineSize() + " " + hisCar.getMake());
        System.out.println("herCar: " + herCar.getColor() + " " + herCar.getHorsepower() + " " + herCar.getEngineSize() + " " + herCar.getMake());
    }
}
