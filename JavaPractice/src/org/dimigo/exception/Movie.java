/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *    |_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class Movie {

	private String title;
	private int LimitAge;
	
	public Movie(String title, int LimitAge){
		this. title = title;
		this.LimitAge = LimitAge;
	}
	public String getTitle(){
		return title;
	}
public int LimitAge(){
		return LimitAge;
	}
public void buyTicket(int age)throws Exception{
	try{
		if(age < LimitAge){
			throw new Exception(title + "은/는 " + LimitAge + "세 이상 관람가입니다.");
		}
		System.out.println(title + "즐감하세요.");
	}catch (Exception e){
		throw e;
	}
}
}
