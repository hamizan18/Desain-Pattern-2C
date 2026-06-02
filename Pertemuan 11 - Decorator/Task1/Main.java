package Task1;

interface Coffee {
    String getDescription();
    double getCost();
}

class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }
}

class IceDecorator extends CoffeeDecorator {
    public IceDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Es batu";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.1;
    }
}

public class Main {
    public static void main(String[] args) {
        // Plain Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        // Coffee with Milk
        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getDescription());

        // Coffee with Milk with Sugar
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarMilkCoffee.getCost());

        // Coffee with Ice
        Coffee longBlackCoffee = new IceDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + longBlackCoffee.getDescription());
        System.out.println("Cost: $" + longBlackCoffee.getCost());
        
        // Coffee with Sugar with Ice
        Coffee icedCoffee = new IceDecorator(new SugarDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + icedCoffee.getDescription());
        System.out.println("Cost: $" + icedCoffee.getCost());

        // Coffee with Milk with Ice
        Coffee icedMilkCoffee = new IceDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + icedMilkCoffee.getDescription());
        System.out.println("Cost: $" + icedMilkCoffee.getCost());

        // Coffee with Milk with Sugar with Ice
        Coffee sweetIcedMilkCoffee = new IceDecorator(new SugarDecorator(new MilkDecorator(new PlainCoffee())));
        System.out.println("\nDescription: " + sweetIcedMilkCoffee.getDescription());
        System.out.println("Cost: $" + sweetIcedMilkCoffee.getCost());
    }
}