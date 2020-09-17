package h5.Greatest;

public class GreatestChecker {

    //methode waarbij twee ints worden verwacht
    public int greatest(int i, int j) {
        if (i < j) return j;
        else return i;
    }

    //methode waarbij 2 Strings worden verwacht
    public int greatest(String si, String sj){
        if (si.length() < sj.length()) return sj.length();
        else return si.length();
    }

    //methode waarbij een een variabel (onbekend aantal ints wordt verwacht
    public int greatest(int... nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public int factorial(int num) {
        if (num == 1) return 1; //stopconditie
        else return num * factorial(num -1); //de recursion
    }
}
