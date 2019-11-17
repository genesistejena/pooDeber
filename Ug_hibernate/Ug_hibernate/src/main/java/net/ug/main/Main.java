package net.ug.main;

import net.ug.dao.DaoAutores;
import net.ug.dao.DaoBiblioteca;
import net.ug.dao.DaoClientes;
import net.ug.hibernate.Autores;
import net.ug.hibernate.Biblioteca;
import net.ug.hibernate.Clientes;

public class Main {
	
	public static void main(String[] args){
		
		
		crear();
		
		
	}
		public static  void crear(){
			
			//Autores
			DaoAutores daoA=new  DaoAutores();
			Autores a1= new Autores(1,"Genesis","tejena","10/10/98");	
			daoA.setup();
			daoA.crear(a1);
			
		//Biblioteca
			DaoBiblioteca daoB=new DaoBiblioteca();
			Biblioteca b1= new Biblioteca(1,"Central","09989854120");
			daoB.setup();
			daoB.crear(b1);
			
		//Clientes
			DaoClientes daoC = new DaoClientes();
			Clientes c1= new Clientes(1, "Katheryne", "Reyes", "15/08/1999", "0956344281", "Florida norte", 'v');
			daoC.setup();
			daoC.crear(c1);
		}

		
}