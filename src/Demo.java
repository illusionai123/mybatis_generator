
public class Demo {
	public static void main(String[] args) {
		String  str= "98765432";
		String newStr = ""; //生成的新数字
		String str2 = "";//暂存变量
		for (int i = 0; i < str.length(); i++) {
			str2 = str.substring(i, i+1);
			
			if(Integer.parseInt(str2)%2==0){
				newStr += str2;
			}
		}
		System.out.println(newStr);
	}
}
