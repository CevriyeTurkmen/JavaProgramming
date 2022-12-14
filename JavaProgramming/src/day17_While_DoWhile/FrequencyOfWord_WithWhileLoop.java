package day17_While_DoWhile;

public class FrequencyOfWord_WithWhileLoop {
    public static void main(String[] args) {
    String str="Java Java Python Python";
    int frequency=0;

    while (str.contains("Java")){
        str=str.replaceFirst("Java"," ");
        frequency++;
    }
        System.out.println(frequency);

    String str1= "cat cat cat dog dog cat cat";
    int frequency1=0;

    while (str1.contains("cat")){
        str1=str1.replaceFirst("cat","");
        frequency1++;
    }
        System.out.println(frequency1);











    }
}
