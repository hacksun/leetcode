import java.util.*

class solution{
	public String findSubString(String in){
		int length = in.length(in)-1;
		String tmp = new String();
		for(int i = 0;i<=length;i++){
			if(in.substring(0,i).contains(in.charAt(i+1))){
				continue;
			}
			else{
				tmp = in.substring(0,i+1);
			}
		}
		return tmp;
	}
}



public class Find_SubString_3{
	public static void main(String[] args){
		String result;
		String in  = new String("abcabcbb");
		solution ex = new solution();
		result = ex.findSubString(in);
		System.out.println(result);
	}
}