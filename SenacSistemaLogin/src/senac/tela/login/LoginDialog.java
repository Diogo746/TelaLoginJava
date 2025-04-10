package senac.tela.login;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginDialog extends JDialog {

    private static final long serialVersionUID = 1L;
    private JTextField emailField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        try {
            LoginDialog dialog = new LoginDialog();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LoginDialog() {
        setBounds(100, 100, 441, 480);
        getContentPane().setLayout(new BorderLayout());
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        emailLabel.setBounds(37, 50, 119, 38);
        contentPanel.add(emailLabel);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        senhaLabel.setBounds(37, 183, 119, 38);
        contentPanel.add(senhaLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        emailField.setBounds(37, 112, 119, 32);
        contentPanel.add(emailField);
        emailField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setBounds(37, 247, 119, 32);
        contentPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        loginButton.setBounds(37, 358, 112, 44);
        contentPanel.add(loginButton);

        JButton cadastroButton = new JButton("Cadastrar");
        cadastroButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        cadastroButton.setBounds(159, 358, 131, 44);
        contentPanel.add(cadastroButton);

        loginButton.addActionListener(e -> {
            // Lógica de autenticação de login
        });

        cadastroButton.addActionListener(e -> {
            new CadastroDialog().setVisible(true);
        });
    }
}
