import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;

public class Window extends JFrame implements WindowListener {
	
	JSlider slider;
	JButton lightDarkBlue;
	JButton darkDarkBlue;
	JButton lightPurple;
	JButton darkPurple;
	JButton lightYellow;
	JButton darkYellow;
	JButton lightBrown;
	JButton darkBrown;
	JButton lightOrange;
	JButton darkOrange;
	JButton lightPink;
	JButton darkPink;
	JButton lightGreen;
	JButton darkGreen;
	JButton lightLightGreen;
	JButton darkLightGreen;
	JButton lightRed;
	JButton darkRed;
	JButton lightBlue;
	JButton darkBlue;
	JButton gray;
	JButton black;
	JButton eraser;
	JButton clear;
	
	// %%%%%%%%%%%%%%%%% COLOR CLASS %%%%%%%%%%%%%%%%%%%%%%%
	class ColorPickerWindow extends JDialog {
		public int WIDTH = 100;
		public int HEIGHT = 510;	
		
		Point compCoords;
		
		public ColorPickerWindow() {
			setUndecorated(true);
			setAlwaysOnTop(true);
			setSize(WIDTH, HEIGHT);
			
			setLayout(new BorderLayout());
			
			JPanel northPanel = new JPanel();
			northPanel.setBackground(new Color(31, 33, 35));		
			northPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));	
					
			compCoords = null;
			northPanel.addMouseListener(new MouseListener() {

				public void mouseClicked(MouseEvent e) {
					
				}

				public void mousePressed(MouseEvent e) {
					compCoords = e.getPoint();
				}

				public void mouseReleased(MouseEvent e) {
					compCoords = null;
				}
				
				public void mouseEntered(MouseEvent e) {
					
				}
				
				public void mouseExited(MouseEvent e) {
					
				}
			});
			northPanel.addMouseMotionListener(new MouseMotionListener() {

				public void mouseDragged(MouseEvent e) {
					Point currCoords = e.getLocationOnScreen();
					setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
				}

				public void mouseMoved(MouseEvent e) {

				}
			});
			
			add(northPanel, BorderLayout.NORTH);
			
			JPanel colorPanel = new JPanel();
			colorPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			slider = new JSlider(SwingConstants.HORIZONTAL, 2, 50, 15);
			slider.setPreferredSize(new Dimension(90, 20));
			slider.setBorder(BorderFactory.createEmptyBorder(2, 8, 0, 0));
			slider.setMajorTickSpacing(2);
			
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					drawArea.setBrushSize(slider.getValue());
				}
			});
			
			colorPanel.add(slider);
			
			int leftSpace = 6;
			
			URL urlLightDarkBlue = Main.class.getResource("/Colors/_0000_light-dark-blue.png");
			lightDarkBlue = new JButton(new ImageIcon(urlLightDarkBlue));
			//lightDarkBlue.setPreferredSize(new Dimension(20, 17));
			lightDarkBlue.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightDarkBlue.setBackground(new Color(0, 0, 0, 0));
			lightDarkBlue.setOpaque(false);
			lightDarkBlue.setBorderPainted(false);
			lightDarkBlue.setFocusPainted(false);
			lightDarkBlue.setContentAreaFilled(false);
			lightDarkBlue.addActionListener(actionListener);
			
			URL urlDarkDarkBlue = Main.class.getResource("/Colors/_0001_dark-dark-blue.png");
			darkDarkBlue = new JButton(new ImageIcon(urlDarkDarkBlue));
			//darkDarkBlue.setPreferredSize(new Dimension(20, 17));
			darkDarkBlue.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkDarkBlue.setBackground(new Color(0, 0, 0, 0));
			darkDarkBlue.setOpaque(false);
			darkDarkBlue.setBorderPainted(false);
			darkDarkBlue.setFocusPainted(false);
			darkDarkBlue.setContentAreaFilled(false);
			darkDarkBlue.addActionListener(actionListener);
			
			URL urlLightpurple = Main.class.getResource("/Colors/_0002_light-purple.png");
			lightPurple = new JButton(new ImageIcon(urlLightpurple));
			//lightPurple.setPreferredSize(new Dimension(20, 17));
			lightPurple.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightPurple.setBackground(new Color(0, 0, 0, 0));
			lightPurple.setOpaque(false);
			lightPurple.setBorderPainted(false);
			lightPurple.setFocusPainted(false);
			lightPurple.setContentAreaFilled(false);
			lightPurple.addActionListener(actionListener);
			
			URL urlDarkpurple = Main.class.getResource("/Colors/_0003_dark-purple.png");
			darkPurple = new JButton(new ImageIcon(urlDarkpurple));
			//darkPurple.setPreferredSize(new Dimension(20, 17));
			darkPurple.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkPurple.setBackground(new Color(0, 0, 0, 0));
			darkPurple.setOpaque(false);
			darkPurple.setBorderPainted(false);
			darkPurple.setFocusPainted(false);
			darkPurple.setContentAreaFilled(false);
			darkPurple.addActionListener(actionListener);
			
			URL urlLightYellow = Main.class.getResource("/Colors/_0004_light-yellow.png");
			lightYellow = new JButton(new ImageIcon(urlLightYellow));
			//lightYellow.setPreferredSize(new Dimension(20, 17));
			lightYellow.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightYellow.setBackground(new Color(0, 0, 0, 0));
			lightYellow.setOpaque(false);
			lightYellow.setBorderPainted(false);
			lightYellow.setFocusPainted(false);
			lightYellow.setContentAreaFilled(false);
			lightYellow.addActionListener(actionListener);
			
			URL urlDarkYellow = Main.class.getResource("/Colors/_0005_dark-yellow.png");
			darkYellow = new JButton(new ImageIcon(urlDarkYellow));
			//darkYellow.setPreferredSize(new Dimension(20, 17));
			darkYellow.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkYellow.setBackground(new Color(0, 0, 0, 0));
			darkYellow.setOpaque(false);
			darkYellow.setBorderPainted(false);
			darkYellow.setFocusPainted(false);
			darkYellow.setContentAreaFilled(false);
			darkYellow.addActionListener(actionListener);
			
			URL urlLightBrown = Main.class.getResource("/Colors/_0006_light-brown.png");
			lightBrown = new JButton(new ImageIcon(urlLightBrown));
			//lightBrown.setPreferredSize(new Dimension(20, 17));
			lightBrown.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightBrown.setBackground(new Color(0, 0, 0, 0));
			lightBrown.setOpaque(false);
			lightBrown.setBorderPainted(false);
			lightBrown.setFocusPainted(false);
			lightBrown.setContentAreaFilled(false);
			lightBrown.addActionListener(actionListener);
			
			URL urlDarkBrown = Main.class.getResource("/Colors/_0007_dark-brown.png");
			darkBrown = new JButton(new ImageIcon(urlDarkBrown));
			//darkBrown.setPreferredSize(new Dimension(20, 17));
			darkBrown.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkBrown.setBackground(new Color(0, 0, 0, 0));
			darkBrown.setOpaque(false);
			darkBrown.setBorderPainted(false);
			darkBrown.setFocusPainted(false);
			darkBrown.setContentAreaFilled(false);
			darkBrown.addActionListener(actionListener);
			
			URL urlLightOrange = Main.class.getResource("/Colors/_0008_light-orange.png");
			lightOrange = new JButton(new ImageIcon(urlLightOrange));
			//lightOrange.setPreferredSize(new Dimension(20, 17));
			lightOrange.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightOrange.setBackground(new Color(0, 0, 0, 0));
			lightOrange.setOpaque(false);
			lightOrange.setBorderPainted(false);
			lightOrange.setFocusPainted(false);
			lightOrange.setContentAreaFilled(false);
			lightOrange.addActionListener(actionListener);
			
			URL urlDarkOrange = Main.class.getResource("/Colors/_0009_dark-orange.png");
			darkOrange = new JButton(new ImageIcon(urlDarkOrange));
			//darkOrange.setPreferredSize(new Dimension(20, 17));
			darkOrange.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkOrange.setBackground(new Color(0, 0, 0, 0));
			darkOrange.setOpaque(false);
			darkOrange.setBorderPainted(false);
			darkOrange.setFocusPainted(false);
			darkOrange.setContentAreaFilled(false);
			darkOrange.addActionListener(actionListener);
			
			URL urlLightPink = Main.class.getResource("/Colors/_0010_llight-pink.png");
			lightPink = new JButton(new ImageIcon(urlLightPink));
			//lightPink.setPreferredSize(new Dimension(20, 17));
			lightPink.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightPink.setBackground(new Color(0, 0, 0, 0));
			lightPink.setOpaque(false);
			lightPink.setBorderPainted(false);
			lightPink.setFocusPainted(false);
			lightPink.setContentAreaFilled(false);
			lightPink.addActionListener(actionListener);
			
			URL urlDarkPink = Main.class.getResource("/Colors/_0011_dark-pink.png");
			darkPink = new JButton(new ImageIcon(urlDarkPink));
			//darkPink.setPreferredSize(new Dimension(20, 17));
			darkPink.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkPink.setBackground(new Color(0, 0, 0, 0));
			darkPink.setOpaque(false);
			darkPink.setBorderPainted(false);
			darkPink.setFocusPainted(false);
			darkPink.setContentAreaFilled(false);
			darkPink.addActionListener(actionListener);
			
			URL urlLightGreen = Main.class.getResource("/Colors/_0012_light-green.png");
			lightGreen = new JButton(new ImageIcon(urlLightGreen));
			//lightGreen.setPreferredSize(new Dimension(20, 17));
			lightGreen.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightGreen.setBackground(new Color(0, 0, 0, 0));
			lightGreen.setOpaque(false);
			lightGreen.setBorderPainted(false);
			lightGreen.setFocusPainted(false);
			lightGreen.setContentAreaFilled(false);
			lightGreen.addActionListener(actionListener);
			
			URL urlDarkGreen = Main.class.getResource("/Colors/_0013_dark-green.png");
			darkGreen = new JButton(new ImageIcon(urlDarkGreen));
			//darkGreen.setPreferredSize(new Dimension(20, 17));
			darkGreen.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkGreen.setBackground(new Color(0, 0, 0, 0));
			darkGreen.setOpaque(false);
			darkGreen.setBorderPainted(false);
			darkGreen.setFocusPainted(false);
			darkGreen.setContentAreaFilled(false);
			darkGreen.addActionListener(actionListener);
			
			URL urlLightLightGreen = Main.class.getResource("/Colors/_0014_light-light-green.png");
			lightLightGreen = new JButton(new ImageIcon(urlLightLightGreen));
			//lightLightGreen.setPreferredSize(new Dimension(20, 17));
			lightLightGreen.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightLightGreen.setBackground(new Color(0, 0, 0, 0));
			lightLightGreen.setOpaque(false);
			lightLightGreen.setBorderPainted(false);
			lightLightGreen.setFocusPainted(false);
			lightLightGreen.setContentAreaFilled(false);
			lightLightGreen.addActionListener(actionListener);
			
			URL urlDarkLightGreen = Main.class.getResource("/Colors/_0015_dark-light-green.png");
			darkLightGreen = new JButton(new ImageIcon(urlDarkLightGreen));
			//darkLightGreen.setPreferredSize(new Dimension(20, 17));
			darkLightGreen.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkLightGreen.setBackground(new Color(0, 0, 0, 0));
			darkLightGreen.setOpaque(false);
			darkLightGreen.setBorderPainted(false);
			darkLightGreen.setFocusPainted(false);
			darkLightGreen.setContentAreaFilled(false);
			darkLightGreen.addActionListener(actionListener);
			
			URL urlLightRed = Main.class.getResource("/Colors/_0016_light-red.png");
			lightRed = new JButton(new ImageIcon(urlLightRed));
			//lightRed.setPreferredSize(new Dimension(20, 17));
			lightRed.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightRed.setBackground(new Color(0, 0, 0, 0));
			lightRed.setOpaque(false);
			lightRed.setBorderPainted(false);
			lightRed.setFocusPainted(false);
			lightRed.setContentAreaFilled(false);
			lightRed.addActionListener(actionListener);
			
			URL urlDarkRed = Main.class.getResource("/Colors/_0017_dark-red.png");
			darkRed = new JButton(new ImageIcon(urlDarkRed));
			//darkRed.setPreferredSize(new Dimension(20, 17));
			darkRed.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkRed.setBackground(new Color(0, 0, 0, 0));
			darkRed.setOpaque(false);
			darkRed.setBorderPainted(false);
			darkRed.setFocusPainted(false);
			darkRed.setContentAreaFilled(false);
			darkRed.addActionListener(actionListener);
			
			URL urlLightBlue = Main.class.getResource("/Colors/_0018_light-blue.png");
			lightBlue = new JButton(new ImageIcon(urlLightBlue));
			//lightBlue.setPreferredSize(new Dimension(20, 17));
			lightBlue.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			lightBlue.setBackground(new Color(0, 0, 0, 0));
			lightBlue.setOpaque(false);
			lightBlue.setBorderPainted(false);
			lightBlue.setFocusPainted(false);
			lightBlue.setContentAreaFilled(false);
			lightBlue.addActionListener(actionListener);
			
			URL urlDarkBlue = Main.class.getResource("/Colors/_0019_dark-blue.png");
			darkBlue = new JButton(new ImageIcon(urlDarkBlue));
			//darkBlue.setPreferredSize(new Dimension(20, 17));
			darkBlue.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			darkBlue.setBackground(new Color(0, 0, 0, 0));
			darkBlue.setOpaque(false);
			darkBlue.setBorderPainted(false);
			darkBlue.setFocusPainted(false);
			darkBlue.setContentAreaFilled(false);
			darkBlue.addActionListener(actionListener);
			
			URL urlGray = Main.class.getResource("/Colors/_0020_gray.png");
			gray = new JButton(new ImageIcon(urlGray));
			//gray.setPreferredSize(new Dimension(20, 17));
			gray.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			gray.setBackground(new Color(0, 0, 0, 0));
			gray.setOpaque(false);
			gray.setBorderPainted(false);
			gray.setFocusPainted(false);
			gray.setContentAreaFilled(false);
			gray.addActionListener(actionListener);
			
			URL urlblack = Main.class.getResource("/Colors/_0021_black.png");
			black = new JButton(new ImageIcon(urlblack));
			//black.setPreferredSize(new Dimension(20, 17));
			black.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			black.setBackground(new Color(0, 0, 0, 0));
			black.setOpaque(false);
			black.setBorderPainted(false);
			black.setFocusPainted(false);
			black.setContentAreaFilled(false);
			black.addActionListener(actionListener);
			
			URL urlEraser = Main.class.getResource("/eraser.png");
			eraser = new JButton(new ImageIcon(urlEraser));
			//eraser.setPreferredSize(new Dimension(20, 17));
			eraser.setBorder(BorderFactory.createEmptyBorder(2, leftSpace, 0, 0));
			eraser.setBackground(new Color(0, 0, 0, 0));
			eraser.setOpaque(false);
			eraser.setBorderPainted(false);
			eraser.setFocusPainted(false);
			eraser.setContentAreaFilled(false);
			eraser.addActionListener(actionListener);
			
			URL urlClear = Main.class.getResource("/clear.png");
			clear = new JButton(new ImageIcon(urlClear));
			//clear.setPreferredSize(new Dimension(20, 17));
			clear.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
			clear.setBackground(new Color(0, 0, 0, 0));
			clear.setOpaque(false);
			clear.setBorderPainted(false);
			clear.setFocusPainted(false);
			clear.setContentAreaFilled(false);
			clear.addActionListener(actionListener);
			
			colorPanel.add(eraser);
			colorPanel.add(clear);
			colorPanel.add(lightDarkBlue);
			colorPanel.add(darkDarkBlue);
			colorPanel.add(lightPurple);
			colorPanel.add(darkPurple);
			colorPanel.add(lightYellow);
			colorPanel.add(darkYellow);
			colorPanel.add(lightBrown);
			colorPanel.add(darkBrown);
			colorPanel.add(lightOrange);
			colorPanel.add(darkOrange);
			colorPanel.add(lightPink);
			colorPanel.add(darkPink);
			colorPanel.add(lightGreen);
			colorPanel.add(darkGreen);
			colorPanel.add(lightLightGreen);
			colorPanel.add(darkLightGreen);
			colorPanel.add(lightRed);
			colorPanel.add(darkRed);
			colorPanel.add(lightBlue);
			colorPanel.add(darkBlue);
			colorPanel.add(gray);
			colorPanel.add(black);
			
			add(colorPanel, BorderLayout.CENTER);
			    
			//Centers window in the screen
		    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		    setLocation(x -  6 * WIDTH, y - HEIGHT/5);
		    
		    // Rounded Corners
		    setShape(new RoundRectangle2D.Double(5, 5, WIDTH - 5, HEIGHT - 5, 5, 5));
		    
			setVisible(true);
		}
		
		
	}
	
	// %%%%%%%%%%%%%%%%% WINDOW CLASS %%%%%%%%%%%%%%%%%%%%%%%
	public static int WIDTH = 1100;
	public static int HEIGHT = 800;	
	
	static Point compCoords;
	DrawArea drawArea;
	ActionListener actionListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == lightDarkBlue) {
				drawArea.lightDarkBlue();
			} else if(e.getSource() == darkDarkBlue) {
				drawArea.darkDarkBlue();
			} else if(e.getSource() == lightPurple) {
				drawArea.lightPurple();
			} else if(e.getSource() == darkPurple) {
				drawArea.darkPurple();
			} else if(e.getSource() == lightYellow) {
				drawArea.lightYellow();
			} else if(e.getSource() == darkYellow) {
				drawArea.darkYellow();
			} else if(e.getSource() == lightBrown) {
				drawArea.lightBrown();
			} else if(e.getSource() == darkBrown) {
				drawArea.darkBrown();
			} else if(e.getSource() == lightOrange) {
				drawArea.lightOrange();
			} else if(e.getSource() == darkOrange) {
				drawArea.darkOrange();
			} else if(e.getSource() == lightPink) {
				drawArea.lightPink();
			} else if(e.getSource() == darkPink) {
				drawArea.darkPink();
			} else if(e.getSource() == lightGreen) {
				drawArea.lightGreen();
			} else if(e.getSource() == darkGreen) {
				drawArea.darkGreen();
			} else if(e.getSource() == lightLightGreen) {
				drawArea.lightLightGreen();
			} else if(e.getSource() == darkLightGreen) {
				drawArea.darkLightGreen();
			} else if(e.getSource() == lightRed) {
				drawArea.lightRed();
			} else if(e.getSource() == darkRed) {
				drawArea.darkRed();
			} else if(e.getSource() == lightBlue) {
				drawArea.lightBlue();
			} else if(e.getSource() == darkBlue) {
				drawArea.darkBlue();
			} else if(e.getSource() == gray) {
				drawArea.gray();
			} else if(e.getSource() == black) {
				drawArea.black();
			} else if(e.getSource() == eraser) {
				drawArea.eraser();
			} else if(e.getSource() == clear) {
				drawArea.clear();
			}
			
		}
	};
			
	ColorPickerWindow cpw;
	
	public Window() {
		
		addWindowListener(this);
		
		cpw = new ColorPickerWindow();
		
		setUndecorated(true);
		setSize(WIDTH, HEIGHT);
		setTitle("Holi");
		
		setLayout(new BorderLayout());
		
		drawArea = new DrawArea();
		add(drawArea, BorderLayout.CENTER);
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1, 2));	
		northPanel.setBackground(new Color(225, 225, 225));
		
		compCoords = null;
		northPanel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				
			}

			public void mousePressed(MouseEvent e) {
				compCoords = e.getPoint();
			}

			public void mouseReleased(MouseEvent e) {
				compCoords = null;
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
		});
		northPanel.addMouseMotionListener(new MouseMotionListener() {

			public void mouseDragged(MouseEvent e) {
				Point currCoords = e.getLocationOnScreen();
				setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
			}

			public void mouseMoved(MouseEvent e) {

			}
		});
		
		
		JLabel title = new JLabel("    Holi");
		title.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
		northPanel.add(title);		
		
		//Close and Minimize button Panel
		JPanel windowButtons = new JPanel();
		windowButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//windowButtons.setBackground(new Color(31, 33, 35));
		windowButtons.setBackground(new Color(225, 225, 225));	

		//Close Button		
		URL urlCloseBtn = Main.class.getResource("/close.png");
		ImageIcon closeBtnImage = new ImageIcon(urlCloseBtn);
		JButton close = new JButton(closeBtnImage);
		close.setPreferredSize(new Dimension(20, 20));
		close.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
		close.setBackground(new Color(0, 0, 0, 0));
		close.setOpaque(false);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		close.setContentAreaFilled(false);
		close.setBackground(new Color(225, 225, 225));
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpw.dispose();
				dispose();
				System.exit(0);
			}
		});
				
		//Minimize Button
		URL urlMinimizeBtn = Main.class.getResource("/minimize.png");
		ImageIcon minimizeBtnImage = new ImageIcon(urlMinimizeBtn);
		JButton minimize = new JButton(minimizeBtnImage);
		minimize.setPreferredSize(new Dimension(20, 20));
		minimize.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));		//top, left, bottom, right
		minimize.setBackground(new Color(0, 0, 0, 0));
		minimize.setOpaque(false);
		minimize.setBorderPainted(false);
		minimize.setFocusPainted(false);
		minimize.setContentAreaFilled(false);
		minimize.setBackground(new Color(225, 225, 225));
		
		minimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		
		windowButtons.add(minimize);
		windowButtons.add(close);

		northPanel.add(windowButtons);

		add(northPanel, BorderLayout.NORTH);	
		
		//Centers window in the screen
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - getHeight()) / 2);
	    setLocation(x, y);
	    
	    // Rounded Corners
	    setShape(new RoundRectangle2D.Double(5, 5, WIDTH - 5, HEIGHT - 5, 5, 5));
	    
	    URL urlLogo = Main.class.getResource("/logo.png");	    
	    ImageIcon icon = new ImageIcon(urlLogo);
	    setIconImage(icon.getImage());

	    setVisible(true);
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		cpw.setVisible(false);
	}

	public void windowDeiconified(WindowEvent e) {
		cpw.setVisible(true);
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
