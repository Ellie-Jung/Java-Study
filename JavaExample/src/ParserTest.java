interface Parseable{
	public abstract void parse(String fileName);  //구문 분석작업을 수행한다.		
}
class ParserManager{
	// 리턴타입이 Parseable 인터페이스다.
	public static Parseable getParser(String type) {
		if (type.equals("XML")) { return new XMLParser(); }
		else {
			Parseable p = new HTMLParser();
			return p;        //return new HTMLParser();
		}
	}
} 
class XMLParser implements Parseable{
	public void parse(String fileName) { System.out.println(fileName + "-XML parsing completed.");} //구문 분석작업 수행하는 코드
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {System.out.println(fileName+ "-HTML parsing completed.");} //구문 분석작업 수행 코드

}
public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
