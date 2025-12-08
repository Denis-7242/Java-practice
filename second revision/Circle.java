class Circle{
    int radius;
    void getData(int radius){
        this.radius = radius;
    }
    int CircleArea(){
        int area= (int)(3.14 * radius * radius);
        return (area);
       
    }
}
class CircleArea{
    public static void main(String args[]){ 
        int area1, area2;
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.radius = 7;
        area1 = (int)(3.14 * circle1.radius * circle1.radius);
        circle2.getData(10);
        area2 = circle2.CircleArea();
        System.out.println("Area of circle 1: " + area1);
        System.out.println("Area of circle 2: " + area2);
    
    }
}
