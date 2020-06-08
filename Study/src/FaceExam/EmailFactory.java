package FaceExam;

public class EmailFactory implements Factory {
    @Override
    public Sender getSender() {
        return new EmailSender();
    }
}
