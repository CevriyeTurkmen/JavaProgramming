package week13_12_03_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {

        Instagram instagram=new Instagram(5.6);

        System.out.println(instagram);
        instagram.postPhoto();
        instagram.download();
        instagram.useTheApp(15);
    }
}
