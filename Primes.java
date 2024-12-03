public class Primes {
    public static void main(String[] args) {
       
        int input = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[input +1];
        arr[0]=false;
        arr[1]=false;
        System.out.println("Prime numbers up to " + input + ":");
        for (int i =2; i<input+1; i++){
            arr[i] = true;
        }

        int isPrime =2;

        while (isPrime <= Math.sqrt(input)) {
            if (arr[isPrime]) { 
                int currentNum = isPrime * 2;
                while (currentNum < input + 1) {
                    arr[currentNum] = false;
                    currentNum += isPrime;
                }
            }
            isPrime++;
        }
        

        int countPrime = 0;
       for (int i =0; i<input+1; i++){
        if (arr[i] ==true){
            countPrime++;
            System.out.println(i);
        }
       }
       double percent = countPrime /(double) input *100;
       
        System.out.println("There are " + countPrime +" primes between 2 and "+input+" (" +(int)percent+"% are primes)");



    }
}