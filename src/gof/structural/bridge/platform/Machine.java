package gof.structural.bridge.platform;


public interface Machine {
    void beginJob(String name);
    void cut(int len);
    void commitJob();
}
