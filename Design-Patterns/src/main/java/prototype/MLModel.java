package prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MLModel implements ObjectClonable {

    private ModelType type;
    private String description;
    private Double trainingSplit;
    private double validationSplit;
    private double alpha;
    private double beta;

    @Override
    public ObjectClonable clone() {
        return new MLModel(type, description, trainingSplit, validationSplit, alpha, beta);
    }
}
