package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			String s = String.valueOf(i);  //59 -> "59" 
			
			int countClap = 0;
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if(c == '3' || c == '6' || c == '9') {
					countClap++;
				}
				
				if(countClap == 1) {
					System.out.println(i + " 짝");
				}
				if(countClap == 2) {
					System.out.println(i + " 짝짝");
				}
			}
		}
	}
}
