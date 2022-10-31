import java.util.Scanner;
public class guessSecretNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Secret Number : ");
        // int n1=1213;
        int n1=s.nextInt();
        System.out.print("Enter Friend's Guess : ");
        // int n2=201;
        int n2=s.nextInt();
        int a1[]=new int[4];
        int a2[]=new int[4];
        int on=1000, k=0, x=0, y=0;
        while(on!=0){
            a1[k]=(n1/on)%10;
            a2[k]=(n2/on)%10;
            if(a1[k]==a2[k]){
                a1[k]=-1;a2[k]=-1;
                x++;
            }
            k++;
            on/=10;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a1[i]==a2[j] && a1[i]!=-1 && a2[j]!=-1){
                    a1[i]=-1;a2[j]=-1;
                    y++;
                }
            }
        }
        System.out.println("\n"+x+"P"+y+"R");
        s.close();
    }
}