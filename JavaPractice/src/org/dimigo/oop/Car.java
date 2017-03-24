/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class Car {

    private String company = "현대자동차";
    private String model = "제네시스";
    private String color = "검정색";
    private int maxSpeed = 225;
    private int price = 50000000; 
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	
}
