public class Equation {
    public void CalcukateQuadratic(int a, int b, int c){
        if (a == 0 && b == 0 && c == 0) {
            System.out.println(" PT vo so nghiem");
        }
        else if (a == 0 && b == 0) {
            System.out.println(" PT vo nghiem");
        } else if (a == 0) {
            double answer = (double) -c / b;
            System.out.println("pt co mot nghiem: " + answer);
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("pt vo nghiem");
            } else if (delta == 0) {
                double answer = (double) -b / (2 * a);
                System.out.println("pt co nghiem kep la: " + answer);
            } else {
                double answer1 = (-b + Math.sqrt(delta)) / (2 * a);
                double answer2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("pt co 2 nghiem khac biet: " + answer1 + " và " + answer2);
            }
        }
    }

}

