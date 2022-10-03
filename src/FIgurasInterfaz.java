import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FIgurasInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textRcirculo;
	private JTextField textAcirculo;
	private JTextField textPcirculo;
	private JTextField textBrectangulo;
	private JTextField textHrectangulo;
	private JTextField textArectangulo;
	private JTextField textPrectangulo;
	private JTextField textLcuadrado;
	private JTextField textAcuadrado;
	private JTextField textPcuadrado;
	private JTextField textHtriangulo;
	private JTextField textBtriangulo;
	private JTextField textHiptriangulo;
	private JTextField textPtriangulo;
	private JTextField textAtriangulo;
	private JTextField textDMenor_rombo;
	private JTextField textDMayor_rombo;
	private JTextField textArombo;
	private JTextField textPrombo;
	private JTextField textBMayor_trapecio;
	private JTextField textBMenor_trapecio;
	private JTextField textHtrapecio;
	private JTextField textAtrapecio;
	private JTextField textPtrapecio;
	private JTextField textTipotriangulo;
	private JTextField textLrombo;

	
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					FIgurasInterfaz frame = new FIgurasInterfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FIgurasInterfaz() {
		this.setTitle("Figuras geométricas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 957);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(51, 153, 255));
		contentPane_1.setBounds(0, 0, 1258, 918);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Círculo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 117, 111, 14);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rectángulo");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 251, 211, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cuadrado");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(22, 355, 132, 45);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Triángulo rectángulo");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 514, 226, 14);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Rombo");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(20, 664, 111, 14);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Trapecio");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 828, 182, 14);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Radio círculo (cm): ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(118, 92, 323, 14);
		contentPane_1.add(lblNewLabel_4);
		
		textRcirculo = new JTextField();
		textRcirculo.setColumns(10);
		textRcirculo.setBounds(104, 115, 139, 20);
		contentPane_1.add(textRcirculo);
		
		JButton btnCcirculo = new JButton("Determinar");
		btnCcirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// para un circulo
				try {
					double radio; // variable
					// ingreso por teclado (captar)
					radio = Double.parseDouble(textRcirculo.getText());
					// definir
					Circulo miCir = new Circulo(radio);
					// salidas
					textAcirculo.setText(String.valueOf(miCir.calcularArea()));
					textPcirculo.setText(String.valueOf(miCir.calcularPerimetro()));
					// en caso de que el radio no se ingrese correctamente
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "El radio ingresado no es válido. Intente nuevamente.");
				}
			}
		});
				
				
			
		
		btnCcirculo.setBounds(118, 142, 107, 23);
		contentPane_1.add(btnCcirculo);
		
		JLabel lblNewLabel_5 = new JLabel("Área círculo (cm^2): ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(369, 92, 123, 14);
		contentPane_1.add(lblNewLabel_5);
		
		textAcirculo = new JTextField();
		textAcirculo.setColumns(10);
		textAcirculo.setBounds(348, 115, 144, 20);
		contentPane_1.add(textAcirculo);
		
		JLabel lblNewLabel_5_1 = new JLabel("Perimetro círculo (cm):");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(522, 92, 166, 14);
		contentPane_1.add(lblNewLabel_5_1);
		
		textPcirculo = new JTextField();
		textPcirculo.setColumns(10);
		textPcirculo.setBounds(502, 115, 132, 20);
		contentPane_1.add(textPcirculo);
		
		JLabel lblNewLabel_4_1 = new JLabel("Base rectángulo (cm): ");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(260, 196, 323, 14);
		contentPane_1.add(lblNewLabel_4_1);
		
		textBrectangulo = new JTextField();
		textBrectangulo.setColumns(10);
		textBrectangulo.setBounds(260, 221, 139, 20);
		contentPane_1.add(textBrectangulo);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Altura rectángulo (cm):");
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_1.setBounds(260, 252, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_1);
		
		textHrectangulo = new JTextField();
		textHrectangulo.setColumns(10);
		textHrectangulo.setBounds(260, 277, 139, 20);
		contentPane_1.add(textHrectangulo);
		
		JButton btnNewCrectangulo = new JButton("Determinar");
		btnNewCrectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double Brectangulo, Hrectangulo; // variables
					Brectangulo = Double.parseDouble(textBrectangulo.getText()); // base
				Hrectangulo = Double.parseDouble(textHrectangulo.getText()); // altura
					Rectangulo miRect = new Rectangulo(Brectangulo, Hrectangulo);

					textArectangulo.setText(String.valueOf(miRect.calcularArea()));
					textPrectangulo.setText(String.valueOf(miRect.calcularPerímetro()));
				}
				// en caso de excepciones
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Los valores de base y altura no son válidos. Rectifique e intente nuevamente.");
				}
				
				
				
			}
		});
		btnNewCrectangulo.setBounds(118, 248, 114, 23);
		contentPane_1.add(btnNewCrectangulo);
		
		JLabel lblNewLabel_5_2 = new JLabel("Área rectángulo (cm^2): ");
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2.setBounds(446, 224, 153, 14);
		contentPane_1.add(lblNewLabel_5_2);
		
		textArectangulo = new JTextField();
		textArectangulo.setColumns(10);
		textArectangulo.setBounds(437, 249, 144, 20);
		contentPane_1.add(textArectangulo);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Perímetro rectángulo (cm): ");
		lblNewLabel_5_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_1_1.setBounds(616, 224, 166, 14);
		contentPane_1.add(lblNewLabel_5_1_1);
		
		textPrectangulo = new JTextField();
		textPrectangulo.setColumns(10);
		textPrectangulo.setBounds(616, 249, 132, 20);
		contentPane_1.add(textPrectangulo);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Lado cuadrado (cm): ");
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_2.setBounds(118, 343, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_2);
		
		textLcuadrado = new JTextField();
		textLcuadrado.setColumns(10);
		textLcuadrado.setBounds(104, 368, 139, 20);
		contentPane_1.add(textLcuadrado);
		
		JButton btnCcuadrado = new JButton("Determinar");
		btnCcuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// CALCULA PROPIEDADES CUADRADO
					double lado;
					lado = Double.parseDouble(textLcuadrado.getText());
					Cuadrado miCuad = new Cuadrado(lado);
					// entregar valores encontrados
					textAcuadrado.setText(String.valueOf(miCuad.calcularArea()));
					textPcuadrado.setText(String.valueOf(miCuad.calcularPerímetro()));
				}
				// en caso de haber errores al diligenciar el lado
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"El valor ingresado para le lado del cuadrado NO es válido. Intente de nuevo.");
				}
				
				
			}
		});
		btnCcuadrado.setBounds(118, 402, 114, 23);
		contentPane_1.add(btnCcuadrado);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Área cuadrado (cm^2): ");
		lblNewLabel_5_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1.setBounds(369, 337, 123, 14);
		contentPane_1.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Perímetro cuadrado (cm): ");
		lblNewLabel_5_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_1_1_1.setBounds(522, 337, 166, 14);
		contentPane_1.add(lblNewLabel_5_1_1_1);
		
		textAcuadrado = new JTextField();
		textAcuadrado.setColumns(10);
		textAcuadrado.setBounds(358, 368, 132, 20);
		contentPane_1.add(textAcuadrado);
		
		textPcuadrado = new JTextField();
		textPcuadrado.setColumns(10);
		textPcuadrado.setBounds(522, 368, 132, 20);
		contentPane_1.add(textPcuadrado);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Altura triángulo (cm): ");
		lblNewLabel_4_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_2_1.setBounds(276, 530, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_2_1);
		
		textHtriangulo = new JTextField();
		textHtriangulo.setColumns(10);
		textHtriangulo.setBounds(270, 547, 139, 20);
		contentPane_1.add(textHtriangulo);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Base triángulo (cm): ");
		lblNewLabel_4_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3.setBounds(276, 474, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3);
		
		textBtriangulo = new JTextField();
		textBtriangulo.setColumns(10);
		textBtriangulo.setBounds(270, 499, 139, 20);
		contentPane_1.add(textBtriangulo);
		
		JButton btnCtriangulo = new JButton("Determinar");
		btnCtriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double Btriangulo, Htriangulo;
					Btriangulo = Double.parseDouble(textBtriangulo.getText());
					Htriangulo = Double.parseDouble(textHtriangulo.getText());
					TrianguloRectangulo miTri = new TrianguloRectangulo(Btriangulo, Htriangulo);

					textAtriangulo.setText(String.valueOf(miTri.calcularArea()));
					textPtriangulo.setText(String.valueOf(miTri.calcularPerímetro()));
					textHiptriangulo.setText(String.valueOf(miTri.calcularH()));

					if (miTri.tipo() == 27) {
						textTipotriangulo.setText("El triángulo ingreso es equilátero.");
					} else if (miTri.tipo() == 21) {
						textTipotriangulo.setText("El triángulo es escaleno.");
					} else {
						textTipotriangulo.setText("El triángulo es isósceles.");
					}
				}
				// para excepciones donde no se den correctamente los datos
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Los valores indicados no son válidos. Borre y vuelva a intentarlo.");
				}
				
				
			}
		});
		btnCtriangulo.setBounds(143, 511, 117, 23);
		contentPane_1.add(btnCtriangulo);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("Hipotenusa triángulo (cm): ");
		lblNewLabel_5_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1.setBounds(502, 474, 173, 14);
		contentPane_1.add(lblNewLabel_5_2_1_1);
		
		textHiptriangulo = new JTextField();
		textHiptriangulo.setColumns(10);
		textHiptriangulo.setBounds(502, 499, 132, 20);
		contentPane_1.add(textHiptriangulo);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Perímetro triángulo (cm): ");
		lblNewLabel_4_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1.setBounds(673, 474, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_1);
		
		textPtriangulo = new JTextField();
		textPtriangulo.setColumns(10);
		textPtriangulo.setBounds(673, 499, 132, 20);
		contentPane_1.add(textPtriangulo);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("Área triángulo (cm^2): ");
		lblNewLabel_5_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1.setBounds(515, 530, 173, 14);
		contentPane_1.add(lblNewLabel_5_2_1_1_1);
		
		textAtriangulo = new JTextField();
		textAtriangulo.setColumns(10);
		textAtriangulo.setBounds(502, 547, 132, 20);
		contentPane_1.add(textAtriangulo);
		
		JLabel lblNewLabel_4_1_3_2 = new JLabel("Diámetro menor rombo (cm): ");
		lblNewLabel_4_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2.setBounds(221, 617, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2);
		
		textDMenor_rombo = new JTextField();
		textDMenor_rombo.setColumns(10);
		textDMenor_rombo.setBounds(221, 633, 139, 20);
		contentPane_1.add(textDMenor_rombo);
		
		JLabel lblNewLabel_4_1_3_2_1 = new JLabel("Diámetro mayor rombo (cm): ");
		lblNewLabel_4_1_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_1.setBounds(221, 665, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2_1);
		
		textDMayor_rombo = new JTextField();
		textDMayor_rombo.setColumns(10);
		textDMayor_rombo.setBounds(221, 677, 139, 20);
		contentPane_1.add(textDMayor_rombo);
		
		JButton btnCrombo = new JButton("Determinar");
		btnCrombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double DMenorombo, DMayor, lado;
					DMenorombo = Double.parseDouble(textDMenor_rombo.getText());
					DMayor = Double.parseDouble(textDMayor_rombo.getText());
					lado = Double.parseDouble(textLrombo.getText());
					Rombo miRom = new Rombo(lado, DMenorombo, DMayor);
					textArombo.setText(String.valueOf(miRom.calcularArea()));
					textPrombo.setText(String.valueOf(miRom.calcularPerimetro()));
				}
				// para valores no válidos
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Uno de los tres valores ingresado no es válido. Intente de nuevo.");
				}
				
				
				
			}
		});
		btnCrombo.setBounds(87, 661, 89, 23);
		contentPane_1.add(btnCrombo);
		
		JLabel lblNewLabel_5_2_1_1_1_1 = new JLabel("Área rombo (cm^2): ");
		lblNewLabel_5_2_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_1.setBounds(390, 664, 173, 14);
		contentPane_1.add(lblNewLabel_5_2_1_1_1_1);
		
		JLabel lblNewLabel_4_1_3_1_1 = new JLabel("Perímetro rombo (cm): ");
		lblNewLabel_4_1_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1_1.setBounds(554, 664, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_1_1);
		
		textArombo = new JTextField();
		textArombo.setColumns(10);
		textArombo.setBounds(386, 677, 132, 20);
		contentPane_1.add(textArombo);
		
		textPrombo = new JTextField();
		textPrombo.setColumns(10);
		textPrombo.setBounds(543, 677, 132, 20);
		contentPane_1.add(textPrombo);
		
		JLabel lblNewLabel_4_1_3_2_2 = new JLabel("Base mayor trapecio (cm): ");
		lblNewLabel_4_1_3_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2.setBounds(221, 779, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2_2);
		
		textBMayor_trapecio = new JTextField();
		textBMayor_trapecio.setColumns(10);
		textBMayor_trapecio.setBounds(221, 798, 139, 20);
		contentPane_1.add(textBMayor_trapecio);
		
		JLabel lblNewLabel_4_1_3_2_2_1 = new JLabel("Base menor trapecio (cm): ");
		lblNewLabel_4_1_3_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2_1.setBounds(221, 829, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2_2_1);
		
		textBMenor_trapecio = new JTextField();
		textBMenor_trapecio.setColumns(10);
		textBMenor_trapecio.setBounds(221, 840, 139, 20);
		contentPane_1.add(textBMenor_trapecio);
		
		JLabel lblNewLabel_4_1_3_2_2_1_1 = new JLabel("Altura trapecio (cm): ");
		lblNewLabel_4_1_3_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2_1_1.setBounds(221, 862, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2_2_1_1);
		
		textHtrapecio = new JTextField();
		textHtrapecio.setColumns(10);
		textHtrapecio.setBounds(221, 887, 139, 20);
		contentPane_1.add(textHtrapecio);
		
		JButton btnCtrapecio = new JButton("Determinar");
		btnCtrapecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double BMenor = Double.parseDouble(textBMenor_trapecio.getText()),
							BMayor = Double.parseDouble(textBMayor_trapecio.getText()),
							altura = Double.parseDouble(textHtrapecio.getText());
					Trapecio mitrapecio = new Trapecio(BMayor, BMenor, altura);
					textAtrapecio.setText(String.valueOf(mitrapecio.calcularArea()));
					textPtrapecio.setText(String.valueOf(mitrapecio.calcularPerimetro()));
				}
				// para las excepciones
				catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Alguno de los valores no es válido. Revise nuevamente.");
				}
				
				
				
			}
		});
		btnCtrapecio.setBounds(79, 825, 97, 23);
		contentPane_1.add(btnCtrapecio);
		
		JLabel lblNewLabel_5_2_1_1_1_1_1 = new JLabel("Área trapecio (cm^2): ");
		lblNewLabel_5_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_1_1.setBounds(401, 810, 173, 14);
		contentPane_1.add(lblNewLabel_5_2_1_1_1_1_1);
		
		textAtrapecio = new JTextField();
		textAtrapecio.setColumns(10);
		textAtrapecio.setBounds(390, 826, 132, 20);
		contentPane_1.add(textAtrapecio);
		
		JLabel lblNewLabel_4_1_3_1_1_1 = new JLabel("Perímetro trapecio (cm): ");
		lblNewLabel_4_1_3_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1_1_1.setBounds(554, 810, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_1_1_1);
		
		textPtrapecio = new JTextField();
		textPtrapecio.setColumns(10);
		textPtrapecio.setBounds(543, 826, 132, 20);
		contentPane_1.add(textPtrapecio);
		
		JLabel lblNewLabel_5_2_1_1_1_2 = new JLabel("Tipo triángulo: ");
		lblNewLabel_5_2_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_2.setBounds(673, 530, 173, 14);
		contentPane_1.add(lblNewLabel_5_2_1_1_1_2);
		
		textTipotriangulo = new JTextField();
		textTipotriangulo.setColumns(10);
		textTipotriangulo.setBounds(673, 547, 200, 20);
		contentPane_1.add(textTipotriangulo);
		
		JLabel lblNewLabel_4_1_3_2_1_1 = new JLabel("Lado rombo (cm):");
		lblNewLabel_4_1_3_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_1_1.setBounds(221, 703, 323, 14);
		contentPane_1.add(lblNewLabel_4_1_3_2_1_1);
		
		textLrombo = new JTextField();
		textLrombo.setColumns(10);
		textLrombo.setBounds(221, 728, 139, 20);
		contentPane_1.add(textLrombo);
		
		JButton btnBorrarC = new JButton("Borrar");
		btnBorrarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRcirculo.setText("");
				textAcirculo.setText("");
				textPcirculo.setText("");
				
				
			}
		});
		btnBorrarC.setBounds(446, 142, 89, 23);
		contentPane_1.add(btnBorrarC);
		
		JButton btnBorrarR = new JButton("Borrar");
		btnBorrarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBrectangulo.setText("");
				textHrectangulo.setText("");
				textArectangulo.setText("");
				textPrectangulo.setText("");
			
			}
		});
		btnBorrarR.setBounds(554, 277, 89, 23);
		contentPane_1.add(btnBorrarR);
		
		JButton btnCuadrado = new JButton("Borrar");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLcuadrado.setText("");
				textAcuadrado.setText("");
				textPcuadrado.setText("");
				
				
			}
		});
		btnCuadrado.setBounds(463, 402, 89, 23);
		contentPane_1.add(btnCuadrado);
		
		JButton btnBorrarrec = new JButton("Borrar");
		btnBorrarrec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// las comillas vacías indican que el campo queda en blanco
				textTipotriangulo.setText("");
				textBtriangulo.setText("");
				textHtriangulo.setText("");
				textHiptriangulo.setText("");
				textAtriangulo.setText("");
				textPtriangulo.setText("");
			}
		});
		btnBorrarrec.setBounds(870, 511, 89, 23);
		contentPane_1.add(btnBorrarrec);
		
		JButton btnBorrartri = new JButton("Borrar");
		btnBorrartri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDMenor_rombo.setText("");
				textDMayor_rombo.setText("");
				textLrombo.setText("");
				textArombo.setText("");
				textPrombo.setText("");
				
			}
		});
		btnBorrartri.setBounds(482, 708, 89, 23);
		contentPane_1.add(btnBorrartri);
		
		JButton btnBorrartra = new JButton("Borrar");
		btnBorrartra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBMenor_trapecio.setText("");
				textBMayor_trapecio.setText("");
				textHtrapecio.setText("");
				textAtrapecio.setText("");
				textPtrapecio.setText("");
				
			}
		});
		btnBorrartra.setBounds(482, 854, 89, 23);
		contentPane_1.add(btnBorrartra);
		
		JEditorPane dtrpnSaludo = new JEditorPane();
		dtrpnSaludo.setText("GeometryNath");
		dtrpnSaludo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		dtrpnSaludo.setBackground(new Color(51, 153, 255));
		dtrpnSaludo.setBounds(357, 11, 277, 39);
		contentPane_1.add(dtrpnSaludo);
		
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH); // comando para cerrar el programa
			}
		});
		btnSalir.setBounds(842, 35, 89, 23);
		contentPane_1.add(btnSalir);
		
		
	
	}
}

