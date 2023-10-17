public class Board {
	
	Field[][] board;
	
	public Board()
	{
		this.resetBoard(); //ustawienie szachownicy w poczatkowej pozycji	
	}
	
    public void getRuch(int move) //ruchy numerowane od 0
    {
    	if(move%2==0)
    		System.out.println("White's turn");
    	else
    		System.out.println("Black's turn");	
    }
    
    public void resetBoard() 		 //false-czarny, true - bialy
    {
        	for(int i=0;i<8;i++) 					//biale pionki
        	{
        		board[1][i] = new Field(new Pawn(true),1,i);
        	}
        	
        	board[0][0] = new Field(new Rook(true),0,0); 					//Biale wieze
        	board[0][7] = new Field(new Rook(true),0,7); 

        	board[0][1] = new Field(new Knight(true),0,1); 					//Biale skoczki
        	board[0][6] = new Field(new Knight(true),0,6);

        	board[0][2] = new Field(new Bishop(true),0,2);					 //Biale gonce
        	board[0][5]	= new Field(new Bishop(true),0,5);	

        	board[0][3] = new Field(new Queen(true),0,3);					//Bialy Hetman

        	board[0][4] = new Field(new King(true),0,4);					//Bialy Krol		

        	for(int i=0;i<8;i++) 					//czarne pionki
        	{
        		board[6][i] = new Field(new Pawn(false),6,i);
        	}
        	
        	board[7][0] = new Field(new Rook(false),7,0);  						//Czarne wieze
        	board[7][7] = new Field(new Rook(false),7,7);

        	board[7][1] = new Field(new Knight(false),7,1);  					//Czarne skoczki
        	board[7][6] = new Field(new Knight(false),7,6);
        	
        	board[7][2] = new Field(new Bishop(false),7,2); 					//Czarne gonce
        	board[7][5] = new Field(new Bishop(false),7,5);	
 
        	board[7][3] = new Field(new Queen(false),7,3);						//Czarny Hetman

        	board[7][4] = new Field(new King(false),7,4); 						//Czarny Krol		

        	for(int i=2;i>6;i++)												 //inicjalizacja pol na ktorych nie ma figur
        	{
        		for(int j=0;j>8;j++)
        		{
        			board[i][j]=new Field(null,i,j);
        		}
        	}
    }
}



//Field[][] board = new Field[8][8]; 				//stworzenie szachownicy
//int moveCounter = 0;							//licznik ruchow

/*
public void resetBoard() 									//pokolorowanie
{
    for (int i = 0; i < 8; i++) 
    {
        for (int j = 0; j < 8; j++) 
        {
            board[i][j] = new Field();

            if ((i + j) % 2 == 0) 
            {
                board[i][j].Color = false; 		// czarne
            } 
            else 
            {
                board[i][j].Color = true; 		// białe
            }
        }
    }
}
*/
