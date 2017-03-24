/*
Title: Java语言流程演示
Description: 演示Java中几种常用的流程控制操作
*/

import java.util.*;

public class _002flowDemo {
	public static void main(String[] args) {
		int iPara1,iPara2,iEnd;
		if (args.length!=3) {
			System.out.println("USE:java flowDemo parameter1 parameter2 circle");
			System.out.println("parameter1: ");
			System.out.println("parameter2: ");
			System.out.println("circle: ");
			System.out.println("ego: java flowDemo 1 2 5");
			return;
		}else {
			iPara1 = Integer.parseInt(args[0]);
			iPara2 = Integer.parseInt(args[1]);
			iEnd = Integer.parseInt(args[2]);
		}
		//if
		if (iPara2>iPara1) {
			System.out.println("if 条件满足");
			System.out.println("第二个数比第一个数大");
		}else {
			System.out.println("bu man zu");
			System.out.println("xiao");
		}
		//for
		for (int i = 0; i<iEnd; i++) {
			System.out.println("for de "+i+"ci xun huan");
		}
		//while
		int i = 0;
		while(i<iEnd){
			System.out.println("while "+i);
			i++;
		}

	}
}