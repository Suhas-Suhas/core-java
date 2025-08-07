class SwitchExample {
    public static void main(String args[]) {
        char grade = 'B';
        String performance = "";
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                performance = "Excellent";
                break;
            case 'B':
                System.out.println("Good");
                performance = "Good";
                break;
            case 'C':
                System.out.println("Average");
                performance = "Average";
                break;
            case 'D':
                System.out.println("Poor");
                performance = "Poor";
                break;
            case 'F':
                System.out.println("Fail");
                performance = "Fail";
                break;
            default:
                System.out.println("Invalid Grade");
        }

        int colorCode = 2;
        String color = "";
        switch (colorCode) {
            case 1:
                System.out.println("Red");
                color = "Red";
                break;
            case 2:
                System.out.println("Green");
                color = "Green";
                break;
            case 3:
                System.out.println("Blue");
                color = "Blue";
                break;
            case 4:
                System.out.println("Yellow");
                color = "Yellow";
                break;
            default:
                System.out.println("Invalid Color Code");
        }

        String sizeCode = "XL";
        String sizeDesc = "";
        switch (sizeCode) {
            case "S":
                System.out.println("Small");
                sizeDesc = "Small";
                break;
            case "M":
                System.out.println("Medium");
                sizeDesc = "Medium";
                break;
            case "L":
                System.out.println("Large");
                sizeDesc = "Large";
                break;
            case "XL":
                System.out.println("Extra Large");
                sizeDesc = "Extra Large";
                break;
            default:
                System.out.println("Invalid Size");
        }

        int paymentCode = 3;
        String paymentMethod = "";
        switch (paymentCode) {
            case 1:
                System.out.println("Cash");
                paymentMethod = "Cash";
                break;
            case 2:
                System.out.println("Credit Card");
                paymentMethod = "Credit Card";
                break;
            case 3:
                System.out.println("UPI");
                paymentMethod = "UPI";
                break;
            case 4:
                System.out.println("Net Banking");
                paymentMethod = "Net Banking";
                break;
            default:
                System.out.println("Invalid Payment Mode");
        }

        int deptCode = 101;
        String department = "";
        switch (deptCode) {
            case 101:
                System.out.println("Human Resources");
                department = "Human Resources";
                break;
            case 102:
                System.out.println("Finance");
                department = "Finance";
                break;
            case 103:
                System.out.println("Engineering");
                department = "Engineering";
                break;
            case 104:
                System.out.println("Marketing");
                department = "Marketing";
                break;
            default:
                System.out.println("Invalid Department Code");
        }
    }
}