package ttt;

import java.util.*;
import java.util.Random;
import ttt.ChecksFormat.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char sys=' ',usr=' ',sy1=' ',sy2=' ',sy3=' ',sy4=' ',sy5=' ',sy6=' ',sy7=' ',sy8=' ',sy9=' ';
		int chance=0,flag=1;
		Integer[]arr= {1,2,3,4,5,6,7,8,9};
		List<Integer>list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(arr));

		System.out.println("Hi User,Please select your character '*' or 'o':");
		char c=scan.nextLine().charAt(0);
		while(c!='o'&&c!='*'){
			System.out.println("Invalid character! Try Again");
			c=scan.nextLine().charAt(0);
		}
		if(c=='o'){usr=c;sys='*';}else{usr=c;sys='o';}
		//System.out.println(c+" "+usr+" "+sys);
		Map<Integer,Character> map=new HashMap<Integer,Character>();
		map.put(1,' ');map.put(2,' ');map.put(3,' ');map.put(4,' ');
		map.put(5,' ');map.put(6,' ');map.put(7,' ');map.put(8,' ');
		map.put(9,' ');
		ChecksFormat.display(map);

		System.out.println("Enter 1 for attempt first else press 2 for System First.");
		chance=scan.nextInt();
		while(chance!=1 && chance!=2){
			System.out.println("Invalid choice! Try Again");
			chance=scan.nextInt();
		}
		int inp=0,status=-2;
		while(chance!=0) {
			if(list.size()==0){
				System.out.println("It's a Tie!");
				break;
			}
				if(chance==1){
					System.out.println("Enter the position in"+list.toString()+" to place your symbol.");
					inp=scan.nextInt();
					if(list.contains(inp)){
						list.remove(new Integer(inp));map.put(inp,usr);chance=2;
					}else{
							System.out.println("Place Already occupied,Try Again!");
					}
					ChecksFormat.display(map);
					System.out.println(" ");
					status=ChecksFormat.CheckUsr(map,usr);
					//System.out.println(status);
					if(status==0){
						System.out.println("\nCongratulations You Wins!");break;
					}
					continue;
				}
			
				inp=ChecksFormat.Predict(map,sys,list);
				//int back=inp-110;//
				if(inp>100){
				    inp=ChecksFormat.Predict(map,usr,list);
				    if(inp>100){inp-=110;}
				    map.put(inp,sys);
				    list.remove(new Integer(inp));
				    ChecksFormat.display(map);
				    status=ChecksFormat.CheckUsr(map,sys);
				    //System.out.println(status);
				    chance=1;
				    if(status==0){
				      System.out.println("\nSystem Wins!");
				      break;
				    }
				}else{
				  map.put(inp,sys);
				  list.remove(new Integer(inp));
				  ChecksFormat.display(map);
				  status=ChecksFormat.CheckUsr(map,sys);
				  //System.out.println(status);
				  chance=1;
				  if(status==0){
				    System.out.println("\nSystem Wins!");
				    break;
				  }
				}


			}
		}
}
