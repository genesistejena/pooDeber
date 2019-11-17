package net.ug.hibernate;

public class main {
	
	public static void main(String[] args) {
		crear();
		read();
		update();
		delete();
		
		crearl();
		readl();
		updatel();
		deletel();
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
	
	
	
	public static void crearl() {
		DaoLibros daoLibros = new DaoLibros();
		Libros libro = new Libros(1,"Nacho","libro para el aprendizaje",2, "Pasta doblada", 1);		
		daoLibros.setup();
		daoLibros.crear(libro);
		libro = new Libros(2,"Administracion de proyectos","libro de aprendizaje",3, "excelente estado", 2);
		daoLibros.crear(libro);		
	}
	
	public static void readl() {
		DaoLibros daoLibros = new DaoLibros();
		daoLibros.setup();
		Libros libro = daoLibros.read(1);
		libro.imprimir();
	}

	public static void updatel() {

		DaoLibros daoLibros = new DaoLibros();
		daoLibros.setup();
		Libros libros = daoLibros.read(2);
		libros.setTitulo("Gestion de proyectos");
		daoLibros.update(libros);
	}
	
	public static void deletel() {
		DaoLibros daoLibros= new DaoLibros();
		daoLibros.setup();
		daoLibros.delete(1);
		daoLibros.delete(2);
	}
}

	
