package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.room2.RoomTwo;
import cn.zpq.village.Village;

public class ThreadOfFifth extends Thread {
	RoomTwo t;
	static int i = 0;

	public ThreadOfFifth(RoomTwo t) {
		this.t = t;
	}

	@Override
	public void run() {
		i = 0;
		if ((Village.taskOfHeadInVillage == 0
				|| Village.taskOfHeadInVillage == 2 || Village.taskOfHeadInVillage == 3)
				|| !Village.task[3]) {
			RoomTwo.talkLable.setVisible(true);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setVisible(true);
			RoomTwo.talkText.setText("���ڻ��������ҵ�ʱ��");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			RoomTwo.wizard.setVisible(false);
			t.setVisible(false);
			return;
		}
		showFirst();
		t.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					i++;
					showSecondMeet(i);
				}
			}
		});

	}

	private void showFirst() {
		// TODO Auto-generated method stub
		RoomTwo.talkLable.setVisible(true);
		RoomTwo.talkText.setVisible(true);
		RoomTwo.hero.setVisible(true);
		RoomTwo.wizard.setVisible(false);
		RoomTwo.talkText.setText("���ã��峤�������Ұ������۾���ȥ");
	}

	protected void showSecondMeet(int j) {

		if (j == 1) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setText("�����ˣ����ö����ȵð��Ҹ�æ��");
		}
		if (j == 2) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("����ס�ڴ�������ûǮ�ˡ� ");
		}
		if (j == 3) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setText("�ޡ�˭Ҫ���Ǯ���������˼�������սʿ��");
		}
		if (j == 4) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("������ܰ����Ǵ򵹣��ҾͰ��۾����㡣");
		}
		if (j == 5) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setText("������ С��һ����");
		}
		if (j == 6) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("��ܿ���սʿ");
		}

		if (j == 7) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setText("���Ȼ���Դ�����ǣ���������С���ӣ�");
		}
		if (j == 8) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("���ǣ�Ҳ��������˭��");
		}
		if (j == 9) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("����ô����˧���������޵У��˼��˰�����");
		}
		if (j == 10) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(true);
			RoomTwo.talkText.setText("���ģ������Ҳ̫��Ҫ���ˣ������۾������");
		}
		if (j == 11) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkText.setText("�õ��۾�");
		}

		if (j == 12) {
			RoomTwo.wizard.setVisible(false);
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			Village.taskOfHeadInVillage = 2;
			t.setVisible(false);
		}

	}

}
