//the first method, very low;find one solution
/*
*4Sum
*3Sum Smaller
*3Sum Closest
*3Sum
*Two Sum III - Data structure design 
*Two Sum II - Input array is sorted
*

public class two_sum_1{
	public static void main(String[] args){
	int arr[] = {1,2,3,4,5,6,7,8,9};
		int var = 10;
		int res1=0,res2=0,i=0,j=0;
		labe:for(i = 0;i <= arr.length;i++){
			for(j = 1;j<= arr.length;j++){
				if(arr[i]+arr[j] == var){
					res1 = i;
					res2 = j;
					break labe;
				}
			}
		}
		System.out.println("["+res1+","+res2+"]");
		System.out.println("["+i+","+j+"]");
	}
}
*/


//the second method, may be higher but not very satisfiable. find all the solutions.
/*
public class two_sum_1{
	public static void main(String[] args){
	int arr[] = {1,2,3,4,5,6,7,8,9};
		int var = 10;
		int i=0,j=0;
		for(i = 0;i <= arr.length;i++){
			for(j = 1;j<= arr.length;j++){
				if(arr[i]+arr[j] == var){
					System.out.println("["+i+","+j+"]");
					break;
				}
			}
		}

	}
}
*/

//the third method, https://www.cnblogs.com/grandyang/p/4130379.html
class Solution{
	public int[] twoSum(int[] nums,int target){
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>;
		int[] res = new int[2];
		for(int i = 0;i<nums.length;++i){
			m.put(nums[i],i);
		}
		for(int i = 0;i<nums.length;i++){
			int t = target-nums[i];
		if(m.containsKey(t)&&m.get(t) !=i){
			res[0] = i;
			res[1] =m.get(t);
			break;
			}
		}
		return res;
	}
}
