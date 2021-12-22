public class ATM {
    public int countBanknotes(int sum){
        int result = 0;
        int [] banknotes = new int []{500, 200, 100, 50, 20, 10 ,5,2,1};
        int i = 0;
        while(sum != 0) {
            if(sum - banknotes[i] >=0) {
                sum = sum - banknotes[i];
                result++;
            }else if (sum < banknotes[i]) {
                i ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ATM banknotes = new ATM();
        System.out.println(banknotes.countBanknotes(547));
    }
}
