package lesson_5.com.abstractstasks.transport.abstracts;

import lesson_5.com.abstractstasks.transport.enums.Model;
import lombok.Getter;

@Getter
public abstract class AirTransport extends Transport {

    protected final double wingSpan;
    protected final int minimumTakeOffStripLength;

    public AirTransport(double power, double maximumSpeed, double weight, Model model,
                        int wingSpan, int minimumTakeOffStripLength) {
        super(power, maximumSpeed, weight, model);
        this.wingSpan = wingSpan;
        this.minimumTakeOffStripLength = minimumTakeOffStripLength;
    }

    @Override
    public String toString() {
        return super.toString() + "wing span = " + wingSpan + "m, minimum take-off strip length = "
                + minimumTakeOffStripLength + "m, ";
    }
}
