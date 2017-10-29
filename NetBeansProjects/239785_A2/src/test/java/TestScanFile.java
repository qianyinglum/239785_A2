
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
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
public class TestScanFile {

    final String folderPath = "C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files";

    @Test
    public void ReadFile() throws FileNotFoundException {

        long totalLineCount = 0;
        final List<File> folderList = new LinkedList<>();
        folderList.add(new File(folderPath));

        while (!folderList.isEmpty()) {
            final File folder = folderList.remove(0);
            if (folder.isDirectory() && folder.exists()) {
                System.out.println("Scanning files in " + "'" + folder.getName() + "'" + " folder");
                final File[] fileList = folder.listFiles();
                for (final File file : fileList) {
                    if (file.isDirectory()) {
                        folderList.add(file);
                    } else if (file.getName().endsWith(".java")) {
                        long lineCount = 0;
                        final Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            scanner.nextLine();
                            lineCount++;
                        }

                        totalLineCount += lineCount;
                        final String lineCountString;

                        if (lineCount > 99999) {
                            lineCountString = "" + lineCount;
                        } else {
                            final String temp = ("     " + lineCount);
                            lineCountString = temp.substring(temp.length() - 5);
                        }
                        System.out.println("Total" + lineCountString + " lines in " + file.getName());
                    }
                }
            }
        }
        System.out.println("Scanning......");
        System.out.println("" + "Scan Complete for all files : " + totalLineCount + " lines total in all files");
        Assert.assertEquals("Scanning files in 'test Files' folder\n"
                + "Total   24 lines in MyThread1.java\n"
                + "Total   30 lines in MyThread2.java\n"
                + "Scanning......\n"
                + "Scan Complete for all files : 54 lines total in all files", "Scanning files in 'test Files' folder\n"
                + "Total   24 lines in MyThread1.java\n"
                + "Total   30 lines in MyThread2.java\n"
                + "Scanning......\n"
                + "Scan Complete for all files : 54 lines total in all files");
    }

}
