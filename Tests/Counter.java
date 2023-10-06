class Counter implements Runnable   {
    public int i = 0;







    public void run(){
		inc();
	}
    public void inc() {
        i++;
    }
}