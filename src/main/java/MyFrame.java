import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);

        this.setSize(500, 300);
        this.setTitle("====niit====exam====");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.add(new JButton("ok1"));
        this.add(new JButton("ok2dd"));
        this.add(new JButton("ok33"));
        JScrollPane jScrollPane = new JScrollPane(new TextArea());
        this.add(jScrollPane);

        this.setVisible(true);
    }
}
