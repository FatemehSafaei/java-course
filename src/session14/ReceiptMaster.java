package session14;

public sealed abstract class ReceiptMaster permits TypeNormal,TypeTransfer{
    double goods;
    String inventor;
    public abstract String receipt();

}
