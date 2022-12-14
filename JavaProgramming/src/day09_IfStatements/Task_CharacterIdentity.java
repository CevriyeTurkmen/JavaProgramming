package day09_IfStatements;

public class Task_CharacterIdentity {
    public static void main(String[] args) {
/*Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table

 */
char character= '!';

if (character>=33&&character<=47) {System.out.println(character+"=Special Character");} else if (character>=48&&character<=57) {
    System.out.println(character+" = Digit");} else if (character>=65&&character<=90) {
    System.out.println(character+ "= Alphabetic");
    
}

    }

    }