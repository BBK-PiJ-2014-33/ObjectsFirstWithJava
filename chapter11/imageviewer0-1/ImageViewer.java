import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.1
 */
public class ImageViewer
{
    private JFrame frame;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");        
        Container contentPane = frame.getContentPane();
        
        //JLabel label = new JLabel("I am a label. I can display some text.");
        //contentPane.add(label);
     
        JButton button = new JButton("Press me, please");
        contentPane.add(button);
        
        makeMenuBar();
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void makeMenuBar(){
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenActionListener ());
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new QuitActionListener ());
        fileMenu.add(quitItem);
        
        JMenu fileMenu1 = new JMenu("Help");
        menubar.add(fileMenu1);
        
        JMenuItem aboutItem = new JMenuItem("About ImageViewer");
        fileMenu1.add(aboutItem);
    }
    
    class OpenActionListener implements ActionListener
	{
		public void actionPerformed( ActionEvent event)
		{
			//perform open action
			System.out.println("Item: " + event.getActionCommand());
		}
	}
	
	class QuitActionListener implements ActionListener
	{
		public void actionPerformed( ActionEvent event)
		{
			//perform quit action
			System.out.println("Item: " + event.getActionCommand());
		}
	}

}
