public class Array {

        public static void main(String[] args) {
            int[] numbers={12,20,30,15,90};
            int min  = numbers[0];
            int max  = numbers[0];
            for (int num:numbers) {
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
                System.out.println("Smallest:"+min);
                System.out.println("Largest:"+max);


        }
    }


