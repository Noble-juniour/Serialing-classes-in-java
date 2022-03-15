package serializing_class_in_javapartc;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        Car c = new Car("G4SZ233454", "BMW", "Forester", "pirple", 2025);
        
        try{
        FileOutputStream outFile = new FileOutputStream("myotherpractice.dat");
        ObjectOutputStream out = new  ObjectOutputStream(outFile);
        out.writeObject(c);
        out.close();
        outFile.close();
                }
        catch(IOException e)
        {
        System.err.println("ERROR");
                }
    }
    
}
