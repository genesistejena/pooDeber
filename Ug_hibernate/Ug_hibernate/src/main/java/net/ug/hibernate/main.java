package net.ug.hibernate;

public class main {
	
	public static void main(String[] args) {
		crear();
		read();
		update();
		delete();
		
		
	}
	
	public static void crear() {
		DaoBiblioteca daoBiblioteca = new DaoBiblioteca();
		Biblioteca biblioteca = new Biblioteca(1,"Biblioteca Central","1204875354579");		
		daoBiblioteca.setup();
		daoBiblioteca.crear(biblioteca);
		biblioteca = new Biblioteca(2,"Biblioteca Municipal ","000987643736");
		daoBiblioteca.crear(biblioteca);		
	}
	
	public static void read() {
		DaoBiblioteca daoBiblioteca = new DaoBiblioteca();
		daoBiblioteca.setup();
		Biblioteca biblioteca = daoBiblioteca.read(1);
		biblioteca.imprimir();
	}

	public static void update() {

		DaoBiblioteca daoBiblioteca = new DaoBiblioteca();
		daoBiblioteca.setup();
		Biblioteca biblioteca = daoBiblioteca.read(1);
		biblioteca.setNombre("Biblioteca Metropolitana");
		daoBiblioteca.update(biblioteca);
	}
	
	public static void delete() {
		DaoBiblioteca daoBiblioteca= new DaoBiblioteca();
		daoBiblioteca.setup();
		daoBiblioteca.delete(1);
		daoBiblioteca.delete(2);
	}
	
	
	
	
}

	
