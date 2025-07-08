public class Prime {
        public static void main(String[] args){
            int num=4;
            boolean isprime=true;
            if (num <= 1) {
                isprime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isprime = false;
                        break;
                    }
                }
            }

            if (isprime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime"); }
        }
    }

