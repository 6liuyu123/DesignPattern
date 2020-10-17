package Observer.Example2;

import java.util.*;

public class BellEventSource {
    private List<BellEventListener> listener;
    public BellEventSource() {
        listener=new ArrayList<BellEventListener>();
    }
    public void addPersonListener(BellEventListener ren) {
        listener.add(ren);
    }
    public void ring(boolean sound) {
        String type = sound?"上课铃":"下课铃";
        System.out.println(type+"响");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }
    protected void notifies(RingEvent e) {
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator=listener.iterator();
        while (iterator.hasNext()) {
            ren = iterator.next();
            ren.heardBell(e);
        }
    }
}
