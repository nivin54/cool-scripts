package session1.version1;

class Runner implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i ++)
		{
			System.out.println("Hell Wolrd");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class App {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();
	}

}
