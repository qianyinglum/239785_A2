
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class TestReadAllCourseInfo {
    

    public String path;
    //static File fileName = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread1.java");
    // static File fileName2 = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread2.java");
@Test
    public void ReadInfo() throws FileNotFoundException, IOException {
        // The name of the file to open.
        File folder = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                //System.out.println("File " + (i + 1) + ":    " + listOfFiles[i].getName());
            } else if (file.isDirectory()) {
                //System.out.println("Directory " + listOfFiles[i].getName());
            }

            // This will reference one line at a time
            try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader = new FileReader(file);
                // Always wrap FileReader in BufferedReader.
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    String strLine;
                    //String a = folder.listFiles();
                    System.out.println(" List All Comments in " + file.getName() + " : ");
                    while (file.isFile()) {
                        while ((strLine = bufferedReader.readLine()) != null) {
                            if (strLine.startsWith("//")) {
                                String s = strLine;
                                System.out.println(s.substring(2));

                            }
                        }
                        System.out.println("\n");
                        bufferedReader.close();
                        // Always close files.
                    }
                }
            } catch (FileNotFoundException ex) {
                //System.out.println("Unable to open file ");
            } catch (IOException ex) {
                //System.out.println("Error reading file '");
                // Or we could just do this: 
                // ex.printStackTrace();
            }

        }
        Assert.assertEquals("Error reading fileMyThread1.java\n"
                + " List All Comments in MyThread2.java : \n"
                + "Semester: #A171\n"
                + "Course: #STIW3054\n"
                + "Group: #A\n"
                + "Task: #Assignment1\n"
                + "Matrik: #123456\n"
                + "Name: #Ali bin Abu Bakar\n"
                + "How to start thread\n"
                + "\n"
                + "\n"
                + "Error reading file MyThread2.java\n"
                + "Course Information in  MyThread1.java\n"
                + "Semester: #A171\n"
                + "Course: #STIW3054\n"
                + "Group: #A\n"
                + "Task: #Assignment1\n"
                + "Matrik: #898989\n"
                + "End ....\n"
                + "", "Error reading fileMyThread1.java\n"
                + " List All Comments in MyThread2.java : \n"
                + "Semester: #A171\n"
                + "Course: #STIW3054\n"
                + "Group: #A\n"
                + "Task: #Assignment1\n"
                + "Matrik: #123456\n"
                + "Name: #Ali bin Abu Bakar\n"
                + "How to start thread\n"
                + "\n"
                + "\n"
                + "Error reading file MyThread2.java\n"
                + "Course Information in  MyThread1.java\n"
                + "Semester: #A171\n"
                + "Course: #STIW3054\n"
                + "Group: #A\n"
                + "Task: #Assignment1\n"
                + "Matrik: #898989\n"
                + "End ....\n"
                + "");

    }
}
