package view;

import javax.swing.JOptionPane;

import Aluno.Aluno;

public class Execucao {

	public static void main(String[] args) {


		Aluno aluno = new Aluno();
		
		aluno.setName(JOptionPane.showInputDialog("Digite seu nome:"));		
		aluno.setEndereco(JOptionPane.showInputDialog("Digite seu endereço:"));		
		aluno.setBairro(JOptionPane.showInputDialog("Digite seu bairro:"));		
		aluno.setCEP(Long.parseLong(JOptionPane.showInputDialog("Digite seu CEP:")));		
		aluno.setCidade(JOptionPane.showInputDialog("Digite seu cidade:"));	
		aluno.setEstado(JOptionPane.showInputDialog("Digite seu estado:"));
		
		System.out.println(aluno.getName());
		System.out.println(aluno.getEndereco());
		System.out.println(aluno.getBairro());
		System.out.println(aluno.getCEP());
		System.out.println(aluno.getCidade());
		System.out.println(aluno.getEstado());

	}

	
}
