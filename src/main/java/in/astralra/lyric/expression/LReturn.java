package in.astralra.lyric.expression;

import in.astralra.lyric.core.LObject;
import in.astralra.lyric.core.LType;

/**
 * Created by jszaday on 8/17/2016.
 */
public class LReturn extends LExpression {

    private LExpression value;

    public LReturn(LExpression value) {
        this.value = value;
    }

    @Override
    public LType getType() {
        return value.getType();
    }

    @Override
    LObject getObject() {
        throw new RuntimeException("Return statements do not provide an object.");
    }

    @Override
    public String toString() {
        return "return " + value + ";";
    }
}
