package ports.time;

import java.time.Instant;

public interface ClockPort {

    Instant now();

}
