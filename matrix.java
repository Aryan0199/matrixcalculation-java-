package matrix;

public class Matrix {
    public static void main(String[] args){
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {     //Generation of addition matrix
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }

        }

        for (int i = 0; i < 3; i++) {   //Generation of Multiplication matrix
            int m=0;
            for (int j = 0; j < 3; j++) {
                d[i][j]=(a[i][0]*b[0][m])+(a[i][1]*b[1][m])+(a[i][2]*b[2][m]);
                m++;
            }

        }
        System.out.println("Addition Matrix");
        for (int k=0;k<3;k++){
            for (int l=0;l<3;l++){
                System.out.print(c[k][l]+" ");
            }
            System.out.print("\n");

        }
        System.out.println("Multiplication matrix");
        for (int k=0;k<3;k++){
            for (int l=0;l<3;l++){
                System.out.print(d[k][l]+" ");
            }
            System.out.print("\n");

        }
    }
}
