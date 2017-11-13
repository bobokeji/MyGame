package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.room2.RoomTwo;
import cn.zpq.village.Village;

public class ThreadOfThird extends Thread {
	RoomTwo t;
	static int i = 0;

	public ThreadOfThird(RoomTwo t) {
		this.t = t;
	}

	@Override
	public void run() {
		if (!Village.task[1]) {
			RoomTwo.talkLable.setVisible(true);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setVisible(true);
			RoomTwo.talkText.setText("���ڴ��û����������");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			RoomTwo.headOfVillage.setVisible(false);
			t.setVisible(false);
			return;
		}
		i = 0;
		if (Village.taskOfHeadInVillage == 1) {
			RoomTwo.talkLable.setVisible(true);
			RoomTwo.talkText.setVisible(true);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�ҵ��۾���ô��û�û�����");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			RoomTwo.headOfVillage.setVisible(false);
			t.setVisible(false);
			return;
		}
		if (Village.taskOfHeadInVillage == 3) {
			RoomTwo.talkLable.setVisible(true);
			RoomTwo.talkText.setVisible(true);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("���ڲ������ҵ�ʱ��");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			RoomTwo.headOfVillage.setVisible(false);
			t.setVisible(false);
			return;
		}
		if (Village.taskOfHeadInVillage == 2) {
			showTalk2();
			t.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() == KeyEvent.VK_SPACE) {
						i++;
						showSecondMeet(i);
					}
				}
			});

		} else {
			showTalk1();
			t.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						i++;
						showFirstMeet(i);
					}
				}
			});
		}

	}

	private void showTalk2() {
		// TODO Auto-generated method stub
		RoomTwo.talkLable.setVisible(true);
		RoomTwo.hero.setVisible(true);
		RoomTwo.talkText.setVisible(true);
		RoomTwo.talkText.setText("��ͷ������۾�������ҿ�����ͼ ");
	}

	private void showFirstMeet(int j) {
		// TODO Auto-generated method stub
		if (j == 1) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("200!");
		}
		if (j == 2) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.headOfVillage.setVisible(false);
			RoomTwo.talkText.setText("What???");
		}
		if (j == 3) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�ٷϻ���200�������ۣ�֧��΢��֧����pos��ˢ��!");
		}
		if (j == 4) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.headOfVillage.setVisible(false);
			RoomTwo.talkText.setText("������ΰ������� QAQ");
		}
		if (j == 5) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�㶮ʲô�������Ǿ�����ᣬ�����ҾͲ�������");
		}
		if (j == 6) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.headOfVillage.setVisible(false);
			RoomTwo.talkText.setText("����  Ϊ�˱��أ������ˡ������Թ��ͳ�200");
		}
		if (j == 7) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("��С���ӣ�ˬ���ˡ�����������ۣ������ڿ��ɡ�");
		}
		if (j == 8) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�����������?С���ӣ���Ҫû�¾��õ�����");
		}
		if (j == 9) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("��ͻȻ�о���������������Ϣ��");
		}
		if (j == 10) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("����ط�̫ģ���ˣ���������ȥ���ҵ��۾���");
		}
		if (j == 11) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.headOfVillage.setVisible(true);
			RoomTwo.talkText.setText("��������Ů������,��ϲ���ֲˡ�");
		}

		if (j == 12) {
			RoomTwo.headOfVillage.setVisible(false);
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			Village.taskOfHeadInVillage = 1;
			t.setVisible(false);
		}

	}

	private void showTalk1() {
		RoomTwo.talkLable.setVisible(true);
		RoomTwo.hero.setVisible(true);
		RoomTwo.talkText.setVisible(true);
		RoomTwo.talkText.setText("���ã������Ĵ峤���ˣ�������������ô����ǣ��ҡ� ");
	}

	private void showSecondMeet(int j) {

		if (j == 1) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("��ʲô�ߣ��ҿ���������ط��������е���Ϥ��");
		}
		if (j == 2) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�������ߣ�������ӣ�");
		}
		if (j == 3) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("���Ǵ��ӵ�����������������������");
		}
		if (j == 4) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("��������ط���������");
		}
		if (j == 5) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("���Ҫ���ӱ�ס�ı�����ȥ������");
		}
		if (j == 6) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("����С���ںӱߣ�һ��֪���������");
		}
		if (j == 7) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.glassOnHeadOfVillage.setVisible(false);
			RoomTwo.talkText.setText("�����Ͼ�ȥ�����ˣ�����Ů����������");
		}
		if (j == 8) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("���ޣ�200�����ŵļһ���������Ů?�������룡");
		}
		if (j == 9) {
			RoomTwo.hero.setVisible(true);
			RoomTwo.glassOnHeadOfVillage.setVisible(false);
			RoomTwo.talkText.setText("����ţ��һ�����ƻ�����");
		}
		if (j == 10) {
			RoomTwo.hero.setVisible(false);
			RoomTwo.glassOnHeadOfVillage.setVisible(true);
			RoomTwo.talkText.setText("�����");
		}
		if (j == 11) {
			RoomTwo.glassOnHeadOfVillage.setVisible(false);
			RoomTwo.talkLable.setVisible(false);
			RoomTwo.talkText.setVisible(false);
			Village.taskOfHeadInVillage = 3;
			t.setVisible(false);
		}

	}

}
