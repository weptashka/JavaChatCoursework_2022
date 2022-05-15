
import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Polina
 */
public class ClientRegister extends javax.swing.JFrame {

    static String info;

    /**
     * Creates new form ClientRegister
     */
    public ClientRegister() {
        initComponents();
        try {
            setIconImage(ImageIO.read(new File("../img/msg.png")));
            setTitle("ChatApp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clientIdField = new javax.swing.JTextField();
        hostField = new javax.swing.JTextField();
        postField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        registrationLabel = new javax.swing.JLabel();
        yourIDLabel = new javax.swing.JLabel();
        hostLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(288, 162));
        setMinimumSize(new java.awt.Dimension(288, 162));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 40, 62));
        jPanel1.setMaximumSize(new java.awt.Dimension(288, 162));
        jPanel1.setMinimumSize(new java.awt.Dimension(288, 162));
        jPanel1.setPreferredSize(new java.awt.Dimension(576, 324));

        clientIdField.setBackground(new java.awt.Color(209, 215, 224));
        clientIdField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        clientIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientIdField.setBorder(new javax.swing.border.MatteBorder(null));
        clientIdField.setMaximumSize(new java.awt.Dimension(90, 25));
        clientIdField.setMinimumSize(new java.awt.Dimension(90, 25));
        clientIdField.setPreferredSize(new java.awt.Dimension(90, 25));

        hostField.setBackground(new java.awt.Color(209, 215, 224));
        hostField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hostField.setBorder(new javax.swing.border.MatteBorder(null));
        hostField.setPreferredSize(new java.awt.Dimension(90, 25));

        postField.setBackground(new java.awt.Color(209, 215, 224));
        postField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        postField.setBorder(new javax.swing.border.MatteBorder(null));
        postField.setPreferredSize(new java.awt.Dimension(90, 25));

        connectButton.setBackground(new java.awt.Color(128, 43, 177));
        connectButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        connectButton.setForeground(new java.awt.Color(209, 215, 224));
        connectButton.setText("Connect");
        connectButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        registrationLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(209, 215, 224));
        registrationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationLabel.setText("Client Registration");

        yourIDLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        yourIDLabel.setForeground(new java.awt.Color(128, 43, 177));
        yourIDLabel.setText("Your ID:");

        hostLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hostLabel.setForeground(new java.awt.Color(128, 43, 177));
        hostLabel.setText("Host: ");

        portLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        portLabel.setForeground(new java.awt.Color(128, 43, 177));
        portLabel.setText("Port:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(hostLabel))
                            .addComponent(portLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yourIDLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hostField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(clientIdField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(registrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(registrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yourIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel))
                .addGap(18, 18, 18)
                .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        try {
            String id = clientIdField.getText();
            String host = hostField.getText();
            int port = Integer.parseInt(postField.getText());
            Socket s = new Socket(host, port);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(id);

            String msgFromServer = new DataInputStream(s.getInputStream()).readUTF();
            if (msgFromServer.equals("User with such ID already entered!")) {
                JOptionPane.showMessageDialog(this, "This ID already registrated!\nPlease, change your ID and try again");
            } else if (id.equals("")) {
                JOptionPane.showMessageDialog(this, "Please, enter your ID");
            } else {
                new ClientView(id, s).setVisible(true);
                this.dispose();
            }
        } catch (NumberFormatException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Incorrect data entered!\nPlease, check host and port and try again");
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientIdField;
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField hostField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField postField;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JLabel yourIDLabel;
    // End of variables declaration//GEN-END:variables
}
