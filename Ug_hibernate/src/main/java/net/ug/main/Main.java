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
		read();
		update();
		delete();
		
	}
		//METODO PARA CREAR
	
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

		//METODO PARA LEER
	
		public static void read() {
				
	   //Autores	
			DaoAutores daoA = new DaoAutores();
			daoA.setup();
			Autores autor = daoA.read(1);
			autor.imprimir();

		//Biblioteca
			DaoBiblioteca daoB = new DaoBiblioteca();
			daoB.setup();
			Biblioteca biblioteca = daoB.read(1);
			biblioteca.imprimir();
		
		//Clientes
			DaoClientes daoC = new DaoClientes();
			daoC.setup();
			Clientes cliente = daoC.read(1);
			cliente.imprimir();
			
		}	
		
		
		//METODO PARA ACTUALIZAR
		
		public static void update() {

		//Autores	
			DaoAutores daoA = new DaoAutores();
			daoA.setup();
			Autores autor = daoA.read(1);
			autor.setNombres("Nicole");
			daoA.update(autor);
			
		//Biblioteca	
			DaoBiblioteca daoB = new DaoBiblioteca();
			daoB.setup();
			Biblioteca biblioteca = daoB.read(1);
			biblioteca.setNombre("Municipal");
			daoB.update(biblioteca);
		
		//Clientes
			DaoClientes daoC = new DaoClientes();
			daoC.setup();
			Clientes cliente = daoC.read(1);
			cliente.setNombres("Elizabeth");
			daoC.update(cliente);
			
		}
		
		//METODO PARA ACTUALIZAR
		
		public static void delete() {
			
		//Autores
			DaoAutores daoA= new DaoAutores();
			daoA.setup();
			daoA.delete(1);
			
		//Biblioteca
			DaoBiblioteca daoB= new DaoBiblioteca();
			daoA.setup();
			daoA.delete(1);
			
		//Clientes
			DaoClientes daoC = new DaoClientes();
			daoC.setup();	
			daoA.delete(1);
			
		}	
		
}