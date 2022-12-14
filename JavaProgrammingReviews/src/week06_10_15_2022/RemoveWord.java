package week06_10_15_2022;

public class RemoveWord {
    public static void main(String[] args) {
String word="Adamm";
int index=3;
String temp="";

if (index>=word.length()||index<0){
    System.out.println("invalid");
}else {
    for (int i = 0; i <word.length() ; i++) {
        if (index==i)
            continue;
        temp+=word.charAt(i);
        
    }

}System.out.println(temp);





















    }
}
