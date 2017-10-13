package zxt;

public class shouPiao {

	/**
	 * @param args
	 * 模拟售票系统
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piao p1 = new Piao();
		Thread t1= new Thread(p1);
		Thread t2= new Thread(p1);
		Thread t3= new Thread(p1);
		Thread t4= new Thread(p1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
		
	}

}
class Piao implements Runnable{
	int piaoshu =10;
	
	static String s = new String("abc");
	public  void run(){
		
		while(true){
			synchronized(s){
		if(piaoshu>0)
		{
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+"当前票数"+piaoshu--);
		}
		}
		
	}
	}
}

