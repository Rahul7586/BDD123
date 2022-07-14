package javap;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
public static void main(String args[]) {
	int num = 123;
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer ss = sb.reverse();
	System.out.println(ss);
}
}