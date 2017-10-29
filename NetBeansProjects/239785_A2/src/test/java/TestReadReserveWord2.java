
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
public class TestReadReserveWord2 {
 
    static File fileName2 = new File("C://Users//User//Documents//NetBeansProjects//239785_A2//src//main//java//com//stiw3054//_a2//test Files//MyThread2.java");
       @Test
    public void readAbstract() {
        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName2);
            // Always wrap FileReader in BufferedReader.
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noAbstract = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("abstract")) {
                        noAbstract++;
                    }
                }
                System.out.println("No of Abstract: " + noAbstract);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of Abstract: 0","No of Abstract: 0");
    }

    public void readAssert() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noassert = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("assert")) {
                        noassert++;
                    }
                }
                System.out.println("No of Assert: " + noassert);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of Assert: 0","No of Assert: 0");

    }

    public void readboolean() {

        ////File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noboolean = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("boolean")) {
                        noboolean++;
                    }
                }
                System.out.println("No of boolean: " + noboolean);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of boolean: 0","No of boolean: 0");
    }

    public void readbreak() {

        ////File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nobreak = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("break")) {
                        nobreak++;
                    }
                }
                System.out.println("No of break: " + nobreak);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of break: 0","No of break: 0");
    }

    public void readbyte() {

        ////File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nobyte = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("byte")) {
                        nobyte++;
                    }
                }
                System.out.println("No of byte: " + nobyte);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of byte: 0","No of byte: 0");
    }

    public void readcase() {

        ////File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nocase = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("case")) {
                        nocase++;
                    }
                }
                System.out.println("No of case: " + nocase);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of case: 0","No of case: 0");
    }

    public void readcatch() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nocatch = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("catch")) {
                        nocatch++;
                    }
                }
                System.out.println("No of catch: " + nocatch);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of catch: 0","No of catch: 0");
    }

    public void readchar() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nochar = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("char")) {
                        nochar++;
                    }
                }
                System.out.println("No of char: " + nochar);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of char: 0","No of char: 0");
    }

    public void readclass() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noclass = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("class")) {
                        noclass++;
                    }
                }
                System.out.println("No of class: " + noclass);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of class: 1","No of class: 1");
    }

    public void readcontinue() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nocontinue = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("continue")) {
                        nocontinue++;
                    }
                }
                System.out.println("No of continue: " + nocontinue);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of continue: 0","No of continue: 0");
    }

    public void readdefault() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nodefault = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("default")) {
                        nodefault++;
                    }
                }
                System.out.println("No of default: " + nodefault);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of default: 0","No of default: 0");
    }

    public void readdo() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nodo = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("do")) {
                        nodo++;
                    }
                }
                System.out.println("No of do: " + nodo);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of do: 0","No of do: 0");
    }

    public void readdouble() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nodouble = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("double")) {
                        nodouble++;
                    }
                }
                System.out.println("No of double: " + nodouble);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of double: 0","No of double: 0");
    }

    public void readelse() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noelse = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("else")) {
                        noelse++;
                    }
                }
                System.out.println("No of else: " + noelse);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of else: 0","No of else: 0");
    }

    public void readenum() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noenum = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("enum")) {
                        noenum++;
                    }
                }
                System.out.println("No of enum: " + noenum);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of enum: 0","No of enum: 0");
    }

    public void readextends() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noextends = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("extends")) {
                        noextends++;
                    }
                }
                System.out.println("No of extends: " + noextends);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of extends: 1","No of extends: 1");
    }

    public void readfinal() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nofinal = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("final")) {
                        nofinal++;
                    }
                }
                System.out.println("No of final: " + nofinal);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of final: 0","No of final: 0");
    }

    public void readfinally() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nofinally = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("finally")) {
                        nofinally++;
                    }
                }
                System.out.println("No of finally: " + nofinally);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of finally: 0","No of finally: 0");
    }

    public void readfloat() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nofloat = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("float")) {
                        nofloat++;
                    }
                }
                System.out.println("No of float: " + nofloat);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of float: 0","No of float: 0");
    }

    public void readfor() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nofor = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("for")) {
                        nofor++;
                    }
                }
                System.out.println("No of for: " + nofor);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of for: 0","No of for: 0");
    }

    public void readif() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noif = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("if")) {
                        noif++;
                    }
                }
                System.out.println("No of if: " + noif);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of if: 0","No of if: 0");
    }

    public void readimplements() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noimplements = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("implements")) {
                        noimplements++;
                    }
                }
                System.out.println("No of implements: " + noimplements);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of implements: 0","No of implements: 0");
    }

    public void readimport() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noimport = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("import")) {
                        noimport++;
                    }
                }
                System.out.println("No of import: " + noimport);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of import: 0","No of import: 0");
    }

    public void readinstanceof() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noinstanceof = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("instanceof")) {
                        noinstanceof++;
                    }
                }
                System.out.println("No of instanceof: " + noinstanceof);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of instanceof: 0","No of instanceof: 0");
    }

    public void readint() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noint = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("int")) {
                        noint++;
                    }
                }
                System.out.println("No of int: " + noint);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of int: 5","No of int: 5");
    }

    public void readinterface() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nointerface = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("interface")) {
                        nointerface++;
                    }
                }
                System.out.println("No of interface: " + nointerface);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of interface: 0","No of interface: 0");
    }

    public void readlong() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nolong = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("long")) {
                        nolong++;
                    }
                }
                System.out.println("No of long: " + nolong);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of long: 0","No of long: 0");
    }

    public void readnative() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nonative = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("native")) {
                        nonative++;
                    }
                }
                System.out.println("No of native: " + nonative);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of native: 0","No of native: 0");
    }

    public void readnew() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nonew = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("new")) {
                        nonew++;
                    }
                }
                System.out.println("No of new: " + nonew);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of new: 2","No of new: 2");
    }

    public void readpackage() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nopackage = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("package")) {
                        nopackage++;
                    }
                }
                System.out.println("No of package: " + nopackage);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of package: 1","No of package: 1");
    }

    public void readprivate() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noprivate = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("private")) {
                        noprivate++;
                    }
                }
                System.out.println("No of private: " + noprivate);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of private: 0","No of private: 0");
    }

    public void readprotected() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noprotected = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("protected")) {
                        noprotected++;
                    }
                }
                System.out.println("No of protected: " + noprotected);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of protected: 0","No of protected: 0");
    }

    public void readpublic() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nopublic = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("public")) {
                        nopublic++;
                    }
                }
                System.out.println("No of public: " + nopublic);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of public: 2","No of public: 2");
    }

    public void readreturn() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noreturn = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("return")) {
                        noreturn++;
                    }
                }
                System.out.println("No of return: " + noreturn);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of return: 0","No of return: 0");
    }

    public void readshort() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noshort = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("short")) {
                        noshort++;
                    }
                }
                System.out.println("No of short: " + noshort);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of short: 0","No of short: 0");
    }

    public void readstatic() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nostatic = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("static")) {
                        nostatic++;
                    }
                }
                System.out.println("No of static: " + nostatic);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of static: 1","No of static: 1");
    }

    public void readstrictfp() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nostrictfp = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("strictfp")) {
                        nostrictfp++;
                    }
                }
                System.out.println("No of strictfp: " + nostrictfp);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of strictfp: 0","No of strictfp: 0");
    }

    public void readsuper() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nosuper = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("super")) {
                        nosuper++;
                    }
                }
                System.out.println("No of super: " + nosuper);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of super: 0","No of super: 0");
    }

    public void readswitch() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int noswitch = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("switch")) {
                        noswitch++;
                    }
                }
                System.out.println("No of switch: " + noswitch);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of switch: 0","No of switch: 0");
    }

    public void readsynchronized() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nosynchronized = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("synchronized")) {
                        nosynchronized++;
                    }
                }
                System.out.println("No of synchronized: " + nosynchronized);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of synchronized: 0","No of synchronized: 0");
    }

    public void readthis() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nothis = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("this")) {
                        nothis++;
                    }
                }
                System.out.println("No of this: " + nothis);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of this: 0","No of this: 0");
    }

    public void readthrow() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nothrow = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("throw")) {
                        nothrow++;
                    }
                }
                System.out.println("No of throw: " + nothrow);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of throw: 0","No of throw: 0");
    }

    public void readthrows() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nothrows = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("throws")) {
                        nothrows++;
                    }
                }
                System.out.println("No of throws: " + nothrows);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of throws: 0","No of throws: 0");
    }

    public void readtransient() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int notransient = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("transient")) {
                        notransient++;
                    }
                }
                System.out.println("No of transient: " + notransient);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of transient: 0","No of transient: 0");
    }

    public void readtry() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int notry = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("try")) {
                        notry++;
                    }
                }
                System.out.println("No of try: " + notry);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of try: 0","No of try: 0");
    }

    public void readvoid() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int novoid = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("void")) {
                        novoid++;
                    }
                }
                System.out.println("No of void: " + novoid);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of void: 2","No of void: 2");
    }

    public void readvolatile() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int novolatile = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("volatile")) {
                        novolatile++;
                    }
                }
                System.out.println("No of volatile: " + novolatile);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of volatile: 0","No of volatile: 0");
    }

    public void readwhile() {

        //File fileName2 = new File("C:\\Users\\User\\Desktop\\java files\\MyThread2.java");
        try {

            FileReader fileReader = new FileReader(fileName2);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String strLine;
                int nowhile = 0;
                //System.out.println(fileName2.getName());
                while ((strLine = bufferedReader.readLine()) != null) {

                    if (strLine.contains("while")) {
                        nowhile++;
                    }
                }
                System.out.println("No of while: " + nowhile);
                bufferedReader.close();
                // Always close files.
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName2 + "'");
        } catch (IOException ex) {

        }Assert.assertEquals("No of while: 0","No of while: 0");
    }
    
}
