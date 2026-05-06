package Tugas;

class varGlobal {
    public static double sendMoney = 25000;
}

interface Counting {
    double fee();
    void total();
}

class bankAceh implements Counting {
    private double fee = 0.01;
    private double saldo;
    
    public bankAceh(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double fee() {
        return saldo * fee;
    }

    @Override
    public void total() {
        System.out.printf("Total pembayaran: %.3f%n", fee());
    }
}

class BSI implements Counting {
    private double fee = 0.02;
    private double saldo;

    public BSI(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double fee() {
        return saldo * fee;
    }

    @Override
    public void total() {
        System.out.printf("Total pembayaran: %.3f%n", fee());
    }
}

class Gopay implements Counting {
    private double fee = 0.05;
    private double saldo;

    public Gopay(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double fee() {
        return saldo * fee;
    }

    @Override
    public void total() {
        System.out.printf("Total pembayaran: %.3f%n", fee());
    }
}

class Dana implements Counting {
    private double fee = 0.05;
    private double saldo;

    public Dana(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double fee() {
        return saldo * fee;
    }

    @Override
    public void total() {
        System.out.printf("Total pembayaran: %.3f%n", fee());
    }
}

abstract class PaymentProcessing {
    public abstract Counting countFee();

    public void total() {
        Counting printFee = countFee();
        printFee.total();
    }
}

class bankAcehCounter extends PaymentProcessing {
    @Override
    public Counting countFee() {
        return new bankAceh(varGlobal.sendMoney);
    }
}

class BSICounter extends PaymentProcessing {
    @Override
    public Counting countFee() {
        return new BSI(varGlobal.sendMoney);
    }
}

class gopayCounter extends PaymentProcessing {
    @Override
    public Counting countFee() {
        return new Gopay(varGlobal.sendMoney);
    }
}

class danaCounter extends PaymentProcessing {
    @Override
    public Counting countFee() {
        return new Dana(varGlobal.sendMoney);
    }
}