package week09_11_05_2022;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[][] twoDimenArray = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(twoDimenArray[2][2]);

        for (int i = 0; i <twoDimenArray.length ; i++) {
            for (int j = 0; j < twoDimenArray[i].length; j++) {

                System.out.print(twoDimenArray[i][j]);
            }


        }









    }
}