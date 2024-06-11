import java.util.Scanner;

public class MaxInteger {
    public int FindMaxInteger(){
        //Tao scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so dau tien");
        int number1 = sc.nextInt();
        System.out.println("Moi ban nhap so thu 2");
        int number2 = sc.nextInt();
        System.out.println("Moi ban nhap so thu 3");
        int number3 = sc.nextInt();
        sc.close();


        int Max;
        Max = number1;
        if(number2 > Max){
            Max = number2;
        }
        if(Max < number3){
            Max = number3;
        }
        else{
            System.out.printf("so lon nhat la %d",Max);
        }
        return Max;


    }
    
}
