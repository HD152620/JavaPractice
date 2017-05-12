/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {
		Person[] per = {
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person p : per) {
			greeting(p);
			System.out.println();
		}
	}
	private static void greeting(Person per){
		System.out.println(per.toString());
		per.sayHello();
		per.sayBye();
	}
}
