import java.util.Scanner;

class NumberToMonth {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();
        
        int days;
        
        //1=January (31=days)
        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                days = 31;
                break;
            case 4:  
            case 6:  
            case 9:  
            case 11: 
                days = 30;
                break;
            case 2:  
                days = 28; 
                break;
            default:
                days = -1; // invalid
        }
        
        if (days == -1) {
            System.out.println("Invalid month number!");
        } else {
            System.out.println("Month " + month + " has " + days + " days.");
        }
    }
}
