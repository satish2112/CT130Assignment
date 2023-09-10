package Practic;

public class A {
public static void main(String[] args) {
	String s="satisjbsjkdsaduaduvdabjsxh";
	boolean visited[] = new boolean[s.length()];

	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
        if (visited[i] == true)
            continue; 
        int count = 1;
        for (int j = i + 1; j < ch.length; j++) {
            if (ch[i] == ch[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(ch[i] + " " + count);
    }

}	
}