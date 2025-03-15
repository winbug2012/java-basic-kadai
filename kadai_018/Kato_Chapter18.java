package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName;
	public String givenName;
	public String address;
	
	Kato_Chapter18(){
		this.familyName="加藤";
		this.address="住所は東京都中野区〇×です";
		
	}
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println(address);
	};
	
	public abstract void eachIntroduce();
	
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
