package unit_3.interfaces_demo;

// Abstract class example
abstract class Vehicle {
    abstract void start();
    void fuelType() {
        System.out.println("Generic fuel type");
    }
}

// Interface example
interface Payment {
    void processPayment(double amount);
}

class Car extends Vehicle implements Payment {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }
}

class PaymentImpl implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using PaymentImpl");
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// loose coupling and tight coupling example

// public class Shopping {
//     public static void main(String[] args) {
//         Vehicle myCar = new Car();
//         myCar.start();
//         myCar.fuelType();

//         Payment payment = new CreditCardPayment();
//         payment.processPayment(150.75);

//         payment = new CashPayment();
//         payment.processPayment(50.00);

//         payment = new UPIPayment();
//         payment.processPayment(200.00);
//     }
// }


// loosely coupled example
public class Shopping {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuelType();

        // CreditCardPayment creditCardPayment = new CreditCardPayment();
        // creditCardPayment.processPayment(150.75);

        String paymentMode = "Credit Card"; // This could be dynamic based on user choice

        

        if (paymentMode.equals("Credit Card")) {
            MakePayment.getPaymentInstance("CreditCard").processPayment(150.75);
        }else if (paymentMode.equals("Cash")) {
            MakePayment.getPaymentInstance("Cash").processPayment(50.00);
        } else if (paymentMode.equals("UPI")) {
            MakePayment.getPaymentInstance("UPI").processPayment(200.00);
        } else {
            System.out.println("Invalid payment mode selected.");
        }

    }

   
}

// factory object class to keep the logic of object creation separate from the main class --> loose coupling
class MakePayment {
    
    public static Payment getPaymentInstance(String paymentMode) {
        if(paymentMode.equals("CreditCard")){
           CreditCardPayment creditCardPayment = new CreditCardPayment();
              return creditCardPayment;
        }
        else if(paymentMode.equals("Cash")){
            CashPayment cashPayment = new CashPayment();
            return cashPayment;
        }
        else if(paymentMode.equals("UPI")){
            UPIPayment upiPayment = new UPIPayment();
            return upiPayment;
        }
        else  throw new IllegalArgumentException("Invalid payment mode");
    }
}
