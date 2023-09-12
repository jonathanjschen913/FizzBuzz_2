public class Multiples {
    public static void main(String[] args) {
        int multiple_three = 0;
        int multiple_five = 0;

        for (int i = 0; i < 1000; i ++ ){
            if (i % 3 == 0){
                multiple_three ++;
            }
            else if (i % 5 == 0){
                multiple_five ++;
            }
        }

        System.out.println("In numbers that are under 1000, there are " + multiple_five + " multiples of five" +
                " and " + multiple_three + " multiples of three");
    }
}
