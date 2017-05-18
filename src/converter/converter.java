/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author adieb
 */
public class converter extends javax.swing.JFrame {

    /**
     * Creates new form converter
     */
    public converter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jumlahuang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uangdari = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        uangke = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        hasilwaktu = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(145, 154, 253));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Matoh Money Converter");

        jLabel2.setText("Masukkan Jumlah Uang   : ");

        jLabel3.setText("Konfersi Dari");

        jLabel4.setText("Konfersi Ke");

        uangdari.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Euro - EUR", "British Pound - GBP", "United States Dollar - USD", "Australian Dollar - AUD", "Canadian Dollar - CAD", "Swiss Franc - CHF", "Chinese Yuan - CNY", "Hong Kong Dollar - HKD", "Indonesian Rupiah - IDR", "Indian Rupee - INR", "Japanese Yen - JPY", "Thai Baht - THB", "Albanian Lek - ALL", "Algerian Dinar - DZD", "Aluminium Ounces - XAL", "Argentine Peso - ARS", "Aruba Florin - AWG", "Bahamian Dollar - BSD", "Bahraini Dinar - BHD", "Bangladesh Taka - BDT", "Barbados Dollar - BBD", "Belarus Ruble - BYR", "Belize Dollar - BZD", "Bermuda Dollar - BMD", "Bhutan Ngultrum - BTN", "Bolivian Boliviano - BOB", "Botswana Pula - BWP", "Brazilian Real - BRL", "Brunei Dollar - BND", "Bulgarian Lev - BGN", "Burundi Franc - BIF", "Cambodia Riel - KHR", "Cape Verde Escudo - CVE", "Cayman Islands Dollar - KYD", "CFA Franc (BCEAO) - XOF", "CFA Franc (BEAC) - XAF", "Chilean Peso - CLP", "Colombian Peso - COP", "Comoros Franc - KMF", "Copper Pounds - XCP", "Costa Rica Colon - CRC", "Croatian Kuna - HRK", "Cuban Peso - CUP", "Czech Koruna - CZK", "Danish Krone - DKK", "Dijibouti Franc - DJF", "Dominican Peso - DOP", "East Caribbean Dollar - XCD", "Ecuador Sucre - ECS", "Egyptian Pound - EGP", "El Salvador Colon - SVC", "Eritrea Nakfa - ERN", "Estonian Kroon - EEK", "Ethiopian Birr - ETB", "Falkland Islands Pound - FKP", "Fiji Dollar - FJD", "Gambian Dalasi - GMD", "Ghanian Cedi - GHC", "Gibraltar Pound - GIP", "Gold Ounces - XAU", "Guatemala Quetzal - GTQ", "Guinea Franc - GNF", "Guyana Dollar - GYD", "Haiti Gourde - HTG", "Honduras Lempira - HNL", "Hungarian Forint - HUF", "Iceland Krona - ISK", "Iran Rial - IRR", "Iraqi Dinar - IQD", "Israeli Shekel - ILS", "Jamaican Dollar - JMD", "Jordanian Dinar - JOD", "Kazakhstan Tenge - KZT", "Kenyan Shilling - KES", "Korean Won - KRW", "Kuwaiti Dinar - KWD", "Lao Kip - LAK", "Latvian Lat - LVL", "Lebanese Pound - LBP", "Lesotho Loti - LSL", "Liberian Dollar - LRD", "Libyan Dinar - LYD", "Lithuanian Lita - LTL", "Macau Pataca - MOP", "Macedonian Denar - MKD", "Malawi Kwacha - MWK", "Malaysian Ringgit - MYR", "Maldives Rufiyaa - MVR", "Maltese Lira - MTL", "Mauritania Ougulya - MRO", "Mauritius Rupee - MUR", "Mexican Peso - MXN", "Moldovan Leu - MDL", "Mongolian Tugrik - MNT", "Moroccan Dirham - MAD", "Myanmar Kyat - MMK", "Namibian Dollar - NAD", "Nepalese Rupee - NPR", "Neth Antilles Guilder - ANG", "Turkish Lira - TRY", "New Zealand Dollar - NZD", "Nicaragua Cordoba - NIO", "Nigerian Naira - NGN", "North Korean Won - KPW", "Norwegian Krone - NOK", "Omani Rial - OMR", "Pacific Franc - XPF", "Pakistani Rupee - PKR", "Palladium Ounces - XPD", "Panama Balboa - PAB", "Papua New Guinea Kina - PGK", "Paraguayan Guarani - PYG", "Peruvian Nuevo Sol - PEN", "Philippine Peso - PHP", "Platinum Ounces - XPT", "Polish Zloty - PLN", "Qatar Rial - QAR", "Romanian New Leu - RON", "Russian Rouble - RUB", "Rwanda Franc - RWF", "Samoa Tala - WST", "Sao Tome Dobra - STD", "Saudi Arabian Riyal - SAR", "Seychelles Rupee - SCR", "Sierra Leone Leone - SLL", "Silver Ounces - XAG", "Singapore Dollar - SGD", "Slovak Koruna - SKK", "Slovenian Tolar - SIT", "Solomon Islands Dollar - SBD", "Somali Shilling - SOS", "South African Rand - ZAR", "Sri Lanka Rupee - LKR", "St Helena Pound - SHP", "Sudanese Pound - SDG", "Swaziland Lilageni - SZL", "Swedish Krona - SEK", "Syrian Pound - SYP", "Taiwan Dollar - TWD", "Tanzanian Shilling - TZS", "Tonga Pa'ang - TOP", "Trinidad & Tobago Dollar - TTD", "Tunisian Dinar - TND", "UAE Dirham - AED", "Ugandan Shilling - UGX", "Ukraine Hryvnia - UAH", "Uruguayan New Peso - UYU", "Vanuatu Vatu - VUV", "Venezuelan Bolivar Fuerte - VEF", "Vietnam Dong - VND", "Yemen Riyal - YER", "Zambian Kwacha - ZMK", "Zimbabwe dollar - ZWD" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(uangdari);

        uangke.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Euro - EUR", "British Pound - GBP", "United States Dollar - USD", "Australian Dollar - AUD", "Canadian Dollar - CAD", "Swiss Franc - CHF", "Chinese Yuan - CNY", "Hong Kong Dollar - HKD", "Indonesian Rupiah - IDR", "Indian Rupee - INR", "Japanese Yen - JPY", "Thai Baht - THB", "Albanian Lek - ALL", "Algerian Dinar - DZD", "Aluminium Ounces - XAL", "Argentine Peso - ARS", "Aruba Florin - AWG", "Bahamian Dollar - BSD", "Bahraini Dinar - BHD", "Bangladesh Taka - BDT", "Barbados Dollar - BBD", "Belarus Ruble - BYR", "Belize Dollar - BZD", "Bermuda Dollar - BMD", "Bhutan Ngultrum - BTN", "Bolivian Boliviano - BOB", "Botswana Pula - BWP", "Brazilian Real - BRL", "Brunei Dollar - BND", "Bulgarian Lev - BGN", "Burundi Franc - BIF", "Cambodia Riel - KHR", "Cape Verde Escudo - CVE", "Cayman Islands Dollar - KYD", "CFA Franc (BCEAO) - XOF", "CFA Franc (BEAC) - XAF", "Chilean Peso - CLP", "Colombian Peso - COP", "Comoros Franc - KMF", "Copper Pounds - XCP", "Costa Rica Colon - CRC", "Croatian Kuna - HRK", "Cuban Peso - CUP", "Czech Koruna - CZK", "Danish Krone - DKK", "Dijibouti Franc - DJF", "Dominican Peso - DOP", "East Caribbean Dollar - XCD", "Ecuador Sucre - ECS", "Egyptian Pound - EGP", "El Salvador Colon - SVC", "Eritrea Nakfa - ERN", "Estonian Kroon - EEK", "Ethiopian Birr - ETB", "Falkland Islands Pound - FKP", "Fiji Dollar - FJD", "Gambian Dalasi - GMD", "Ghanian Cedi - GHC", "Gibraltar Pound - GIP", "Gold Ounces - XAU", "Guatemala Quetzal - GTQ", "Guinea Franc - GNF", "Guyana Dollar - GYD", "Haiti Gourde - HTG", "Honduras Lempira - HNL", "Hungarian Forint - HUF", "Iceland Krona - ISK", "Iran Rial - IRR", "Iraqi Dinar - IQD", "Israeli Shekel - ILS", "Jamaican Dollar - JMD", "Jordanian Dinar - JOD", "Kazakhstan Tenge - KZT", "Kenyan Shilling - KES", "Korean Won - KRW", "Kuwaiti Dinar - KWD", "Lao Kip - LAK", "Latvian Lat - LVL", "Lebanese Pound - LBP", "Lesotho Loti - LSL", "Liberian Dollar - LRD", "Libyan Dinar - LYD", "Lithuanian Lita - LTL", "Macau Pataca - MOP", "Macedonian Denar - MKD", "Malawi Kwacha - MWK", "Malaysian Ringgit - MYR", "Maldives Rufiyaa - MVR", "Maltese Lira - MTL", "Mauritania Ougulya - MRO", "Mauritius Rupee - MUR", "Mexican Peso - MXN", "Moldovan Leu - MDL", "Mongolian Tugrik - MNT", "Moroccan Dirham - MAD", "Myanmar Kyat - MMK", "Namibian Dollar - NAD", "Nepalese Rupee - NPR", "Neth Antilles Guilder - ANG", "Turkish Lira - TRY", "New Zealand Dollar - NZD", "Nicaragua Cordoba - NIO", "Nigerian Naira - NGN", "North Korean Won - KPW", "Norwegian Krone - NOK", "Omani Rial - OMR", "Pacific Franc - XPF", "Pakistani Rupee - PKR", "Palladium Ounces - XPD", "Panama Balboa - PAB", "Papua New Guinea Kina - PGK", "Paraguayan Guarani - PYG", "Peruvian Nuevo Sol - PEN", "Philippine Peso - PHP", "Platinum Ounces - XPT", "Polish Zloty - PLN", "Qatar Rial - QAR", "Romanian New Leu - RON", "Russian Rouble - RUB", "Rwanda Franc - RWF", "Samoa Tala - WST", "Sao Tome Dobra - STD", "Saudi Arabian Riyal - SAR", "Seychelles Rupee - SCR", "Sierra Leone Leone - SLL", "Silver Ounces - XAG", "Singapore Dollar - SGD", "Slovak Koruna - SKK", "Slovenian Tolar - SIT", "Solomon Islands Dollar - SBD", "Somali Shilling - SOS", "South African Rand - ZAR", "Sri Lanka Rupee - LKR", "St Helena Pound - SHP", "Sudanese Pound - SDG", "Swaziland Lilageni - SZL", "Swedish Krona - SEK", "Syrian Pound - SYP", "Taiwan Dollar - TWD", "Tanzanian Shilling - TZS", "Tonga Pa'ang - TOP", "Trinidad & Tobago Dollar - TTD", "Tunisian Dinar - TND", "UAE Dirham - AED", "Ugandan Shilling - UGX", "Ukraine Hryvnia - UAH", "Uruguayan New Peso - UYU", "Vanuatu Vatu - VUV", "Venezuelan Bolivar Fuerte - VEF", "Vietnam Dong - VND", "Yemen Riyal - YER", "Zambian Kwacha - ZMK", "Zimbabwe dollar - ZWD" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(uangke);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton1.setText("Convert Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hasil.setEditable(false);

        jButton3.setBackground(new java.awt.Color(255, 6, 0));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        hasilwaktu.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        hasilwaktu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahuang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(hasilwaktu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jumlahuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasilwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        // Untuk mendapatkan value textbox jumlah uang
        String jumlahuangstring = jumlahuang.getText();

        // Untuk mendapatkan value yang hanya berupa angka
        for (int i = 0; i < jumlahuangstring.length(); i++) {
            if (!Character.isDigit(jumlahuangstring.charAt(i))) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount!");
                uangdari.requestFocus();
                return;
            }
        }

        hasil.setText("");

        // Mengambil value dari jlist uangdari dan uangke
        String curFromText = uangdari.getSelectedValue();
        String curToText = uangke.getSelectedValue();

        String[] temp = null;
        temp = curFromText.split(" - ");
        String curFromTitle = temp[0];
        String curFromCode = temp[1];

        temp = curToText.split(" - ");
        String curToTitle = temp[0];
        String curToCode = temp[1];

        String URL = "http://finance.yahoo.com/q/bc?s=" + curFromCode + "" + curToCode + "=X&t=5d&l=on&z=m&q=l&c=";

        try {
            // Fetch hasil dari yahoo finance
            String results = "";
            URL thePage = new URL(URL);
            BufferedReader in = new BufferedReader(new InputStreamReader(thePage.openStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                results = results + inputLine;
            }
            in.close();
            // Menyesuaikan value uang dari yahoo
            Pattern finalPattern = Pattern.compile("x\">([0-9.]+)</span>");
            Matcher matchFind = finalPattern.matcher(results);
            matchFind.find();

            double curRate = Double.valueOf(matchFind.group(1)).doubleValue();
            double totalConvert = curRate * Double.valueOf(jumlahuang.getText()).doubleValue();

            // Menyesuaikan value waktu dari yahoo
            finalPattern = Pattern.compile("<span id=\"yfs_t10_[a-zA-Z]+=x\">(.*)</span>:");
            matchFind = finalPattern.matcher(results);
            matchFind.find();

            hasil.setText(String.format("%,.2f", totalConvert));
            hasilwaktu.setText("Per Trade Time: " + matchFind.group(1));
        } catch (Exception e) {
            // Handling ketika terdapat error
            JOptionPane.showMessageDialog(this, "Tidak bisa terhubung ke Yahoo Finance!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel hasilwaktu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahuang;
    private javax.swing.JList<String> uangdari;
    private javax.swing.JList<String> uangke;
    // End of variables declaration//GEN-END:variables
}
