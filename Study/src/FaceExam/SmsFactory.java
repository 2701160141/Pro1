package FaceExam;

public class SmsFactory implements Factory {
    @Override
    public Sender getSender() {
        return new SmsSender();
    }
}
