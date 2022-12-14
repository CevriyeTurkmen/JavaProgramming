package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String result="";
String browserName= "Chrome";
boolean validBrowser=browserName=="Chrome"||browserName=="firefox"||browserName=="safari"
        ||browserName=="edge"||browserName=="opera";

if (validBrowser){
    if(browserName=="Chrome"){
        result="Chrome Browser is selected";}
        if (browserName=="firefox"){
            result="Firefox Browser is selected";
        }if (browserName=="opera"){
            result="opera Browser is selected";
    }

}else System.out.println("invalid");
        System.out.println(result);





















    }
}
