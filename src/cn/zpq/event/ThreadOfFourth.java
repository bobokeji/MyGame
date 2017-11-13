package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.room1.RoomOne;
import cn.zpq.village.Village;

public class ThreadOfFourth extends Thread {
	RoomOne r;
	static int i;

	public ThreadOfFourth(RoomOne r) {
		this.r = r;
	}

	@Override
	public void run() {
		i = 0;
		if (!(Village.taskOfHeadInVillage == 1)) {
			RoomOne.talkLable.setVisible(true);
			RoomOne.girl.setVisible(true);
			RoomOne.talkText.setVisible(true);
			RoomOne.talkText.setText("���ڻ��������ҵ�ʱ��");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RoomOne.talkLable.setVisible(false);
			RoomOne.talkText.setVisible(false);
			RoomOne.girl.setVisible(false);
			r.setVisible(false);
			return;
		}
		showFirst();
		r.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					i++;
					showMeet(i);
				}
			}
		});
	}

	private void showFirst() {
		// TODO Auto-generated method stub
		RoomOne.talkLable.setVisible(true);
		RoomOne.girl.setVisible(true);
		RoomOne.talkText.setVisible(true);
		RoomOne.talkText.setText("���ǣ�");
	}

	protected void showMeet(int j) {

		if (j == 1) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("���ã���Ư������ô�������ͷ��ô����ôƯ������Ů��������");
		}
		if (j == 2) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�ҡ��ҡ��壬�峤���Ұ������۾���");
		}
		if (j == 3) {

			RoomOne.girl.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("����үү�������İ��������۾������˾��ȥ�ˣ�");
		}
		if (j == 4) {

			RoomOne.girl.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("���˾��ʱ���������Ҫ��Ҫ�����Ϳ�ȥ�ɣ���ס����ߵĵط���");
		}
		if (j == 5) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("��������һ����𡣡���");
		}
		if (j == 6) {

			RoomOne.girl.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("�������ԡ���");
		}
		if (j == 7) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("лл�㣬�������������������úܲ��");
		}
		if (j == 8) {

			RoomOne.girl.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("Ϊʲô��ô��");
		}
		if (j == 9) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("��Ϊ�¹��������϶𿴵�����̲�ס�ļ��������ò�ġ�");
		}
		if (j == 10) {

			RoomOne.girl.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("�����㡭�����죩����߰ɣ�һ������˾����Ͳ�����");
		}
		if (j == 11) {

			RoomOne.girl.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�Σ���������ˣ�������");
		}
		if (j == 12) {
			RoomOne.hero.setVisible(false);
			RoomOne.talkLable.setVisible(false);
			RoomOne.talkText.setVisible(false);
			Village.task[3] = true;
			r.setVisible(false);
		}

	}

}
