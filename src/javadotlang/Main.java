/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;

/**
 *
 * @author Ryan Cabanas
 */
class AppendableInterfaceTest {

  Appendable Append1(String startString, char addChar) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addChar);
    } catch (Exception e) {
    }

    return test;
  }
  
  Appendable Append2(String startString, String addString) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addString);
    } catch (Exception e) {
    }
    
    return test;
  }
  
  Appendable Append3(String startString, String addString, int start, int end) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addString, start, end);
    } catch (Exception e) {
    }
    
    return test;
  }  
  
  public static void main(String[] args) {
    AppendableInterfaceTest test = new AppendableInterfaceTest();
    StringBuilder builder;
    
    // Append1
    builder = (StringBuilder) test.Append1("yup", 'z');
    System.out.println("Append1 does this: " + builder.toString());
    
    // Append2
    builder = (StringBuilder) test.Append2("yup", "pie");
    System.out.println("Append2 does this: " + builder.toString());
    
    // Append3
    builder = (StringBuilder) test.Append3("yup", "xxpiexx", 2, 5);
    System.out.println("Append3 does this: " + builder.toString());
  }
}