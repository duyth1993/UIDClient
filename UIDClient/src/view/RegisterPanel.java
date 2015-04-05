/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.utility.DateLabelFormatter;
import common.model.Centre;
import common.model.PersonDetails;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author ASUS_PC
 */
public class RegisterPanel extends javax.swing.JPanel {

    private JDatePickerImpl datePicker;
    private String msg2 = "";
    private ArrayList<Centre> arrCentre = null;

    /**
     * Creates new form RegisterPanel
     */
    public RegisterPanel() {
        initComponents();
        UtilDateModel model = new UtilDateModel();
        model.setDate(1990, 8, 24);
        model.setSelected(true);

//		UtilCalendarModel model = new UtilCalendarModel();
//		SqlDateModel model = new SqlDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);

//		datePicker = new JDatePickerImpl(datePanel);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        this.birthdayPanel.add(datePicker);
        initCbbCentre();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdoGMale = new javax.swing.JRadioButton();
        rdoGFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taContact = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfEducation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfOccupation = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rdoMMarried = new javax.swing.JRadioButton();
        rdoMSingle = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rdoPhNormal = new javax.swing.JRadioButton();
        rdoPhHandicapped = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfMName = new javax.swing.JTextField();
        rdoAdYes = new javax.swing.JRadioButton();
        rdoAdNo = new javax.swing.JRadioButton();
        rdoCiYes = new javax.swing.JRadioButton();
        rdoCiNo = new javax.swing.JRadioButton();
        birthdayPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        cboCentre = new javax.swing.JComboBox();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Register Form");
        add(jLabel1);
        jLabel1.setBounds(194, 11, 180, 22);

        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("First Name:");
        add(jLabel2);
        jLabel2.setBounds(50, 50, 70, 20);
        add(tfFName);
        tfFName.setBounds(123, 51, 60, 20);

        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Last Name:");
        add(jLabel3);
        jLabel3.setBounds(350, 50, 70, 20);

        tfLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLNameActionPerformed(evt);
            }
        });
        add(tfLName);
        tfLName.setBounds(420, 50, 60, 20);

        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Date of Birth:");
        add(jLabel4);
        jLabel4.setBounds(50, 90, 80, 30);

        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Gender:");
        add(jLabel5);
        jLabel5.setBounds(50, 130, 50, 20);

        rdoGMale.setBackground(new java.awt.Color(164, 230, 169));
        buttonGroup1.add(rdoGMale);
        rdoGMale.setForeground(new java.awt.Color(51, 51, 0));
        rdoGMale.setText("Male");
        rdoGMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGMaleActionPerformed(evt);
            }
        });
        add(rdoGMale);
        rdoGMale.setBounds(190, 130, 60, 23);

        rdoGFemale.setBackground(new java.awt.Color(164, 230, 169));
        buttonGroup1.add(rdoGFemale);
        rdoGFemale.setForeground(new java.awt.Color(51, 51, 0));
        rdoGFemale.setText("Female");
        add(rdoGFemale);
        rdoGFemale.setBounds(260, 130, 80, 23);

        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("Contact Details:");
        add(jLabel6);
        jLabel6.setBounds(50, 170, 90, 20);

        taContact.setColumns(20);
        taContact.setRows(5);
        jScrollPane1.setViewportView(taContact);

        add(jScrollPane1);
        jScrollPane1.setBounds(189, 162, 220, 77);

        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("Email:");
        add(jLabel7);
        jLabel7.setBounds(50, 240, 50, 30);
        add(tfEmail);
        tfEmail.setBounds(189, 245, 220, 20);

        jLabel8.setForeground(new java.awt.Color(51, 51, 0));
        jLabel8.setText("Address:");
        add(jLabel8);
        jLabel8.setBounds(50, 290, 60, 20);

        jLabel9.setForeground(new java.awt.Color(51, 51, 0));
        jLabel9.setText("Education Qualification:");
        add(jLabel9);
        jLabel9.setBounds(50, 370, 140, 20);
        add(tfEducation);
        tfEducation.setBounds(189, 371, 220, 20);

        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setText("Occupation:");
        add(jLabel10);
        jLabel10.setBounds(50, 410, 70, 20);
        add(tfOccupation);
        tfOccupation.setBounds(189, 409, 220, 20);

        jLabel11.setForeground(new java.awt.Color(51, 51, 0));
        jLabel11.setText("Centre:");
        add(jLabel11);
        jLabel11.setBounds(50, 440, 100, 40);

        rdoMMarried.setBackground(new java.awt.Color(96, 183, 78));
        buttonGroup2.add(rdoMMarried);
        rdoMMarried.setForeground(new java.awt.Color(51, 51, 0));
        rdoMMarried.setText("Married");
        add(rdoMMarried);
        rdoMMarried.setBounds(190, 490, 70, 23);

        rdoMSingle.setBackground(new java.awt.Color(89, 180, 84));
        buttonGroup2.add(rdoMSingle);
        rdoMSingle.setForeground(new java.awt.Color(51, 51, 0));
        rdoMSingle.setText("Single");
        add(rdoMSingle);
        rdoMSingle.setBounds(280, 490, 70, 23);

        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setText("Address Proof:");
        add(jLabel12);
        jLabel12.setBounds(50, 530, 80, 20);

        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("Citizen Proof:");
        add(jLabel13);
        jLabel13.setBounds(50, 570, 80, 20);

        jLabel14.setForeground(new java.awt.Color(51, 51, 0));
        jLabel14.setText("Physical Health:");
        add(jLabel14);
        jLabel14.setBounds(50, 610, 90, 20);

        rdoPhNormal.setBackground(new java.awt.Color(59, 131, 55));
        buttonGroup5.add(rdoPhNormal);
        rdoPhNormal.setForeground(new java.awt.Color(51, 51, 0));
        rdoPhNormal.setText("Normal");
        add(rdoPhNormal);
        rdoPhNormal.setBounds(190, 610, 80, 23);

        rdoPhHandicapped.setBackground(new java.awt.Color(59, 126, 51));
        buttonGroup5.add(rdoPhHandicapped);
        rdoPhHandicapped.setForeground(new java.awt.Color(51, 51, 0));
        rdoPhHandicapped.setText("Handicapped");
        add(rdoPhHandicapped);
        rdoPhHandicapped.setBounds(280, 610, 120, 23);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(410, 560, 89, 32);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset);
        btnReset.setBounds(410, 600, 88, 32);

        jLabel15.setForeground(new java.awt.Color(51, 51, 0));
        jLabel15.setText("Mid Name :");
        add(jLabel15);
        jLabel15.setBounds(200, 50, 70, 20);
        add(tfMName);
        tfMName.setBounds(270, 50, 60, 20);

        rdoAdYes.setBackground(new java.awt.Color(56, 134, 59));
        buttonGroup3.add(rdoAdYes);
        rdoAdYes.setForeground(new java.awt.Color(51, 51, 0));
        rdoAdYes.setText("Yes");
        add(rdoAdYes);
        rdoAdYes.setBounds(190, 530, 60, 23);

        rdoAdNo.setBackground(new java.awt.Color(82, 157, 74));
        buttonGroup3.add(rdoAdNo);
        rdoAdNo.setForeground(new java.awt.Color(51, 51, 0));
        rdoAdNo.setText("No");
        add(rdoAdNo);
        rdoAdNo.setBounds(280, 530, 50, 23);

        rdoCiYes.setBackground(new java.awt.Color(44, 115, 45));
        buttonGroup4.add(rdoCiYes);
        rdoCiYes.setForeground(new java.awt.Color(51, 51, 0));
        rdoCiYes.setText("Yes");
        add(rdoCiYes);
        rdoCiYes.setBounds(190, 570, 60, 23);

        rdoCiNo.setBackground(new java.awt.Color(59, 131, 55));
        buttonGroup4.add(rdoCiNo);
        rdoCiNo.setForeground(new java.awt.Color(51, 51, 0));
        rdoCiNo.setText("No");
        add(rdoCiNo);
        rdoCiNo.setBounds(280, 570, 50, 23);

        birthdayPanel.setBackground(new java.awt.Color(180, 234, 184));
        add(birthdayPanel);
        birthdayPanel.setBounds(130, 90, 330, 30);

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane2.setViewportView(taAddress);

        add(jScrollPane2);
        jScrollPane2.setBounds(189, 276, 220, 77);
        add(jSpinner1);
        jSpinner1.setBounds(660, 300, 29, 20);

        jLabel20.setForeground(new java.awt.Color(51, 51, 0));
        jLabel20.setText("Marital Status:");
        add(jLabel20);
        jLabel20.setBounds(50, 480, 100, 40);

        add(cboCentre);
        cboCentre.setBounds(190, 450, 220, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (!checkInputForm().equalsIgnoreCase("Information Input Register\n------------------------------\n")) {
            showMessage(checkInputForm());
        } else {
            String strInfo = confirmInfo();
            if (checkEmail(tfEmail.getText().trim()) == true && checkInputForm().equalsIgnoreCase("Information Input Register\n------------------------------\n") && msg2.equals("")) {
                int confirm = showMessageConfirm(strInfo);
                if (confirm == JOptionPane.YES_OPTION) {
                    insertDatabase();
                }
            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tfFName.setText("");
        tfLName.setText("");
        tfMName.setText("");
        taContact.setText("");
        taAddress.setText("");
        tfEmail.setText("");
        tfEducation.setText("");
        tfOccupation.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
        cboCentre.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void rdoGMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoGMaleActionPerformed

    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel birthdayPanel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox cboCentre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JRadioButton rdoAdNo;
    private javax.swing.JRadioButton rdoAdYes;
    private javax.swing.JRadioButton rdoCiNo;
    private javax.swing.JRadioButton rdoCiYes;
    private javax.swing.JRadioButton rdoGFemale;
    private javax.swing.JRadioButton rdoGMale;
    private javax.swing.JRadioButton rdoMMarried;
    private javax.swing.JRadioButton rdoMSingle;
    private javax.swing.JRadioButton rdoPhHandicapped;
    private javax.swing.JRadioButton rdoPhNormal;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextArea taContact;
    private javax.swing.JTextField tfEducation;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    private javax.swing.JTextField tfMName;
    private javax.swing.JTextField tfOccupation;
    // End of variables declaration//GEN-END:variables

    private String checkInputForm() {
        String msg = "Information Input Register\n------------------------------\n";
        if (tfFName.getText().trim().isEmpty()) {
            msg += "\n\nFirst Name must not Null";
        }
        if (tfLName.getText().trim().isEmpty()) {
            msg += "\nLast Name must not Null";
        }
        if (tfEmail.getText().trim().isEmpty()) {
            msg += "\nEmail must not Null";
        }
        if (taAddress.getText().trim().isEmpty()) {
            msg += "\nAddress must not Null";
        }
        if (tfEducation.getText().trim().isEmpty()) {
            msg += "\nEducation Qualification must not Null";
        }
        if (tfOccupation.getText().trim().isEmpty()) {
            msg += "\nOccupation must not Null";
        }
        if (buttonGroup1.getSelection() == null) {
            msg += "\nGender must choice";
        }
        if (buttonGroup2.getSelection() == null) {
            msg += "\nMarital Status must choice";
        }
        if (buttonGroup3.getSelection() == null) {
            msg += "\nAddress Proof must choice";
        }
        if (buttonGroup4.getSelection() == null) {
            msg += "\nCitizen Proof must choice";
        }
        if (buttonGroup5.getSelection() == null) {
            msg += "\nPhysical Health must choice";
        }
        return msg;
    }

    private String confirmInfo() {
        String msg = "Information Input Register\n------------------------------\n";
//        msg2 ="";
        if (checkInput(tfFName.getText().trim()) == true) {
            msg += "\n\nFirst Name :" + tfFName.getText().trim();
        } else {
            msg2 += "\nFirst Name : Not match!";
        }
        if (!tfMName.getText().trim().isEmpty()) {
            if (checkInput(tfMName.getText().trim()) == true) {
                msg += "\nMid Name :" + tfMName.getText().trim();
            } else {
                msg2 += "\nMid Name : Not match!";
            }
        }
        if (checkInput(tfLName.getText().trim()) == true) {
            msg += "\nLast Name :" + tfLName.getText().trim();
        } else {
            msg2 += "\nLast Name : Not match!";
        }

        //Date if Birth
        if (rdoGMale.isSelected()) {
            msg += "\nGender : Male";
        } else if (rdoGFemale.isSelected()) {
            msg += "\nGender : FeMale";
        }

        if (!taContact.getText().trim().isEmpty()) {
            msg += "\nContact Details :" + taContact.getText().trim();
        }
        if (!checkEmail(tfEmail.getText().trim())) {
            msg2 += "\nEmail Not Match !\nExample:\nEmail : abc1234@gmail.com";
        } else {
            msg += "\nEmail :" + tfEmail.getText().trim();
        }
        msg += "\nAddress :" + taAddress.getText().trim();
        msg += "\nEducation Qualification :" + tfEducation.getText().trim();
        msg += "\nOccupation :" + tfOccupation.getText().trim();

        if (rdoMMarried.isSelected()) {
            msg += "\nMarital Status : Married";
        } else if (rdoMSingle.isSelected()) {
            msg += "\nMarital Status : Single";
        }
        if (rdoAdYes.isSelected()) {
            msg += "\nAddress Proof : Yes";
        } else if (rdoAdNo.isSelected()) {
            msg += "\nAddress Proof : No";
        }
        if (rdoCiYes.isSelected()) {
            msg += "\nCitizen Proof : Yes";
        } else if (rdoCiNo.isSelected()) {
            msg += "\nCitizen Proof : No";
        }
        if (rdoPhHandicapped.isSelected()) {
            msg += "\nPhysical Health : Normal";
        } else if (rdoPhNormal.isSelected()) {
            msg += "\nPhysical Health : Handicapped";
        }
        if (!msg2.isEmpty()) {
            showMessage(msg2);
            msg = "Information Input Register\n------------------------------\n";
        }
        return msg;
    }

    private int showMessageConfirm(String confirmInfo) {
        int confirm = JOptionPane.showConfirmDialog(this, confirmInfo, "", JOptionPane.OK_CANCEL_OPTION);
        return confirm;
    }

    private void insertDatabase() {
        try {
            ClientFrame.remoteObject.sendRequest(returnObj(), (arrCentre.size() > 0) ? arrCentre.get(cboCentre.getSelectedIndex()).getCentreId() : 0);
            showMessage("Register success!!! We will contact with you soon.");
        } catch (RemoteException ex) {
            showMessage("There was a error. Sorry for this unconvenienc");
        }
    }

    private boolean checkEmail(String email) {
        boolean check = false;
        Pattern pat;
        Matcher match;
        pat = Pattern.compile("^[a-zA-Z]\\w+[@]\\w+[.]\\w+[.]?\\w+$");
        match = pat.matcher(email);
        if (match.find()) {
            check = true;
        }
        return check;
    }

    private boolean checkInput(String str) {
        boolean check = false;
        Pattern pat;
        Matcher match;
        pat = Pattern.compile("^[a-zA-Z]\\w+$");
        match = pat.matcher(str);
        if (match.find()) {
            check = true;
        }
        return check;
    }

    public PersonDetails returnObj() {
        PersonDetails pd = null;
        String fName = tfFName.getText().trim();
        String mName = tfMName.getText().trim();
        String lName = tfLName.getText().trim();
        String dob = datePicker.getJFormattedTextField().getText().trim();
        int gender = (rdoGMale.isSelected()) ? 1 : 0;
        String email = tfEmail.getText().trim();
        String edu = tfEducation.getText().trim();
        String ocu = tfOccupation.getText().trim();
        String addr = taAddress.getText().trim();
        String contact = taContact.getText().trim();
        int marital = (rdoMMarried.isSelected()) ? 1 : 0;
        int addrProof = (rdoAdYes.isSelected()) ? 1 : 0;
        String citizenProof = (rdoCiYes.isSelected()) ? "Yes" : "Not Yet";
        int physical = (rdoPhNormal.isSelected()) ? 1 : 0;
        pd = new PersonDetails("", 0, fName, mName, lName, dob, gender, email, addr, edu, ocu, marital, addrProof, citizenProof);
        return pd;
    }

    private void initCbbCentre() {
        try {
            arrCentre = ClientFrame.remoteObject.loadCentre();
            if (arrCentre.size() > 0) {
                for (Centre centre : arrCentre) {
                    cboCentre.addItem(centre.getCentreName());
                }
            } else {
                cboCentre.addItem("There isn't any available centre yet");
            }
        } catch (RemoteException ex) {
            showMessage("There was a error! Sorry for this unconvennience!!");
        }
    }
}
