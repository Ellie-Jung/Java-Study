package com.test2;

interface Parseable{
	public  abstract void parse  (String fileName);
}
class XMLParser implements Parseable{
	public void parse (String filename) {
		System.out.println(filename+"-XML parsing completed.");
	}
}
class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName+"-HTML parsing mpleted.");
	}
}

class ParserManager2{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser ();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
	
}
public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager2.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager2.getParser("HTML");
		parser.parse("document2.html");

	}

}
