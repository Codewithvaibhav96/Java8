public class Countnumber {

    public static void main(String[] args) {
        int count = 0;
        int number = 123456789;

        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
