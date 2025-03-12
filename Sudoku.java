	class Sudoku{
	
		String[][] layout;
		int size;
		
		 void displayPattern(String[][] layout){
		 
			int size = layout.length;
			int digits = Integer.toString(size).length();
			int m = 0;
			for(int ln = 0; ln < (2*size)+1; ln++){
			
			int column = 0;
			if(ln%2 == 0){
				
				for(int x = 1; x <= size; x++){
				System.out.print(" ");
					for(int dash = 0; dash < digits; dash++){
					System.out.print("-");
					}	
				}
			}else{
				while(column < size){
					int row = ln - (m + 1);
					String entry;
					if(layout[row][column].equals(" ")) {
						entry = String.format("%"+digits+"s", layout[row][column]);
					}
					else {
						entry = String.format("%"+digits+"d", Integer.parseInt(layout[row][column]));
					}   	 
					System.out.print("|");		
					System.out.print(entry);
					column++;
				}
				m++;
			}
				
			if(ln%2 == 0){
				System.out.println();
			}else{
				System.out.println("|");
			}
			}
		}
		
		Sudoku(int size){
		
			String[][] layout = new String[size][size];
			for(int row = 0; row < size; row++){
				Integer column = row+1;
				for(int x = 0; x < size; x++){
					if(column > size) column = 1;
					layout[row][x] = column.toString();
					column++;
				}
			}
			for(int i = 1; i <= (size*size)/3 ; i++){
			int randRow = (int)(System.nanoTime() % size);
			int randColumn = (int)(System.nanoTime() % size);
			if (layout[randRow][randColumn].equals(" ")) {
				i--;
			} else {
				layout[randRow][randColumn] = " ";
			}
			}
		
			displayPattern(layout);
		}
		
		public static void main(String[] args){
			Sudoku puzzle = new Sudoku(Integer.parseInt(args[0]));
		}
	}
 
