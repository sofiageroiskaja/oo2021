public class ThreadHW{

    public static void main(String args[]){
		i = 10;
		ThreadHW thread = new ThreadHW();

		Thread t1 = new Thread(new Runnable() {
			public void run(){
				thread.even();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run(){
				thread.odd();
			}
		});
		t1.start();
		t2.start();
        
        i2 = 0;
		ThreadHW thread2 = new ThreadHW();

		Thread t1_1 = new Thread(new Runnable() {
			public void run(){
				thread2.even2();
			}
		});

		Thread t2_2 = new Thread(new Runnable() {
			public void run(){
				thread2.odd2();
			}
		});
		t1_1.start();
		t2_2.start();

        ThreadHW thread3 = new ThreadHW();

		Thread t3 = new Thread(new Runnable() {
			public void run(){
				thread3.a_to_k();
			}
		});
		t3.start();

        ThreadHW thread4 = new ThreadHW();

		Thread t4 = new Thread(new Runnable() {
			public void run(){
				thread4.k_to_a();
			}
		});
		t4.start();
	}

	int count = 0;
	static int i;

	public void odd(){
		synchronized(this){
			while(count < i){
				while(count % 2 == 0){
					try{
						wait();
					}
					catch(Exception e){
                        System.out.println(e.getMessage());
					}
				}
				System.out.print(count + " ");
				count++;
				notify();
			}
		}
	}

	public void even(){
		synchronized(this){
			while(count < i){
				while(count % 2 != 0){
					try{
						wait();
					}
					catch(Exception e){
                        System.out.println(e.getMessage());
					}
				}

                System.out.print(
					count + " ");
				count++;
				notify();
			}
		}
	}
    int count2 = 10;
	static int i2;

	public void odd2(){
		synchronized(this){
			while(count2 > i2){
				while(count2 % 2 == 0){
					try{
						wait();
					}
					catch(Exception e){
                        System.out.println(e.getMessage());
					}
				}
				System.out.print(count2 + " ");
				count2--;
				notify();
			}
		}
	}

	public void even2(){
		synchronized(this){
			while(count2 > i2){
				while(count2 % 2 != 0){
					try{
						wait();
					}
					catch(Exception e){
                        System.out.println(e.getMessage());
					}
				}

                System.out.print(
					count2 + " ");
				count2--;
				notify();
			}
		}
	}

    public void a_to_k(){
		char letter;
        for(letter = 'a'; letter <= 'k'; letter ++){
			try{
				System.out.println(letter);
			}catch(Exception e){
                System.out.println(e.getMessage());
			}
		}
	}

    public void k_to_a(){
        char letter;
        for(letter = 'k'; letter >= 'a'; letter --){
                try{
                    System.out.println(letter);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
}

