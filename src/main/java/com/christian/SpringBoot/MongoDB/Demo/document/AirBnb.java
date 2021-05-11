package com.christian.SpringBoot.MongoDB.Demo.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

@Document(collection="listingsAndReviews")
public class AirBnb {
    @Id
    private String id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhoodOverview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String propertyType;
    private String roomType;
    private String bedType;
    private String minimumNights;
    private String maxiumNights;
    private String cancellationPolicy;
    private Date lastScraped;
    private Date calendarLastScraped;
    private Date firstReview;
    private Date lastReview;
    private int accomodates;
    private int bedrooms;
    private int beds;
    private int numberOfReviews;
    private long bathrooms;
    private String[] ammenities;
    private long price;
    private long secuirtyDeposit;
    private long cleaningFee;
    private long extraPeople;
    private int guestsIncluded;
    private Object images;
    private Object host;
    private Object address;
    private Object availability;
    private Object reviewScores;
    private Object[] reviews;

    public AirBnb(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListing_url() {
        return listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNeighborhoodOverview() {
        return neighborhoodOverview;
    }

    public void setNeighborhoodOverview(String neighborhoodOverview) {
        this.neighborhoodOverview = neighborhoodOverview;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public String getHouse_rules() {
        return house_rules;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(String minimumNights) {
        this.minimumNights = minimumNights;
    }

    public String getMaxiumNights() {
        return maxiumNights;
    }

    public void setMaxiumNights(String maxiumNights) {
        this.maxiumNights = maxiumNights;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public Date getLastScraped() {
        return lastScraped;
    }

    public void setLastScraped(Date lastScraped) {
        this.lastScraped = lastScraped;
    }

    public Date getCalendarLastScraped() {
        return calendarLastScraped;
    }

    public void setCalendarLastScraped(Date calendarLastScraped) {
        this.calendarLastScraped = calendarLastScraped;
    }

    public Date getFirstReview() {
        return firstReview;
    }

    public void setFirstReview(Date firstReview) {
        this.firstReview = firstReview;
    }

    public Date getLastReview() {
        return lastReview;
    }

    public void setLastReview(Date lastReview) {
        this.lastReview = lastReview;
    }

    public int getAccomodates() {
        return accomodates;
    }

    public void setAccomodates(int accomodates) {
        this.accomodates = accomodates;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public long getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(long bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String[] getAmmenities() {
        return ammenities;
    }

    public void setAmmenities(String[] ammenities) {
        this.ammenities = ammenities;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getSecuirtyDeposit() {
        return secuirtyDeposit;
    }

    public void setSecuirtyDeposit(long secuirtyDeposit) {
        this.secuirtyDeposit = secuirtyDeposit;
    }

    public long getCleaningFee() {
        return cleaningFee;
    }

    public void setCleaningFee(long cleaningFee) {
        this.cleaningFee = cleaningFee;
    }

    public long getExtraPeople() {
        return extraPeople;
    }

    public void setExtraPeople(long extraPeople) {
        this.extraPeople = extraPeople;
    }

    public int getGuestsIncluded() {
        return guestsIncluded;
    }

    public void setGuestsIncluded(int guestsIncluded) {
        this.guestsIncluded = guestsIncluded;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Object getHost() {
        return host;
    }

    public void setHost(Object host) {
        this.host = host;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getAvailability() {
        return availability;
    }

    public void setAvailability(Object availability) {
        this.availability = availability;
    }

    public Object getReviewScores() {
        return reviewScores;
    }

    public void setReviewScores(Object reviewScores) {
        this.reviewScores = reviewScores;
    }

    public Object[] getReviews() {
        return reviews;
    }

    public void setReviews(Object[] reviews) {
        this.reviews = reviews;
    }
}
