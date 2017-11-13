package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.menu.MyMenu;
import cn.zpq.village.Village;

public class ThreadOfFirst extends Thread {
	MyMenu m;
	static int i;

	public ThreadOfFirst(MyMenu m) {
		this.m = m;
	}

	@Override
	public void run() {
		i = 0;
		show();
		Village.vv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					i++;
					showFirst(i);
				}
			}
		});
	}

	private void show() {
		// TODO Auto-generated method stub
		Village.talkLable.setVisible(true);
		Village.talkText.setVisible(true);
		Village.talkText.setText("��ҹƽ���Ĵ�ׯ������ģ�ͻȻһ����Ӱ�������֡�");
	}

	protected void showFirst(int j) {

		if (j == 1) {
			Village.hero.setVisible(true);
			Village.talkText.setText("�����ǣ�������������ҹ��������������ҹ�ߵ��˱��ص���ص�!");
		}
		if (j == 2) {
			Village.talkText.setText("���첻�������˰�����Ҫ�����Ƹ���Ǯ��~");
		}
		if (j == 3) {
			Village.talkText.setText("��ط���ô���˸����ӡ���������ô���ҵı��ذ���ǰ���и���  ��ȥ���ʡ�");
		}
		if (j == 4) {
			Village.hero.setVisible(false);
			Village.talkLable.setVisible(false);
			Village.talkText.setVisible(false);
		}

	}

}
