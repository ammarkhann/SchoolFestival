import javax.swing.JFrame;

public class SchoolFestival extends JFrame {
	
  public SchoolFestival(School school) {
		setTitle("School Festival: " + school.getName());
		setContentPane(new SchoolView(school));
		setSize(600, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		School seirin = new School("Seirin");
		seirin.addStand(new Stand("Rainbow Pots", "Tulips", 4.7));
		seirin.addStand(new Stand("BookWorm's Place", "Book Seperator", 3.2));
		seirin.addStand(new Stand("Caffein Charger", "Coffee", 2.2));
		seirin.addStand(new Stand("Jedi's Place", "Jedi Starter Pack", 15.0));
		SchoolFestival festival = new SchoolFestival(seirin);	
	}
}
