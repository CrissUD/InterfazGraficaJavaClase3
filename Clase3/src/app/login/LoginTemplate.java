package app.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginTemplate extends JFrame {
  private static final long serialVersionUID = 1L;

  // Declaración Objetos Gráficos
  private JPanel pDerecha, pIzquierda;
  private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
  private JLabel lFondo, lSvg1, lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;
  private JTextField tNombreUsuario;
  private JPasswordField tClaveUsuario;
  private JComboBox<String> cbTipoUsuario;
  private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
  private JCheckBox checkSi, checkNo;
  private ButtonGroup grupo;

  // Declaración objetos Decoradores
  private Color colorPrincipal, colorGrisOscuro;
  // private Color colorNegroTransparente;
  private Font fontTPrincipal, fontTitulo, fontSubtitulo;
  // private Font fontMediana;
  private Cursor cMano;
  private Border bInferiorAzul;
  private ImageIcon iFondo, iLogo, iCerrar;
  private ImageIcon iSvg1, iUsuario2, iClave2, iPunto1, iFacebook1, iTwitter1, iYoutube1, iDimAux;

  public LoginTemplate() {
    this.generarFuentes();

    colorPrincipal = new Color(60, 78, 120);
    colorGrisOscuro = new Color(80, 80, 80);
    // colorNegroTransparente = new Color(30, 30, 30, 30);
    fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
    fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 17);
    fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
    // fontMediana = new Font("LuzSans-Book", Font.PLAIN, 15);
    cMano = new Cursor(Cursor.HAND_CURSOR);
    bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
    iFondo = new ImageIcon("Clase3/resources/images/fondo.png");
    iLogo = new ImageIcon("Clase3/resources/images/logo.png");
    iUsuario2 = new ImageIcon("Clase3/resources/images/usuario2.png");
    iClave2 = new ImageIcon("Clase3/resources/images/clave2.png");
    iPunto1 = new ImageIcon("Clase3/resources/images/punto1.png");
    iFacebook1 = new ImageIcon("Clase3/resources/images/facebook1.png");
    iTwitter1 = new ImageIcon("Clase3/resources/images/twitter1.png");
    iYoutube1 = new ImageIcon("Clase3/resources/images/youtube1.png");
    iSvg1 = new ImageIcon("Clase3/resources/images/imagen1.png");
    iCerrar = new ImageIcon("Clase3/resources/images/cerrar.png");

    pIzquierda = new JPanel();
    pIzquierda.setSize(600, 500);
    pIzquierda.setLocation(0, 0);
    pIzquierda.setBackground(Color.white);
    pIzquierda.setLayout(null);
    this.add(pIzquierda);

    pDerecha = new JPanel();
    pDerecha.setSize(400, 500);
    pDerecha.setLocation(600, 0);
    pDerecha.setBackground(Color.white);
    pDerecha.setLayout(null);
    this.add(pDerecha);

    iDimAux = new ImageIcon(
      iLogo.getImage()
        .getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
    );

    lLogo = new JLabel();
    lLogo.setBounds(50, 20, 40, 40);
    lLogo.setIcon(iDimAux);
    pIzquierda.add(lLogo);

    lTituloApp = new JLabel("Login de Usuario");
    lTituloApp.setBounds(100, 20, 220, 30);
    lTituloApp.setForeground(Color.WHITE);
    lTituloApp.setFont(fontTPrincipal);
    pIzquierda.add(lTituloApp);

    iDimAux = new ImageIcon(
      iSvg1.getImage()
        .getScaledInstance(500, 345, Image.SCALE_AREA_AVERAGING)
    );

    lSvg1 = new JLabel();
    lSvg1.setBounds(100, 100, 500, 345);
    lSvg1.setIcon(iDimAux);
    pIzquierda.add(lSvg1);

    lEslogan = new JLabel("Te ayudamos en todo");
    lEslogan.setSize(130, 20);
    lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 60);
    lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
    lEslogan.setForeground(colorGrisOscuro);
    lEslogan.setFont(fontSubtitulo);
    pDerecha.add(lEslogan);

    lTituloLogin = new JLabel("Registra tus Datos");
    lTituloLogin.setSize(150, 30);
    lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 80);
    lTituloLogin.setForeground(colorGrisOscuro);
    lTituloLogin.setFont(fontTitulo);
    lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(lTituloLogin);

    lNotificaciones = new JLabel("¿Recibir Notificaciones?");
    lNotificaciones.setSize(140, 20);
    lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 400);
    lNotificaciones.setForeground(colorGrisOscuro);
    lNotificaciones.setFont(fontSubtitulo);
    lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(lNotificaciones);

    iDimAux = new ImageIcon(
      iUsuario2.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    lUsuario = new JLabel();
    lUsuario.setBounds(40, 140, 30, 30);
    lUsuario.setIcon(iDimAux);
    pDerecha.add(lUsuario);

    iDimAux = new ImageIcon(
      iClave2.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    lClave = new JLabel();
    lClave.setBounds(40, 270, 30, 30);
    lClave.setIcon(iDimAux);
    pDerecha.add(lClave);

    tNombreUsuario = new JTextField("Nombre Usuario");
    tNombreUsuario.setSize(260, 40);
    tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 130);
    tNombreUsuario.setForeground(colorPrincipal);
    tNombreUsuario.setBackground(Color.WHITE);
    tNombreUsuario.setCaretColor(colorGrisOscuro);
    tNombreUsuario.setBorder(bInferiorAzul);
    tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tNombreUsuario);

    tClaveUsuario = new JPasswordField("Clave Usuario");
    tClaveUsuario.setSize(260, 40);
    tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 260);
    tClaveUsuario.setForeground(colorPrincipal);
    tClaveUsuario.setCaretColor(colorGrisOscuro);
    tClaveUsuario.setBorder(bInferiorAzul);
    tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(tClaveUsuario);

    cbTipoUsuario = new JComboBox<String>();
    cbTipoUsuario.addItem("Cliente");
    cbTipoUsuario.addItem("Cajero");
    cbTipoUsuario.addItem("Administrador");
    cbTipoUsuario.setSize(220, 30);
    cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 210);
    cbTipoUsuario.setForeground(colorPrincipal);
    cbTipoUsuario.setBackground(Color.WHITE);
    ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    pDerecha.add(cbTipoUsuario);

    bEntrar = new JButton("Entrar");
    bEntrar.setSize(250, 45);
    bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 330);
    bEntrar.setFocusable(false);
    bEntrar.setBackground(colorPrincipal);
    bEntrar.setForeground(Color.WHITE);
    bEntrar.setCursor(cMano);
    pDerecha.add(bEntrar);

    bRegistrarse = new JButton("Registrarse");
    bRegistrarse.setBounds(240, 460, 145, 35);
    bRegistrarse.setFocusable(false);
    bRegistrarse.setBackground(colorPrincipal);
    bRegistrarse.setForeground(Color.WHITE);
    bRegistrarse.setCursor(cMano);
    pDerecha.add(bRegistrarse);
    
    iDimAux = new ImageIcon(
      iCerrar.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    bCerrar = new JButton();
    bCerrar.setBounds(350, 10, 45, 30);
    bCerrar.setFocusable(false);
    bCerrar.setBackground(Color.BLUE);
    bCerrar.setForeground(Color.WHITE);
    bCerrar.setCursor(cMano);
    bCerrar.setIcon(iDimAux);
    bCerrar.setContentAreaFilled(false);
    bCerrar.setFocusable(false);
    bCerrar.setBorder(null);
    pDerecha.add(bCerrar);

    iDimAux = new ImageIcon(
      iPunto1.getImage()
        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
    );

    bOpcion1 = new JButton();
    bOpcion1.setBounds(10, 220, 30, 20);
    bOpcion1.setCursor(cMano);
    bOpcion1.setIcon(iDimAux);
    bOpcion1.setContentAreaFilled(false);
    bOpcion1.setFocusable(false);
    bOpcion1.setBorder(null);
    pIzquierda.add(bOpcion1);

    bOpcion2 = new JButton();
    bOpcion2.setBounds(10, 250, 30, 20);
    bOpcion2.setCursor(cMano);
    bOpcion2.setIcon(iDimAux);
    bOpcion2.setContentAreaFilled(false);
    bOpcion2.setFocusable(false);
    bOpcion2.setBorder(null);
    pIzquierda.add(bOpcion2);

    bOpcion3 = new JButton();
    bOpcion3.setBounds(10, 280, 30, 20);
    bOpcion3.setCursor(cMano);
    bOpcion3.setIcon(iDimAux);
    bOpcion3.setContentAreaFilled(false);
    bOpcion3.setFocusable(false);
    bOpcion3.setBorder(null);
    pIzquierda.add(bOpcion3);

    iDimAux = new ImageIcon(
      iFacebook1.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    lFacebook = new JLabel();
    lFacebook.setBounds(20, 460, 30, 30);
    lFacebook.setIcon(iDimAux);
    lFacebook.setCursor(cMano);
    pIzquierda.add(lFacebook);

    iDimAux = new ImageIcon(
      iTwitter1.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    lTwitter = new JLabel();
    lTwitter.setBounds(60, 460, 30, 30);
    lTwitter.setIcon(iDimAux);
    lTwitter.setCursor(cMano);
    pIzquierda.add(lTwitter);

    iDimAux = new ImageIcon(
      iYoutube1.getImage()
        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
    );

    lYoutube = new JLabel();
    lYoutube.setBounds(100, 460, 30, 30);
    lYoutube.setIcon(iDimAux);
    lYoutube.setCursor(cMano);
    pIzquierda.add(lYoutube);

    iDimAux = new ImageIcon(
      iFondo.getImage()
        .getScaledInstance(600, 600, Image.SCALE_AREA_AVERAGING)
    );

    lFondo = new JLabel();
    lFondo.setBounds(0, 0, 600, 600);
    lFondo.setIcon(iDimAux);
    pIzquierda.add(lFondo);

    checkSi = new JCheckBox("Si");
    checkSi.setSize(45, 25);
    checkSi.setFocusable(false);
    checkSi.setBackground(Color.WHITE);
    checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 375);
    checkSi.setCursor(cMano);
    pDerecha.add(checkSi);

    checkNo = new JCheckBox("No");
    checkNo.setSize(45, 25);
    checkNo.setFocusable(false);
    checkNo.setBackground(Color.WHITE);
    checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 375);
    checkNo.setCursor(cMano);
    pDerecha.add(checkNo);

    grupo = new ButtonGroup();
    grupo.add(checkSi);
    grupo.add(checkNo);

    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1000, 500);
    setLocationRelativeTo(this);
    setUndecorated(true);
    setLayout(null);
    setVisible(true);
  }

  private void generarFuentes() {
    try {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      ge.registerFont( Font.createFont(
          Font.TRUETYPE_FONT,
          new File("Clase3/resources/fonts/LUZRO.ttf")
      ));
    } catch (IOException | FontFormatException e) {
      System.out.println(e);
    }
  }
}