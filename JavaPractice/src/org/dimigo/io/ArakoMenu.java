/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *    |_ ArakoMenu
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 16.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class ArakoMenu {

	   public static void main(String[] args) {
	      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
	            BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
	            // 키보드로 메뉴를 한 줄씩 입력받아 파일에 저장하기
	            // Ctrl+Z 또는 Ctrl+D를 누를 때까지 계속 입력 받기
	            // 한 줄씩 입력 : BufferedReader의 readLine() 이용하기
	             String data;
	            while ((data = br.readLine())!= null){
	               writer.write(data+"\n");
	               writer.flush();
	            }
	            System.out.println("<< 메뉴 출력 >>");
	            while ((data = reader.readLine())!= null){
	               System.out.println(data);
	            }
	            // 파일에서 한 줄씩 읽어와서 모니터로 출력하기
	            } catch (Exception e) {
	            e.printStackTrace();
	            }

	   }
}

