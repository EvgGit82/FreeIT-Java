package lesson_5.com.abstractclassestasks.transport_project.abstracts;

import lesson_5.com.abstractclassestasks.transport_project.enums.Model;

public class AirTransport extends Transport {

    protected double wingSpan;
    protected int minimumTakeOffStripLength;

    public AirTransport(double power, double maximumSpeed, double weight, Model model,
                        int wingSpan, int minimumTakeOffStripLength) {
        super(power, maximumSpeed, weight, model);
        this.wingSpan = wingSpan;
        this.minimumTakeOffStripLength = minimumTakeOffStripLength;
    }
}
