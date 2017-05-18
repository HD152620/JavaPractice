/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] ps = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(int i = 0; i < 2; i++){
			System.out.println(ps[i].toString());
			ps[i].turnOn();
			ps[i].pay();
			ps[i].useSpecialFunction();
			ps[i].turnOff();
		}
	}

}
