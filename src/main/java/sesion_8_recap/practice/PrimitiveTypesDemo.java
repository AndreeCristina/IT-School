package sesion_8_recap.practice;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class PrimitiveTypesDemo {

    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 12.5;
        char myChar = 'A';
        boolean myBoolean = true;
        float myfloat = 1.1f;
        long myLong = 4424135465545L;

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
        System.out.println("Float value: " + myfloat);
        System.out.println("Long value: " + myLong);
        MethodReturnType methodReturnType = new MethodReturnType();
        methodReturnType.testMethod();
    }
}
