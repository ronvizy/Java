//You are given an array of integers that contain numbers in random order. 
//Write a program to find and return the number which occurs the maximum times in the given input.
//If two or more elements contend for the maximum frequency, return the element which occurs in the array first.

public static int maxCount(int arr[]) { 
		ArrayList<Integer> arList=new ArrayList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				int value=map.get(arr[i]);
				value++;
				map.put(arr[i], value);
			}
			else{
				map.put(arr[i], 1);
				arList.add(arr[i]);
			}
		}
		int maxcount=map.get(arList.get(0));
		int item=arList.get(0);
		for(int i=0;i<arList.size();i++){
			int count=map.get(arList.get(i));
			if(count>maxcount){
				maxcount=count;
				item=arList.get(i);
			}
		}
		return item;
		
	}
