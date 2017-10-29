
import java.io.File;
import java.io.FileNotFoundException;
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
public class TestReadAllFiles {

    @Test
    public void read() throws FileNotFoundException, IOException {
        File folder = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + ":    " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        Assert.assertEquals("File in: test Filesfolder=\n"
                + "File 1 :    MyThread1.java\n"
                + "File 2 :    MyThread2.java", "File in: test Filesfolder=\n"
                + "File 1 :    MyThread1.java\n"
                + "File 2 :    MyThread2.java");
    }

}
