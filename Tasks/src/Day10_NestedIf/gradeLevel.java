package Day10_NestedIf;

public class gradeLevel {

        /*
        1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    For Any Other grade: Invalid grade level given
         */
        public static void main(String[] args) {
            byte number = 15;
            String gradeLevel = "";

            boolean validNumber = number >= 1 && number <= 18;

            if(validNumber){ // 1 ~ 18

                if(number >= 17){
                    gradeLevel = "Grad School";
                }else if(number >= 13 ){
                    gradeLevel = "College";
                }else if(number >= 9 ){
                    gradeLevel = "High School";
                }else if(number >= 6 ){
                    gradeLevel = "Middle School";
                }else if(number >= 1 ){
                    gradeLevel = "Elementary School";
                }

            }else{
                gradeLevel = "Invalid Grade Level";
            }


            System.out.println(gradeLevel);

String result="";
            for (int i = 1; i <=5 ; i++) {
                result+=i+",";
            }
            result= result.substring(0,result.length()-1);
            System.out.println(result);


            int a = 1;
            for (int i = 0; i < 4; i++) {

                System.out.print(a++ + ",");

            }System.out.print(a);







        }

    }


