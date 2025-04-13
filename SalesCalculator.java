import java.util.Scanner;

// Interface
interface Product {
    String getInfo();
    double getSales();
    void setSales(double sales);
}

// Hardware class
class Hardware implements Product {
    public String category;
    public String manufacturer;
    public double sales;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = 0.0;
    }

    public String getInfo() {
        return "Category: " + category + ", Manufacturer: " + manufacturer;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales += sales;
    }
}

// Software class
class Software implements Product {
    public String type;
    public String operatingSystem;
    public double sales;

    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = 0.0;
    }

    public String getInfo() {
        return "Type: " + type + ", Operating System: " + operatingSystem;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales += sales;
    }
}

// Main class to calculate total sales
public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create hardware object
        System.out.println("Enter information and sales for hardware for last 3 months:");
        String category = scanner.nextLine();
        String manufacturer = scanner.nextLine();
        Hardware hardware = new Hardware(category, manufacturer);
        for (int i = 0; i < 3; i++) {
            System.out.println("Month " + (i + 1) + ":");
            double sales = scanner.nextDouble();
            hardware.setSales(sales);
            scanner.nextLine(); // Consume newline left-over
        }

        // Create software object
        System.out.println("Enter information and sales for software for last 3 months:");
        String type = scanner.nextLine();
        String operatingSystem = scanner.nextLine();
        Software software = new Software(type, operatingSystem);
        for (int i = 0; i < 3; i++) {
            System.out.println("Month " + (i + 1) + ":");
            double sales = scanner.nextDouble();
            software.setSales(sales);
            scanner.nextLine(); // Consume newline left-over
        }

        // Calculate total sales for hardware and software
        double totalHardwareSales = hardware.getSales();
        double totalSoftwareSales = software.getSales();

        System.out.println("Total Hardware Sales: " + totalHardwareSales);
        System.out.println("Total Software Sales: " + totalSoftwareSales);
    } 
    }