package Projects.Projects_02;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */




    public static void main(String[] args) {
        int[][] number = new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min = 10000 ;
        for( int i = 0 ; i < number.length ; i++){
            for(int j =0 ; j< number[i].length ; j++){

                if(number[i][j] < min){
                    min = number[i][j];
                }
            }

        }

        System.out.println(min);


}

}
