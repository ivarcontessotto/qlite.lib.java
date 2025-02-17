package org.qubiclite.qlite.oracle.input;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Config for the Queue Input Provider.
 */
public class QueueInputConfig extends OracleInputConfig {

    private Queue<String> inputSequence;

    public QueueInputConfig(ValueType valueType, Queue<String> inputSequence) {
        super(valueType);
        this.inputSequence = inputSequence;
    }

    public Queue<String> getInputSequence() {
        return new LinkedList<>(this.inputSequence);
    }
}
