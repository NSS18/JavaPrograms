public class ConvertToNumber {

        //method to convert string into number

        public static void StringToNumber(String price1, String price2) {
            int total;
            total = Integer.parseInt(price1) + Integer.parseInt(price2);
            System.out.println("total of " + price1 + " and " + price2 + " is: " + total);
        }

        //main method
        
        public static void main(String[] args) {

            StringToNumber("100", "200");       //calling StringToNumber method using string as parameter
            StringToNumber("150", "200");

        }

    }


