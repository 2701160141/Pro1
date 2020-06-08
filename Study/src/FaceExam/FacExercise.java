package FaceExam;

public class FacExercise implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Factory smsFactory = FactoryManager.getFactory(SmsFactory.class);
            Sender sender1 = smsFactory.getSender();
            sender1.send("hello sms!");
            System.out.println("短信工厂：" + smsFactory);
            Factory emailFactory = FactoryManager.getFactory(EmailFactory.class);
            Sender sender2 = emailFactory.getSender();
            sender2.send("hello email");
            System.out.println("邮件工厂：" + emailFactory);
        }
    }
}
