import models.buffer.Buffer;
import models.process.Process;
import models.process.Reader;
import models.process.Writer;
import models.scheduler.Scheduler;

public class Main {
    public static void main(String[] args) {
        final int BUFFER_SIZE = 3;
        Buffer b = new Buffer(BUFFER_SIZE);
        Process.setProcessingMax(BUFFER_SIZE);
        Writer w = new Writer("w1");
        Reader r = new Reader("r1");
        Scheduler s = new Scheduler(b, w, r);
        s.schedule(10);
    }
}
