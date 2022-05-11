package Entities;

public class Game {
	private int id;
	private String nameOfGame;
	private double unitPrice;

	public Game() {

	}

	public Game(int id, String nameOfGame, double unitPrice) {
		this.id = id;
		this.nameOfGame = nameOfGame;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return nameOfGame;
	}

	public void setName(String name) {
		this.nameOfGame = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
