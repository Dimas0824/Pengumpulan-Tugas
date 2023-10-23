public class BubbleSortExample20 {
    public static void main(String[] args) {
        int[] intData = {34 , 18, 87, 72, 32, 54, 43};
        int temp=0;

        for (int i = 0; i < intData.length; i++) {
            for (int j = i+1; j < intData.length; j++) {
                if (intData[i] < intData[j]) {
                    temp = intData[i];
                    intData[i] = intData[j];
                    intData[j] = temp;
                }
            }   
        }
        System.out.println("Hasil pengurutan: ");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
        }
    }
}
