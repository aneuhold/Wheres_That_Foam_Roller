package gui;

import com.intellij.uiDesigner.core.GridLayoutManager;
import helper.queryDB;

import javax.swing.*;
import java.awt.*;

public class showAllCategories extends JFrame {
    private JPanel panel1;

    {
        // GUI initializer generated by IntelliJ IDEA GUI Designer
        // >>> IMPORTANT!! <<<
        // DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    public showAllCategories() {
        add(panel1);
        setTitle("Show All Categories");
        setSize(200, 600);
        setLocationRelativeTo(null);

        String query = "SELECT Category FROM itemcategory GROUP BY Category";
        queryDB queryDB = new queryDB();
        add(queryDB.getScrollPane(query));
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
