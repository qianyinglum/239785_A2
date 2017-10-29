/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054._a2;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class MainClass {

    public static void main(String[] args) throws IOException {
        ReadAllFiles raf = new ReadAllFiles();

        raf.read();
        CountComments cc = new CountComments();
        System.out.println("Calculate the comments in java files...");
        cc.blankLines();
        cc.blankLines2();
        System.out.println();

        ReadAllCourseInfo rci = new ReadAllCourseInfo();
        System.out.println();
        rci.ReadInfo();

        cc.readComments1();
        System.out.println();
        System.out.println();
        cc.readComments2();

        ScanFile sf = new ScanFile();
        System.out.println();
        System.out.println();
        sf.ReadFile();
        System.out.println();
        System.out.println("Search reserve word in MyThread1...");
        ReadReserveWord rrw = new ReadReserveWord();
        rrw.readAbstract();
        rrw.readAssert();
        rrw.readboolean();
        rrw.readbreak();
        rrw.readbyte();
        rrw.readcase();
        rrw.readcatch();
        rrw.readchar();
        rrw.readclass();
        rrw.readcontinue();
        rrw.readdefault();
        rrw.readdo();
        rrw.readdouble();
        rrw.readelse();
        rrw.readenum();
        rrw.readextends();
        rrw.readfinal();
        rrw.readfinally();
        rrw.readfloat();
        rrw.readfor();
        rrw.readif();
        rrw.readimplements();
        rrw.readimport();
        rrw.readinstanceof();
        rrw.readint();
        rrw.readinterface();
        rrw.readlong();
        rrw.readnative();
        rrw.readnew();
        rrw.readpackage();
        rrw.readprivate();
        rrw.readprotected();
        rrw.readpublic();
        rrw.readreturn();
        rrw.readshort();
        rrw.readstatic();
        rrw.readstrictfp();
        rrw.readsuper();
        rrw.readswitch();
        rrw.readsynchronized();
        rrw.readthis();
        rrw.readthrow();
        rrw.readthrows();
        rrw.readtransient();
        rrw.readtry();
        rrw.readvoid();
        rrw.readvolatile();
        rrw.readwhile();

        System.out.println("\n" + "\n" + "Search Reserve Word in MyThread2... ");
        ReadReserveWord2 rrw2 = new ReadReserveWord2();
        rrw2.readAbstract();
        rrw2.readAssert();
        rrw2.readboolean();
        rrw2.readbreak();
        rrw2.readbyte();
        rrw2.readcase();
        rrw2.readcatch();
        rrw2.readchar();
        rrw2.readclass();
        rrw2.readcontinue();
        rrw2.readdefault();
        rrw2.readdo();
        rrw2.readdouble();
        rrw2.readelse();
        rrw2.readenum();
        rrw2.readextends();
        rrw2.readfinal();
        rrw2.readfinally();
        rrw2.readfloat();
        rrw2.readfor();
        rrw2.readif();
        rrw2.readimplements();
        rrw2.readimport();
        rrw2.readinstanceof();
        rrw2.readint();
        rrw2.readinterface();
        rrw2.readlong();
        rrw2.readnative();
        rrw2.readnew();
        rrw2.readpackage();
        rrw2.readprivate();
        rrw2.readprotected();
        rrw2.readpublic();
        rrw2.readreturn();
        rrw2.readshort();
        rrw2.readstatic();
        rrw2.readstrictfp();
        rrw2.readsuper();
        rrw2.readswitch();
        rrw2.readsynchronized();
        rrw2.readthis();
        rrw2.readthrow();
        rrw2.readthrows();
        rrw2.readtransient();
        rrw2.readtry();
        rrw2.readvoid();
        rrw2.readvolatile();
        rrw2.readwhile();

        System.out.println();

        CountActualLines cal = new CountActualLines();
        cal.countActualLine();
        cal.countActualLine2();
        //cc.com();
        //cc.analyzeLine();
    }

}
