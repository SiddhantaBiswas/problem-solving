import java.util.HashSet;
import java.util.Set;

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> set = new HashSet<>();
        for(int i: a) {
            set.add(i);
        }
        for(int i: b) {
            set.add(i);
        }
        return set.size();
    }
}