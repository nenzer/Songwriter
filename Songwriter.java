import java.util.Scanner;

public class Songwriter {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Songs are not as difficult to write as people think. Here... you try! The key of a song is often the first chord. What is your first chord and key?");
		String firstchord = sc.nextLine();
      String bridge = new String();
		String[] chordsc = {"C","Dm","Em","F","G","Am","Bm"};
      String[] chordsg = {"G","Am","Bm","C","D","Em","F#m"};
      String[] chordsf = {"F","Gm","Am","Bb","C","Dm","Em"};
      String[] chordsa = {"A","Bm","C#m","D","E","F#m","G#m"};
      String[] chordsb = {"B","C#m","Ebm","E","Gb","G#m","A#m"};
      String[] chordsd = {"D","Em","F#m","G","A","Bm","C#m"};
      String[] chordse = {"E","F#m","G#m","A","B","C#m","D#m"};
      while(!firstchord.equals("0"))
      {
		   for (int i=0;i<7;i++)
		   {
		   	if(firstchord.equals(chordsc[i]))
			   {
				   System.out.println("Your next chord should be "+chordsc[(i+3)%7] + " followed by "+chordsc[(i+4)%7]+".This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            
            	if(firstchord.equals(chordsg[i]))
			   {
				   System.out.println("Your next chord should be "+chordsg[(i+3)%7] + " followed by "+chordsg[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            	if(firstchord.equals(chordsf[i]))
			   {
				   System.out.println("Your next chord should be "+chordsf[(i+3)%7] + " followed by "+chordsf[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            
            	if(firstchord.equals(chordsa[i]))
			   {
				   System.out.println("Your next chord should be "+chordsa[(i+3)%7] + " followed by "+chordsa[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            
            	if(firstchord.equals(chordsb[i]))
			   {
				   System.out.println("Your next chord should be "+chordsb[(i+3)%7] + " followed by "+chordsb[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            
            	if(firstchord.equals(chordsd[i]))
			   {
				   System.out.println("Your next chord should be "+chordsd[(i+3)%7] + " followed by "+chordsd[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
			   }
            
            	if(firstchord.equals(chordse[i]))
			   {
				   System.out.println("Your next chord should be "+chordse[(i+3)%7] + " followed by "+chordse[(i+4)%7]+". This is called the I IV V progression. Mess around with that! When you are satisfied press any key.");
               break;
              }
              
              firstchord = sc.nextLine();
              }
                        break;
                                             	}
                                                for (int j=0;j<7;j++)
		   {
         sc.next();
		   	if(firstchord.equals(chordsc[j])||firstchord.equals(chordsg[j]))
			   {
				   System.out.println("You should write a bridge next. A good bridge is different from the verse and the chorus, often times it is the vi of the key. ");
               break;
			   }
}
                                       
                                           }
}
// COPYRIGHT 2019 NICHOLAS ENZER AND PRANAY CHOWDHARY