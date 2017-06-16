
package Act4;


public class Rectangle {
    double length;
    double width;
    //constructor starts here:
    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }
    Rectangle(double length){
        this.length = length;
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length, int width){
        this.width = width;
        this.length = length;
        System.out.println("Third Constructor Loaded");
    }
   //Methods starts here:
    //getter of length
    double getLength(){
        return this.length;
    }
    double getWidth(){
        return this.width;
    }
    //setter of length
    void setLength(double length){
        this.length = length;
    }
    void setWidth(double width){
        this.width = width;
    }
    //Method display area
  //procedural method displayArea
    void displayArea(){
        double area = this.length * this.width;
        System.out.printf("Area: %.2f\n", area);
    }
    //functional method displayArea
    double display_Area(){
        double area = this.length * this.width;
        return area;
    }
}
