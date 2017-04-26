public class FirstThread extends Thread{
	private int i;
	private int a;
	//重写run方法,run方法的方法体就是线程执行体
	public void run(){
		for(;i<100;i++){
			//当线程类继承Thread类时，可以直接调用getName()方法返回当前线程的名。
			//如果想获取当前线程，直接使用this即可
			//Thread对象的getName()返回当前该线程的名字
			System.out.println(getName() + " " + i);
			
		}
	}
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<100;i++){
			//调用Thread的currentThread方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				
				//创建并启动第一条线程
				new FirstThread().start();
				//程序调用子线程的start()方法后子线程开始立即执行
				//使用Thread.sleep(1)让当前运行的线程(主线程)睡眠1毫秒
				Thread.sleep(1);
				//创建并启动第二条线程
				new FirstThread().start();
			}
		}
	}
}