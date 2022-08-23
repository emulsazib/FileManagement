package QuizMarksFile;

import java.util.ArrayList;

public class Quiz{
    private int id;
    private int marks;

    public Quiz(){
        this.id=0;
        this.marks=0;
    }

    public Quiz(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }


    public Integer getMarks() {
        return marks;
    }


    public long hightMarks(ArrayList obj){
        int max=(int)obj.get(0);
        for(int i=0; i< obj.size();i++){
            if((int)obj.get(i)>max) {
                max = (int) obj.get(i);
            }
        }
        return max;

    }
}
