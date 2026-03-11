class ATM {
    private long[] notes = new long[5];
    private int[] values = {20, 50, 100, 200, 500};
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < 5; i++){
            notes[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] res = new int[5];
        for(int i = 4; i >= 0; i--){
            int use = (int)Math.min(notes[i], amount / values[i]);
            res[i] = use;
            amount -= (use * values[i]);
        }
        if(amount != 0){
            return new int[]{-1};
        }
        for(int i = 0; i < 5; i++){
            notes[i] -= res[i];
        }
        return res;
    }
}
public class Main{
    public static void main(String args[]){
        ATM a = new ATM();
        a.deposit(new int[]{0, 0, 1, 2, 1});
        System.out.println(Arrays.toString(a.withdraw(600)));
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */