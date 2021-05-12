class BBSItem{
	static int seqNo;
	BBSItem(){
		seqNo++;
		System.out.println(seqNo);
	}
}
public class Sample02 {

	public static void main(String[] args) {
		BBSItem b = new BBSItem();
		BBSItem b2 = new BBSItem();
		BBSItem b3 = new BBSItem();
		

	}

}
