package session14;

public final  class TypeTransfer extends ReceiptMaster {
    String key;
    String name;
    int id;


    @Override
    public String receipt() {
        if (id == 2) {
            return name + " " + key + " " + id;
        }
        return  " null 2" ;
    }
}
