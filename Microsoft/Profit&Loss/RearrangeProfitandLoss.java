import java.util.*;
class RearrangeProfitandLoss{
    static void profitandLossAnalyser(int a[]){
       List<Integer> profit = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();

        for (int value : a) {
            if (value >= 0) {
                profit.add(value);
            } else {
                loss.add(value);
            }
        }

        List<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < profit.size() && i < loss.size()) {
            result.add(profit.get(i));
            result.add(loss.get(i));
            i++;
        }

        while (i < profit.size()) {
            result.add(profit.get(i));
            i++;
        }

        while (i < loss.size()) {
            result.add(loss.get(i));
            i++;
        }

        System.out.println("Rearranged output");
        for (int val : result) 
            System.out.print(val + " ");
    }

    
    public static void main(String[] args){
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        profitandLossAnalyser(arr);
    }
}