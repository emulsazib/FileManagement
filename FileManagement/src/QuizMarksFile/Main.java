package QuizMarksFile;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File file=new File("marks.txt");


        ArrayList<Object> myObjs=new ArrayList<Object>();

        Quiz quiz;

        try {
            FileInputStream fos=new FileInputStream(file);
            ObjectInputStream oos=new ObjectInputStream(fos);


            while (( oos.readObject())!=null){
                myObjs.add(oos.readObject());
                System.out.println(myObjs);
            }
            System.out.println(myObjs);
            for(int i=0;i<myObjs.size();i++){
                System.out.println(myObjs.indexOf(i));
            }
            oos.close();
            fos.close();

        }catch (Exception e){
            System.out.println(e);
        }
        //incomplete

    }
}
