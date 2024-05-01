
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import org.json.JSONObject;

public class JavaGUIJFrame extends javax.swing.JFrame {

    public JavaGUIJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Extract_Text = new javax.swing.JButton();
        Summarize_Text = new javax.swing.JButton();
        Translate_Text = new javax.swing.JButton();
        Convert_Text_To_Speech = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();
        Summarize_and_translate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("YOLO"));
        jPanel1.setEnabled(false);

        Extract_Text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Extract_Text.setText("Extract Text");
        Extract_Text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Extract_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Extract_TextActionPerformed(evt);
            }
        });

        Summarize_Text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Summarize_Text.setText("Summarize");
        Summarize_Text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Summarize_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Summarize_TextActionPerformed(evt);
            }
        });

        Translate_Text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Translate_Text.setText("Translate");
        Translate_Text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Translate_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Translate_TextActionPerformed(evt);
            }
        });

        Convert_Text_To_Speech.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Convert_Text_To_Speech.setText("Convert Text to Speech");
        Convert_Text_To_Speech.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        responseTextArea.setColumns(20);
        responseTextArea.setRows(5);
        jScrollPane1.setViewportView(responseTextArea);

        Summarize_and_translate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Summarize_and_translate.setText("Summarize and Translate");
        Summarize_and_translate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Summarize_and_translate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Summarize_and_translateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Extract_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Summarize_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(Translate_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Summarize_and_translate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Convert_Text_To_Speech)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Extract_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Summarize_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Translate_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Convert_Text_To_Speech, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Summarize_and_translate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Summarize_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Summarize_TextActionPerformed

        //String text = inputTextField.getText();
        // String preprocessedText = preprocessText(text);
        new Thread(() -> {
            try {
                @SuppressWarnings("deprecation")
                URL url = new URL("http://127.0.0.1:5000/summarize");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);

                //String jsonInputString = "{\"text\": \"" + text + "\"}";
//                try (OutputStream os = connection.getOutputStream()) {
//                    byte[] input = jsonInputString.getBytes("utf-8");
//                    os.write(input, 0, input.length);
//                }
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    in.close();
                    saveToFile(response.toString(), "C:\\Users\\areta\\OneDrive\\Desktop\\delte\\summarized_text.txt");
                    SwingUtilities.invokeLater(() -> responseTextArea.setText(response.toString()));
                } else {
                    SwingUtilities.invokeLater(() -> responseTextArea.setText("Error: " + responseCode));
                }
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> responseTextArea.setText("Exception: " + e.getMessage()));
            }
        }).start();
    }//GEN-LAST:event_Summarize_TextActionPerformed

    private void Extract_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Extract_TextActionPerformed

        //String serverUrl = "http://127.0.0.1:5000/extract_text"; // Change this to your Flask server URL
        // String filePath = "./Dashboard.png"; // Change this to the path of your image
        // file

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Image File: ");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File imageFile = fileChooser.getSelectedFile();
            String serverUrl = "http://127.0.0.1:5000/extract_text";

            try {
                URL url = new URL(serverUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");

                String boundary = "Boundary-" + System.currentTimeMillis();
                connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

                OutputStream outputStream = connection.getOutputStream();
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);

                // Send image file
                writer.append("--" + boundary).append("\r\n");
                writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + imageFile.getName() + "\"")
                        .append("\r\n");
                writer.append("Content-Type: image/jpeg").append("\r\n"); // Change Content-Type accordingly
                writer.append("\r\n").flush();
                FileInputStream inputStream = new FileInputStream(imageFile);
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                outputStream.flush();
                inputStream.close();
                writer.append("\r\n").flush();

                writer.append("--" + boundary + "--").append("\r\n");
                writer.close();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    JSONObject jsonObject = new JSONObject(response.toString());
                    // responseTextArea.setText(response.toString());
                    responseTextArea.setText(jsonObject.getString("extracted_text"));

                    System.out.println("Response: " + response.toString());
                } else {
                    System.out.println("POST request failed with response code " + responseCode);
                }
                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Extract_TextActionPerformed

    private void Translate_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Translate_TextActionPerformed
        // TODO add your handling code here:
        // String text = inputTextField.getText();
        // String preprocessedText = preprocessText(text);
        new Thread(() -> {
            try {
                @SuppressWarnings("deprecation")
                URL url = new URL("http://127.0.0.1:5000/translate"); // Change the URL to the translation endpoint
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);

//                String jsonInputString = "{\"text\": \"" + text + "\"}";
//                try (OutputStream os = connection.getOutputStream()) {
//                    byte[] input = jsonInputString.getBytes("utf-8");
//                    os.write(input, 0, input.length);
//                }
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    in.close();

                    saveToFile(response.toString(), "C:\\Users\\areta\\OneDrive\\Desktop\\delte\\translated_text.txt");

                    SwingUtilities.invokeLater(() -> responseTextArea.setText(response.toString()));
                } else {
                    SwingUtilities.invokeLater(() -> responseTextArea.setText("Error: " + responseCode));
                }
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> responseTextArea.setText("Exception: " + e.getMessage()));
            }
        }).start();
    }//GEN-LAST:event_Translate_TextActionPerformed

    private void Summarize_and_translateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Summarize_and_translateActionPerformed
        // TODO add your handling code here:
        //String text = inputTextField.getText();
        new Thread(() -> {
            try {
                @SuppressWarnings("deprecation")
                URL url = new URL("http://127.0.0.1:5000/summarize_and_translate");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);

//                String jsonInputString = "{\"text\": \"" + text + "\"}";
//                try (OutputStream os = connection.getOutputStream()) {
//                    byte[] input = jsonInputString.getBytes("utf-8");
//                    os.write(input, 0, input.length);
//                }
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    in.close();

                    saveToFile(response.toString(), "C:\\Users\\areta\\OneDrive\\Desktop\\delte\\translated_summary_text.txt");

                    SwingUtilities.invokeLater(() -> responseTextArea.setText(response.toString()));
                } else {
                    SwingUtilities.invokeLater(() -> responseTextArea.setText("Error: " + responseCode));
                }
            } catch (IOException e) {
                SwingUtilities.invokeLater(() -> responseTextArea.setText("Exception: " + e.getMessage()));
            }
        }).start();
    }//GEN-LAST:event_Summarize_and_translateActionPerformed

    public void saveToFile(String text, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
            System.out.println("File Saved");

            File file = new File(fileName);
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error saving file." + e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaGUIJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert_Text_To_Speech;
    private javax.swing.JButton Extract_Text;
    private javax.swing.JButton Summarize_Text;
    private javax.swing.JButton Summarize_and_translate;
    private javax.swing.JButton Translate_Text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea responseTextArea;
    // End of variables declaration//GEN-END:variables
}
