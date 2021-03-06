package com.emr.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class HomeScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel titleBar;
	private JPanel iconmaxmizeClose;
	private JPanel maximizeBtn;
	private JLabel maximizeIcon;
	private JPanel closeBtn;
	private JPanel minBtn;
	private JLabel closeIcon;
	private JLabel minIcon;
	private JPanel sideMenuBar;
	private JPanel brandTitle;
	private JLabel brandLogo;
	private JPanel midTitlePanel;
	private JLabel midTitle;
	private JPanel initialsPanel;
	private JLabel userNameText;
	private JPanel menuContainer;
	private JPanel userPanel;
	private JLabel nameBackLbl;
	private JPanel homeBtn;
	private JLabel homeIcon;
	private JLabel lblHome;
	private JPanel historyBtn;
	private JLabel historyIcon;
	private JLabel historyLbl;
	private JPanel inventoryBtn;
	private JPanel usersBtn;
	private JLabel inventoryIcon;
	private JLabel inventoryLbl;
	private JLabel usersIcon;
	private JLabel usersLbl;
	private JPanel settingsBtn;
	private JPanel subMenuContainer;
	private JLabel settingsIcon;
	private JLayeredPane bodyLayeredPan;
	private JPanel appointmentPanel;
	private JPanel addPatientPanel;
	private JPanel patientPanel;
	private JPanel patientHeadingPanel;
	private JPanel patientProfilePanel;
	private JLabel patientLogoIcon;
	private JPanel sideMenuPanel;
	private JLabel patientProfileText;
	private JPanel cancelPanel;
	private JPanel sideMenuContainer;
	private JPanel closeCasePanel;
	private JLabel closeCaseIcon;
	private JPanel viewPanel;
	private JLabel viewIcon;
	private JPanel downloadPanel;
	private JLabel downloadIcon;
	private JPanel savePanel;
	private JLabel saveIcon;
	private JLabel cancelIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
					frame.initEvents();
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
	public HomeScreen() {

		initComponents();
/**
		Router.INSTANCE.setLayeredPane(bodyLayeredPan);

		appointmentPanel = new AppointmentPanel();
		Router.INSTANCE.registerRoute(appointmentPanel);
		bodyLayeredPan.add(appointmentPanel, BorderLayout.CENTER);

		addPatientPanel = new AddAppointmentPanel();
		Router.INSTANCE.registerRoute(addPatientPanel);
		bodyLayeredPan.add(addPatientPanel, BorderLayout.CENTER);
**/
		patientPanel = new JPanel();
		Router.INSTANCE.registerRoute(patientPanel);
		bodyLayeredPan.add(patientPanel, BorderLayout.CENTER);

		patientPanel.setBackground(Color.decode("#ffffff"));
		patientPanel.setLayout(new BorderLayout(0, 0));

		patientHeadingPanel = new JPanel();
		patientHeadingPanel.setBorder(new LineBorder(Color.decode("#bfbfbf")));
		patientHeadingPanel.setBackground(Color.decode("#4d94ff"));
		patientHeadingPanel.setPreferredSize(new Dimension(70, 70));

		patientPanel.add(patientHeadingPanel, BorderLayout.NORTH);
		patientHeadingPanel.setLayout(new BorderLayout(0, 0));
		
		patientProfilePanel = new JPanel();
		patientProfilePanel.setOpaque(false);
		patientProfilePanel.setPreferredSize(new Dimension(450, 10));
		patientHeadingPanel.add(patientProfilePanel, BorderLayout.WEST);
		patientProfilePanel.setLayout(null);
		
		patientLogoIcon = new JLabel("S");
		patientLogoIcon.setForeground(Color.decode("#262626"));
		patientLogoIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		patientLogoIcon.setHorizontalAlignment(SwingConstants.CENTER);
		patientLogoIcon.setFont(new Font("Open Sans", Font.BOLD, 35));
		patientLogoIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/patient-logo.png")));
		patientLogoIcon.setBounds(22, 0, 64, 68);
		patientProfilePanel.add(patientLogoIcon);
		
		patientProfileText = new JLabel();
		patientProfileText.setText("PAT-32345  |  Siddharth Kumar   |  30 Male");
		patientProfileText.setHorizontalTextPosition(SwingConstants.CENTER);
		patientProfileText.setHorizontalAlignment(SwingConstants.CENTER);
		patientProfileText.setForeground(Color.decode("#ffffff"));
		patientProfileText.setFont(new Font("Open Sans", Font.BOLD, 14));
		patientProfileText.setBounds(85, 12, 320, 47);
		patientProfilePanel.add(patientProfileText);
		
		sideMenuPanel = new JPanel();
		sideMenuPanel.setPreferredSize(new Dimension(400, 10));
		sideMenuPanel.setOpaque(false);
		patientHeadingPanel.add(sideMenuPanel, BorderLayout.EAST);
		sideMenuPanel.setLayout(null);
		
		sideMenuContainer = new JPanel();
		sideMenuContainer.setOpaque(false);
		sideMenuContainer.setBounds(12, 12, 357, 44);
		sideMenuPanel.add(sideMenuContainer);
		sideMenuContainer.setLayout(null);
		
		closeCasePanel = new JPanel();
		closeCasePanel.setToolTipText("Close Case");
		closeCasePanel.setOpaque(false);
		closeCasePanel.setBounds(77, 0, 44, 44);
		sideMenuContainer.add(closeCasePanel);
		closeCasePanel.setLayout(new BorderLayout(0, 0));
		
		closeCaseIcon = new JLabel("");
		closeCaseIcon.setBackground(Color.decode("#4d94ff"));
		closeCaseIcon.setOpaque(true);
		closeCaseIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/close-32.png")));
		closeCaseIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		closeCaseIcon.setHorizontalAlignment(SwingConstants.CENTER);
		closeCasePanel.add(closeCaseIcon, BorderLayout.CENTER);
		
		viewPanel = new JPanel();
		viewPanel.setToolTipText("View Prescription");
		viewPanel.setOpaque(false);
		viewPanel.setBounds(133, 0, 44, 44);
		sideMenuContainer.add(viewPanel);
		viewPanel.setLayout(new BorderLayout(0, 0));
		
		viewIcon = new JLabel("");
		viewIcon.setBackground(Color.decode("#4d94ff"));
		viewIcon.setOpaque(true);
		viewIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/view-32.png")));
		viewIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		viewIcon.setHorizontalAlignment(SwingConstants.CENTER);
		viewPanel.add(viewIcon, BorderLayout.CENTER);
		
		downloadPanel = new JPanel();
		downloadPanel.setToolTipText("Download Prescription");
		downloadPanel.setOpaque(false);
		downloadPanel.setBounds(189, 0, 44, 44);
		sideMenuContainer.add(downloadPanel);
		downloadPanel.setLayout(new BorderLayout(0, 0));
		
		downloadIcon = new JLabel("");
		downloadIcon.setBackground(Color.decode("#4d94ff"));
		downloadIcon.setOpaque(true);
		downloadIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/download-32.png")));
		downloadIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		downloadIcon.setHorizontalAlignment(SwingConstants.CENTER);
		downloadPanel.add(downloadIcon, BorderLayout.CENTER);
		
		savePanel = new JPanel();
		savePanel.setToolTipText("Save Data");
		savePanel.setOpaque(false);
		savePanel.setBounds(245, 0, 44, 44);
		sideMenuContainer.add(savePanel);
		savePanel.setLayout(new BorderLayout(0, 0));
		
		saveIcon = new JLabel("");
		saveIcon.setBackground(Color.decode("#4d94ff"));
		saveIcon.setOpaque(true);
		saveIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		saveIcon.setHorizontalAlignment(SwingConstants.CENTER);
		saveIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/save-32.png")));
		savePanel.add(saveIcon, BorderLayout.CENTER);
		
		cancelPanel = new JPanel();
		cancelPanel.setBounds(301, 0, 44, 44);
		sideMenuContainer.add(cancelPanel);
		cancelPanel.setLayout(new BorderLayout(0, 0));
		
		cancelIcon = new JLabel("");
		cancelIcon.setOpaque(true);
		cancelIcon.setToolTipText("Go Back");
		cancelIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/back-32.png")));
		cancelIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		cancelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		cancelPanel.add(cancelIcon, BorderLayout.CENTER);

	}

	private void initComponents() {
		setTitle("Orange EMR");
		setFont(new Font("Open Sans", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(HomeScreen.class.getResource("/com/emr/app/images/breakfast-30.png")));
		setBackground(Color.decode("#ffffff"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 950, 550);
		setResizable(true);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Open Sans", Font.PLAIN, 12));
		contentPane.setBackground(Color.decode("#ffffff"));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		titleBar = new JPanel();
		titleBar.setBorder(new LineBorder(new Color(166, 166, 166), 0));
		titleBar.setBackground(Color.decode("#262626"));
		titleBar.setPreferredSize(new Dimension(10, 30));
		contentPane.add(titleBar, BorderLayout.NORTH);
		titleBar.setLayout(new BorderLayout(0, 0));

		iconmaxmizeClose = new JPanel();
		iconmaxmizeClose.setAlignmentX(0.0f);
		iconmaxmizeClose.setAlignmentY(0.0f);
		iconmaxmizeClose.setBackground(Color.decode("#262626"));
		iconmaxmizeClose.setPreferredSize(new Dimension(105, 10));
		iconmaxmizeClose.setBorder(null);
		titleBar.add(iconmaxmizeClose, BorderLayout.EAST);
		iconmaxmizeClose.setLayout(null);

		maximizeBtn = new JPanel();
		maximizeBtn.setBorder(null);
		maximizeBtn.setBackground(Color.decode("#262626"));
		maximizeBtn.setPreferredSize(new Dimension(35, 10));
		maximizeBtn.setBounds(35, 0, 35, 30);
		iconmaxmizeClose.add(maximizeBtn);
		maximizeBtn.setLayout(new BorderLayout(0, 0));

		maximizeIcon = new JLabel("");
		maximizeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		maximizeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		maximizeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/maximize-24.png")));
		maximizeBtn.add(maximizeIcon, BorderLayout.CENTER);

		closeBtn = new JPanel();
		closeBtn.setBorder(null);
		closeBtn.setBackground(Color.decode("#262626"));
		closeBtn.setPreferredSize(new Dimension(35, 10));
		closeBtn.setBounds(70, 0, 35, 30);
		iconmaxmizeClose.add(closeBtn);
		closeBtn.setLayout(new BorderLayout(0, 0));

		closeIcon = new JLabel("");
		closeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/close-24.png")));
		closeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		closeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		closeBtn.add(closeIcon, BorderLayout.CENTER);

		minBtn = new JPanel();
		minBtn.setBorder(null);
		minBtn.setBackground(Color.decode("#262626"));
		minBtn.setPreferredSize(new Dimension(35, 10));
		minBtn.setBounds(0, 0, 35, 30);
		iconmaxmizeClose.add(minBtn);
		minBtn.setLayout(new BorderLayout(0, 0));

		minIcon = new JLabel("");
		minIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/min-20.png")));
		minIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		minIcon.setHorizontalAlignment(SwingConstants.CENTER);
		minBtn.add(minIcon, BorderLayout.CENTER);

		brandTitle = new JPanel();
		brandTitle.setBackground(Color.decode("#262626"));
		brandTitle.setPreferredSize(new Dimension(80, 10));
		titleBar.add(brandTitle, BorderLayout.WEST);
		brandTitle.setLayout(new BorderLayout(0, 0));

		brandLogo = new JLabel("Orange");
		brandLogo.setFont(new Font("Open Sans", Font.BOLD, 12));
		brandLogo.setForeground(Color.decode("#ffffff"));
		brandLogo.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/breakfast-30.png")));
		brandTitle.add(brandLogo, BorderLayout.CENTER);

		midTitlePanel = new JPanel();
		midTitlePanel.setBackground(Color.decode("#262626"));
		titleBar.add(midTitlePanel, BorderLayout.CENTER);
		midTitlePanel.setLayout(new BorderLayout(0, 0));

		midTitle = new JLabel("Electronic Medical Record");
		midTitle.setHorizontalAlignment(SwingConstants.CENTER);
		midTitle.setForeground(Color.decode("#ffffff"));
		midTitle.setFont(new Font("Open Sans", Font.BOLD, 12));
		midTitlePanel.add(midTitle, BorderLayout.CENTER);

		sideMenuBar = new JPanel();
		sideMenuBar.setPreferredSize(new Dimension(80, 10));
		sideMenuBar.setBackground(Color.decode("#0d0d0d"));
		contentPane.add(sideMenuBar, BorderLayout.WEST);
		sideMenuBar.setLayout(new BorderLayout(0, 0));

		userPanel = new JPanel();
		userPanel.setBorder(null);
		userPanel.setBackground(Color.decode("#0d0d0d"));
		userPanel.setPreferredSize(new Dimension(10, 120));
		sideMenuBar.add(userPanel, BorderLayout.NORTH);
		userPanel.setLayout(new BorderLayout(0, 0));

		initialsPanel = new JPanel();
		initialsPanel.setBackground(Color.decode("#0d0d0d"));
		initialsPanel.setPreferredSize(new Dimension(10, 80));
		userPanel.add(initialsPanel, BorderLayout.NORTH);
		initialsPanel.setLayout(null);

		nameBackLbl = new JLabel("V");
		nameBackLbl.setForeground(Color.decode("#ffffff"));
		nameBackLbl.setFont(new Font("Open Sans", Font.BOLD, 40));
		nameBackLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		nameBackLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameBackLbl.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/nameBack-64.png")));
		nameBackLbl.setBounds(0, 12, 80, 70);
		initialsPanel.add(nameBackLbl);

		userNameText = new JLabel("Dr. Vikash");
		userNameText.setPreferredSize(new Dimension(54, 10));
		userNameText.setForeground(Color.decode("#ffffff"));
		userNameText.setHorizontalAlignment(SwingConstants.CENTER);
		userNameText.setFont(new Font("Open Sans", Font.BOLD, 12));
		userPanel.add(userNameText, BorderLayout.CENTER);

		menuContainer = new JPanel();
		menuContainer.setBackground(Color.decode("#0d0d0d"));
		sideMenuBar.add(menuContainer, BorderLayout.CENTER);
		menuContainer.setLayout(new BorderLayout(0, 0));

		settingsBtn = new JPanel();
		settingsBtn.setPreferredSize(new Dimension(10, 53));
		settingsBtn.setLayout(new BorderLayout(0, 0));
		settingsBtn.setBackground(Color.decode("#0d0d0d"));
		// settingsBtn.setBorder(new LineBorder(Color.decode("#737373")));
		menuContainer.add(settingsBtn, BorderLayout.SOUTH);

		settingsIcon = new JLabel("");
		settingsIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/settings-32.png")));
		settingsIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		settingsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		settingsBtn.add(settingsIcon, BorderLayout.CENTER);

		subMenuContainer = new JPanel();
		subMenuContainer.setBackground(Color.decode("#0d0d0d"));
		menuContainer.add(subMenuContainer, BorderLayout.CENTER);
		subMenuContainer.setLayout(null);

		homeBtn = new JPanel();
		homeBtn.setBorder(new LineBorder(Color.decode("#737373")));
		homeBtn.setBounds(0, 38, 80, 53);
		homeBtn.setBackground(Color.decode("#0d0d0d"));
		subMenuContainer.add(homeBtn);
		homeBtn.setLayout(new BorderLayout(0, 0));

		homeIcon = new JLabel("");
		homeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/home-32.png")));
		homeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		homeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		homeBtn.add(homeIcon, BorderLayout.NORTH);

		lblHome = new JLabel("Home");
		lblHome.setForeground(Color.decode("#d9d9d9"));
		lblHome.setFont(new Font("Open Sans", Font.BOLD, 12));
		lblHome.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		homeBtn.add(lblHome, BorderLayout.SOUTH);

		historyBtn = new JPanel();
		historyBtn.setBorder(new LineBorder(Color.decode("#737373")));
		historyBtn.setBackground(Color.decode("#0d0d0d"));
		historyBtn.setBounds(0, 103, 80, 53);
		subMenuContainer.add(historyBtn);
		historyBtn.setLayout(new BorderLayout(0, 0));

		historyIcon = new JLabel("");
		historyIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		historyIcon.setHorizontalAlignment(SwingConstants.CENTER);
		historyIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/history-32.png")));
		historyBtn.add(historyIcon, BorderLayout.NORTH);

		historyLbl = new JLabel("History");
		historyLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		historyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		historyLbl.setForeground(new Color(217, 217, 217));
		historyLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		historyBtn.add(historyLbl, BorderLayout.SOUTH);

		inventoryBtn = new JPanel();
		inventoryBtn.setBorder(new LineBorder(Color.decode("#737373")));
		inventoryBtn.setBackground(Color.decode("#0d0d0d"));
		inventoryBtn.setBounds(0, 168, 80, 53);
		subMenuContainer.add(inventoryBtn);
		inventoryBtn.setLayout(new BorderLayout(0, 0));

		inventoryIcon = new JLabel("");
		inventoryIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/inventory-32.png")));
		inventoryIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		inventoryIcon.setHorizontalAlignment(SwingConstants.CENTER);
		inventoryBtn.add(inventoryIcon, BorderLayout.NORTH);

		inventoryLbl = new JLabel("Inventory");
		inventoryLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		inventoryLbl.setHorizontalAlignment(SwingConstants.CENTER);
		inventoryLbl.setForeground(new Color(217, 217, 217));
		inventoryLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		inventoryBtn.add(inventoryLbl, BorderLayout.SOUTH);

		usersBtn = new JPanel();
		usersBtn.setBorder(new LineBorder(Color.decode("#737373")));
		usersBtn.setBackground(Color.decode("#0d0d0d"));
		usersBtn.setBounds(0, 233, 80, 53);
		subMenuContainer.add(usersBtn);
		usersBtn.setLayout(new BorderLayout(0, 0));

		usersIcon = new JLabel("");
		usersIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/users-32.png")));
		usersIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		usersIcon.setHorizontalAlignment(SwingConstants.CENTER);
		usersBtn.add(usersIcon, BorderLayout.NORTH);

		usersLbl = new JLabel("Users");
		usersLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		usersLbl.setHorizontalAlignment(SwingConstants.CENTER);
		usersLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		usersLbl.setForeground(new Color(217, 217, 217));
		usersBtn.add(usersLbl, BorderLayout.SOUTH);

		bodyLayeredPan = new JLayeredPane();
		contentPane.add(bodyLayeredPan, BorderLayout.CENTER);
		bodyLayeredPan.setLayout(new CardLayout(0, 0));
	}

	public void initEvents() {
		maximizeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), maximizeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), maximizeBtn);
			}
		});

		closeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), closeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), closeBtn);
			}
		});

		minBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), minBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), minBtn);
			}
		});

		closeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		maximizeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
					setExtendedState(JFrame.MAXIMIZED_BOTH);
				} else {
					setExtendedState(JFrame.NORMAL);
				}
			}
		});

		minBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});

		homeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), homeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), homeBtn);
			}
		});

		historyBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), historyBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), historyBtn);
			}
		});

		inventoryBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), inventoryBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), inventoryBtn);
			}
		});

		usersBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), usersBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), usersBtn);
			}
		});

		settingsBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), settingsBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), settingsBtn);
			}
		});
		
		cancelPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), cancelPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), cancelPanel);
			}
		});
	}

	private void changeColor(Color color, Component component) {
		component.setBackground(color);
	}
}

class DateLabelFormatter extends AbstractFormatter {

	private String datePattern = "yyyy-MM-dd";
	private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	@Override
	public Object stringToValue(String text) throws ParseException {
		return dateFormatter.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		if (value != null) {
			Calendar cal = (Calendar) value;
			return dateFormatter.format(cal.getTime());
		}

		return "";
	}

}
