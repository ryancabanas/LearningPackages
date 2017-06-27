/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadotlang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 *
 * @author Ryan Cabanas
 */
public class Main extends ClassLoader {
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
//    System.out.println(Byte.decode("011"));
//    System.out.println(Byte.parseByte("11", 9));
//    System.out.println((int) Math.pow(2, 8));
//    System.out.println(Byte.toUnsignedInt((byte) -1));
//    System.out.println(Byte.toUnsignedInt((byte) 255));


    /**
     * Character Class Testing
     */
//    System.out.println(Integer.parseInt("FFFF", 16)); // Unicode code unit upper limit
//    System.out.println(Integer.parseInt("10FFFF", 16)); // Unicode code point upper limit
    
//    System.out.println(Character.BYTES); // 2 bytes because Java uses UTF-16 encoding
//    System.out.println(Integer.toHexString(Character.MAX_CODE_POINT));
//    System.out.println(Character.MAX_RADIX);
//    System.out.println(Character.MIN_RADIX);
//    System.out.println(Character.SIZE);
//    System.out.println(Character.charCount(65535));
//    System.out.println(Character.charCount(65536));

//    System.out.println(Integer.toHexString(Character.codePointBefore("dog", 2)));
//    System.out.println(Character.compare('a', 'c'));
//    System.out.println(Character.digit('A', 16)); // Tells you what digit a char is in that radix
//    System.out.println(Character.digit(65, 16)); // Tells you the digit of a code point in that radix
//    System.out.println(Character.forDigit(10, 16));
//    System.out.println(
//            Byte.compare(Character.getDirectionality('A'), Character.DIRECTIONALITY_RIGHT_TO_LEFT));
//    System.out.println(Character.getName(65));
//    System.out.println(Character.getNumericValue('G'));
//    System.out.println(Character.getType('b'));
//    System.out.println(Character.isAlphabetic(Character.codePointAt("C", 0)));
//    System.out.println(Character.isDigit('4'));
//    System.out.println(Character.isSpaceChar(' '));
//    System.out.println(Character.isWhitespace(' '));
//    System.out.println(Character.reverseBytes('G'));
//    System.out.println(Character.reverseBytes('䜀'));
//    System.out.println(Character.toTitleCase('b'));


    /**
     * Class Class Testing
     */
//    System.out.println(new String().getClass().getName());
//    System.out.println(String.class.getName());

//    Class<?> integerClass = Integer.class;
//    Integer test = new Integer(50);
//    Number num = (Number) test;
//    Number num2 = Number.class.cast(test);
    
//    Class<?> bubba;
//    try {
//      bubba = Class.forName("java.lang.Integer");
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.AnnotatedType[] annoTest = String.class.getAnnotatedInterfaces();
//    for (AnnotatedType annotatedType : annoTest) {
//      System.out.println(annotatedType.getType().getTypeName());
//    }
    
//    java.lang.reflect.AnnotatedType annoTest2 = Integer.class.getAnnotatedSuperclass();
//    System.out.println(annoTest2.getType().getTypeName());
    
//    java.lang.annotation.Retention test = 
//            java.lang.annotation.Repeatable.class.getAnnotation(
//                    java.lang.annotation.Retention.class);

//    java.lang.annotation.Annotation[] annoTest3 = java.lang.annotation.Repeatable.class.getAnnotations();
//    for (java.lang.annotation.Annotation annotation : annoTest3) {
//      System.out.println(annotation.toString());
//    }

//    java.lang.annotation.Retention[] test = 
//                java.lang.annotation.Repeatable.class.getAnnotationsByType(
//                        java.lang.annotation.Retention.class);
//    for (Retention retention : test) {
//      System.out.println(retention.toString());
//    }
    
//    System.out.println(Character.Subset.class.getName());
//    System.out.println(Character.Subset.class.getCanonicalName());
//    String name = Character.Subset.class.getName();
//    String canonicalName = Character.Subset.class.getCanonicalName();
//    Class<?> test;
//    Class<?> test2;
//    try {
//      test = Character.Subset.class.forName(name); // Works
////      test2 = Character.Subset.class.forName(canonicalName); // Does not work
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    Class<?>[] test = Character.class.getClasses();
    
//    java.lang.ClassLoader test = SomeClass.class.getClassLoader();
//    Class<?> test2;
//    try {
//      test2 = test.loadClass("java.lang.String");      
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    Class<?> test = boolean[].class.getComponentType();
//    Class<?> test2 = boolean[].class;

//    java.lang.reflect.Constructor<String> test;
//    String test2;
//    String test3;
//    try {
//      test = String.class.getConstructor(String.class);
//      test2 = test.toString();
//      test3 = test.newInstance("A test.");
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.Constructor<?>[] test;
//    test = String.class.getConstructors();
//    for (Constructor<?> constructor : test) {
//      System.out.println(constructor.toString());
//    }

//    java.lang.annotation.Documented test;
//    test = java.lang.annotation.Repeatable.class.getDeclaredAnnotation(
//            java.lang.annotation.Documented.class);
//    String test2 = test.toString();

//    java.lang.annotation.Annotation[] test = java.lang.annotation.Repeatable.class.getDeclaredAnnotations();
//    for (java.lang.annotation.Annotation annotation : test) {
//      System.out.println(annotation.toString());
//    }

//    java.lang.reflect.Field test;
//    String test2;
//    try {
//      test = Integer.class.getDeclaredField("BYTES");
//      test2 = test.toString();
//      System.out.println(test2);
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.Method[] test;
//    test = Integer.class.getDeclaredMethods();
//    for (Method method : test) {
//      System.out.println(method.toString());      
//    }

//    java.lang.reflect.Type[] test;
//    try {
//      test = java.util.stream.Stream.class.getGenericInterfaces();
//      for (Type type : test) {
//        System.out.println(type.getTypeName());
//      }
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.Type test;
//    java.lang.reflect.Type test2;
//    GenericA<String> test3 = new GenericB<>();
//    java.lang.reflect.Type test4;
//
//    try {
//      test = Integer.class.getGenericSuperclass();
//      test2 = GenericB.class.getGenericSuperclass();
//      test4 = test3.getClass().getGenericSuperclass();
//      System.out.println(test.getTypeName());
//      System.out.println(test2.getTypeName());
//      System.out.println(test4.getTypeName());
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    Class<?>[] test;
//    try {
//      test = String.class.getInterfaces();
//      for (Class<?> class1 : test) {
//        System.out.println(class1.toGenericString());
//      }
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.Method test;
//    try {
//      test = java.util.stream.Stream.class.getMethod("limit", long.class);
//      System.out.println(test.toGenericString());
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    java.lang.reflect.Method[] test;
//    try {
//      test = java.util.stream.Stream.class.getMethods();
//      for (Method method : test) {
//        System.out.println(method.toGenericString());
//      }
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    int mods = String.class.getModifiers();
//    System.out.println(Modifier.toString(mods));

//    java.security.ProtectionDomain test;
//    test = ClassLoader.class.getProtectionDomain();
//    System.out.println(test.toString());
    
//    Class<?> test;
//    try {
//      test = GenericB.class.getSuperclass();
//      System.out.println(test.toGenericString());
//    } catch (Exception e) {
//      System.out.println(e);
//    }

//    String test = java.util.stream.Stream.class.getTypeName();
//    System.out.println(test);

//    java.util.HashMap<Boolean, Integer> test = new java.util.HashMap<>();
//    java.lang.reflect.TypeVariable[] test2 = test.getClass().getTypeParameters();
//    for (TypeVariable typeVariable : test2) {
//      String test3 = typeVariable.getName();
//      System.out.println(test3);
//    }

    



    System.out.println("");
    

  }
}

class GenericA<T> {}
class GenericB<T> extends GenericA<T> {}

class SomeClass {}

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