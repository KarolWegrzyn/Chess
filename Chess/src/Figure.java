
public abstract class Figure {
	
	public Figure(boolean color)
	{
		this.setIsFigureWhite(color);
	}
	
	private boolean IsFigureWhite = true;	
	private boolean IsFigureKilled = false;
	
	public boolean getIsFigureWhite()
	{
		return this.IsFigureWhite;
	}
	
	public void setIsFigureWhite(boolean color)
	{
		this.IsFigureWhite = color;
	}
	
	public boolean getIsFigureKilled()
	{
		return this.IsFigureKilled;
	}
	
	public void setIsFigureKilled(boolean killed)
	{
		this.IsFigureKilled = killed;
	}

	public abstract boolean isMovePossible(Board board, Field start, Field end);
	public abstract void getPosition();					//to nie musza byc abstrakcyjne
	public abstract void setPosition();					//to nie musza byc abstrakcyjne
	public abstract void getOccupiedHorizontal();		//to nie musza byc abstrakcyjne
	public abstract void getOccupiedVertical();			//to nie musza byc abstrakcyjne
	public abstract void getOccupiedDiagonal();			//to nie musza byc abstrakcyjne
}