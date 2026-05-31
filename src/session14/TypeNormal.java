package session14;

public final class TypeNormal extends ReceiptMaster {
    String name;
    String key;
    int id;

    @Override
    public String receipt() {
        if (id == 1) {
            return name + " " + key + " " + id;
        }
        return " null ";
    }
}
