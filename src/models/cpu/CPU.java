package models.cpu;

import models.buffer.Buffer;
import models.process.Process;

public class CPU {
    private Process p;

    private Buffer b;

    public Process getProcess() { return p; }

    public void setProcess(Process p) {
        this.p = p;
    }

    public Buffer getBuffer() { return b; }

    public void setBuffer(Buffer b) { this.b = b; }

    public void process() {
        if (this.p == null) {
            throw new IllegalStateException("The underlying process must be not null.");
        }
        if (this.b == null) {
            throw new IllegalStateException("The underlying buffer must be not null.");
        }
        this.p.performAction(b);
        this.p.decreaseProcessing();
    }
}
