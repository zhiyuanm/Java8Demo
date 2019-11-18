package com.example.concurrent.threadLocal;

public class SessionHandler {
   private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            int x = i;
            new Thread(()->{
                Session session = new Session();
                session.setUser("mazhiyuan--" + x);
                session.setStatus(""+x);
                setSession(session);
                System.out.println(Thread.currentThread() + "--"+getSession().toString());
            },"thread--"+i).start();
        }
    }
   public static void setSession(Session session){
       threadLocal.set(session);
   }
   public static Session getSession(){
       return threadLocal.get();
   }
   private static class Session{
        private String user;
        private String status;

        public String getUser() {
            return user;
        }
        public void setUser(String user) {
            this.user = user;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

       @Override
       public String toString() {
           return user+"---"+status;
       }
   }
}
