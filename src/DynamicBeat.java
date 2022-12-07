import javax.swing.*;
import java.awt.*;


public class DynamicBeat extends JFrame {

    static JPanel img = new JPanel() {
        Image background = new ImageIcon(Main.class.getResource("../images/introBackground2.jpeg")).getImage();
        public void paint(Graphics g) {
            g.drawImage(background,0,0,null);
        }
    };

    private Image screenImages;
    private Graphics screenGraphics;

    private Image introBackground = new ImageIcon(Main.class.getResource("images/introBackground(title).jpg")).getImage();;
    private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("images/menuBar.png")));
    private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("images/exitButtonBasic.png")));



    public DynamicBeat(){
        setUndecorated(true);
        setTitle("Dynamic Beat");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(0, 0, 0, 0));
        setLayout(null);

        menuBar.setBounds(0, 0, 1280, 30);
        add(menuBar);

        exitButton.setBounds(50, 50, 30, 30);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        add(exitButton);

        Music introMusic = new Music("introMusic.mp3", true);
        introMusic.start();

        img.setLayout(null);
        img.setBounds(0,0,1280,720);
        add(img);
    }

//    public void paint (Graphics g){
//        screenImages = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
//        screenGraphics = screenImages.getGraphics();
//        screenDraw(screenGraphics);
//        g.drawImage(screenImages, 0, 0, null);
//    }
//
//    public void screenDraw(Graphics g){
//        g.drawImage(introBackground, 0, 0,null);
//        paintComponents(g);
//        this.repaint();
//    }
}
