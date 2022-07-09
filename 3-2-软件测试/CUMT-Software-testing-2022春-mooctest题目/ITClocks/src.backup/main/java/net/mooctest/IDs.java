package net.mooctest;

final class IDs {

    static ID zero() {
        return new LeafID(0);
    }

    static ID one() {
        return new LeafID(1);
    }

    static ID with(ID id1, ID id2) {
        return new NonLeafID(id1, id2);
    }

    private IDs() { }

}
