package cn.zpq.event;

import javax.swing.ImageIcon;

import cn.zpq.menu.MyMenu;
import cn.zpq.village.Village;

public class ThreadOfSeventh extends Thread {
	@Override
	public void run() {
		Village.talkLable.setVisible(true);
		Village.talkText.setVisible(true);
		Village.talkText.setText("��ϲ�㣡�����ҵ����أ�����");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Village.box.setVisible(true);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Village.box.setIcon(new ImageIcon("src/cn/zpq/images/�򿪱���2.png"));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Village.vv.setVisible(false);
		MyMenu.menu.setVisible(true);
	}

}
