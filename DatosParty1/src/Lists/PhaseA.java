package Lists;

/**
 * Class in charge of the creation of phase A, which only has one way.
 *
 */
public class PhaseA extends ListStructure {

    SingleNode first;
    SingleNode last;

    /**
     * Phase A Constructor.
     */
    public PhaseA() {

        first = null;
        last = null;

    }

    /**
     * Method to add nodes to the Phase A.
     *
     * @param cell It receives the cell type parameter that inside it has the Y
     * position , X position, color, number and action.
     */
    @Override
    public void addNode(Cell cell) {

        SingleNode newNode = new SingleNode();
        newNode.cell = cell;

        if (first == null) {

            first = newNode;
            first.next = null;
            last = newNode;

        } else {

            last.next = newNode;
            newNode.next = null;
            last = newNode;

        }

    }

    /**
     * Method to find position X.
     *
     * @param cellNumber Identifier of the cell
     * @return X position
     */
    @Override
    public int findXLocation(int cellNumber) {

        SingleNode actual = new SingleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.xPosition;

            }

            actual = actual.next;

        } while (actual != null);

        return -1;

    }

    /**
     * Method to find position Y.
     *
     * @param cellNumber Identifier of the cell
     * @return Y position
     */
    @Override
    public int findYLocation(int cellNumber) {

        SingleNode actual = new SingleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.yPosition;

            }

            actual = actual.next;

        } while (actual != null);

        return -1;

    }

    /**
     * Method to find the color of the cell.
     *
     * @param cellNumber number of the cell you want to find the color.
     * @return The color of the desired cell.
     */
    @Override
    public String findColor(int cellNumber) {

        SingleNode actual = new SingleNode();
        actual = first;
        String color = "gray";

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.color;

            }

            actual = actual.next;

        } while (actual != first);

        return color;

    }

}
