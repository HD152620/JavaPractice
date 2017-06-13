/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public class MelonGenreChart {

	   public static void main(String[] args) {
	      
	      Map<String, List<Music>> map = new HashMap<>();
	      
	      List<Music> list = new ArrayList<Music>();
	      List<Music> list2 = new ArrayList<Music>();
	      
	      System.out.println("-- << 멜론 장르별 차트 >> --");
	      map.put("발라드", list);
	      list.add(new Music("팔레트", "아이유"));
	      map.put("댄스", list2);
	      list2.add(new Music("I LUV IT", "PSY"));
	      list2.add(new Music("맞지?", "언니쓰"));
	      printMap(map);
	      
	      System.out.println("-- << 댄스 2위 곡 변경 >> --");
	      map.put("댄스", list2);
	      list2.set(1, new Music("SIGNAL", "트와이스"));
	      printMap(map);
	      
	      System.out.println("-- << 댄스 1위 곡 삭제 >> --");
	      map.put("댄스", list2);
	      list2.remove(0);
	      printMap(map);
	      
	      System.out.println("-- << 전체 리스트 삭제 >> --");
	      list.clear();
	      list2.clear();

	   }

	   private static void printMap(Map<String, List<Music>> map) {
	      for (String key : map.keySet()){
	         int i=0;
	         System.out.println("["+key+"]");
	         for (Music m : map.get(key)){
	            System.out.printf((i+1) + ". ");
	            System.out.println(m.toString());
	            i++;
	         }
	      }
	      System.out.println();
	   }}
