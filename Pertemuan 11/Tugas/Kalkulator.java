import java.util.ArrayList;

public class Kalkulator extends javax.swing.JFrame {

    public Kalkulator() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tombolTitik = new javax.swing.JButton();
        tombol0 = new javax.swing.JButton();
        tombol2 = new javax.swing.JButton();
        tombolC = new javax.swing.JButton();
        tombol6 = new javax.swing.JButton();
        tombol3 = new javax.swing.JButton();
        tombol1 = new javax.swing.JButton();
        tombol7 = new javax.swing.JButton();
        tombol5 = new javax.swing.JButton();
        tombol4 = new javax.swing.JButton();
        tombol8 = new javax.swing.JButton();
        tombol9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tombolTambah = new javax.swing.JButton();
        tombolKurang = new javax.swing.JButton();
        tombolBagi = new javax.swing.JButton();
        tombolKali = new javax.swing.JButton();
        tombolSamaDengan = new javax.swing.JButton();
        tombolPersen = new javax.swing.JButton();
        tombolB = new javax.swing.JButton();
        tombolE = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fieldAngka = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tombolTitik.setBackground(java.awt.Color.lightGray);
        tombolTitik.setText(".");
        tombolTitik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolTitikMouseClicked(evt);
            }
        });
        tombolTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTitikActionPerformed(evt);
            }
        });

        tombol0.setBackground(java.awt.Color.lightGray);
        tombol0.setText("0");
        tombol0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol0MouseClicked(evt);
            }
        });

        tombol2.setBackground(java.awt.Color.lightGray);
        tombol2.setText("2");
        tombol2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol2MouseClicked(evt);
            }
        });

        tombolC.setBackground(java.awt.Color.lightGray);
        tombolC.setText("C");
        tombolC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCMouseClicked(evt);
            }
        });
        tombolC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCActionPerformed(evt);
            }
        });

        tombol6.setBackground(java.awt.Color.lightGray);
        tombol6.setText("6");
        tombol6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol6MouseClicked(evt);
            }
        });

        tombol3.setBackground(java.awt.Color.lightGray);
        tombol3.setText("3");
        tombol3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol3MouseClicked(evt);
            }
        });

        tombol1.setBackground(java.awt.Color.lightGray);
        tombol1.setText("1");
        tombol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol1MouseClicked(evt);
            }
        });

        tombol7.setBackground(java.awt.Color.lightGray);
        tombol7.setText("7");
        tombol7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol7MouseClicked(evt);
            }
        });

        tombol5.setBackground(java.awt.Color.lightGray);
        tombol5.setText("5");
        tombol5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol5MouseClicked(evt);
            }
        });

        tombol4.setBackground(java.awt.Color.lightGray);
        tombol4.setText("4");
        tombol4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol4MouseClicked(evt);
            }
        });

        tombol8.setBackground(java.awt.Color.lightGray);
        tombol8.setText("8");
        tombol8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol8MouseClicked(evt);
            }
        });

        tombol9.setBackground(java.awt.Color.lightGray);
        tombol9.setText("9");
        tombol9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tombol1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(tombolTitik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tombol2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombol3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tombol0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tombol8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tombol4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(tombol7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombol5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombol6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol7)
                    .addComponent(tombol8)
                    .addComponent(tombol9))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol4)
                    .addComponent(tombol5)
                    .addComponent(tombol6))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol1)
                    .addComponent(tombol2)
                    .addComponent(tombol3))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol0)
                    .addComponent(tombolC)
                    .addComponent(tombolTitik))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tombolTambah.setBackground(java.awt.Color.lightGray);
        tombolTambah.setText("+");
        tombolTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolTambahMouseClicked(evt);
            }
        });

        tombolKurang.setBackground(java.awt.Color.lightGray);
        tombolKurang.setText("-");
        tombolKurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKurangMouseClicked(evt);
            }
        });

        tombolBagi.setBackground(java.awt.Color.lightGray);
        tombolBagi.setText("/");
        tombolBagi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolBagiMouseClicked(evt);
            }
        });
        tombolBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBagiActionPerformed(evt);
            }
        });

        tombolKali.setBackground(java.awt.Color.lightGray);
        tombolKali.setText("*");
        tombolKali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKaliMouseClicked(evt);
            }
        });

        tombolSamaDengan.setBackground(java.awt.Color.lightGray);
        tombolSamaDengan.setText("=");
        tombolSamaDengan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolSamaDenganMouseClicked(evt);
            }
        });

        tombolPersen.setBackground(java.awt.Color.lightGray);
        tombolPersen.setText("%");
        tombolPersen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolPersenMouseClicked(evt);
            }
        });

        tombolB.setBackground(java.awt.Color.lightGray);
        tombolB.setText("B");

        tombolE.setBackground(java.awt.Color.lightGray);
        tombolE.setText("E");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tombolB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tombolKali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tombolSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolTambah)
                    .addComponent(tombolKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolKali)
                    .addComponent(tombolBagi))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSamaDengan)
                    .addComponent(tombolPersen))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolB)
                    .addComponent(tombolE))
                .addGap(28, 28, 28))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        fieldAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAngkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fieldAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(fieldAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void tombolTitikActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + ".");
    }                                           

    private void tombolCActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void tombolBagiActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void tombolTitikMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
          fieldAngka.setText(fieldAngka.getText()+ ".");
    }                                        

    private void tombol0MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText()+ "0");
    }                                    

    private void tombolCMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         fieldAngka.setText("");
       
    }                                    

    private void fieldAngkaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void tombol7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "7");
    }                                    

    private void tombolTambahMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
     fieldAngka.setText(fieldAngka.getText() + "+");
    }                                         

    private void tombolSamaDenganMouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
    String[] input = fieldAngka.getText().split("[+%-]");
    ArrayList<Character> operators = new ArrayList<Character>();

    for (int i = 0; i < fieldAngka.getText().length(); i++) {
        char currentChar = fieldAngka.getText().charAt(i);
        if (currentChar == '+' || currentChar == '-' || currentChar == '%') {
            operators.add(currentChar);
        }
    }

    System.out.println(operators);
    double result = perhitunganPerkalianDanPembagian(input[0]);

    for (int j = 0; j < operators.size(); j++) {
        double nextOperand = perhitunganPerkalianDanPembagian(input[j + 1]);
        switch (operators.get(j)) {
            case '+':
                System.out.println("Tambah");
                result += nextOperand;
                break;
            case '-':
                result -= nextOperand;
                System.out.println("Kurang");
                break;
            case '%':
                result %= nextOperand;
                System.out.println("Modulus");
                break;
            default:
                break;
        }
    }

    fieldAngka.setText(Double.toString(result));
    }                                             

    private void tombol1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "1");
    }                                    

    private void tombol2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "2");
    }                                    

    private void tombol3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "3");
    }                                    

    private void tombol4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "4");
        
    }                                    

    private void tombol5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "5");
    }                                    

    private void tombol6MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "6");
    }                                    

    private void tombol8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "8");
    }                                    

    private void tombol9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "9");
    }                                    

    private void tombolKurangMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "-");
    }                                         

    private void tombolKaliMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "*");
    }                                       

    private void tombolBagiMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        fieldAngka.setText(fieldAngka.getText() + "/");
    }                                       

    private void tombolPersenMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
         fieldAngka.setText(fieldAngka.getText() + "%");
    }                                         

    private double perhitunganPerkalianDanPembagian(String expression) {
    String[] factors = expression.split("[*/]");
    ArrayList<Character> operators = new ArrayList<Character>();

    for (int i = 0; i < expression.length(); i++) {
        char currentChar = expression.charAt(i);
        if (currentChar == '*' || currentChar == '/') {
            operators.add(currentChar);
        }
    }

    double result = Double.parseDouble(factors[0]);

    for (int j = 0; j < operators.size(); j++) {
        double nextFactor = Double.parseDouble(factors[j + 1]);
        switch (operators.get(j)) {
            case '*':
                System.out.println("Kali");
                result *= nextFactor;
                break;
            case '/':
                if (nextFactor != 0) {
                    result /= nextFactor;
                    System.out.println("Bagi");
                }
                break;
            default:
                break;
        }
    }

    return result;
}
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Membuat dan Menampilkan kalkulator*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField fieldAngka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton tombol0;
    private javax.swing.JButton tombol1;
    private javax.swing.JButton tombol2;
    private javax.swing.JButton tombol3;
    private javax.swing.JButton tombol4;
    private javax.swing.JButton tombol5;
    private javax.swing.JButton tombol6;
    private javax.swing.JButton tombol7;
    private javax.swing.JButton tombol8;
    private javax.swing.JButton tombol9;
    private javax.swing.JButton tombolB;
    private javax.swing.JButton tombolBagi;
    private javax.swing.JButton tombolC;
    private javax.swing.JButton tombolE;
    private javax.swing.JButton tombolKali;
    private javax.swing.JButton tombolKurang;
    private javax.swing.JButton tombolPersen;
    private javax.swing.JButton tombolSamaDengan;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolTitik;
    // End of variables declaration                   
}
