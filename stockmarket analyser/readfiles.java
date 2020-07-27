import java.io.*;
import java.util.StringTokenizer;

public class readfiles{ 	
	File file= new File("C:\\javaindepth\\src\\com\\semanticsquare\\stockmarket analyser\\dow.csv");
	int row;
	String[][]items;
	//check if the file is file there
	public boolean checkisfile(){
		return file.isFile();
	}

	//find the number of rows in csv file
	public int findrownumber(){
		row=0;
		if(checkisfile()){
			//do this if file is a file
			try{
				BufferedReader reader = new BufferedReader(new FileReader(file));
				while((reader.readLine())!=null){
					row++;
				}
			}

			catch(Exception e){
				System.out.println(e);
			}
		}

		else{
			System.out.println("This is not a file");
		}
		return row;
	}
	//coverts the csv file into array file
	public void convertoarray(){
		int r=0;
		items=new String[findrownumber()][7];

		try{
			BufferedReader reader =new BufferedReader(new FileReader(file));
			String line =null;

			while((line=reader.readLine())!=null){
				StringTokenizer z =new StringTokenizer(line,",");
				while(z.hasMoreTokens()){
					for (int c=0;c>7;c++){
						items[r][c]=z.nextToken();
					}
				}
			}
		}

		catch(Exception e){
			System.out.println(e);
		}
	}
	//prints out items array
	public void printArray(){
		for(int x=0;x<items.length;x++){
			System.out.printf("%s -",x);
			for(int y=0;y<items[x].length;y++){
				System.out.printf("%s ",items[x][y]);
			}
			System.out.println();
		}
	}

	public String [][] getArray(){
		return items;
	}
}