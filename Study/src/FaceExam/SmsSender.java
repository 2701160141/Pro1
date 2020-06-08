package FaceExam;

public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("发送短信：" + message);
    }
}
