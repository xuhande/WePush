package com.fangxuele.tool.push.ui.form;

import com.fangxuele.tool.push.App;
import com.fangxuele.tool.push.util.UndoUtil;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 * 性能模式Form
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2019/6/15.
 */
@Getter
public class BoostForm {
    private JPanel boostPanel;
    private JTextArea consoleTextArea;
    private JButton startButton;
    private JButton stopButton;
    private JButton scheduledRunButton;
    private JCheckBox dryRunCheckBox;
    private JProgressBar processedProgressBar;
    private JProgressBar completedProgressBar;
    private JLabel boostModeHelpLabel;
    private JLabel processedCountLabel;
    private JLabel successCountLabel;
    private JLabel failCountLabel;
    private JLabel lastTimeLabel;
    private JLabel leftTimeLabel;
    private JLabel msgNameLabel;
    private JLabel memberCountLabel;
    private JLabel processorCountLabel;
    private JLabel jvmMemoryLabel;
    private JLabel scheduledTaskLabel;

    private static BoostForm boostForm;

    private BoostForm() {
        UndoUtil.register(this);
    }

    public static BoostForm getInstance() {
        if (boostForm == null) {
            boostForm = new BoostForm();
        }
        return boostForm;
    }

    public static void init() {
        boostForm = getInstance();
        boostForm.getDryRunCheckBox().setSelected(App.config.isDryRun());
        boostForm.getScheduledTaskLabel().setVisible(false);

        if ("Darcula(推荐)".equals(App.config.getTheme())) {
            Color bgColor = new Color(43, 43, 43);
            boostForm.getConsoleTextArea().setBackground(bgColor);
            Color foreColor = new Color(169, 183, 198);
            boostForm.getConsoleTextArea().setForeground(foreColor);
        }
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        boostPanel = new JPanel();
        boostPanel.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(5, 13, new Insets(0, 8, 0, 10), -1, -1));
        boostPanel.add(panel1, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JSeparator separator1 = new JSeparator();
        separator1.setOrientation(1);
        panel1.add(separator1, new GridConstraints(0, 3, 5, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        successCountLabel = new JLabel();
        Font successCountLabelFont = this.$$$getFont$$$(null, -1, 72, successCountLabel.getFont());
        if (successCountLabelFont != null) successCountLabel.setFont(successCountLabelFont);
        successCountLabel.setForeground(new Color(-13587376));
        successCountLabel.setText("0");
        panel1.add(successCountLabel, new GridConstraints(0, 5, 2, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("成功");
        panel1.add(label1, new GridConstraints(0, 6, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        failCountLabel = new JLabel();
        Font failCountLabelFont = this.$$$getFont$$$(null, -1, 72, failCountLabel.getFont());
        if (failCountLabelFont != null) failCountLabel.setFont(failCountLabelFont);
        failCountLabel.setForeground(new Color(-2200483));
        failCountLabel.setText("0");
        panel1.add(failCountLabel, new GridConstraints(2, 5, 2, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("失败");
        panel1.add(label2, new GridConstraints(2, 6, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        completedProgressBar = new JProgressBar();
        panel1.add(completedProgressBar, new GridConstraints(4, 4, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator2 = new JSeparator();
        separator2.setEnabled(true);
        separator2.setOrientation(1);
        panel1.add(separator2, new GridConstraints(0, 7, 5, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        processedProgressBar = new JProgressBar();
        panel1.add(processedProgressBar, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        processedCountLabel = new JLabel();
        Font processedCountLabelFont = this.$$$getFont$$$(null, -1, 72, processedCountLabel.getFont());
        if (processedCountLabelFont != null) processedCountLabel.setFont(processedCountLabelFont);
        processedCountLabel.setText("0");
        panel1.add(processedCountLabel, new GridConstraints(2, 1, 2, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("已处理");
        panel1.add(label3, new GridConstraints(2, 2, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator3 = new JSeparator();
        separator3.setOrientation(1);
        panel1.add(separator3, new GridConstraints(0, 11, 5, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        memberCountLabel = new JLabel();
        memberCountLabel.setText("消息总数：0");
        panel1.add(memberCountLabel, new GridConstraints(1, 12, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        processorCountLabel = new JLabel();
        processorCountLabel.setText("可用处理器核心：-");
        panel1.add(processorCountLabel, new GridConstraints(2, 12, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("耗时");
        panel1.add(label4, new GridConstraints(0, 9, 2, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("预计剩余");
        panel1.add(label5, new GridConstraints(2, 9, 2, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lastTimeLabel = new JLabel();
        Font lastTimeLabelFont = this.$$$getFont$$$(null, -1, 36, lastTimeLabel.getFont());
        if (lastTimeLabelFont != null) lastTimeLabel.setFont(lastTimeLabelFont);
        lastTimeLabel.setText("0s");
        panel1.add(lastTimeLabel, new GridConstraints(0, 10, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        leftTimeLabel = new JLabel();
        Font leftTimeLabelFont = this.$$$getFont$$$(null, -1, 36, leftTimeLabel.getFont());
        if (leftTimeLabelFont != null) leftTimeLabel.setFont(leftTimeLabelFont);
        leftTimeLabel.setText("0s");
        panel1.add(leftTimeLabel, new GridConstraints(2, 10, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(2, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(2, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(2, 8, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        boostModeHelpLabel = new JLabel();
        Font boostModeHelpLabelFont = this.$$$getFont$$$(null, -1, 28, boostModeHelpLabel.getFont());
        if (boostModeHelpLabelFont != null) boostModeHelpLabel.setFont(boostModeHelpLabelFont);
        boostModeHelpLabel.setForeground(new Color(-3513110));
        boostModeHelpLabel.setIcon(new ImageIcon(getClass().getResource("/icon/helpButton.png")));
        boostModeHelpLabel.setText("性能模式");
        panel1.add(boostModeHelpLabel, new GridConstraints(0, 0, 2, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgNameLabel = new JLabel();
        Font msgNameLabelFont = this.$$$getFont$$$(null, -1, 24, msgNameLabel.getFont());
        if (msgNameLabelFont != null) msgNameLabel.setFont(msgNameLabelFont);
        msgNameLabel.setForeground(new Color(-276358));
        msgNameLabel.setText("消息名称：-");
        panel1.add(msgNameLabel, new GridConstraints(0, 12, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        jvmMemoryLabel = new JLabel();
        jvmMemoryLabel.setText("JVM内存占用：-");
        panel1.add(jvmMemoryLabel, new GridConstraints(3, 12, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scheduledTaskLabel = new JLabel();
        scheduledTaskLabel.setForeground(new Color(-276358));
        scheduledTaskLabel.setText("计划任务执行中");
        scheduledTaskLabel.setVisible(true);
        panel1.add(scheduledTaskLabel, new GridConstraints(4, 12, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        boostPanel.add(panel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel2.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        consoleTextArea = new JTextArea();
        scrollPane1.setViewportView(consoleTextArea);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 5, new Insets(0, 5, 5, 5), -1, -1));
        boostPanel.add(panel3, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        startButton = new JButton();
        startButton.setIcon(new ImageIcon(getClass().getResource("/icon/run@2x.png")));
        startButton.setText("开始");
        panel3.add(startButton, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel3.add(spacer4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        stopButton = new JButton();
        stopButton.setIcon(new ImageIcon(getClass().getResource("/icon/suspend.png")));
        stopButton.setText("停止");
        panel3.add(stopButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scheduledRunButton = new JButton();
        scheduledRunButton.setIcon(new ImageIcon(getClass().getResource("/icon/clock.png")));
        scheduledRunButton.setText("按计划执行");
        panel3.add(scheduledRunButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dryRunCheckBox = new JCheckBox();
        dryRunCheckBox.setText("空跑");
        panel3.add(dryRunCheckBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        boostPanel.add(spacer5, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return boostPanel;
    }

}
