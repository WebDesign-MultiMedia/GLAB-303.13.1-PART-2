//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import  java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) {

        try{
            String location = "C:/Users/julio.salas/Downloads/CourseData.csv";
                    File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<course> data = new ArrayList<course>();

            while (input.hasNext()){
                String Line = input.nextLine();
                String[] splitedLine = Line.split(",");

                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name( splitedLine[1]);
                cObj.setInstructor_name(splitedLine[2]);

                data.add(cObj);
            }

            for (course c : data){
                System.out.println(c.getCode() + " | " + c.getCourse_name() + " | " + c.getInstructor_name());
                System.out.println("=====================================");
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }
}