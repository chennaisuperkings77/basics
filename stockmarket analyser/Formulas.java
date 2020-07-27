import java.util.*;
import java.text.SimpleDateFormat;

public class Formulas{
	readfiles r=new readfiles();
	float [][] dataArray=new float[r.findrownumber()][7];
	Date[] dateArray=new Date[r.findrownumber()];

	public void createDateArray(String[][] n){
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd");
		for(int x=0;x<n.length;x++){
			for(int y=0;y<n[x].length;y++){
				if(y==0){
					try{
						Date newdate=(Date)df.parse(n[x][0]);
						dateArray[x]=newdate;
					}

					catch(Exception e){
						System.out.println(e);
					}
				}
			}
		}
	}
}
