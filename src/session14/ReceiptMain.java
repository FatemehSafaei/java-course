package session14;

public class ReceiptMain{

    static ReceiptMaster transfer = new TypeTransfer();
    static ReceiptMaster normal = new TypeNormal();

    public static void main(String[] args) {




    }
    public static String receiptType() {
        ReceiptGeneric  receipt = new ReceiptGeneric();
        receipt.ReceiptGeneric(new TypeNormal());
        return transfer.receipt();
    }
}
