package com.webscrapper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class webscrapper {

	public static void main(String[] args) throws IOException {
	    String url = "https://www.walmart.com/cp/food/976759?povid=GlobalNav_rWeb_Grocery_Grocery_ShopAll";

	    Document document = Jsoup.connect(url).get();

	    //Elements e = document.getElementsByClass("flex flex-column items-center pa1 pr2 pb2");
	   
	    Elements e = document.select("li");
	    for( Element i:e) {
	    	String text = i.text();
	    System.out.println(text);
	  
	
	 }
}}
