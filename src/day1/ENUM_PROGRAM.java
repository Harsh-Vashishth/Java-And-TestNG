package day1;


enum FoodChoice{
	Chinese,
	Indian,
	Continental
};
public class ENUM_PROGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodChoice choice = FoodChoice.Chinese;
		if(choice.equals(FoodChoice.Chinese)) {
			System.out.println("you chose chinese");
		}

	}

}
