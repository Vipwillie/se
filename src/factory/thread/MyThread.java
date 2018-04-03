package factory.thread;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/22 11:36</p>
 */
class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            myThread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);

                System.out.println("当前线程" + Thread.currentThread().getId() + "状态:" + this.isAlive());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
