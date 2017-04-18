/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	FamilyMember members[] = {
			new FamilyMember("아빠"),
			new FamilyMember("엄마"),
			new FamilyMember("나"),
			new FamilyMember("남동생")
	};
	FamilyMember.printMemberCnt();
	PiggyBank.putMoney(10000, members[0]);
	PiggyBank.putMoney(5000, members[1]);
	PiggyBank.putMoney(2000, members[2]);
	PiggyBank.putMoney(1000, members[3]);
	PiggyBank.printBalance();
	PiggyBank.putMoney(1000, members[2]);
	PiggyBank.printBalance();
	}

}
