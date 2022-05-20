package prototype;

import java.util.HashMap;
import java.util.Map;

public class ModelRegistry {
    private Map<ModelType, ObjectClonable> registry = new HashMap<>();

    public ModelRegistry() {
        MLModel mlModel = new MLModel(ModelType.DT, "model 1", 0.5, 1,2,4);
        this.registry.put(ModelType.DT, mlModel);

    }

    public ObjectClonable put(ModelType key, ObjectClonable objectClonable) {
        registry.put(key, objectClonable);
        return objectClonable;
    }

    public ObjectClonable get(ModelType modelType) {
        return registry.get(modelType).clone();
    }
}
