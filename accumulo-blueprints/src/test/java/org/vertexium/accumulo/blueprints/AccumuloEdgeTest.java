package org.vertexium.accumulo.blueprints;

import org.vertexium.accumulo.blueprints.util.AccumuloBlueprintsGraphTestHelper;
import org.vertexium.blueprints.VertexiumBlueprintsEdgeTestBase;

import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class AccumuloEdgeTest extends VertexiumBlueprintsEdgeTestBase {
    public AccumuloEdgeTest() {
        super(new AccumuloBlueprintsGraphTestHelper());
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("======================================");
        final Instant startTime = Instant.now();
        String hostName = InetAddress.getLocalHost().getHostName();
        final Instant endTime = Instant.now();
        System.out.printf("Method called, hostname %s, elapsed time: %d (ms)%n", hostName, TimeUnit.NANOSECONDS.toMillis(Duration.between(startTime, endTime).toNanos()));
        System.out.println("======================================");

        super.setUp();
        ((AccumuloBlueprintsGraphTestHelper) this.graphTest).setUp();
    }
}
