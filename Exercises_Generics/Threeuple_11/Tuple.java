public class Tuple<F,S,T> {
    private F first;
    private S second;
    private T third;

    public Tuple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <P> boolean isDrunk(String state){
        if (state.equals("not")){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",first.toString(),second.toString(),third.toString());
    }
}
