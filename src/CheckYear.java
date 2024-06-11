public class CheckYear {
    public void checkyear(int year){
        if(year %4 == 0 && year%100 != 0){
            System.out.print("day la nam nhuan");
        }
        else if(year %400 ==0){
            System.out.print("day la nam nhuan");
        }
        else{
            System.out.print("day ko phai la nam nhuan");
        }
        }

    
}
