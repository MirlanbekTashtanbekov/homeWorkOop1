public class Triangle {

    double a;
    double b;
    double c;

    public void area(){
        double p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);
        System.out.println("Площадь треугольника: "+Math.sqrt(s));
    }





}
