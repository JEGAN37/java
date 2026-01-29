package bill;

public class ElectricityBill {
    public static void main(String[] args) {

        // Sample input
        int unitsConsumed = 200; // units in kWh
        double ratePerUnit = 8.0; // Rs per unit

        double totalBill = calculateBill(unitsConsumed, ratePerUnit);

        System.out.println("Electricity Bill Calculation");
        System.out.println("----------------------------");
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Rate per Unit  : Rs " + ratePerUnit);
        System.out.println("Total Bill     : Rs " + totalBill);
    }

    public static double calculateBill(int units, double rate) {
        return units * rate;
    }
}
