# Chess3

Field
✔)konstruktor
✔)zmienic z enum z bialych czarnych na pole klasy field
✔)zmienic nazwe z Occupied na isOccupied
✔)getColorOfFigure - zwraca kolor(true,false)
✔)getOccupyingFigure() - zwraca czy pole jest zajmowane 
  	?|->getOccupying() - w klasie bord musiałem stworzyc metode żeby odwołać się do metody field
✔)getPositionX(int X) - zwraca pozycje abcde
	?|->getX(int X) - w klasie bord musiałem stworzyc metode żeby odwołać się do metody field
✔)getPositionY() - zwraca pozycje 12345
	?|->getY(int Y) - w klasie bord musiałem stworzyc metode żeby odwołać się do metody field
?9)setFigure() - ustalenie pozycji na ktorej bedzie stala figura
	|->przypisanie nazwy do figury

Board
✔) public void UmiescFigury(boolean kolor)	zmienic atrybut koloru figury
2) metoda getBoard() - zwraca szachownice z 64 polami
✔) getRuch(int move) - metoda zwracajaca informacje o kolejnym ruchu danego gracza (KOGO JEST RUCH, INFORMACJE)
	|->boolean ruch
5) setPoruszanaFigura() - metoda ustawiajaca aktualna figure -> ma wskazywac field
6) getPoruszanaFigura() - zwracza poruszana figure -> ma zwracac field
7) mousePressed(), mouseRelased, mouseDragged()

Figure - nowa klasa abstrakcyjna po ktorej beda dziedziczyc klasy zwiazane z figurami
✔)konstruktor 
✔)Move() - abstrakcyjna 
✔)getColor() - zwraca kolor figury
✔)getMoves() - zwraca dostepne ruchy
✔)getPosition() - zwraca aktualne połozenie, czyli zwraca obiekt klasy Field
✔)setPosition() - ustawienie pozycji figury
7)getOccupiedHorizontal() -- metody sprawdzajace czy pola sa zajete poziomo pionowo
8)getOccupiedVertical()
9)getOccupiedDiagonal() 

10)//Interface: rysowanieFigury(), obrazekFigury(),

klasy figur potomne: 
1)Pown
2)Rook
3)Knight
4)Beshop
5)Queen
6)King

--King:
--1)konstruktor
--2)implementacja move
--3)implementacja getMoves - lista dostepnych ruchow

Main
1)main()-konstr nowej gry
2)start()-odpala okienko gry
3)menu()-menu
 
Time 
1)time() - konstr zegara gry
//2)getTime() - zwraca aktualny czas

CheckMate
1)konstruktor
2)sprawdza czy bialy krol jest w szachu
3)sprawdza czy czarny krol jest w szachu
4)sprawdza czy bialy krol jest w macie
5)sprawdza czy czarny krol jest w macie
6)sprawdzanie niedozwolonych ruchów
7)sprawdzanie dozwolonych pol do poruszania (pola niedozwolone bo sa szachowane, odslanianie krola przez skoczka)

ENKAPSULACJA !!! NIE GRZEBAC W SZCZEGÓŁACH 
JAK METODA NA POLU TO POBRAC OBIEKT KTORY MA ZROBIC CO TRZEBA
INNE KLASY MAJA POBRAC FIELD ZROBIC COS ZWROCIC
BOARD MA MIEC WSZYSTKO CO SIE WIAZE Z USTAWIENIEM FIGUR NA SZACHOWNICY
