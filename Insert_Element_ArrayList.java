import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Element_ArrayList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            al.add(sc.nextInt());
        }

//        Print ArrayList
        System.out.println(al);
    }
}
