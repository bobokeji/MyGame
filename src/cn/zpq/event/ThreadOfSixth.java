package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.room1.RoomOne;
import cn.zpq.village.Village;

public class ThreadOfSixth extends Thread {
	RoomOne r;
	static int i;

	public ThreadOfSixth(RoomOne r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	@Override
	public void run() {
		i = 0;
		if (Village.taskOfHeadInVillage != 3) {
			RoomOne.talkLable.setVisible(true);
			RoomOne.bili.setVisible(true);
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
			RoomOne.bili.setVisible(false);
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
		RoomOne.hero.setVisible(true);
		RoomOne.talkText.setVisible(true);
		RoomOne.talkText.setText("������������á�");
	}

	protected void showMeet(int j) {

		if (j == 1) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("����������");
		}
		if (j == 2) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�������������̡�");
		}
		if (j == 3) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("����������");
		}
		if (j == 4) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("���е�");
		}
		if (j == 5) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("ԭ����Ҷ������룬Ϊʲô��û�С�");
		}
		if (j == 6) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("ֻ��ÿ���ںӱߴ��㡣��");
		}
		if (j == 7) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("ֻ������Ը������档��5555555");
		}
		if (j == 8) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("��ԭ����������������һ�𡣡�������Ҫ������ӣ�");
		}
		if (j == 9) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("���������㣬��ʵ��������Լ�ϲ��ʲô��ȥ��ʲô����ϲ��ʲô��");
		}
		if (j == 10) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("��ϲ������ĸо�����");
		}
		if (j == 11) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�������Ҹ������һ���ط���������ѧ��ȥѧjava��");
		}
		if (j == 12) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("ѧ��Ϳ���д���������죡");
		}
		if (j == 13) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("�����⣡��Ҫ����һ����վ���������£�");
		}
		if (j == 14) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("���ֶ�����ˣ��ͽб�������");
		}
		if (j == 15) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("��ϲ�㣡�ҵ��������ȥʵ�ְ�  ��Ҫ�ڴ��������");
		}
		if (j == 16) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("лл��~��һ���̾����ˣ�");
		}
		if (j == 17) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�������Ǹ�ɵС�ӹ���Ҳֻ����ѧ�������������̺���");
		}
		if (j == 18) {

			RoomOne.bili.setVisible(false);
			RoomOne.hero.setVisible(true);
			RoomOne.talkText.setText("�������ȵȣ����ҿ�����ͼ���߰���");
		}
		if (j == 19) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("�Σ���Ǹ��һʱ�������������¡�����");
		}
		if (j == 20) {

			RoomOne.bili.setVisible(true);
			RoomOne.hero.setVisible(false);
			RoomOne.talkText.setText("����ط������š����ϵá����ػ������λ�ã���Ҫ�����ټ���");
		}
		if (j == 21) {
			RoomOne.bili.setVisible(false);
			RoomOne.talkLable.setVisible(false);
			RoomOne.talkText.setVisible(false);
			r.setVisible(false);
		}

	}

}
