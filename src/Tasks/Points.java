package Tasks;

public class Points {
    public static void main(String[] args) {
        int i,j;
        String [] result = new String[5];
        int[][] points ={{3,5,3,1,2},{4,5,3,2,4},{5,5,3,2,1},{4,4,5,3,3},{5,5,5,3,1}};
        int [] summPoint = new int[5];
        String [] names = {"Roma","Nikolay","Vladimir","Andrey","Sergey"};
        for (i = 0; i <names.length ; i++) {
            for (j = 0; j <points[i].length ; j++) {
                summPoint[i] += points[i][j];
            }
            result[i] = names[i] + " " + summPoint[i];
            System.out.println(result[i]);
        }

    }
}
