package FaceExam;

public class EmailSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("发送邮件：" + message);
    }
}
