package EmployeeFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file=new File("employee.txt");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            Employee e1=new Employee("Sazib",2121460);
            oos.writeObject(e1);
            Employee e2=new Employee("Shawon",2121461);
            oos.writeObject(e2);
            Employee e3=new Employee("Ena",2121462);
            oos.writeObject(e3);
            oos.close();

            //deserializable
            Employee obj,obj1,obj2;
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            obj=(Employee) ois.readObject();
            System.out.println("The Name of the Object: "+obj.getName());
            System.out.println("The ID of the Object: "+obj.getId());
            System.out.println("________________000________________");
            obj1=(Employee)ois.readObject();
            System.out.println("The Name of the Object: "+obj1.getName());
            System.out.println("The ID of the Object: "+obj1.getId());
            System.out.println("________________000________________");
            obj2=(Employee)ois.readObject();
            System.out.println("The Name of the Object: "+obj2.getName());
            System.out.println("The ID of the Object: "+obj2.getId());

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
