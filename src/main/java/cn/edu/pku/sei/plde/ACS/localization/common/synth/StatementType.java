package cn.edu.pku.sei.plde.ACS.localization.common.synth;

public enum StatementType {
    LOOP(Boolean.class),
    CONDITIONAL(Boolean.class),
    PRECONDITION(Boolean.class),
    INTEGER_LITERAL(Integer.class),
    DOUBLE_LITERAL(Double.class),
    BOOLEAN_LITERAL(Boolean.class),
    NONE(null);

    private Class<?> type;

    private StatementType(Class<?> type) {
        this.type = type;
    }

    public Class<?> getType() {
        return type;
    }
}
