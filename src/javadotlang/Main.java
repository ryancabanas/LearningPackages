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
public class Main {
  public static void main(String[] args) {
//    /**
//     * Appendable Interface Test
//     */
//    AppendableInterfaceTest test = new AppendableInterfaceTest();
//    StringBuilder builder;
//    
//    // Append1
//    builder = (StringBuilder) test.Append1("yup", 'z');
//    System.out.println("Append1 does this: " + builder.toString());
//    
//    // Append2
//    builder = (StringBuilder) test.Append2("yup", new StringBuilder("pie"));
//    System.out.println("Append2 does this: " + builder.toString());
//    
//    // Append3
//    builder = (StringBuilder) test.Append3("yup", "xxpiexx", 2, 5);
//    System.out.println("Append3 does this: " + builder.toString());
    

    /**
     * Boolean Class Test
     */
//    BooleanClassTest test = new BooleanClassTest();
    
    //Fields
//    System.out.println(test.boo1.compareTo(Boolean.TRUE));
//    System.out.println(test.boo2.compareTo(Boolean.FALSE));
//    Class junk = Boolean.TYPE;
        
    // Constructors
//    System.out.println(test.boo1);
//    System.out.println(test.boo2);
//    System.out.println(test.boo3);
//    System.out.println(test.boo4);

    //Methods
//    System.out.println(test.boo1.booleanValue());
//    System.out.println(test.boo2.booleanValue());
//    System.out.println(test.boo3.booleanValue());
//    System.out.println(test.boo4.booleanValue());

//    System.out.println(test.boo1.compareTo(test.boo3));
//    System.out.println(test.boo2.compareTo(test.boo1));
//    System.out.println(test.boo1.compareTo(test.boo2));

//    System.getProperties().list(System.out);

//    System.out.println(Boolean.logicalAnd(true, true));
//    System.out.println(Boolean.logicalOr(true, false));
//    System.out.println(Boolean.logicalXor(true, true));

//    System.out.println(Boolean.parseBoolean("true"));
    
//    System.out.println(Boolean.valueOf("truer").toString());


    /**
     * Byte Class Test
     */
    
    // Fields
//    System.out.println(Byte.BYTES);
//    System.out.println(Byte.MAX_VALUE);
//    System.out.println(Byte.MIN_VALUE);
//    System.out.println(Byte.SIZE);
//    System.out.println(Byte.TYPE);
    
    // Methods
//    System.out.println(Byte.compare((byte) 25, (byte) 10));
    System.out.println(Byte.decode("011"));

  }
}

class BooleanClassTest {
  Boolean boo1 = new Boolean(false);
  Boolean boo2 = new Boolean(true);
  
  Boolean boo3 = new Boolean("bugs");
  Boolean boo4 = new Boolean("true");
  
}

class AppendableInterfaceTest {

  Appendable Append1(String startString, char addChar) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addChar);
    } catch (Exception e) {
    }

    return test;
  }
  
  Appendable Append2(String startString, CharSequence addCharSeq) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addCharSeq);
    } catch (Exception e) {
    }
    
    return test;
  }
  
  Appendable Append3(String startString, CharSequence addCharSeq, int start, int end) {
    Appendable test = new StringBuilder(startString);
    
    try {
      test.append(addCharSeq, start, end);
    } catch (Exception e) {
    }
    
    return test;
  }
}