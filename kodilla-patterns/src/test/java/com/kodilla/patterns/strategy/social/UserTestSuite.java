package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials("User Millenial");
        User yGen = new YGeneration("User YGen");
        User zGen = new ZGeneration("User ZGen");

        //When
        String millenialShouldShare = millenial.sharePost();
        System.out.println("User Millenial should share: " + millenialShouldShare);
        String yGenShouldShare = yGen.sharePost();
        System.out.println("User YGen should share: " + yGenShouldShare);
        String zGenShouldShare = zGen.sharePost();
        System.out.println("User ZGen should share: " + zGenShouldShare);

        //Then
        Assert.assertEquals("Facebook", millenialShouldShare);
        Assert.assertEquals("Twitter", yGenShouldShare);
        Assert.assertEquals("Snapchat", zGenShouldShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenial = new Millenials("User Millenial");

        //When
        String millenialShouldShare = millenial.sharePost();
        System.out.println("User Millenial should share: " + millenialShouldShare);
        millenial.setIndividualSocialPublisher(new SnapchatPublisher());
        millenialShouldShare = millenial.sharePost();
        System.out.println("User Millenial should share: " + millenialShouldShare);

        //Then
        Assert.assertEquals("Snapchat", millenialShouldShare);
    }
}
