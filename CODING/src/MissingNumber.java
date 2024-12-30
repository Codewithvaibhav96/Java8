public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = new int[] {1,2,3,5,6,7};

        int sum=(7*8)/2;
        int actualValue=0;
        for (int i=0; i<arr.length;i++)
        {
            actualValue=actualValue+arr[i];
        }

        System.out.println("Misssing...."+(sum-actualValue));




    }
}
