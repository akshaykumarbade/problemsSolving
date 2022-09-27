
//Q Change the AM-PM time format to 24 hour time Format.

public class TimeFormatChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "07:23:47PM";//hh:mm:ss
		changeFormat(s);
	}
	
	static void changeFormat(String s) {
		
//		int h1 = (int)s.charAt(1)-'0';
//		int h2 =(int)s.charAt(0)-'0';
//		int hh = (h2*10 + h1%10);
		
		int h1 = Integer.parseInt(String.valueOf(s.charAt(1)));
		int h2 = Integer.parseInt(String.valueOf(s.charAt(0)));
		int hh = (h2+h1);
		//for AM time 
		if(s.charAt(8)== 'A') {
			if(hh== 12) {
				System.out.print("00");
				for(int i=2; i<=7;i++) {
					System.out.print(s.charAt(i));
				}
			}else {
				for(int j=0;j<=7;j++) {
					System.out.print(s.charAt(j));
				}
			}
		}
		//for PM time
		else {
			if(hh == 12) {
				System.out.print("12");
				for(int i=2;i<=7;i++) {
					System.out.print(s.charAt(i));
				}
			}else {
				hh=hh+12;
				System.out.print(hh);
				for(int i=2; i<=7;i++) {
					System.out.print(s.charAt(i));
				}
			}
		}
	}

}

