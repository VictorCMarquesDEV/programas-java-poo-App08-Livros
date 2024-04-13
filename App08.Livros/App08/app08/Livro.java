package app08;

public class Livro implements Publicacao{
	private String titulo; 
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public Livro(String ti, String au, int tp, Pessoa le) {
		this.setTitulo(ti);
		this.setAutor(au);
		this.setTotPaginas(tp);
		this.setAberto(false);
		this.setPagAtual(0);
		leitor = le;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
	public void detalhes() {
		System.out.println("=========================");
		System.out.println("Livro '" + this.getTitulo() + "'");
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Leitor: " + this.leitor.getNome() + " (" + this.leitor.getIdade() + ") -> " + this.leitor.getSexo());
		System.out.println("Livro Aberto: " + this.isAberto() + " | Página Atual: " + this.getPagAtual());
	}
	public void abrir() {
		if (!(this.isAberto())) {
			this.setAberto(true);
			this.setPagAtual(1);
		}
	}
	public void fechar() {
		if (this.isAberto()) {
			this.setAberto(false);
		}
	}
	public void folhear(int p) {
		if (this.isAberto()) {
			if (p <= this.getTotPaginas() && p >= 1) {
				this.setPagAtual(p);
			} else {
				System.out.println("Esta página não existe");
			}
		} else {
			System.out.println("Livro fechado");
		}
	}
	public void avançarPag() {
		if (this.isAberto()) {
			if(this.getPagAtual() < this.getTotPaginas()) {
				this.setPagAtual(this.getPagAtual() + 1);
			} else {
				System.out.println("Livro totalmente lido");
			}
		} else {
			System.out.println("Livro fechado");
		}
	}
	public void voltarPag() {
		if (this.isAberto()) {
			if(this.getPagAtual() > 1) {
				this.setPagAtual(this.getPagAtual() - 1);
			} else {
				System.out.println("Página inicial");
			}
		} else {
			System.out.println("Livro fechado");
		}
	}
}
