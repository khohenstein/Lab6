/*
 * Kate Hohenstein
 * Lab 6
 * 3/10/18
 * Enemy: set up enemy attributes and methods
 */
public class Enemy {

	private String image;
	private int positionX;
	private int positionY;
	private int speed;
	
	public Enemy(String image, int positionX, int positionY, int speed)
	{

		this.image = image;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
	}
	
	//method to add enemy image icon to screen in position (X,Y)
	public void showEnemyImage()
	{
	}
	
	//method to get enemy position (X)
	public int getEnemyPosX()
	{ 
		return positionX;
	}
	
	//method to get enemy position (Y)
	public int getEnemyPosY()
	{ 
		return positionY;
	}
	
	//method to set enemy position (X,Y)
	public void setEnemyPos(int X, int Y)
	{
		positionX = X;
		positionY = Y;
	}
	
	//method to get enemy speed
	public int getSpeed()
	{ 
		return speed;
	}
	
	//method to set enemy speed
	public void setSpeed(int enemySpeed)
	{
		speed = enemySpeed;
	}
	

}
