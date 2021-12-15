package State_Document;

public class Demo {
	public static void main(String[] args) {
		Document paper1 = new Document();
		paper1.getSate(new New_Paper());
		System.out.println(paper1.ApplyState());
		
		paper1.getSate(new Reviewing());
		System.out.println(paper1.ApplyState());
		
		paper1.getSate(new Revised());
		System.out.println(paper1.ApplyState());
		
		paper1.getSate(new Apporved());
		System.out.println(paper1.ApplyState());
	}
}
