package ttt;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChecksFormat {
	
	
	public static int CheckUsr(Map<Integer,Character> mp,char usr) {
		//System.out.println(mp.toString()+" "+sys+" "+usr);
	  if(mp.get(1)==usr){
	    if((mp.get(2)==usr && mp.get(3)==usr)||(mp.get(4)==usr && mp.get(7)==usr)||(mp.get(5)==usr && mp.get(9)==usr)){return 0;}
	  }
		if(mp.get(2)==usr){
	    if(mp.get(5)==usr && mp.get(8)==usr){return 0;}
	  }
		if(mp.get(3)==usr){
	    if((mp.get(6)==usr && mp.get(9)==usr)||(mp.get(5)==usr && mp.get(7)==usr)){return 0;}
	  }
		if(mp.get(4)==usr){
	    if(mp.get(5)==usr && mp.get(6)==usr){return 0;}
	  }
		if(mp.get(7)==usr){
	    if(mp.get(8)==usr && mp.get(9)==usr){return 0;}
	  }
		return -1;
	}
	
	
		public static int Predict(Map<Integer,Character> mp,char sys,List<Integer> list) {
			//System.out.println(mp.toString()+" "+sys+" "+usr);
			if(mp.get(1)==sys){
				if((mp.get(2)==sys && mp.get(3)==sys)||(mp.get(4)==sys && mp.get(7)==sys)||(mp.get(5)==sys && mp.get(9)==sys)){return 0;}
				else if(mp.get(2)==sys && mp.get(3)==' '){return 3;}
				else if(mp.get(2)==' ' && mp.get(3)==sys){return 2;}
				else if(mp.get(4)==sys && mp.get(7)==' '){return 7;}
				else if(mp.get(4)==' ' && mp.get(7)==sys){return 4;}
				else if(mp.get(5)==sys && mp.get(9)==' '){return 9;}
				else if(mp.get(5)==' ' && mp.get(9)==sys){return 5;}
			}
			if(mp.get(2)==sys){
				if(mp.get(5)==sys && mp.get(8)==sys){return 0;}
				else if(mp.get(5)==sys && mp.get(8)==' '){return 8;}
				else if(mp.get(5)==' ' && mp.get(8)==sys){return 5;}
			}
			if(mp.get(3)==sys){
				if((mp.get(6)==sys && mp.get(9)==sys)||(mp.get(5)==sys && mp.get(7)==sys)){return 0;}
				else if(mp.get(6)==sys && mp.get(9)==' '){return 9;}
				else if(mp.get(6)==' ' && mp.get(9)==sys){return 6;}
				else if(mp.get(5)==sys && mp.get(7)==' '){return 7;}
				else if(mp.get(5)==' ' && mp.get(7)==sys){return 5;}
			}
			if(mp.get(4)==sys){
				if(mp.get(5)==sys && mp.get(6)==sys){return 0;}
				else if(mp.get(5)==sys && mp.get(6)==' '){return 6;}
				else if(mp.get(5)==' ' && mp.get(6)==sys){return 5;}
			}
			if(mp.get(7)==sys){
				if(mp.get(8)==sys && mp.get(9)==sys){return 0;}
				else if(mp.get(8)==sys && mp.get(9)==' '){return 9;}
				else if(mp.get(8)==' ' && mp.get(9)==sys){return 8;}
			}
			if(mp.get(1)==' '){
				if((mp.get(2)==sys && mp.get(3)==sys)||(mp.get(4)==sys && mp.get(7)==sys)||(mp.get(5)==sys && mp.get(9)==sys)){
					return 1;}
			}
			if(mp.get(2)==' '&&mp.get(2)==sys && mp.get(2)==sys){return 2;}
			if(mp.get(3)==' '){
				if((mp.get(6)==sys && mp.get(9)==sys)||(mp.get(5)==sys && mp.get(7)==sys)){
					return 3;}}
			if(mp.get(4)==' '&&mp.get(5)==sys && mp.get(6)==sys){return 4;}
			if(mp.get(7)==' '&&mp.get(8)==sys && mp.get(9)==sys){return 7;}
			//return -1;
			return list.get(new Random().nextInt(list.size()))+110;
		}
		

		public static void display(Map<Integer,Character> mp) {
			System.out.println(" "+mp.get(1)+" | "+mp.get(2)+" | "+mp.get(3)+
					" \n-----------\n "+mp.get(4)+" | "+mp.get(5)+" | "+mp.get(6)+
					" \n-----------\n "+mp.get(7)+" | "+mp.get(8)+" | "+mp.get(9)+" ");
		}
		

}
