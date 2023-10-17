
public class King extends Figure{
	
	public King(boolean color) 
	{
		super(color);
	}
	
	public boolean isMovePossible(Board board, Field start, Field end) 
	{
		int x1 = start.getPositionX();
		int x2 = end.getPositionX();
		int y1 = start.getPositionY();
		int y2 = end.getPositionY();
		
		if((x1==x2)&&((y1-y2==1)||(y2-y1==1)))
			return true;
		
		if((x2-x1==1)&&((y1==y2)||(y2-y1==1)||(y1-y2==1)))
			return true;
		
		if((x1-x2==1)&&((y1==y2)||(y2-y1==1)||(y1-y2==1)))
			return true;
		
		return false;
	}

	public void figure() {
		
	}
	
	public void Move() {
		
		
		
	}

	public void getColor() {
		// TODO Auto-generated method stub
		
	}

	public void getMoves() {
		// TODO Auto-generated method stub
		
	}

	public void getPosition() {
		// TODO Auto-generated method stub
		
	}

	public void setPosition() {
		// TODO Auto-generated method stub
		
	}

	public void getOccupiedHorizontal() {
		// TODO Auto-generated method stub
		
	}

	public void getOccupiedVertical() {
		// TODO Auto-generated method stub
		
	}

	public void getOccupiedDiagonal() {
		// TODO Auto-generated method stub
		
	}
}
