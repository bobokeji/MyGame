package cn.zpq.room1.movecontrol;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import cn.zpq.characteract.ArrayOfPerson;
import cn.zpq.event.ThreadOfFourth;
import cn.zpq.event.ThreadOfSixth;
import cn.zpq.map.load.LoadMap;
import cn.zpq.room1.RoomOne;
import cn.zpq.village.Village;

public class ThreadOfUpInRoom1 implements Runnable {
	RoomOne r;

	public ThreadOfUpInRoom1(RoomOne r) {
		this.r = r;
	}

	@Override
	public void run() {
		setImage();

	}

	public void setImage() {
		synchronized (Village.vv) {
			ImageIcon imageIcon = null;
			imageIcon = new ImageIcon(ArrayOfPerson.up[0]);
			imageIcon.setImage(imageIcon.getImage().getScaledInstance(30, 30,
					Image.SCALE_AREA_AVERAGING));
			RoomOne.personOfRoom1.setIcon(imageIcon);

			Point beforeStep = RoomOne.personOfRoom1.getLocation();
			// �ж���һ��λ���Ƿ�����ƶ�
			int afterX = beforeStep.x + 3;
			int afterY = beforeStep.y - 24;
			int indexX = afterX / 24;
			int indexY = afterY / 24;
			System.out.println("������ X:" + indexX + "--Y:" + indexY);
			if (indexX == 11 && indexY == 9) {
				System.out.println("---------------------------------------");
				new ThreadOfFourth(r).start();
			}
			if (indexX == 5 && indexY == 5) {
				new ThreadOfSixth(r).start();
			}
			if (LoadMap.room1[indexY][indexX] == 0) {
				return;
			} else {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 3; j++) {
						imageIcon = new ImageIcon(ArrayOfPerson.up[j]);
						imageIcon.setImage(imageIcon.getImage()
								.getScaledInstance(30, 30,
										Image.SCALE_AREA_AVERAGING));
						RoomOne.personOfRoom1.setIcon(imageIcon);
						Point here = RoomOne.personOfRoom1.getLocation();

						Point afterStep1 = new Point(here.x, here.y - 1);
						RoomOne.personOfRoom1.setLocation(afterStep1);

						try {
							// System.out.println("˯30����");
							Thread.sleep(30);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
			}
		}
	}

}
