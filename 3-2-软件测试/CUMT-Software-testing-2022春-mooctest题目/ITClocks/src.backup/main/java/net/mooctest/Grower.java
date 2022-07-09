package net.mooctest;

final class Grower {

    static Event grow(ID id, Event event) {
        return innerGrow(id, event).getEvent();
    }

    private static GrowResult innerGrow(ID id, Event event) {
        if (id.isLeaf()) {
            return growLeafID(id, event);
        }
        else {
            return growNonLeafID(id, event);
        }
    }

    private static GrowResult growLeafID(ID id, Event event) {
        if (id.isOne() && event.isLeaf()) {
            return new GrowResult(Events.with(event.getValue() + 1), 0);
        }
        else {
            throw new IllegalArgumentException("Illegal arguments: " + id + " and " + event);
        }
    }

    private static GrowResult growNonLeafID(ID id, Event event) {
        if (event.isLeaf()) {
            return growLeafEvent(id, event);
        }
        else if (id.getLeft().isZero()) {
            return growOnRight(id, event);
        }
        else if (id.getRight().isZero()) {
            return growOnLeft(id, event);
        }
        else {
            return growOnBothSides(id, event);
        }
    }

    private static GrowResult growLeafEvent(ID id, Event event) {
        GrowResult er = innerGrow(id, Events.with(event.getValue(), Events.zero(), Events.zero()));
        er.setCost(er.getCost() + event.maxDepth() + 1);
        return er;
    }

    private static GrowResult growOnRight(ID id, Event event) {
        GrowResult rightGrowth = growRight(id, event);
        return rightGrowth(event, rightGrowth);
    }

    private static GrowResult growRight(ID id, Event event) {
        return innerGrow(id.getRight(), event.getRight());
    }

    private static GrowResult rightGrowth(Event event, GrowResult growth) {
        Event result = Events.with(event.getValue(),
                event.getLeft(), growth.getEvent());
        return new GrowResult(result, growth.getCost() + 1);
    }

    private static GrowResult growOnLeft(ID id, Event event) {
        GrowResult leftGrowth = growLeft(id, event);
        return leftGrowth(event, leftGrowth);
    }

    private static GrowResult growLeft(ID id, Event event) {
        return innerGrow(id.getLeft(), event.getLeft());
    }

    private static GrowResult leftGrowth(Event event, GrowResult growth) {
        Event result = Events.with(event.getValue(),
                growth.getEvent(), event.getRight());
        return new GrowResult(result, growth.getCost() + 1);
    }

    private static GrowResult growOnBothSides(ID id, Event event) {
        GrowResult leftGrowth = growLeft(id, event);
        GrowResult rightGrowth = growRight(id, event);
        if (leftGrowth.getCost() < rightGrowth.getCost()) {
            return leftGrowth(event, leftGrowth);
        }
        else {
            return rightGrowth(event, rightGrowth);
        }
    }

    private Grower() { }

}
