package com.FinancialTweets.tweets.daoTweets;

import com.FinancialTweets.tweets.entites.Twitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterRepository  extends JpaRepository<Twitter, Integer> {

}
