package com.webautomation.tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjectClasses.Frames;

public class iFramesTest extends BaseClass {
  @Test
  public void Launchurl() throws Exception {
	  
	  Frames frame = new Frames(driver);
	 
	  frame.navigateToFramesPractice();
	  frame.EnterText("Prakash");
	  System.out.println("prakash");
	  
	  Thread.sleep(1000);
	  
	  frame.framehandling1();
	  System.out.println("Frame 1 switched ....");
	  
	  frame.Scroll();
	  System.out.println("Scroll  worked");
	  
	  Thread.sleep(1000);
	  
	  frame.dropdownValue("Java");
	  System.out.println("Java selected from dd");
	  
	  Thread.sleep(1000);
	  
	  frame.DefaultFrame();
	  System.out.println("Switched to default ");
	  
	  Thread.sleep(1000);
	  
	  frame.Clear();
	  System.out.println("Cleared text");
	  
	  Thread.sleep(1000);
	  
	  frame.EnterText("Prakash2");
	  System.out.println("entered Prakash 2 ");
	  
	  Thread.sleep(1000);
	  
	  frame.Scroll();
	  
	  frame.framehandling2();
	  System.out.println("Frame 2 switched ....");
	 
	  Thread.sleep(1000);
	  
	  frame.Frame2Fname("Boya Omprakash");
	  System.out.println("Frame 2 Firstname Entered ....");
	  
	  Thread.sleep(1000);
	  
	  frame.DefaultFrame();
	  
	  Thread.sleep(1000);
	  
	  frame.framehandling1();
	  System.out.println("again Frame 1 switched ....");
	  
	  Thread.sleep(1000);
	  
	  frame.dropdownValue("Dot Net");
	  System.out.println("Dot Net selected from dd");
	  
	  Thread.sleep(1000);
	  
	  frame.DefaultFrame();
	  System.out.println("Switched to main Document");
	  
	  Thread.sleep(1000);
	  
	  frame.EnterText("Prakash3");
	  System.out.println("text entered as prakash3......");
	  
	  Thread.sleep(1000);
	  
	  frame.framehandling3();
	  System.out.println(" Frame 3 switched ....");
	  
	  Thread.sleep(1000);
	  
	  frame.framehandling1();
	  System.out.println("Frame 1 switched ....");
	  
	  Thread.sleep(1000);
	  
	  frame.Scroll();
	  System.out.println("Scroll  worked");
	  
	  Thread.sleep(1000);
	  
	  frame.dropdownValue("Java");
	  System.out.println("Java selected from dd");
	  
	  Thread.sleep(1000);
	  
	  frame.ParentFrame();
	  System.out.println("Switched to Parent frame in frames 3");
	  
	  Thread.sleep(1000);
	  
	  frame.framehandling2();
	  System.out.println("Frame 2 switched ....in Frame3");
	  
	  Thread.sleep(1000);
	  
	  frame.Frame2Fname("Boya Omprakash");
	  System.out.println("Frame 2 Firstname Entered .... Frame3");
	  
	  Thread.sleep(1000);
	  
	  frame.DefaultFrame();
	  System.out.println("Switched to default ");
	  
	  Thread.sleep(1000);
	  
	  frame.Clear();
	  System.out.println("Cleared text");
	  
	  Thread.sleep(1000);
	  
	  frame.EnterText("Prakash3");
	  System.out.println("entered Prakash 3 ");
	  
	  Thread.sleep(3000);
	  
	  
	  
  }
}