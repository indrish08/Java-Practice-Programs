package D25_08_22;
public class magicSquareOrNot {
    public static void main(String[] args) {
        int a[][]= {{2,7,6},{9,5,1},{4,3,8}}; //new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int s=0, s1=0;
        int val=a[0][0]+a[0][1]+a[0][2];
        for(int i=0;i<3;i++){
            s=0; s1=0;
            for(int j=0;j<3;j++){
                s+=a[i][j];
                s1+=a[j][i];
            }
            if(s!=val || s1!=val){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
