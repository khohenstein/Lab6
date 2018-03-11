/*
 * Kate Hohenstein
 * Lab 6
 * 3/10/18
 * Driver: operate game
 */
public class Driver {

	public static void main(String[] args) {
		
		//create instance of Player
		String playerName = "dog";
		String playerImage = "player.jpg";
		int playerPositionX = 0;
		int playerPositionY = 0;
		int playerScore = 0;

		Player myPlayer = new Player(playerName, playerImage, playerPositionX, playerPositionY, playerScore);
		
		//test Player getter/setter methods
		myPlayer.setPlayerPos(5, 5);
		myPlayer.setScore(30);
		System.out.println(myPlayer.getPlayerPosX());
		System.out.println(myPlayer.getPlayerPosX());
		System.out.println(myPlayer.getScore());

		//create instance of Enemy
		String enemyImage = "enemy.jpg";
		int enemyPositionX = 100;
		int enemyPositionY = 100;
		int enemySpeed = 10;

		Enemy myEnemy = new Enemy(enemyImage, enemyPositionX, enemyPositionY, enemySpeed);
		
		//test Enemy getter/setter methods
		myEnemy.setEnemyPos(10, 10);
		myEnemy.setSpeed(20);
		System.out.println(myEnemy.getEnemyPosX());
		System.out.println(myEnemy.getEnemyPosX());
		System.out.println(myEnemy.getSpeed());

		//create instance of Items
		String itemImage = "item.jpg";
		int numOfItems = 5;
		int itemPositionX = 50;
		int itemPositionY = 50;
		
		Items myItem = new Items(itemImage, numOfItems, itemPositionX, itemPositionY);
		
		//test Items getter/setter methods
		myItem.setItemPos(40, 70);
		myItem.setNumItems(15);
		System.out.println(myItem.getItemPosX());
		System.out.println(myItem.getItemPosX());
		System.out.println(myItem.getNumItems());
		
	}

}
