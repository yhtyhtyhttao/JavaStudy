public class FirstThread extends Thread{
	private int i;
	private int a;
	//��дrun����,run�����ķ���������߳�ִ����
	public void run(){
		for(;i<100;i++){
			//���߳���̳�Thread��ʱ������ֱ�ӵ���getName()�������ص�ǰ�̵߳�����
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this����
			//Thread�����getName()���ص�ǰ���̵߳�����
			System.out.println(getName() + " " + i);
			
		}
	}
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<100;i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				
				//������������һ���߳�
				new FirstThread().start();
				//����������̵߳�start()���������߳̿�ʼ����ִ��
				//ʹ��Thread.sleep(1)�õ�ǰ���е��߳�(���߳�)˯��1����
				Thread.sleep(1);
				//�����������ڶ����߳�
				new FirstThread().start();
			}
		}
	}
}