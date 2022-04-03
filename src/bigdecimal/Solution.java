package bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    //Input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    for(int i=0;i<n;i++){
      s[i]=sc.next();
    }
    sc.close();
    Comparator<String> comparator = (o1, o2) -> {
      if(o1 == null || o2 == null){
        return 0;
      }
      BigDecimal b1 = new BigDecimal(o1);
      BigDecimal b2 = new BigDecimal(o2);
      int i = b1.compareTo(b2);
      if(i > 0){
        return -1;
      }
      else if(i < 0){
        return 1;
      }
      return i;
    };
    Arrays.sort(s, comparator);

    //Output
    for(int i=0;i<n;i++)
    {
      System.out.println(s[i]);
    }
  }
}
