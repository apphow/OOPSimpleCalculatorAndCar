public class Main {

    public static void main(String[] args) {

        // create car object
        // creat local variable

        Car porshe = new Car();
        Car chevrolet = new Car();
        Car honda = new Car();

        porshe.setModel("Carrera");
        porshe.setColor("White");
        porshe.setDoors(2);
        porshe.setEngine("V8");
        porshe.setWheels(4);

        System.out.println("Model is " + porshe.getModel() + ", " + porshe.getColor() +
                ", " + porshe.getDoors() + " doors, " + porshe.getEngine() + " engine, " + porshe.getWheels() + " wheels.");

        chevrolet.setModel("Camaro");
        chevrolet.setColor("Red");
        chevrolet.setDoors(2);
        chevrolet.setEngine("V8");
        chevrolet.setWheels(4);

        System.out.println(chevrolet.toString());

        honda.setModel("Accord");
        honda.setColor("Maroon");
        honda.setDoors(4);
        honda.setEngine("V6");
        honda.setWheels(4);

        System.out.println(honda.toString());


        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


    }
}
