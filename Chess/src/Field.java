
public class Field {
	
	private Figure figure;
	private int positionX;
	private int positionY;
	
	public Field(Figure fig, int X, int Y)
	{
		this.setFigure(fig);
		this.setPositionX(X);
		this.setPositionY(Y);
	}
	
	public Figure getFigure()
	{
		return this.figure;
	}
	
	public void setFigure(Figure fig)
	{
		this.figure = fig;
	}
	
	public int getPositionX()
	{
		return this.positionX;
	}
	
	public void setPositionX(int X)
	{
		this.positionX = X;
	}
	
	public int getPositionY()
	{
		return this.positionY;
	}
	
	public void setPositionY(int Y)
	{
		this.positionY = Y;
	}
	
	char translatePositionX(int X) //ZWRACA A+X
	{
		switch(X)
		{
		case 0:
			return 'A';
		case 1:
			return 'B';
		case 2:
			return 'C';
		case 3:
			return 'D';
		case 4:
			return 'E';
		case 5:
			return 'F';
		case 6:
			return 'G';
		case 7:
			return 'H';
		}
		return 0;
	}
	
	int translatePositionY(int Y)//nie ma zwracac int tylko char odpowiadajacy intowi
	{
		return Y+1;
	}	
}

//boolean isOccupied = false;
//boolean Color = true; 			// kolor pola (false-czarny, true - bialy)

//FigureName myFigure = FigureName.EMPTY;

/*void getColorOfFigure()
{
	if(ColorOfFigure)
		System.out.println("White");
	else
		System.out.println("Black");
}

void getOccupyingFigure()
{
	if(isOccupied)
		System.out.println("Field is Occupied");
	else
		System.out.println("Field is Free");
}
*/

/*
void SetFigure(int Figura)
{
	switch(Figura)
	{
		case 0: //empty
		{
			myFigure = FigureName.EMPTY;
		}break;
		case 1: //white pown
		{
			myFigure = FigureName.POWN;
		}break;
		case 2: //white rook
		{
			myFigure = FigureName.ROOK;
		}break;
		case 3: //white knight
		{
			myFigure = FigureName.KNIGHT;
		}break;
		case 4: //white bishop
		{
			myFigure = FigureName.BISHOP;
		}break;
		case 5: //white queen
		{
			myFigure = FigureName.QUEEN;
		}break;
		case 6: //white king
		{
			myFigure = FigureName.KING;
		}break;
	}
}

void DeleteFigure()
{
		myFigure = FigureName.EMPTY;
		isOccupied = false;
}
*/
