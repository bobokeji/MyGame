package cn.zpq.menu;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.zpq.event.ThreadOfFirst;
import cn.zpq.playmusic.PlayMusic;
import cn.zpq.village.Village;

public class MyMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JButton btnBegi;
	static JButton btnLoad;
	static JButton btnRead;
	static JButton btnExit;
	public static MyMenu menu = new MyMenu();

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Menu frame = new Menu();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	private MyMenu() {
		setTitle("�ᱦ���");
		new PlayMusic().start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 789);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnBegi = new JButton("");
		btnBegi.setIcon(new ImageIcon(MyMenu.class
				.getResource("images/��ʼ��Ϸ.png")));
		btnBegi.setForeground(Color.WHITE);
		btnBegi.setBounds(204, 84, 352, 84);
		contentPane.add(btnBegi);
		btnBegi.setContentAreaFilled(false);
		btnBegi.setBorderPainted(false);
		btnBegi.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

				Village.vv.setVisible(true);
				menu.setVisible(false);
				new ThreadOfFirst(menu).start();
			}
		});
		// "/image/\u5F00\u59CB\u6E38\u620F\uFF08\u70B9\u51FB\uFF09.png"��ʼ��Ϸ���
		btnBegi.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnBegi.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ʼ��Ϸ������.png")));
			}
		});
		btnBegi.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnBegi.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ʼ��Ϸ.png")));
			}
		});
		btnBegi.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				btnBegi.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ʼ��Ϸ�������.png")));
			}
		});
		btnBegi.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				btnBegi.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ʼ��Ϸ������.png")));
			}
		});

		btnLoad = new JButton("");
		btnLoad.setIcon(new ImageIcon(MyMenu.class
				.getResource("images/�������.png")));
		btnLoad.setBounds(204, 252, 352, 84);
		contentPane.add(btnLoad);
		btnLoad.setContentAreaFilled(false);
		btnLoad.setBorderPainted(false);
		// "/image/\u4FDD\u5B58\u8FDB\u5EA6\uFF08\u70B9\u51FB\uFF09.png"������Ϸ
		// "/image/\u4FDD\u5B58\u8FDB\u5EA6\uFF08\u4EAE\uFF09.png"��
		btnLoad.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnLoad.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/������ȣ�����.png")));
			}
		});
		btnLoad.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnLoad.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/�������.png")));
			}
		});
		btnLoad.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				btnLoad.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/������ȣ������.png")));
			}
		});
		btnLoad.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				btnLoad.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/������ȣ�����.png")));
			}
		});

		btnRead = new JButton("");
		btnRead.setIcon(new ImageIcon(MyMenu.class
				.getResource("images/��ȡ����.png")));
		btnRead.setBounds(204, 420, 352, 84);
		contentPane.add(btnRead);
		btnRead.setContentAreaFilled(false);
		btnRead.setBorderPainted(false);
		// \uFF08\u4EAE\uFF09.png" ��
		btnRead.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnRead.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ȡ���ȣ�����.png")));
			}
		});
		btnRead.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnRead.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ȡ����.png")));
			}
		});
		btnRead.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				btnRead.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ȡ���ȣ������.png")));
			}
		});
		btnRead.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				btnRead.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/��ȡ���ȣ�����.png")));
			}
		});

		btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(MyMenu.class
				.getResource("images/�˳���Ϸ.png")));
		btnExit.setBounds(204, 588, 352, 84);
		contentPane.add(btnExit);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);

		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/�˳���Ϸ������.png")));
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/�˳���Ϸ.png")));
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/�˳���Ϸ�������.png")));
				System.exit(0);
			}
		});
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(MyMenu.class
						.getResource("images/�˳���Ϸ������.png")));
			}
		});

		JLabel lblMenu = new JLabel("");
		lblMenu.setIcon(new ImageIcon("src/cn/zpq/images/load.png"));
		lblMenu.setBounds(0, 0, 760, 760);
		contentPane.add(lblMenu);
		setLocationRelativeTo(null);
		setResizable(false);

	}
}
