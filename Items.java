/*
 * Kate Hohenstein
 * Lab 6
 * 3/10/18
 * Item: set up item attributes and methods
 */
public class Items {
	private String image;
	private int numOfItems;
	private int positionX;
	private int positionY;
	
	public Items(String image, int numOfItems, int positionX, int positionY)
	{
		this.image = image;
		this.numOfItems = numOfItems;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	//method to add item image icons to screen, based on # of items, and random X,Y combinations?
	public void showItemImage()
	{
	}
	
	//method to remove image icons from screen when player collides with them
	public void removeItemImage()
	{
	}
	
	//method to get item position (X)
	public int getItemPosX()
	{ 
		return positionX;
	}
	
	//method to get item position (Y)
	public int getItemPosY()
	{ 
		return positionY;
	}
	
	//method to set item position (X,Y)
	public void setItemPos(int X,int Y)
	{
		positionX = X;
		positionY = Y;
	}
	
	//method to get number of items
	public int getNumItems()
	{ 
		return numOfItems;
	}
	
	//method to set number of items
	public void setNumItems(int newItemNumber)
	{
		numOfItems = newItemNumber;
	}
	
}

