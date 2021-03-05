
package edu.ru.lab06;

public class Rectangle {
    
    
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void draw(){
        for (int i = 0; i<height; i++){
            for (int j = 0; i<width; j++){
                System.out.print("i");
                
            }
            System.out.println("");
        }
    }
    
    
}
