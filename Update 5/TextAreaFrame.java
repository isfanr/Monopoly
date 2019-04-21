import javax.swing.*;

 class TextAreaFrame {
 
   JTextArea textArea = null;
 
   public TextAreaFrame() {
 
      JFrame frame = new JFrame();
      frame.setSize( 300 , 300 );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
      textArea = new JTextArea( 10 , 20 );
      textArea.setEditable( false );
      textArea.setLineWrap(true);
      textArea.setWrapStyleWord(true);
 
      JPanel panel = new JPanel();
      panel.add( textArea );
 
      frame.getContentPane().add( panel );
 
      frame.show();
 
   }
 
} 