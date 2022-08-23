package FileManageMent;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        File file=new File("data.txt");

        int nums;
        int sum=0;
        double avg;
        int count=0;
        try{
            FileWriter fileWriter=new FileWriter(file);

            do{
                System.out.print("Enter the Number: ");
                nums=input.nextInt();
                fileWriter.write(String.valueOf(nums));
                fileWriter.write(",");
                count++;
                sum+=nums;
            }while (nums>0);
            avg=sum/count;
            System.out.println("The sun is="+sum);
            System.out.println("The Avg is="+avg);
            fileWriter.write("\n");
            fileWriter.write("The Sum is: "+sum);
            fileWriter.write("\n");
            fileWriter.write("The Avg is: "+avg);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }






    }
}
