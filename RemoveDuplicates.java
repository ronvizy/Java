//Removing duplicate eleemnts from an array and returning a new Arraylist

import java.util.HashMap;
import java.util.ArrayList;

public class Solution{
  public static ArrayList<Integer> RemoveDuplicate(int arr[]){
		if(arr.length==0)
			return null;
    
		ArrayList<Integer> arList=new ArrayList<>();
		HashMap<Integer, Boolean> map=new HashMap<>();
    
    
		for(int i=0;i<arr.length;i++) {
      
			if(!map.containsKey(arr[i])) {
        
				map.put(arr[i], true);
				arList.add(arr[i]);
			}
		}
		return arList;
	}
  
  public static void main(String args[]){
    int arr[]= {1,2,3,2,2,3,1,4,5,6,7,8,8,7,5,1,6,2};

		ArrayList<Integer> arList=RemoveDuplicate(arr);
    
		for(int i=0;i<arList.size();i++) 
			System.out.print(arList.get(i)+" ");
    
  }
}
