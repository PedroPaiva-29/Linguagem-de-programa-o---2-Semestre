package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	//Método sobrescrito da classe
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 800, 400);
		
		//Grama
		g.setColor(Color.green);
		g.fillRect(0, 400, 800, 200);
		
		//Sol
		g.setColor(Color.yellow);
		g.fillOval(610, 40, 130, 130);
		
		//Contorno do sol
		g.setColor(Color.orange);
		g.fillOval(630, 60, 90, 90);
		
		//Frente da casa
		g.setColor(Color.black);
		g.drawRect(50, 300, 80, 200);
		
		//Telhado 
		g.setColor(Color.black);
		g.drawLine(50, 300, 90, 200);
		g.drawLine(90, 200, 130, 300);
		
		//Lateral da casa
		g.drawLine(130, 300, 330, 250);
		g.drawLine(330, 250, 330, 430);
		g.drawLine(130, 500, 330, 430);
		
		//Telhado da lateral da casa
		g.drawLine(90, 200, 270, 170);
		g.drawLine(270, 170, 330, 250);
		
		//Boneco de palito
		g.drawOval(540, 300, 50, 50); //Cabeça
		g.drawLine(565, 350, 565, 450); //Tronco
		g.drawLine(500, 380, 630, 380); //Braços
		g.drawLine(565, 450, 500, 500); //Perna Esquerda
		g.drawLine(565, 450, 630, 500); //Perna Direita
		

	}
}
