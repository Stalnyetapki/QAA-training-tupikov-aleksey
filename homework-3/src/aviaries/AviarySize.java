package aviaries;

public enum AviarySize {

    SIZE_1(1),
    SIZE_2(2),
    SIZE_3(3),
    SIZE_4(4);

    private int value;

    AviarySize(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
