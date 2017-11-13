package cn.zpq.room1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.zpq.characteract.ArrayOfPerson;
import cn.zpq.map.load.LoadMap;
import cn.zpq.room1.movecontrol.MyKeyAdapter1;

public class RoomOne extends JFrame {

	private static final long serialVersionUID = 6962165479045444977L;
	private JPanel contentPane;
	public static JLabel personOfRoom1;
	// ��ʿͷ��
	public static JLabel hero;
	// �峤��Ůͷ��
	public static JLabel girl;
	// �峤��Ůģ��
	public static JLabel girlSmall;
	// ����ͷ��
	public static JLabel bili;
	// ����ģ��
	public static JLabel biliSmall;
	// �Ի���
	public static JLabel talkLable;
	// �Ի��ı�
	public static JLabel talkText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomOne frame = new RoomOne();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RoomOne() {
		new LoadMap();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 398);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// �Ի��İ�ɫ�װ�
		ImageIcon talkWindow = new ImageIcon("src/cn/zpq/images/room1talk.png");
		talkWindow.setImage(talkWindow.getImage().getScaledInstance(410, 120,
				Image.SCALE_AREA_AVERAGING));

		// �Ի��ı�
		talkText = new JLabel("");
		talkText.setFont(new Font("����", Font.BOLD, 18));
		talkText.setBounds(20, 220, 410, 120);
		contentPane.add(talkText);
		talkText.setVisible(true);
		talkLable = new JLabel(talkWindow);
		talkLable.setFont(new Font("����", Font.BOLD, 18));
		talkLable.setBounds(20, 220, 410, 120);
		contentPane.add(talkLable);
		talkText.setVisible(false);
		talkLable.setVisible(false);

		// ���ǶԻ�ͷ��
		ImageIcon heroimg = new ImageIcon("src/cn/zpq/roleimg/��ʿ.png");
		heroimg.setImage(heroimg.getImage().getScaledInstance(70, 70,
				Image.SCALE_AREA_AVERAGING));
		hero = new JLabel(heroimg);
		hero.setBounds(50, 150, 70, 70);
		contentPane.add(hero);
		hero.setVisible(false);

		// �峤��Ů�Ի�ͷ��
		ImageIcon girlimag = new ImageIcon("src/cn/zpq/roleimg/����.png");
		girlimag.setImage(girlimag.getImage().getScaledInstance(70, 70,
				Image.SCALE_AREA_AVERAGING));
		girl = new JLabel(girlimag);
		girl.setBounds(340, 150, 70, 70);
		contentPane.add(girl);
		girl.setVisible(false);

		// �����Ի�ͷ��
		ImageIcon biliimg = new ImageIcon("src/cn/zpq/roleimg/����.png");
		biliimg.setImage(biliimg.getImage().getScaledInstance(70, 70,
				Image.SCALE_AREA_AVERAGING));
		bili = new JLabel(biliimg);
		bili.setBounds(340, 150, 70, 70);
		contentPane.add(bili);
		bili.setVisible(false);

		// �峤��Ůģ��
		ImageIcon girlSmallimg = new ImageIcon(
				"src/cn/zpq/roleimg/small/����С.png");
		girlSmallimg.setImage(girlSmallimg.getImage().getScaledInstance(30, 30,
				Image.SCALE_AREA_AVERAGING));
		girlSmall = new JLabel(girlSmallimg);
		girlSmall.setBounds(260, 210, 30, 30);
		contentPane.add(girlSmall);
		girlSmall.setVisible(false);

		// ����ģ��
		ImageIcon biliSmallimg = new ImageIcon(
				"src/cn/zpq/roleimg/small/����С.png");
		biliSmallimg.setImage(biliSmallimg.getImage().getScaledInstance(30, 30,
				Image.SCALE_AREA_AVERAGING));
		biliSmall = new JLabel(biliSmallimg);
		biliSmall.setBounds(120, 105, 30, 30);
		contentPane.add(biliSmall);
		biliSmall.setVisible(false);

		ImageIcon imageIcon = new ImageIcon(ArrayOfPerson.up[0]);
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(30, 30,
				Image.SCALE_AREA_AVERAGING));
		// ��ɫ
		personOfRoom1 = new JLabel(imageIcon);
		personOfRoom1.setBounds(213, 336, 30, 30);
		contentPane.add(personOfRoom1);
		MyKeyAdapter1 adapter = new MyKeyAdapter1(this);
		this.addKeyListener(adapter);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RoomOne.class
				.getResource("/cn/zpq/images/room1.png")));
		lblNewLabel.setBounds(0, 0, 456, 360);
		contentPane.add(lblNewLabel);
	}

}
