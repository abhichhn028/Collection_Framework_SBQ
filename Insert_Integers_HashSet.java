import java.util.HashSet;
import java.util.Scanner;

public class Insert_Integers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();

//        Store 10 integers in HashSet with the help of foe loop

        for(int i=0;i<10;i++)
        {
            hs.add(in.nextInt());
        }

//        Print Hashset
        System.out.println(hs);
    }
}
