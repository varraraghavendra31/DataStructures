package StringPrograms;
public class ReverseTheWordsEndToStart {
		public static void main(String[] args) {
			String s = "java is easy";
			char[]a=s.toCharArray();
			String s2 = "";
			for(int i=a.length-1;i>=0;i--){
				int j=i;
				while(i>=0&&a[i]!=' ') {
					i--;
				}
				int k=i+1;
				while(k<=j) {
					s2+=a[k];
					k++;
				}
				s2+=" ";
			}
			System.out.println(s2);
			}
		}
