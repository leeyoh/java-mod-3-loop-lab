public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear + 1;

        while (currentYear < targetYear) {
            if((currentYear - startingYear) == 1){
                System.out.println((currentYear - startingYear) + " year has passed");
            } else {
                System.out.println((currentYear - startingYear) + " years have passed");
            }
            // conditional logic based on the current year
            currentYear++;
        }
    }
}
