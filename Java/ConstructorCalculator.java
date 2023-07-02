public class ConstructorCalculator {
    public int num1;
    public int num2;
    public int num3;
    
    // Constructor
    public ConstructorCalculator(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    // Method to add the numbers
    public int add() {
        return num1 + num2 + num3;
    }
    
    // Method to multiply the numbers
    public int multiply() {
        return num1 * num2 * num3;
    }
    
    public static void main(String[] args) {
        
        ConstructorCalculator calculator = new ConstructorCalculator(2, 4, 6);
        
        int sum = calculator.add();
        int product = calculator.multiply();
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
