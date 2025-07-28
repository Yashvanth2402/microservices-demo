package com.google.sample.adservice;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdServiceTest {

    @Test
    void testDefaultAds() {
        AdService adService = new AdService();
        List<Ad> ads = adService.getAds(List.of("electronics"));

        assertNotNull(ads, "Ads list should not be null");
        assertFalse(ads.isEmpty(), "Ads list should not be empty");
    }
}
