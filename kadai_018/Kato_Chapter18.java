package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
	public String GivenName;
	public String address;
	
	
	
	//コンストラクタで初期値をセット
	public Kato_Chapter18(String givenName) {
		this.familyName="加藤";
		this.GivenName=givenName;
		this.address="住所は東京都中野区〇×です";
	}
	
	
	
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+GivenName+"です");
		
	};
	
	
	public abstract void eachIntroduce();
	
	
	public void execIntroduce() {
		commonIntroduce();
		System.out.println("住所は"+address+"です");
	};
}
