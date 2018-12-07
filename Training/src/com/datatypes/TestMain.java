package com.datatypes;

import java.math.BigInteger;

/**
 * Data Types
 * primitive : Boolean (false) 1bit, Numeric
 * (Character( 2byte (Integral (Integer(byte (0, 1byte),
 * short(0, 2 byte), int(0,4byte), long(0L, 8byte) ,
 * Floating-point (float(0.0f 4 byte,double (0.0d 8byte)))
 * non-primitive -- String, Array etc..
 * Size of Boolean type is 1 byte(s)

 Number of bits in a character: 8
 Size of character types is 1 byte
 Signed char min: -128 max: 127
 Unsigned char min: 0 max: 255
 Default char is unsigned

 Size of short int types is 2 bytes
 Signed short min: -32768 max: 32767
 Unsigned short min: 0 max: 65535

 Size of int types is 4 bytes
 Signed int min: -2147483648 max: 2147483647
 Unsigned int min: 0 max: 4294967295

 Size of long int types is 4 bytes
 Signed long min: -2147483648 max: 2147483647
 Unsigned long min: 0 max: 4294967295

 Size of long long types is 8 bytes
 Signed long long min: -9223372036854775808 max: 9223372036854775807
 Unsigned long long min: 0 max: 18446744073709551615
 Note that int and long are the same size and if you want a 64 bit integer then you need to use long long (or unsigned long long).
 **/
public class TestMain
{

    static char test;
    static int number;
    static long value;
    static double valueDouble;
    static float valueFloat;
    static short valueShort;
    static boolean flag;

    /*** Non primitive **/
    static String name;
    static Integer number1;
    static BigInteger number2;
    public static void main(String args[]) {
        if (test == 1) {
            System.out.println(test);
        }
        System.out.println(number);
        System.out.println(value);
        System.out.println(valueDouble);
        System.out.println(valueFloat);
        System.out.println(valueShort);
        System.out.println(flag);
        System.out.println(name);
        System.out.println(number1);
        System.out.println(number2);
    }
}
