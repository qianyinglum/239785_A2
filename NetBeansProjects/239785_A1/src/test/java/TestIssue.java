
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class TestIssue {

    @Test

    public void testIssue() throws IOException, FileNotFoundException {
        File dir = new File("C://Users//User//Documents//NetBeansProjects//239785_A1//src//main//java//com//stiw3054//_a1//files//New folder");
        File[] filesInDir = dir.listFiles();
        ArrayList list = new ArrayList();
        ArrayList<File> li = new ArrayList();
        ArrayList<String> word = new ArrayList();
        String strLine;
        int count = 0;
        int notCount = 0;

        for (File listIssue : filesInDir) {

            if (listIssue.isFile()) {
                if (listIssue.getName().endsWith(".java")) {
                    li.add(listIssue.getAbsoluteFile());
                    count++;

                    System.out.println(listIssue.getName());

                }

            }

        }
        System.out.println("Total Number Of Java Files is: " + count);

//==========================================================================
        for (File newFile : filesInDir) {
            int i = 0;

            BufferedReader br = new BufferedReader(new FileReader(newFile));

            while ((strLine = br.readLine()) != null) {

                if (strLine.contains("main")) {

                    word.add(strLine.toString());
                    count++;

                }

            }
            br.close();

        }
        System.out.println(word + "\t");
        Assert.assertEquals("[    public static void main(String[] args) {,     public static void main(String args[]) throws Exception {,     public static void main(String[] args) {]	", "[    public static void main(String[] args) {,     public static void main(String args[]) throws Exception {,     public static void main(String[] args) {]	");
    }

}
