package sun.socket.client.event.handler;

import io.socket.emitter.Emitter;

public interface EventHandler extends Emitter.Listener {

    public abstract void eventName();
}
