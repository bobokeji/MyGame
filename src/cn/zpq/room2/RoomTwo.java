package cn.zpq.room2;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.zpq.characteract.ArrayOfPerson;
import cn.zpq.map.load.LoadMap;
import cn.zpq.room2.movecontrol.MyKeyAdapter2;

public class RoomTwo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JLabel personOfRoom2;
	// �峤ģ��
	public static JLabel headOfVillageSmall;
	// �峤ͷ��
	public static JLabel headOfVillage;
	// ����ͷ��
	public static JLabel hero;
	// ���˾ģ��
	public static JLabel wizardSmall;
	// ���˾ͷ��
	public static JLabel wizard;
	// �Ի���
	public static JLabel talkLable;
	// ���۾��峤ͷ��
	public static JLabel glassOnHeadOfVillage;
	// �Ի��ı�
	public static JLabel talkText;

	// Test
	// public static void main(String[] args) {
	// RoomTwo room = new RoomTwo();
	// room.setVisible(true);
	// }

	/**
	 * Create the frame.
	 */
	public RoomTwo() {
		new LoadMap();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 510, 437);
		contentPane = new JPanel();
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// �Ի��İ�ɫ�װ�
		ImageIcon talkWindow = new ImageIcon("src/cn/zpq/images/room2talk.png");
		talkWindow.setImage(talkWindow.getImage().getScaledInstance(485, 145,
				Image.SCALE_AREA_AVERAGING));

		// �Ի��ı�
		talkText = new JLabel("");
		talkText.setFont(new Font("����", Font.BOLD, 18));
		talkText.setBounds(10, 250, 485, 145);
		contentPane.add(talkText);
		talkText.setVisible(true);
		talkLable = new JLabel(talkWindow);
		talkLable.setFont(new Font("����", Font.BOLD, 18));
		talkLable.setBounds(10, 250, 485, 145);
		contentPane.add(talkLable);
		talkText.setVisible(false);
		talkLable.setVisible(false);

		// ���ǶԻ�ͷ��
		ImageIcon heroimg = new ImageIcon("src/cn/zpq/roleimg/��ʿ.png");
		heroimg.setImage(heroimg.getImage().getScaledInstance(70, 70,
				Image.SCALE_AREA_AVERAGING));
		hero = new JLabel(heroimg);
		hero.setBounds(50, 180, 70, 70);
		contentPane.add(hero);
		hero.setVisible(false);

		// �峤�Ի�ͷ��
		ImageIcon headOfVillageimg = new ImageIcon("src/cn/zpq/roleimg/�峤.png");
		headOfVillageimg.setImage(headOfVillageimg.getImage()
				.getScaledInstance(70, 70, Image.SCALE_AREA_AVERAGING));
		headOfVillage = new JLabel(headOfVillageimg);
		headOfVillage.setBounds(400, 180, 70, 70);
		contentPane.add(headOfVillage);
		headOfVillage.setVisible(false);

		// �峤���۾��Ի�ͷ��
		ImageIcon glassOnHeadOfVillageimg = new ImageIcon(
				"src/cn/zpq/roleimg/�峤���۾�.png");
		glassOnHeadOfVillageimg.setImage(glassOnHeadOfVillageimg.getImage()
				.getScaledInstance(70, 70, Image.SCALE_AREA_AVERAGING));
		glassOnHeadOfVillage = new JLabel(glassOnHeadOfVillageimg);
		glassOnHeadOfVillage.setBounds(400, 180, 70, 70);
		contentPane.add(glassOnHeadOfVillage);
		glassOnHeadOfVillage.setVisible(false);

		// ���˾ͷ��
		ImageIcon wizardimg = new ImageIcon("src/cn/zpq/roleimg/���˾.png");
		wizardimg.setImage(wizardimg.getImage().getScaledInstance(70, 70,
				Image.SCALE_AREA_AVERAGING));
		wizard = new JLabel(wizardimg);
		wizard.setBounds(400, 180, 70, 70);
		contentPane.add(wizard);
		wizard.setVisible(false);

		// �峤ģ��
		ImageIcon headOfVillageSmallimg = new ImageIcon(
				"src/cn/zpq/roleimg/small/�峤С.png");
		headOfVillageSmallimg.setImage(headOfVillageSmallimg.getImage()
				.getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
		headOfVillageSmall = new JLabel(headOfVillageSmallimg);
		headOfVillageSmall.setBounds(262, 166, 30, 30);
		contentPane.add(headOfVillageSmall);
		headOfVillageSmall.setVisible(false);

		// ���˾ģ��
		ImageIcon wizardSmallimg = new ImageIcon(
				"src/cn/zpq/roleimg/small/���˾С.png");
		wizardSmallimg.setImage(wizardSmallimg.getImage().getScaledInstance(30,
				30, Image.SCALE_AREA_AVERAGING));
		wizardSmall = new JLabel(wizardSmallimg);
		wizardSmall.setBounds(358, 310, 30, 30);
		contentPane.add(wizardSmall);
		wizardSmall.setVisible(false);

		// ����ģ��
		ImageIcon imageIcon = new ImageIcon(ArrayOfPerson.up[0]);
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(30, 30,
				Image.SCALE_AREA_AVERAGING));
		personOfRoom2 = new JLabel(imageIcon);
		personOfRoom2.setBounds(237, 380, 30, 30);
		contentPane.add(personOfRoom2);

		// ���䱳��
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RoomTwo.class
				.getResource("/cn/zpq/images/room2.png")));
		lblNewLabel.setBounds(0, 0, 504, 408);
		contentPane.add(lblNewLabel);
		MyKeyAdapter2 adapter = new MyKeyAdapter2(this);
		this.addKeyListener(adapter);
	}

}
