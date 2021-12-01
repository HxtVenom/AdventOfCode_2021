import java.util.*;
import java.io.*;

public class Solution {
  
  public static void main(String[] args){
    File file = new File("in.txt");
    Scanner sc;

    try{
      sc = new Scanner(file);
    }catch(FileNotFoundException ex){
      System.out.println("FUCK");
      return;
    }

    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    while(sc.hasNextLine()){
      nums.add(sc.nextInt());
    }

    int count = 0;
    int previous = nums.get(0) + nums.get(1) + nums.get(2);
    int curr = previous;
    int len = nums.size();

    for(int i = 1; i <= len - 3; i++){
      curr -= nums.get(i - 1);
      curr += nums.get(i + 2); 

      if(curr > previous){
        count++;
      }

      previous = curr;
    }

    System.out.println("Count: " + count);
  }
}