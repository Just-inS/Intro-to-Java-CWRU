package com.myproject.jframes;
import javax.swing.JFrame;

public class GeometricFrame extends JFrame{

    public static void main(String[] args) {
        System.out.println("Hello, World");
    }

    // flip the height and width of the window
    public void transpose(){
        this.setSize(this.getHeight(), this.getWidth());
    }

    // scale the size of the window by a scaling factor
    public void scale(double factor){
         this.setSize((int)(this.getWidth() * factor), (int)(this.getHeight() * factor));
    }

    // determine if this window has the same area as the input window
    public boolean sameAreaAs(JFrame frame){
        return (frame.getWidth() * frame.getHeight()) == (this.getWidth() * this.getHeight());
    }

}
