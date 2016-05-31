import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;



public class SchoolController implements ActionListener {
	SchoolView view;
	School school;
	JTextField selectedStandName;
	public SchoolController(School school, JTextField selectedStandName){
		this.view = view;
		this.school = school;
		this.selectedStandName = selectedStandName;
		
	}

	public void actionPerformed(ActionEvent e) {
		JComboBox comboBox = (JComboBox) e.getSource();
		int index = comboBox.getSelectedIndex();
		String standInfo = school.getStands().get(index).toString();
		selectedStandName.setText(standInfo);
	}
}
