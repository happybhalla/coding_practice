package question;

public class TwoFunction {
    public void funA(int[] input){
        input[0]=input[0]-2;
        input[1]=input[1]-1;
        input[2]=input[2]+1;
    }

    public void funB(int[] input){
        input[0]=input[0]-1;
        input[1]=input[1]-2;
        input[3]=input[3]++;
    }

    public int[] getVal(int [] input){
        if(input[0] <= 0 || input[1]<=0){
            return input;
        }
        funA(input);


        getVal(input);

return null;
    }
    public static int Solve(int a, int b) {
        // beware integer overflow! we use long in case a = 2_000_000_000 provided
        long x = (2L * a - b) / 3;
        long y = (2L * b - a) / 3;

        return ((x >= 0 && y >= 0 && (2L * b - a) % 3 == 0 && (2L * a - b) % 3 == 0))
                ? (int)(x + y)
                : -1; // impossible
    }
    public static void main(String[] args) {

        //int [] input = {4,2,0};
        //TwoFunction obj = new TwoFunction();
        //obj.getVal(input);

        System.out.println(Solve(1,3));
    }
}
