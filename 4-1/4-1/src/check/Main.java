package check;

import constants.Constants;

public class Main {
	private static String firstName = "上村";
	private static String lastName = "紗世" ;
	private static void printName() {
		String fullName = firstName + lastName ;
		System.out.println("printNameメソッド"+" "+"→"+" "+fullName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName();
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE) ;
		pet.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}

}
