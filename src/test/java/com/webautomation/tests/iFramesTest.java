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
	  frame.framehandling1();
	  System.out.println("Frame 1 switched ....");
	  frame.Scroll();
	  System.out.println("Scroll  worked");
	  frame.dropdownValue("Java");
	  System.out.println("Java selected from dd");
	  frame.DefaultFrame();
	  System.out.println("Switched to default ");
	  frame.Clear();
	  System.out.println("Cleared text");
	  frame.EnterText("Prakash2");
	  System.out.println("entered Prakash 2 ");
	  
	  frame.Scroll();
	  
	  frame.framehandling2();
	  System.out.println("Frame 2 switched ....");
	 
	  Thread.sleep(3000);
	  
	  frame.Frame2Fname("Boya Omprakash");
	  System.out.println("Frame 2 Firstname Entered ....");
	  
	  frame.DefaultFrame();
	  
	  frame.framehandling1();
	  System.out.println("again Frame 1 switched ....");
	  
	  frame.dropdownValue("Dot Net");
	  System.out.println("Dot Net selected from dd");
	  
	  frame.DefaultFrame();
	  System.out.println("Switched to main Document");
	  
	  frame.EnterText("Prakash3");
	  System.out.println("text entered as prakash3......");
	  
	  
  }
}