class Practical6 {

    void displayPattern1(int size) {
        int stars, spaces;

        // Upper part until line = size
        for (int ln = 1; ln <= size; ln++) {
            // spaces
            for (spaces = size; spaces > ln; spaces--) {
                System.out.print(" ");
            }
            // stars
            for (stars = 1; stars <= (2 * ln - 1); stars++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
        // lower half for line > size
        for (int ln = size - 1; ln >= 1; ln--) {
            // spaces
            for (spaces = size; spaces > ln; spaces--) {
                System.out.print(" ");
            }
            // stars
            for (stars = 1; stars <= (2 * ln - 1); stars++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
    }
    
    void displayPattern2(int size) {
        for (int ln = 1; ln <= 2 * size - 1; ln++) {
            // spaces and stars for each line
            int spaces = (ln <= size) ? (size - ln) : (ln - size);
            int stars = 2 * size - 1 - 2 * spaces;

            // spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            // Print stars with alternating spaces
            for (int s = 1; s <= stars; s++) {
            	if(ln <= size){
                	System.out.print(s % 2 == 1 ? "+" : " ");
                	}
                else System.out.print(s % 2 == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
    
    void displayPattern3(int size) {
        int totalLines = 2 * size - 1; // Total lines in the diamond

        // top half 
        for (int ln = 1; ln <= size; ln++) {
            int spaces = size - ln; 
            int symbols = 2 * ln - 1; 

            // spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print * and + symbols
            for (int s = 1; s <= symbols; s++) {
                System.out.print(s % 2 == 1 ? "*" : "+");
            }
            System.out.println();
        }

        // bottom half
        for (int ln = size; ln >= 1; ln--) {
            int spaces = size - ln; 
            int symbols = 2 * ln - 1;

            // spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print * and + symbols
            for (int s = 1; s <= symbols; s++) {
                System.out.print(s % 2 == 1 ? "+" : "*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practical6 dp = new Practical6();
        dp.displayPattern1(3);
        System.out.println(); 
        dp.displayPattern2(3);
        System.out.println();
        dp.displayPattern3(3);
    }
}

