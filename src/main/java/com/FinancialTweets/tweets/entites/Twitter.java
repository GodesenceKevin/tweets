package com.FinancialTweets.tweets.entites;

import javax.persistence.*;

@Entity
@Table(name="mytable")
public class Twitter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idUser;

    @Column(name="user_name", length=73, nullable=false, unique=false)
    private String userName;

    @Column(name="user_location", length=2145)
    private String userLocation;

    @Column(name="user_description", length=264)
    private String userDescription;

    @Column(name="user_created", length=19 , nullable=false)
    private String userCreated;

    @Column(name="user_followers" , length=11, nullable=false)
    private int userFollowers;

    @Column(name="user_friends", nullable=false)
    private int userFriends;

    @Column(name="user_favorites", nullable=false)
    private  int favorites;

    @Column(name="user_verified", length=10 , nullable=false)
    private String userVerified;

    @Column(name="date", length=50, nullable=false)
    private String date;

    @Column(name="text", length=280, nullable=false)
    private String text;

    @Column(name="hashtags", length=280)
    private String hashtags;

    @Column(name="source", length=50)
    private String source;

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }

    public int getUserFriends() {
        return userFriends;
    }

    public void setUserFriends(int userFriends) {
        this.userFriends = userFriends;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public String getUserVerified() {
        return userVerified;
    }

    public void setUserVerified(String userVerified) {
        this.userVerified = userVerified;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIsRetweet() {
        return isRetweet;
    }

    public void setIsRetweet(String isRetweet) {
        this.isRetweet = isRetweet;
    }

    @Column(name="isRetweet", length=10, nullable=false)
    private String isRetweet;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
