package oppHomeWork3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Group g1 = new Group();
		try {

			g1.add(new Student("Mario", "Rodriguez", 18, true, "Mexico", 12.5, 2));
			g1.add(new Student("Mario1", "Rodriguez1", 19, true, "Peru", 14.5, 2));
			g1.add(new Student("Mario2", "Rodriguez2", 17, true, "Colombia", 15.5, 2));
			g1.add(new Student("Mario3", "Rodriguez3", 20, true, "Brazil", 15.5, 2));
			g1.add(new Student("Mario4", "Rodriguez4", 18, true, "Bolivia", 11.5, 2));
			g1.add(new Student("Mario5", "Rodriguez5", 17, true, "Panama", 10.5, 2));
			g1.add(new Student("Mari6", "Rodriguez6", 19, true, "Ecuador", 19.5, 2));
			g1.add(new Student("Mario7", "Rodriguez7", 21, true, "Chile", 20.0, 2));
			g1.add(new Student("Mario8", "Rodriguez8", 17, true, "Ukraine", 11.5, 2));
			g1.add(new Student("Mario8", "Rodriguez9", 22, true, "Venezuela", 13.5, 2));

		} catch (MyException e) {
			System.out.println(e.getmessage());

		}
		System.out.println(g1.findStudent("Rodriguez10"));

	}

}
