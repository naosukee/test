
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name = "山田太郎" ;
		taro.age = 20;

	System.out.println(taro.name);
	System.out.println(taro.age);


		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;

		Person naoto = new Person();
		naoto.name = "上野直人";
		naoto.age = 29;

		taro.talk();

		taro.walk();

		taro.run();


		Robot aibo = new Robot();
		aibo.name = "アイボ";

		Robot asimo = new Robot();
		asimo.name = "アシモ";

		Robot pepper = new Robot();
		pepper.name = "ペッパー";

		asimo.talk();
		asimo.walk();
		asimo.run();
		
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
