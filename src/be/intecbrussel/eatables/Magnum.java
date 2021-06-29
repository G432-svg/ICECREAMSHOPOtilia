package be.intecbrussel.eatables;

public class Magnum implements Eatable{
protected MagnumType type;

public Magnum(){

}
public Magnum(MagnumType magnumType){

}

//    public static MagnumType[] values() {
//        return MagnumType.values();
//    }
//
//    public static MagnumType valueOf(String name) throws IllegalArgumentException {
//        return MagnumType.valueOf(name);
//    }
//
//    public String name() {
//        return type.name();
//    }
//
//    public int ordinal() {
//        return type.ordinal();
//    }
//
//    public int compareTo(MagnumType o) {
//        return type.compareTo(o);
//    }
//
//    public Class<MagnumType> getDeclaringClass() {
//        return type.getDeclaringClass();
//    }


    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        Eatable.super.eat();
    }
}
