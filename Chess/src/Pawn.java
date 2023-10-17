
public class Pawn extends Figure {

	public Pawn(boolean color) 
	{
		super(color);//poczytac 
	}

	public boolean isMovePossible(Board board, Field start, Field end) 
	{	
		int x1 = start.getPositionX();
		int x2 = end.getPositionX();
		int y1 = start.getPositionY();
		int y2 = end.getPositionY();
		
		if(start.getFigure().getIsFigureWhite())
		{
			if((y1==1 && y2 ==3) && x1 == x2) //o dwa pola do przodu
				return true;
				
			if(y2 == (y1+1) && x1 == x2)	//o jedno pola do przodu
				return true;
			
			if(y2 == (y1 + 1) && (x1==(x2+1)||x1==(x2-1)) && !end.getFigure().getIsFigureWhite())//bicie
				return true;
			//if(end.getFigure() instanceof King)//roszada do wiezy ,instanceof przeczytac
				//end.getFigure() != null sprawdzenie czy pole jest zajete
		}
		else
		{
			if((y1==6 && y2==4) && x1==x2) //o dwa pola do przodu
				return true;
			
			if(y2 == (y1-1) && x1==x2) //o jedno pola do przodu
				return true;
			if(y2 ==(y1-1) && ((x1==x2+1)||x1==(x2-1)) && end.getFigure().getIsFigureWhite())
				return true;
		}
		
		return false;
	}

	
	public void getPosition() 
	{
		// TODO Auto-generated method stub
		
	}

	
	public void setPosition() 
	{
		// TODO Auto-generated method stub
		
	}


	public void getOccupiedHorizontal() 
	{
		// TODO Auto-generated method stub
		
	}

	
	public void getOccupiedVertical() 
	{
		// TODO Auto-generated method stub
		
	}


	public void getOccupiedDiagonal() 
	{
		// TODO Auto-generated method stub
		
	}

}