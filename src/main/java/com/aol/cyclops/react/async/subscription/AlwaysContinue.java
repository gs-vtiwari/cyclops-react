package com.aol.cyclops.react.async.subscription;

import com.aol.cyclops.data.async.Queue;

public class AlwaysContinue implements Continueable {

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#closeQueueIfFinished(com.aol.cyclops.data.async.Queue)
     */
    @Override
    public void closeQueueIfFinished(final Queue queue) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#addQueue(com.aol.cyclops.data.async.Queue)
     */
    @Override
    public void addQueue(final Queue queue) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#registerSkip(long)
     */
    @Override
    public void registerSkip(final long skip) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#registerLimit(long)
     */
    @Override
    public void registerLimit(final long limit) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#closeAll(com.aol.cyclops.data.async.Queue)
     */
    @Override
    public void closeAll(final Queue queue) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#closed()
     */
    @Override
    public boolean closed() {

        return false;
    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#closeQueueIfFinishedStateless(com.aol.cyclops.data.async.Queue)
     */
    @Override
    public void closeQueueIfFinishedStateless(final Queue queue) {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#closeAll()
     */
    @Override
    public void closeAll() {

    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#timeLimit()
     */
    @Override
    public long timeLimit() {

        return -1;
    }

    /* (non-Javadoc)
     * @see com.aol.cyclops.react.async.subscription.Continueable#registerTimeLimit(long)
     */
    @Override
    public void registerTimeLimit(final long nanos) {

    }
}
