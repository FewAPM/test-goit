package firstClassesBeginningOther;

public class ATM {
    public int countBanknotes(int sum){
        int amount = 0;
        amount += sum / 500;
        sum = sum % 500;

        amount += sum / 200;
        sum = sum % 200;

        amount += sum /100;
        sum = sum % 100;

        amount += sum /50;
        sum = sum % 50;

        amount += sum /20;
        sum = sum % 20;


        amount += sum /10;
        sum = sum % 10;

        amount += sum /5;
        sum = sum % 5;

        amount += sum /2;
        sum = sum % 2;

        amount += sum /1;
        sum = sum % 1;
        return amount;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(2881));
    }
}
