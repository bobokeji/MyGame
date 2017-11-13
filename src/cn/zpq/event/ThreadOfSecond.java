package cn.zpq.event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import cn.zpq.village.Village;

public class ThreadOfSecond extends Thread {
	static int i = 0;
	Village v;

	public ThreadOfSecond(Village v) {
		this.v = v;
	}

	@Override
	public void run() {
		if (Village.task[1]) {
			Village.talkLable.setVisible(true);
			Village.talkText.setVisible(true);
			Village.talkText.setText("���Ǹ�����Ҫȥ�Ҵ峤���𣿿�ȥ��");
			try {
				sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Village.talkLable.setVisible(false);
			Village.talkText.setVisible(false);
			return;
		}
		showTalk();
		v.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					i++;
					showMore(i);
				}
			}
		});

	}

	protected void showMore(int j) {
		// TODO Auto-generated method stub
		if (j == 1) {
			Village.hero.setVisible(false);
			Village.guard.setVisible(true);
			Village.talkText.setText("�õõã���ϻ������������ܿ�����ô�ࣿ����˭�����Ǵ��Ӹ��");
		}
		if (j == 2) {
			Village.hero.setVisible(true);
			Village.guard.setVisible(false);
			Village.talkText.setText("�������ģ�����������ط���˧����֪������ط��𣿱����Ǵ��Ӹ�ס�ˡ�");
		}
		if (j == 3) {
			Village.hero.setVisible(false);
			Village.guard.setVisible(true);
			Village.talkText.setText("�����㰮˵ʵ���������ϣ��Ҿ͸�����ɡ�����û������");
		}
		if (j == 4) {
			Village.hero.setVisible(true);
			Village.guard.setVisible(false);
			Village.talkText.setText("�����㡣����������");
		}
		if (j == 5) {
			Village.hero.setVisible(false);
			Village.guard.setVisible(true);
			Village.talkText.setText("�ٺ٣���嶯���������������µ����µ�����ȥ���ʴ峤���˰ɡ�");
		}
		if (j == 6) {
			Village.hero.setVisible(false);
			Village.guard.setVisible(true);
			Village.talkText.setText("��������������곤���ˣ�Ӧ�û�֪����");
		}
		if (j == 7) {
			Village.talkLable.setVisible(false);
			Village.talkText.setVisible(false);
			Village.guard.setVisible(false);
			Village.task[1] = true;
		}
	}

	private void showTalk() {
		Village.talkLable.setVisible(true);
		Village.hero.setVisible(true);
		Village.talkText.setVisible(true);
		Village.talkText.setText("�ˣ���λ˧�磬�����Ƿ������Σ�Ӣ���������˼��˰�����������");
	}

}
