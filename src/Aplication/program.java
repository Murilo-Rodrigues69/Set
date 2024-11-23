package Aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.students;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();
		Set<students> set = new HashSet<>();
		for(int i = 0 ; i<n ;i++) {
			int number = sc.nextInt();
			students a = new students(number);
			set.add(a);
		}
		
		System.out.print("How many students for course B?");
		int f = sc.nextInt();
		for(int i = 0 ; i<f ;i++) {
			int number = sc.nextInt();
			students a = new students(number);
			set.add(a);
		}
		System.out.print("How many students for course C?");
		int e = sc.nextInt();
		for (int i = 0; i<e; i++) {
			int number = sc.nextInt();
			students a = new students(number);
			set.add(a);
		}
		System.out.print("Total students:" + set.size());
		
		
		
sc.close();
	}

}
