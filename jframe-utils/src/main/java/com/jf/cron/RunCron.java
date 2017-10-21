package com.jf.cron;

import java.awt.*;

public class RunCron {

	public static void main(String[] args) {
		Main.initCustomLAF();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainJFrame().setVisible(true);
			}
		});
	}

}
