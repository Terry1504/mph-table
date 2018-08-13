package com.indeed.mph.serializers;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.io.IOException;

import static com.indeed.mph.helpers.RoundTripHelpers.assertRoundTrip;

@RunWith(JUnitQuickcheck.class)
public class TestSmartShortSerializer {
    @Property
    public void canRoundTripShort(final short target) throws IOException {
        final SmartShortSerializer serializer = new SmartShortSerializer();
        assertRoundTrip(serializer, target);
    }
}
