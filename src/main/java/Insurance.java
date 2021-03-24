import java.util.Scanner;
public class Insurance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your age, so that your insurance rate can be calculated.");
    int age = keyboard.nextInt();
    
    try {
    calculateInsurance(age);
    }
    catch(InvalidAgeException ex) {
        System.out.println("You entered an invalid age.");
    }
    }
    public static int calculateInsurance (int age) throws InvalidAgeException {
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid age.");
        }    
        int insurancePrice = (age * 5) + 300;
        System.out.println("Since you are " + age + " years old, your insurance will cost $" + insurancePrice + " per year.");
       return insurancePrice;
    }
}
