package gof.behavioral.templatemethod;// program@globall.ru @ 24.05.2017.

public final class NotificationChanel {
    private final CommunicationType communicationType;
    private final String address;

    public NotificationChanel(CommunicationType communicationType, String address) {
        this.communicationType = communicationType;
        this.address = address;
    }

    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    public String getAddress() {
        return address;
    }

}
