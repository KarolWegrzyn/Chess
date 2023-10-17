
public class Rook extends Figure {

	public Rook(boolean color) 
	{
		super(color);
	}

	public boolean isMovePossible(Board board, Field start, Field end) 
	{
		int x1 = start.getPositionX();
		int x2 = end.getPositionX();
		int y1 = start.getPositionY();
		int y2 = end.getPositionY();
		
		if(start.getFigure().getIsFigureWhite())
		{
			if(x1==x2)
				return true;
			
			if(y1==y2)
				return true;
		}
		else
		{
			if(x1==x2)
				return true;
			
			if(y1==y2)
				return true;
		}
		
		return false;
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
