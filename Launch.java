import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launch {
    public static void main(String[] args) {
		System.out.println("Press Ctrl + c here, to exit ...");
		Frame frm = new Frame("Login Frame");

		Panel p = new Panel();
		frm.add(p, BorderLayout.NORTH);
		p.add(new Label("Username"));
		final TextField un = new TextField(15);//<-- no. of cols
		p.add(un);

		p = new Panel();
		frm.add(p, BorderLayout.CENTER);
		p.add(new Label("Password"));
		final TextField ps = new TextField(15);
		ps.setEchoChar('*');//<-- don't show the actual password
		p.add(ps);

		p = new Panel();
		frm.add(p, BorderLayout.SOUTH);
		Button b = new Button("OK");
		p.add(b);

		frm.pack();
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.printf("Username is:\t%s\n", un.getText());
				System.out.printf("Password is:\t%s\n", ps.getText());
			}
		};

		b.addActionListener(al);
    }
}
