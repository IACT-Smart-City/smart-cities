package org.openiot.gsndatapusher.singletontcplistener;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.openiot.gsndatapusher.core.FieldType;
import org.openiot.gsndatapusher.core.SensorManager;
import org.openiot.gsndatapusher.gui.AbstractSensorDummyPanel;

/**
 *
 * @author admin-jacoby
 */
public class SingletonTcpListenerSensorDummyPanel extends AbstractSensorDummyPanel {

	private final List<Integer> ports = new ArrayList<>();

	/**
	 * Creates new form AbstractSensorDummyPanel
	 */
	public SingletonTcpListenerSensorDummyPanel() {
		initComponents();
	}

	public void releasePort(int port) {
		ports.remove(port);
	}

	@Override
	public String getDisplayName() {
		return "Singleton TCP";
	}

	@Override
	public SensorManager getSensorManager(int mulitplicity, String gsnAddress) {
		SingletonTcpListenerConfig config = new SingletonTcpListenerConfig();
		config.setName(edtName.getText());
		config.setType(edtType.getText());
		config.setBadValues(edtBadValues.getText());
		config.setFieldType((FieldType) cmbDatatype.getSelectedItem());
		config.setFieldCount(Integer.parseInt(edtFieldCount.getText()));
		config.setHistorySize(edtHistorySize.getText());
		config.setPoolSize(Integer.parseInt(edtPoolSize.getText()));
		config.setPort(Integer.parseInt(edtPort.getText()));
		config.setPriority(Integer.parseInt(edtPriority.getText()));
		config.setPublishToLSM(chkPublishToLSM.isSelected());
		config.setSamplingRate(Integer.parseInt(edtSamplingRate.getText()));
		config.setStorageSize(Integer.parseInt(edtStorageSize.getText()));
		config.setTimeZone(edtTimezone.getText());
		config.setServer(edtServer.getText());
		config.setGsnAddress(gsnAddress);
		SensorManager result = new SensorManager(mulitplicity, mulitplicity, mulitplicity, getDisplayName(), config);
		return result;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblName = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        edtType = new javax.swing.JTextField();
        lblInterval = new javax.swing.JLabel();
        edtInterval = new javax.swing.JFormattedTextField();
        lblFieldCount = new javax.swing.JLabel();
        edtFieldCount = new javax.swing.JFormattedTextField();
        lblPoolSize = new javax.swing.JLabel();
        edtPoolSize = new javax.swing.JFormattedTextField();
        lblHistorySize = new javax.swing.JLabel();
        edtBadValues = new javax.swing.JTextField();
        lblSamplingRate = new javax.swing.JLabel();
        edtSamplingRate = new javax.swing.JFormattedTextField();
        lblStorageSize = new javax.swing.JLabel();
        edtStorageSize = new javax.swing.JFormattedTextField();
        lblPriority = new javax.swing.JLabel();
        chkPublishToLSM = new javax.swing.JCheckBox();
        lblBadValues = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        edtPort = new javax.swing.JFormattedTextField();
        edtPriority = new javax.swing.JFormattedTextField();
        edtTimezone = new javax.swing.JTextField();
        edtHistorySize = new javax.swing.JTextField();
        lblTimezone = new javax.swing.JLabel();
        cmbDatatype = new javax.swing.JComboBox();
        lblDataype = new javax.swing.JLabel();
        lblServer = new javax.swing.JLabel();
        edtServer = new javax.swing.JTextField();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        setLayout(layout);

        lblName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblName, gridBagConstraints);

        edtName.setText("testsensor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtName, gridBagConstraints);

        lblType.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblType, gridBagConstraints);

        edtType.setText("testType");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtType, gridBagConstraints);

        lblInterval.setText("Interval");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblInterval, gridBagConstraints);

        edtInterval.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtInterval.setText("1000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtInterval, gridBagConstraints);

        lblFieldCount.setText("Field count");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblFieldCount, gridBagConstraints);

        edtFieldCount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtFieldCount.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtFieldCount, gridBagConstraints);

        lblPoolSize.setText("Pool size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblPoolSize, gridBagConstraints);

        edtPoolSize.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtPoolSize.setText("100");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtPoolSize, gridBagConstraints);

        lblHistorySize.setText("History size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblHistorySize, gridBagConstraints);

        edtBadValues.setText("NaN,null");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtBadValues, gridBagConstraints);

        lblSamplingRate.setText("Sampling rate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblSamplingRate, gridBagConstraints);

        edtSamplingRate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtSamplingRate.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtSamplingRate, gridBagConstraints);

        lblStorageSize.setText("Storage size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblStorageSize, gridBagConstraints);

        edtStorageSize.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtStorageSize.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtStorageSize, gridBagConstraints);

        lblPriority.setText("Priority");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblPriority, gridBagConstraints);

        chkPublishToLSM.setText("Pubslih to LSM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        add(chkPublishToLSM, gridBagConstraints);

        lblBadValues.setText("Bad values");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblBadValues, gridBagConstraints);

        lblPort.setText("Port");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblPort, gridBagConstraints);

        edtPort.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtPort.setText("22002");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtPort, gridBagConstraints);

        edtPriority.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        edtPriority.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtPriority, gridBagConstraints);

        edtTimezone.setText("Etc/GMT-2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtTimezone, gridBagConstraints);

        edtHistorySize.setText("2h");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtHistorySize, gridBagConstraints);

        lblTimezone.setText("Timezone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblTimezone, gridBagConstraints);

        cmbDatatype.setModel(new DefaultComboBoxModel(FieldType.values()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(cmbDatatype, gridBagConstraints);

        lblDataype.setText("Datatype");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblDataype, gridBagConstraints);

        lblServer.setText("Server");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 13, 0, 0);
        add(lblServer, gridBagConstraints);

        edtServer.setText("localhost");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 11);
        add(edtServer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPublishToLSM;
    private javax.swing.JComboBox cmbDatatype;
    private javax.swing.JTextField edtBadValues;
    private javax.swing.JFormattedTextField edtFieldCount;
    private javax.swing.JTextField edtHistorySize;
    private javax.swing.JFormattedTextField edtInterval;
    private javax.swing.JTextField edtName;
    private javax.swing.JFormattedTextField edtPoolSize;
    private javax.swing.JFormattedTextField edtPort;
    private javax.swing.JFormattedTextField edtPriority;
    private javax.swing.JFormattedTextField edtSamplingRate;
    private javax.swing.JTextField edtServer;
    private javax.swing.JFormattedTextField edtStorageSize;
    private javax.swing.JTextField edtTimezone;
    private javax.swing.JTextField edtType;
    private javax.swing.JLabel lblBadValues;
    private javax.swing.JLabel lblDataype;
    private javax.swing.JLabel lblFieldCount;
    private javax.swing.JLabel lblHistorySize;
    private javax.swing.JLabel lblInterval;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPoolSize;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblSamplingRate;
    private javax.swing.JLabel lblServer;
    private javax.swing.JLabel lblStorageSize;
    private javax.swing.JLabel lblTimezone;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables

}
