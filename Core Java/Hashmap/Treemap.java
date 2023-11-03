package Hashmap;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap = new TreeMap<Integer,String>();//Tree map sorts in ascending order....with help of key
		
		tmap.put(12, "1Sri");//key ,value..
		tmap.put(34, "2Hari");//key ,value..
		tmap.put(46, "3Onel");//key ,value..
		tmap.put(67, "4ghost");//key ,value..
		tmap.put(56, "5police");//key ,value..
		
		for(Map.Entry me:tmap.entrySet())
		{
			System.out.println("Key:"+me.getKey()+" & Values"+me.getValue());
		}
		System.out.println(tmap);

	}

}
