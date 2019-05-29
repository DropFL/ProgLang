public interface KotlinType {
    static KotlinType ERROR = new KotlinType(){
        @Override
        public KotlinType parent() {
            return this;
        }
    
        @Override
        public int id() {
            return -1;
        }

        @Override
        public KotlinType common (KotlinType other) {
            return this;
        }
    };

    int id();
    KotlinType parent();
    
    default KotlinType common (KotlinType other) {
        // TODO
        return KotlinType.ERROR;
    }

    default boolean compare(KotlinType type) {
        return id() == type.id();
    }
}