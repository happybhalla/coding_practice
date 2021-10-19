package ds.arrays;

public class StockPrice {


    private int MaxProfit(int [] ret){
        int maxProfit =0 ;
        for(int j =0 ; j <ret.length; j++){
            int buy = ret [j];
            for(int k =j+1 ; k<ret.length; k++ ){
                int dayProfit = 0;
                for(int m = k ; m < ret.length; m++){

                    dayProfit = dayProfit + (ret[m] - ret[m-1]);

                }

                if(maxProfit < dayProfit){
                    maxProfit = dayProfit;
                }
            }
        }
        System.out.print(maxProfit);
        return maxProfit;


    }



    public static void main(String[] args) {

    StockPrice obj = new StockPrice();
    int input[] = {5030607, 3485715, 2500526, 676233, 7968122, 7455631, 2382510};
    System.out.println(input.length);
    obj.MaxProfit(input);

    }
}
//552236226